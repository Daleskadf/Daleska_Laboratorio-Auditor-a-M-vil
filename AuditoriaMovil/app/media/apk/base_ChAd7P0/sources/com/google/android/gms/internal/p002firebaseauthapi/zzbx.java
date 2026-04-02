package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbx  reason: invalid package */
/* loaded from: classes.dex */
public final class zzbx {
    private final zzwl.zzb zza;

    private zzbx(zzwl.zzb zzbVar) {
        this.zza = zzbVar;
    }

    public final synchronized zzbs zza() {
        return zzbs.zza((zzwl) ((zzakg) this.zza.zze()));
    }

    public static zzbx zza(zzbs zzbsVar) {
        return new zzbx(zzbsVar.zzb().zzn());
    }
}
