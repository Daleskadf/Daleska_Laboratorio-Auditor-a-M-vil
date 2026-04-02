package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import p3.j;
/* loaded from: classes.dex */
final class zzcn extends zzcq {
    final /* synthetic */ j zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzcr zzcrVar, o oVar, j jVar, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = jVar;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzdz) bVar).zzE(this.zza, this.zzb, zzcr.zza(this));
    }
}
