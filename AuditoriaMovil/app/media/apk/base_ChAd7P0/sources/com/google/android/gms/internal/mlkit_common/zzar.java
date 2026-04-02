package com.google.android.gms.internal.mlkit_common;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzar {
    public static int zza(Set set) {
        int i7;
        int i8 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i8 += i7;
        }
        return i8;
    }
}
