package com.google.android.gms.internal.auth;

import O2.d;
import O2.f;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0731e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
/* loaded from: classes.dex */
final class zzac extends AbstractC0731e {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, i iVar, o oVar, boolean z7) {
        super(iVar, oVar);
        this.zza = z7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final void doExecute(b bVar) {
        boolean z7 = this.zza;
        d dVar = (d) ((f) ((zzam) bVar).getService());
        Parcel zza = dVar.zza();
        int i7 = zzc.zza;
        zza.writeInt(z7 ? 1 : 0);
        dVar.zzc(1, zza);
        setResult((zzac) new zzaj(Status.f9152e));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0732f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzac) ((t) obj));
    }
}
