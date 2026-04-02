package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdjo implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;

    public zzdjo(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcxy zza = ((zzcyi) this.zzb).zza();
        zzdeh zza2 = ((zzdfb) this.zzc).zza();
        zzdjd zza3 = ((zzdjf) this.zzd).zza();
        zzdbf zzb = ((zzcrl) this.zze).zzb();
        zzekd zzekdVar = (zzekd) this.zzf.zzb();
        zzcsl zze = ((zzcik) this.zza.zzb()).zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzemj(null));
        zze.zzg(new zzctn(zzb, null));
        zze.zzc(new zzcrj(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdy)).booleanValue()) {
            zze.zzj(zzekm.zzb(zzekdVar));
        }
        zzcty zzc = zze.zzk().zzc();
        zzhjd.zzb(zzc);
        return zzc;
    }
}
