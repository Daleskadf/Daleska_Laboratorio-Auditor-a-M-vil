package com.google.android.gms.internal.p002firebaseauthapi;

import W2.f;
import android.content.Context;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadu  reason: invalid package */
/* loaded from: classes.dex */
public final class zzadu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        boolean z7;
        if (zza == null) {
            int d7 = f.f6172b.d(context, 12451000);
            if (d7 != 0 && d7 != 2) {
                z7 = false;
            } else {
                z7 = true;
            }
            zza = Boolean.valueOf(z7);
        }
        return zza.booleanValue();
    }
}
