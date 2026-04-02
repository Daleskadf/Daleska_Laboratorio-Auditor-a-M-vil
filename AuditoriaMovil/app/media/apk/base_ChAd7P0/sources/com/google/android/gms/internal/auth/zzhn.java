package com.google.android.gms.internal.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i7 = zzds.zza;
        }
        zzb = new zzhm();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b5 = bArr[i7 - 1];
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    byte b7 = bArr[i7];
                    byte b8 = bArr[i7 + 1];
                    if (b5 <= -12 && b7 <= -65 && b8 <= -65) {
                        return ((b7 << 8) ^ b5) ^ (b8 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b9 = bArr[i7];
                if (b5 <= -12 && b9 <= -65) {
                    return b5 ^ (b9 << 8);
                }
            }
        } else if (b5 <= -12) {
            return b5;
        }
        return -1;
    }

    public static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzc(byte[] bArr, int i7, int i8) {
        return zzb.zzb(bArr, i7, i8);
    }
}
