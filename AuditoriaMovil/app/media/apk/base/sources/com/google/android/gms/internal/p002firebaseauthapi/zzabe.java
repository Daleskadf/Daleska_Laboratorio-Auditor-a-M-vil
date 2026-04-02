package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabe  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabe implements zzaew<zzagw> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzabe(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        zzafv zzafvVar = new zzafv(zzagwVar.zzc());
        zzaeuVar = this.zzb.zza;
        zzaeuVar.zza(zzafvVar, new zzabh(this, this.zza, this));
    }
}
