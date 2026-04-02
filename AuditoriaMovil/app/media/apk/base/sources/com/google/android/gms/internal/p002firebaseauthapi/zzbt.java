package com.google.android.gms.internal.p002firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbt  reason: invalid package */
/* loaded from: classes.dex */
public final class zzbt {
    private boolean zza;
    private zzbq zzb;
    private final zzcg zzc;
    private zzbw zzd;
    private zzbu zze;

    private zzbt(zzcg zzcgVar) {
        this.zzb = zzbq.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzcgVar;
    }

    public final zzbt zzb() {
        zzbw zzbwVar;
        zzbwVar = zzbw.zza;
        this.zzd = zzbwVar;
        return this;
    }

    public final zzbt zza() {
        zzbu zzbuVar = this.zze;
        if (zzbuVar != null) {
            zzbu.zza(zzbuVar);
        }
        this.zza = true;
        return this;
    }
}
