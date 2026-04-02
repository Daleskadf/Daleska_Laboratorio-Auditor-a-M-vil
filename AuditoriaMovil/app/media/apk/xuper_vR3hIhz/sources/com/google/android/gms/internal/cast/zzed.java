package com.google.android.gms.internal.cast;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzed {
    public static int zza(Set<?> set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }
}
