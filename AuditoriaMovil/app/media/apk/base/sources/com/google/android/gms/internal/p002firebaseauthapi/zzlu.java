package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlu  reason: invalid package */
/* loaded from: classes.dex */
public final class zzlu {
    public static final byte[] zza = zza(1, 0);
    public static final byte[] zzb;
    public static final byte[] zzc;
    public static final byte[] zzd;
    public static final byte[] zze;
    public static final byte[] zzf;
    public static final byte[] zzg;
    public static final byte[] zzh;
    public static final byte[] zzi;
    public static final byte[] zzj;
    public static final byte[] zzk;
    public static final byte[] zzl;
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static {
        zza(1, 2);
        zzb = zza(2, 32);
        zzc = zza(2, 16);
        zzd = zza(2, 17);
        zze = zza(2, 18);
        zzf = zza(2, 1);
        zzg = zza(2, 2);
        zzh = zza(2, 3);
        zzi = zza(2, 1);
        zzj = zza(2, 2);
        zzk = zza(2, 3);
        zzl = new byte[0];
        Charset charset = zzpy.zza;
        zzm = "KEM".getBytes(charset);
        zzn = "HPKE".getBytes(charset);
        zzo = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzju.zzd zzdVar) {
        if (zzdVar == zzju.zzd.zzd || zzdVar == zzju.zzd.zza) {
            return 32;
        }
        if (zzdVar == zzju.zzd.zzb) {
            return 48;
        }
        if (zzdVar == zzju.zzd.zzc) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzju.zzd zzdVar) {
        if (zzdVar == zzju.zzd.zzd) {
            return 32;
        }
        if (zzdVar == zzju.zzd.zza) {
            return 65;
        }
        if (zzdVar == zzju.zzd.zzb) {
            return 97;
        }
        if (zzdVar == zzju.zzd.zzc) {
            return 133;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static zzyl zzc(zzju.zzd zzdVar) {
        if (zzdVar == zzju.zzd.zza) {
            return zzyl.NIST_P256;
        }
        if (zzdVar == zzju.zzd.zzb) {
            return zzyl.NIST_P384;
        }
        if (zzdVar == zzju.zzd.zzc) {
            return zzyl.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzyc.zza(zzn, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i7, int i8) {
        if (i7 > 4 || i7 < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i8 >= 0 && (i7 >= 4 || i8 < (1 << (i7 << 3)))) {
            byte[] bArr = new byte[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) (i8 >> (((i7 - i9) - 1) * 8));
            }
            return bArr;
        }
        throw new IllegalArgumentException("value too large");
    }

    public static byte[] zza(byte[] bArr) {
        return zzyc.zza(zzm, bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2) {
        return zzyc.zza(zzo, bArr2, str.getBytes(zzpy.zza), bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i7) {
        return zzyc.zza(zza(2, i7), zzo, bArr2, str.getBytes(zzpy.zza), bArr);
    }
}
