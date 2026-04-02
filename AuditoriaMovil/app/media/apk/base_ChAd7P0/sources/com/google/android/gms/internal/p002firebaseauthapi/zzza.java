package com.google.android.gms.internal.p002firebaseauthapi;

import org.apache.tika.fork.ForkServer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzza  reason: invalid package */
/* loaded from: classes.dex */
public final class zzza {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            int i7 = b5 & ForkServer.ERROR;
            sb.append("0123456789abcdef".charAt(i7 / 16));
            sb.append("0123456789abcdef".charAt(i7 % 16));
        }
        return sb.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                int digit = Character.digit(str.charAt(i8), 16);
                int digit2 = Character.digit(str.charAt(i8 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i7] = (byte) ((digit << 4) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
