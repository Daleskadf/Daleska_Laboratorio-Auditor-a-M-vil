package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import h3.AbstractC1079a;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaav  reason: invalid package */
/* loaded from: classes.dex */
final class zzaav implements zzaew<zzaim> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzaas zzb;

    public zzaav(zzaas zzaasVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzaasVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaim zzaimVar) {
        zzaim zzaimVar2 = zzaimVar;
        if (!TextUtils.isEmpty(zzaimVar2.zza()) && !TextUtils.isEmpty(zzaimVar2.zzb())) {
            this.zzb.zza.zza(new zzagw(zzaimVar2.zzb(), zzaimVar2.zza(), Long.valueOf(zzagy.zza(zzaimVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
            return;
        }
        this.zza.zza(AbstractC1079a.y("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
