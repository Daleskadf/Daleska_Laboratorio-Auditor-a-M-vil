package com.google.android.gms.internal.mlkit_common;

import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public final class zzak {
    public static Object[] zza(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException(b.e(i8, "at index "));
            }
        }
        return objArr;
    }
}
