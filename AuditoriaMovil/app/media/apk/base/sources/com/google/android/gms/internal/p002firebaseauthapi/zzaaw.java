package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaaw implements zzaew<zzagw> {
    final /* synthetic */ zzzv zza;
    private final /* synthetic */ zzaga zzb;
    private final /* synthetic */ zzadp zzc;

    public zzaaw(zzzv zzzvVar, zzaga zzagaVar, zzadp zzadpVar) {
        this.zzb = zzagaVar;
        this.zzc = zzadpVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzc.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        this.zzb.zza(zzagwVar.zzc());
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(this.zzb, new zzaaz(this, this.zzc));
    }
}
