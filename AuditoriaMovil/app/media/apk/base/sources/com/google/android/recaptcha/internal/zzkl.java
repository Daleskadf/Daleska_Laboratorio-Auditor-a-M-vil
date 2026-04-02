package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
final class zzkl {
    public static void zza(boolean z7, String str, long j, long j8) {
        if (z7) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j8 + ")");
    }

    public static void zzb(boolean z7) {
        if (z7) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
