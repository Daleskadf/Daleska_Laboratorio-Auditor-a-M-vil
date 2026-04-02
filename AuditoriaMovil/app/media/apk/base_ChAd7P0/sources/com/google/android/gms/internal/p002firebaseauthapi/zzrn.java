package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzrn {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] zzb(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i7 = 0; i7 < 16; i7++) {
                byte b5 = (byte) ((bArr[i7] << 1) & 254);
                bArr2[i7] = b5;
                if (i7 < 15) {
                    bArr2[i7] = (byte) (((byte) ((bArr[i7 + 1] >> 7) & 1)) | b5);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
