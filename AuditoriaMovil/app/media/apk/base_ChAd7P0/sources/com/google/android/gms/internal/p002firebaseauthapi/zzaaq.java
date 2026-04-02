package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaaq implements zzaew<zzagw> {
    final /* synthetic */ zzzv zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzadp zzc;

    public zzaaq(zzzv zzzvVar, String str, zzadp zzadpVar) {
        this.zzb = str;
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
        zzagw zzagwVar2 = zzagwVar;
        zzagj zzagjVar = new zzagj(zzagwVar2.zzc());
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(zzagjVar, new zzaat(this, this, zzagwVar2, this.zzb, this.zzc));
    }
}
