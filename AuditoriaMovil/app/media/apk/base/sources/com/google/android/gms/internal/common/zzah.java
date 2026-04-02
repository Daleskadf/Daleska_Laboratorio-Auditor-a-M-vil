package com.google.android.gms.internal.common;

import io.flutter.plugins.pathprovider.b;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* loaded from: classes.dex */
public final class zzah {
    public static Object[] zza(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException(b.e(i8, "at index "));
            }
        }
        return objArr;
    }
}
