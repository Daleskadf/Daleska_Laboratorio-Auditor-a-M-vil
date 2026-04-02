package com.google.android.gms.internal.fido;

import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public final class zzbq {
    public static Object zza(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(b.e(i7, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            zza(objArr[i8], i8);
        }
        return objArr;
    }
}
