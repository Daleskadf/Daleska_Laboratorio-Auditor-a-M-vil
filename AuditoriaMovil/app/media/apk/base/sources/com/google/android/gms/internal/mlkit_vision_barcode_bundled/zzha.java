package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* loaded from: classes.dex */
final class zzha {
    public static /* bridge */ /* synthetic */ void zza(byte b5, byte b7, byte b8, byte b9, char[] cArr, int i7) {
        if (!zze(b7)) {
            if ((((b7 + 112) + (b5 << 28)) >> 30) == 0 && !zze(b8) && !zze(b9)) {
                int i8 = ((b5 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i7] = (char) ((i8 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
                return;
            }
        }
        throw new zzer("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b5, byte b7, byte b8, char[] cArr, int i7) {
        if (!zze(b7)) {
            if (b5 == -32) {
                if (b7 >= -96) {
                    b5 = -32;
                }
            }
            if (b5 == -19) {
                if (b7 < -96) {
                    b5 = -19;
                }
            }
            if (!zze(b8)) {
                cArr[i7] = (char) (((b5 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
                return;
            }
        }
        throw new zzer("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b5, byte b7, char[] cArr, int i7) {
        if (b5 >= -62 && !zze(b7)) {
            cArr[i7] = (char) (((b5 & 31) << 6) | (b7 & 63));
            return;
        }
        throw new zzer("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b5) {
        return b5 >= 0;
    }

    private static boolean zze(byte b5) {
        return b5 > -65;
    }
}
