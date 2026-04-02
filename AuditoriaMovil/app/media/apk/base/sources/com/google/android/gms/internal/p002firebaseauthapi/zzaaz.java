package com.google.android.gms.internal.p002firebaseauthapi;

import h3.AbstractC1079a;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaz  reason: invalid package */
/* loaded from: classes.dex */
final class zzaaz implements zzaew<zzafz> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzaaw zzb;

    public zzaaz(zzaaw zzaawVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzaawVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzafz zzafzVar) {
        zzafz zzafzVar2 = zzafzVar;
        this.zzb.zza.zza(new zzagw(zzafzVar2.zzb(), zzafzVar2.zza(), Long.valueOf(zzagy.zza(zzafzVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
