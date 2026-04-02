package com.google.android.gms.internal.auth;

import O2.d;
import O2.f;
import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0731e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
/* loaded from: classes.dex */
final class zzag extends AbstractC0731e {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, i iVar, o oVar, Account account) {
        super(iVar, oVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final void doExecute(b bVar) {
        zzaf zzafVar = new zzaf(this);
        Account account = this.zza;
        d dVar = (d) ((f) ((zzam) bVar).getService());
        Parcel zza = dVar.zza();
        zzc.zzd(zza, zzafVar);
        zzc.zzc(zza, account);
        dVar.zzc(3, zza);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0732f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzag) ((t) obj));
    }
}
