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
final class zzae extends AbstractC0731e {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, i iVar, o oVar, String str) {
        super(iVar, oVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ t createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final void doExecute(b bVar) {
        zzad zzadVar = new zzad(this);
        String str = this.zza;
        d dVar = (d) ((f) ((zzam) bVar).getService());
        Parcel zza = dVar.zza();
        zzc.zzd(zza, zzadVar);
        zza.writeString(str);
        dVar.zzc(2, zza);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0732f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzae) ((t) obj));
    }
}
