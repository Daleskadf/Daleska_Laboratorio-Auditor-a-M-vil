package com.google.android.gms.internal.fido;

import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public final class zzap {
    public static int zza(int i7, int i8, String str) {
        String zza;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 >= 0) {
            if (i8 < 0) {
                throw new IllegalArgumentException(b.e(i8, "negative size: "));
            }
            zza = zzaq.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        } else {
            zza = zzaq.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i7, int i8, String str) {
        if (i7 >= 0 && i7 <= i8) {
            return i7;
        }
        throw new IndexOutOfBoundsException(zzf(i7, i8, "index"));
    }

    public static void zzc(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zzd(boolean z7, String str, char c8) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(zzaq.zza(str, Character.valueOf(c8)));
    }

    public static void zze(int i7, int i8, int i9) {
        String zzf;
        if (i7 >= 0 && i8 >= i7 && i8 <= i9) {
            return;
        }
        if (i7 >= 0 && i7 <= i9) {
            if (i8 >= 0 && i8 <= i9) {
                zzf = zzaq.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                zzf = zzf(i8, i9, "end index");
            }
        } else {
            zzf = zzf(i7, i9, "start index");
        }
        throw new IndexOutOfBoundsException(zzf);
    }

    private static String zzf(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzaq.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzaq.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(b.e(i8, "negative size: "));
    }
}
