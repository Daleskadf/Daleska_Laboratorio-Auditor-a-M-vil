package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.I;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
/* loaded from: classes.dex */
public final class zzaf {
    public final r removeActivityUpdates(o oVar, PendingIntent pendingIntent) {
        return ((I) oVar).f9188b.doWrite((l) new zzad(this, oVar, pendingIntent));
    }

    public final r requestActivityUpdates(o oVar, long j, PendingIntent pendingIntent) {
        return ((I) oVar).f9188b.doWrite((l) new zzac(this, oVar, j, pendingIntent));
    }
}
