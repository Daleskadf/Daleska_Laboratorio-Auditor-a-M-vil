package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.f;
/* loaded from: classes.dex */
public class zzaa {
    public static int zza(int i7, int i8) {
        if (i8 >= 0) {
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                int highestOneBit = Integer.highestOneBit(i8 - 1);
                i9 = highestOneBit + highestOneBit;
            }
            if (i9 < 0) {
                return f.API_PRIORITY_OTHER;
            }
            return i9;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
