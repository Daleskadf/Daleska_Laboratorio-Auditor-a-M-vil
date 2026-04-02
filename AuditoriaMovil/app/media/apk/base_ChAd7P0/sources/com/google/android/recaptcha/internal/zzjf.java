package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzjf {
    public static void zza(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zzb(boolean z7, Object obj) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void zzc(boolean z7, String str, char c8) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c8)));
    }

    public static void zzd(int i7, int i8, int i9) {
        String zzf;
        if (i7 >= 0 && i8 >= i7 && i8 <= i9) {
            return;
        }
        if (i7 >= 0 && i7 <= i9) {
            if (i8 >= 0 && i8 <= i9) {
                zzf = zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                zzf = zzf(i8, i9, "end index");
            }
        } else {
            zzf = zzf(i7, i9, "start index");
        }
        throw new IndexOutOfBoundsException(zzf);
    }

    public static void zze(boolean z7, Object obj) {
        if (z7) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    private static String zzf(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        return zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
    }
}
