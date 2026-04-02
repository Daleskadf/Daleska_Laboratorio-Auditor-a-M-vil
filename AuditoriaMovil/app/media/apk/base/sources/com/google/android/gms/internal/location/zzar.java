package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.o;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes.dex */
final class zzar extends zzba {
    final /* synthetic */ C0742p zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzbb zzbbVar, o oVar, C0742p c0742p, LocationRequest locationRequest) {
        super(oVar);
        this.zza = c0742p;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzdz) bVar).zzs(new zzaz(this.zza), this.zzb, zzbb.zza(this));
    }
}
