package com.google.android.gms.internal.mlkit_vision_barcode_bundled;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhe {
    public static final /* synthetic */ int zza = 0;
    private static final zzhb zzb;

    static {
        if (zzgz.zzx() && zzgz.zzy()) {
            int i7 = zzct.zza;
        }
        zzb = new zzhc();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b5 = bArr[i7 - 1];
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return zzi(b5, bArr[i7], bArr[i7 + 1]);
                }
                throw new AssertionError();
            }
            return zzh(b5, bArr[i7]);
        } else if (b5 > -12) {
            return -1;
        } else {
            return b5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzd(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhe.zzd(java.lang.String, byte[], int, int):int");
    }

    public static int zze(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) >= 65536) {
                                i8++;
                            } else {
                                throw new zzhd(i8, length2);
                            }
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static int zzf(int i7, byte[] bArr, int i8, int i9) {
        return zzb.zza(i7, bArr, i8, i9);
    }

    public static boolean zzg(byte[] bArr, int i7, int i8) {
        if (zzb.zza(0, bArr, i7, i8) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzh(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }
}
