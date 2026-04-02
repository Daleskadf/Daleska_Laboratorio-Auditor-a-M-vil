package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, O2.c
    public final void zzc(boolean z7) {
        Status status;
        zzag zzagVar = this.zza;
        if (z7) {
            status = Status.f9152e;
        } else {
            status = zzal.zza;
        }
        zzagVar.setResult((zzag) new zzak(status));
    }
}
