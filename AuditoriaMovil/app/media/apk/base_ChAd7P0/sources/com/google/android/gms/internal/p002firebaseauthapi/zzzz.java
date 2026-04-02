package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0457f;
import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzzz implements zzaew<zzagw> {
    private final /* synthetic */ C0457f zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzadp zzc;
    private final /* synthetic */ zzzv zzd;

    public zzzz(zzzv zzzvVar, C0457f c0457f, String str, zzadp zzadpVar) {
        this.zza = c0457f;
        this.zzb = str;
        this.zzc = zzadpVar;
        this.zzd = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzc.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        this.zzd.zza(new zzafy(this.zza, zzagwVar.zzc(), this.zzb), this.zzc);
    }
}
