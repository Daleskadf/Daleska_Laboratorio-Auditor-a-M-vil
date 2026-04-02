package com.google.android.recaptcha.internal;

import W2.f;
import android.content.Context;
/* loaded from: classes.dex */
public final class zzbs {
    private final f zza;

    public zzbs() {
        this.zza = f.f6172b;
    }

    public final int zza(Context context) {
        int c8 = this.zza.c(context);
        if (c8 != 1 && c8 != 3 && c8 != 9) {
            return 3;
        }
        return 4;
    }

    public zzbs(f fVar) {
        this.zza = fVar;
    }
}
