package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak  reason: invalid package */
/* loaded from: classes.dex */
public class zzak<E> {
    public static int zza(int i7, int i8) {
        if (i8 >= 0) {
            if (i8 <= i7) {
                return i7;
            }
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            if (i9 < 0) {
                return f.API_PRIORITY_OTHER;
            }
            return i9;
        }
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }
}
