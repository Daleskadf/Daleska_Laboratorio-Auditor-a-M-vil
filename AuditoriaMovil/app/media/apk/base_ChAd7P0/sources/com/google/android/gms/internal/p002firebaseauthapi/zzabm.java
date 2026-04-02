package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabm  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabm implements zzaew<zzagw> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzzv zzc;

    public zzabm(zzzv zzzvVar, String str, zzadp zzadpVar) {
        this.zza = str;
        this.zzb = zzadpVar;
        this.zzc = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzagw zzagwVar2 = zzagwVar;
        String zzc = zzagwVar2.zzc();
        zzahm zzahmVar = new zzahm();
        zzahmVar.zzd(zzc).zzf(this.zza);
        zzzv.zza(this.zzc, this.zzb, zzagwVar2, zzahmVar, this);
    }
}
