package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
/* loaded from: classes.dex */
final class zzay extends zzba {
    final /* synthetic */ Location zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(zzbb zzbbVar, o oVar, Location location) {
        super(oVar);
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzdz) bVar).zzA(this.zza, zzbb.zza(this));
    }
}
