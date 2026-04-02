package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import org.apache.tika.fork.ForkServer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzpy {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i7 = 0;
        while (i7 == 0) {
            secureRandom.nextBytes(bArr);
            i7 = ((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
        }
        return i7;
    }

    public static final zzzn zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i7] = (byte) charAt;
            } else {
                throw new zzpw("Not a printable ASCII character: " + charAt);
            }
        }
        return zzzn.zza(bArr);
    }

    public static final zzzn zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i7] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return zzzn.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (bArr2[i7] != bArr[i7]) {
                return false;
            }
        }
        return true;
    }
}
