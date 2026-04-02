package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0989b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaey  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaey {
    private final String zza;
    private final String zzb;

    public zzaey(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzaey(Context context, String str) {
        I.i(context);
        I.e(str);
        this.zza = str;
        try {
            byte[] c8 = AbstractC0989b.c(context, str);
            if (c8 == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + str);
                this.zzb = null;
                return;
            }
            this.zzb = AbstractC0989b.a(c8);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
