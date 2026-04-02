package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzw {
    public static int zza(int i7, int i8) {
        String zza;
        if (i7 < 0 || i7 >= i8) {
            if (i7 < 0) {
                zza = zzae.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else if (i8 < 0) {
                throw new IllegalArgumentException(b.e(i8, "negative size: "));
            } else {
                zza = zzae.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i7;
    }

    public static int zzb(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzb(i7, i8, "index"));
        }
        return i7;
    }

    private static String zzb(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(b.e(i8, "negative size: "));
    }

    public static int zza(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzb(i7, i8, str));
        }
        return i7;
    }

    public static <T> T zza(T t7) {
        t7.getClass();
        return t7;
    }

    public static void zza(int i7, int i8, int i9) {
        String zzb;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                zzb = zzb(i7, i9, "start index");
            } else if (i8 >= 0 && i8 <= i9) {
                zzb = zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                zzb = zzb(i8, i9, "end index");
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }
}
