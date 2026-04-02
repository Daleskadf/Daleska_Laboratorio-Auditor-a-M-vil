package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaah  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaah implements zzaew<zzaig> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzaah(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaig zzaigVar) {
        zzaig zzaigVar2 = zzaigVar;
        this.zzb.zza(new zzagw(zzaigVar2.zzc(), zzaigVar2.zzb(), Long.valueOf(zzaigVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaigVar2.zzd()), null, this.zza, this);
    }
}
