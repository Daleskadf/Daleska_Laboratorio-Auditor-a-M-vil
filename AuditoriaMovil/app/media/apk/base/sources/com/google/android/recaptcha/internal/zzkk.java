package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzkk {
    public static long zza(long j, long j8) {
        boolean z7;
        boolean z8 = false;
        if ((j ^ j8) < 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j9 = j + j8;
        if ((j ^ j9) >= 0) {
            z8 = true;
        }
        zzkl.zza(z7 | z8, "checkedAdd", j, j8);
        return j9;
    }

    public static long zzb(long j, long j8) {
        boolean z7;
        boolean z8 = false;
        if ((1 ^ j) >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j9 = (-1) + j;
        if ((j ^ j9) >= 0) {
            z8 = true;
        }
        zzkl.zza(z7 | z8, "checkedSubtract", j, 1L);
        return j9;
    }
}
