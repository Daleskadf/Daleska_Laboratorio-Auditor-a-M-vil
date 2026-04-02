package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaas implements zzaew<zzagw> {
    final /* synthetic */ zzzv zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzadp zzd;

    public zzaas(zzzv zzzvVar, String str, String str2, zzadp zzadpVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzadpVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzd.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        zzaij zzaijVar = new zzaij(zzagwVar.zzc(), this.zzb, this.zzc);
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(zzaijVar, new zzaav(this, this.zzd));
    }
}
