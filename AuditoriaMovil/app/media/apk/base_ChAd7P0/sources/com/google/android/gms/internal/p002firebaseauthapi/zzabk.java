package com.google.android.gms.internal.p002firebaseauthapi;

import a4.G;
import h3.AbstractC1079a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabk implements zzaew<zzagw> {
    private final /* synthetic */ G zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzzv zzc;

    public zzabk(zzzv zzzvVar, G g3, zzadp zzadpVar) {
        this.zza = g3;
        this.zzb = zzadpVar;
        this.zzc = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(AbstractC1079a.y(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final void zza(zzagw zzagwVar) {
        zzagw zzagwVar2 = zzagwVar;
        zzahm zzahmVar = new zzahm();
        zzahmVar.zzd(zzagwVar2.zzc());
        G g3 = this.zza;
        if (g3.f6964c || g3.f6962a != null) {
            zzahmVar.zzb(g3.f6962a);
        }
        G g4 = this.zza;
        if (g4.f6965d || g4.f6966e != null) {
            zzahmVar.zzg(g4.f6963b);
        }
        zzzv.zza(this.zzc, this.zzb, zzagwVar2, zzahmVar, this);
    }
}
