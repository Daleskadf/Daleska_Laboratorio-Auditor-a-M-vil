package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzag  reason: invalid package */
/* loaded from: classes.dex */
final class zzag {
    public static int zza(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC0059i.M("null value in entry: ", String.valueOf(obj), "=null"));
        }
    }
}
