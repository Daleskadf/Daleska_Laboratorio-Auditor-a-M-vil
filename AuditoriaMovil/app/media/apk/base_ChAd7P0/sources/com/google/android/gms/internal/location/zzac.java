package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.I;
/* loaded from: classes.dex */
final class zzac extends zzae {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, o oVar, long j, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = j;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        boolean z7;
        PendingIntent pendingIntent = this.zzb;
        zzg zzgVar = (zzg) bVar;
        I.i(pendingIntent);
        long j = this.zza;
        if (j >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("detectionIntervalMillis must be >= 0", z7);
        ((zzv) zzgVar.getService()).zzh(j, true, pendingIntent);
        setResult((zzac) Status.f9152e);
    }
}
