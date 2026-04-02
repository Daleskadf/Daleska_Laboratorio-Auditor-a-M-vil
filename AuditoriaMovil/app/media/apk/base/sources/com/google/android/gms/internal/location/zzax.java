package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
/* loaded from: classes.dex */
final class zzax extends zzba {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzbb zzbbVar, o oVar, boolean z7) {
        super(oVar);
        this.zza = z7;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        zzdz zzdzVar = (zzdz) bVar;
        if (this.zza) {
            zzdzVar.zzy(zzbb.zza(this));
        } else {
            zzdzVar.zzz(zzbb.zza(this));
        }
    }
}
