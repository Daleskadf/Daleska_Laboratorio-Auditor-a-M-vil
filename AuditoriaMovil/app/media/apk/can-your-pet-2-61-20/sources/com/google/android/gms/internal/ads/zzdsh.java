package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdg;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdsh implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;

    public zzdsh(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzciq) this.zza).zza();
        final String zzb = ((zzdza) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcjc) this.zzc).zza();
        final zzbdg.zza.EnumC0007zza enumC0007zza = (zzbdg.zza.EnumC0007zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbcx zzbcxVar = new zzbcx(new zzbdf(zza));
        zzbdg.zzar.zza zzd = zzbdg.zzar.zzd();
        zzd.zzg(zza2.buddyApkVersion);
        zzd.zzi(zza2.clientJarVersion);
        zzd.zzh(true != zza2.isClientJar ? 2 : 0);
        final zzbdg.zzar zzbr = zzd.zzbr();
        zzbcxVar.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                zzbdg.zza.zzb zzcZ = zzaVar.zze().zzcZ();
                zzcZ.zzH(zzbdg.zza.EnumC0007zza.this);
                zzaVar.zzG(zzcZ);
                zzbdg.zzm.zza zzcZ2 = zzaVar.zzg().zzcZ();
                zzcZ2.zzm(zzb);
                zzcZ2.zzw(zzbr);
                zzaVar.zzK(zzcZ2);
                zzaVar.zzO(str);
            }
        });
        return zzbcxVar;
    }
}
