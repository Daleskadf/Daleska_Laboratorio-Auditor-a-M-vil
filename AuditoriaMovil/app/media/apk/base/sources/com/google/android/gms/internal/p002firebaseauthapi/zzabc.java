package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabc implements zzaew<zzagw> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzabc(zzzv zzzvVar, zzadp zzadpVar) {
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
        zzagw zzagwVar2 = zzagwVar;
        zzagj zzagjVar = new zzagj(zzagwVar2.zzc());
        zzaeuVar = this.zzb.zza;
        zzaeuVar.zza(zzagjVar, new zzabf(this, this, this.zza, zzagwVar2));
    }
}
