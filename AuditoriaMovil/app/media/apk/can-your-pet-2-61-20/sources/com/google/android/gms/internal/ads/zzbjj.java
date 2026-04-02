package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbjj {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbhz zzc;

    public zzbjj(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    public final synchronized zzbhz zzf(zzbhy zzbhyVar) {
        zzbhz zzbhzVar = this.zzc;
        if (zzbhzVar != null) {
            return zzbhzVar;
        }
        zzbhz zzbhzVar2 = new zzbhz(zzbhyVar);
        this.zzc = zzbhzVar2;
        return zzbhzVar2;
    }

    public final zzbii zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbjg(this, null);
    }

    public final zzbil zzd() {
        return new zzbji(this, null);
    }
}
