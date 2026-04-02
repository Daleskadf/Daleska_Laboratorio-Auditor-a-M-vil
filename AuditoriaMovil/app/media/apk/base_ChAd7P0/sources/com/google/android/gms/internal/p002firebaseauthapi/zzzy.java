package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzy  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzy implements zzaew<zzafx> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzzy(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzafx zzafxVar) {
        zzafx zzafxVar2 = zzafxVar;
        if (zzafxVar2.zzf()) {
            this.zza.zza(new zzzs(zzafxVar2.zzc(), zzafxVar2.zze(), null));
            return;
        }
        this.zzb.zza(new zzagw(zzafxVar2.zzd(), zzafxVar2.zzb(), Long.valueOf(zzafxVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzafxVar2.zzg()), null, this.zza, this);
    }
}
