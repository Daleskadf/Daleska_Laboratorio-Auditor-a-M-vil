package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
/* loaded from: classes.dex */
final class zzco extends zzcq {
    final /* synthetic */ PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzco(zzcr zzcrVar, o oVar, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzdz) bVar).zzF(zzem.zzb(this.zza), zzcr.zza(this));
    }
}
