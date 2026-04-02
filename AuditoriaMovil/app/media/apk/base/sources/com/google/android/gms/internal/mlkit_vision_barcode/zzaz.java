package com.google.android.gms.internal.mlkit_vision_barcode;

import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public final class zzaz {
    public static int zza(int i7, int i8, String str) {
        String zzb;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 >= 0) {
            if (i8 < 0) {
                throw new IllegalArgumentException(b.e(i8, "negative size: "));
            }
            zzb = zzba.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        } else {
            zzb = zzba.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i7, int i8, String str) {
        if (i7 >= 0 && i7 <= i8) {
            return i7;
        }
        throw new IndexOutOfBoundsException(zzg(i7, i8, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Executor was null.");
    }

    public static void zzd(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zze(int i7, int i8, int i9) {
        String zzg;
        if (i7 >= 0 && i8 >= i7 && i8 <= i9) {
            return;
        }
        if (i7 >= 0 && i7 <= i9) {
            if (i8 >= 0 && i8 <= i9) {
                zzg = zzba.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                zzg = zzg(i8, i9, "end index");
            }
        } else {
            zzg = zzg(i7, i9, "start index");
        }
        throw new IndexOutOfBoundsException(zzg);
    }

    public static void zzf(boolean z7, Object obj) {
        if (z7) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    private static String zzg(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzba.zzb("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzba.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(b.e(i8, "negative size: "));
    }
}
