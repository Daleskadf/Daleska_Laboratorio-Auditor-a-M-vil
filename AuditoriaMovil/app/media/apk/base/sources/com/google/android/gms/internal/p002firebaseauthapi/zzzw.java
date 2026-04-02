package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzw implements zzaew<zzaii> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzzw(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaii zzaiiVar) {
        zzaii zzaiiVar2 = zzaiiVar;
        if (zzaiiVar2.zzf()) {
            this.zza.zza(new zzzs(zzaiiVar2.zzc(), zzaiiVar2.zze(), null));
            return;
        }
        this.zzb.zza(new zzagw(zzaiiVar2.zzd(), zzaiiVar2.zzb(), Long.valueOf(zzaiiVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
