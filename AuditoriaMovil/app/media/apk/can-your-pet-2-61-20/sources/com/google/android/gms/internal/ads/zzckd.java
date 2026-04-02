package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzckd extends zzeyg {
    private final zzexu zza;
    private final zzckh zzb;
    private final zzckd zzc = this;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;
    private final zzhje zzk;
    private final zzhje zzl;
    private final zzhje zzm;
    private final zzhje zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckd(zzckh zzckhVar, zzexu zzexuVar, zzckc zzckcVar) {
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzhje zzhjeVar3;
        this.zzb = zzckhVar;
        this.zza = zzexuVar;
        zzhjeVar = zzckhVar.zzz;
        this.zzd = zzhiu.zzc(new zzfli(zzhjeVar));
        zzeyc zzeycVar = new zzeyc(zzexuVar);
        this.zze = zzeycVar;
        zzhje zzc = zzhiu.zzc(zzdtc.zza());
        this.zzf = zzc;
        zzhje zzc2 = zzhiu.zzc(zzdta.zza());
        this.zzg = zzc2;
        zzhje zzc3 = zzhiu.zzc(zzdte.zza());
        this.zzh = zzc3;
        zzhje zzc4 = zzhiu.zzc(zzdtg.zza());
        this.zzi = zzc4;
        zzhiy zzc5 = zzhiz.zzc(4);
        zzc5.zzb(zzfkh.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfkh.BUILD_URL, zzc2);
        zzc5.zzb(zzfkh.HTTP, zzc3);
        zzc5.zzb(zzfkh.PRE_PROCESS, zzc4);
        zzhiz zzc6 = zzc5.zzc();
        this.zzj = zzc6;
        zzhjeVar2 = zzckhVar.zzh;
        zzhje zzc7 = zzhiu.zzc(new zzdth(zzeycVar, zzhjeVar2, zzfji.zza(), zzc6));
        this.zzk = zzc7;
        zzhji zza = zzhjj.zza(0, 1);
        zza.zza(zzc7);
        zzhjj zzc8 = zza.zzc();
        this.zzl = zzc8;
        zzfkq zzfkqVar = new zzfkq(zzc8);
        this.zzm = zzfkqVar;
        zzfji zza2 = zzfji.zza();
        zzhjeVar3 = zzckhVar.zze;
        this.zzn = zzhiu.zzc(new zzfkp(zza2, zzhjeVar3, zzfkqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeyg
    public final zzewu zza() {
        zzcin zzcinVar;
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzcin zzcinVar2;
        zzhje zzhjeVar3;
        zzcin zzcinVar3;
        zzhje zzhjeVar4;
        zzhje zzhjeVar5;
        zzhje zzhjeVar6;
        zzcin zzcinVar4;
        zzcin zzcinVar5;
        zzcin zzcinVar6;
        zzhje zzhjeVar7;
        zzhje zzhjeVar8;
        zzhje zzhjeVar9;
        zzhje zzhjeVar10;
        zzhje zzhjeVar11;
        zzhje zzhjeVar12;
        zzcinVar = this.zzb.zza;
        Context zzb = zzcinVar.zzb();
        zzhjd.zzb(zzb);
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        zzcav zzcavVar = new zzcav();
        zzgep zzgepVar2 = zzcbr.zza;
        zzhjd.zzb(zzgepVar2);
        zzezf zzezfVar = new zzezf(zzcavVar, zzgepVar2, zzexv.zza(this.zza));
        zzeur zza = zzeut.zza();
        zzhjeVar = this.zzb.zze;
        zzewr zza2 = zzfab.zza(zzezfVar, zza, (ScheduledExecutorService) zzhjeVar.zzb(), 0);
        zzbut zzbutVar = new zzbut();
        zzhjeVar2 = this.zzb.zze;
        zzcinVar2 = this.zzb.zza;
        Context zzb2 = zzcinVar2.zzb();
        zzhjd.zzb(zzb2);
        zzezp zzezpVar = new zzezp(zzbutVar, (ScheduledExecutorService) zzhjeVar2.zzb(), zzb2);
        zzhjeVar3 = this.zzb.zze;
        zzewr zzb3 = zzfab.zzb(zzezpVar, (ScheduledExecutorService) zzhjeVar3.zzb());
        zzcay zzcayVar = new zzcay();
        zzcinVar3 = this.zzb.zza;
        Context zzb4 = zzcinVar3.zzb();
        zzhjd.zzb(zzb4);
        zzhjeVar4 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhjeVar4.zzb();
        zzgep zzgepVar3 = zzcbr.zza;
        zzhjd.zzb(zzgepVar3);
        zzexu zzexuVar = this.zza;
        zzexm zza3 = zzexo.zza(zzcayVar, zzb4, scheduledExecutorService, zzgepVar3, zzexw.zza(zzexuVar), zzexy.zza(zzexuVar), zzexz.zza(zzexuVar));
        zzhjeVar5 = this.zzb.zze;
        zzewr zza4 = zzfac.zza(zza3, (ScheduledExecutorService) zzhjeVar5.zzb());
        zzgep zzgepVar4 = zzcbr.zza;
        zzhjd.zzb(zzgepVar4);
        zzfak zzfakVar = new zzfak(zzgepVar4);
        zzhjeVar6 = this.zzb.zze;
        zzewr zzc = zzfab.zzc(zzfakVar, (ScheduledExecutorService) zzhjeVar6.zzb());
        zzezz zzezzVar = zzezz.zza;
        zzcinVar4 = this.zzb.zza;
        Context zzb5 = zzcinVar4.zzb();
        zzhjd.zzb(zzb5);
        String zza5 = zzexv.zza(this.zza);
        zzgep zzgepVar5 = zzcbr.zza;
        zzhjd.zzb(zzgepVar5);
        zzeyi zzeyiVar = new zzeyi(null, zzb5, zza5, zzgepVar5);
        zzbcm zzbcmVar = new zzbcm();
        zzgep zzgepVar6 = zzcbr.zza;
        zzhjd.zzb(zzgepVar6);
        zzcinVar5 = this.zzb.zza;
        Context zzb6 = zzcinVar5.zzb();
        zzhjd.zzb(zzb6);
        zzbdj zzbdjVar = new zzbdj();
        zzgep zzgepVar7 = zzcbr.zza;
        zzhjd.zzb(zzgepVar7);
        zzcay zzcayVar2 = new zzcay();
        zzgep zzgepVar8 = zzcbr.zza;
        zzhjd.zzb(zzgepVar8);
        zzexu zzexuVar2 = this.zza;
        zzcay zzcayVar3 = new zzcay();
        zzexu zzexuVar3 = this.zza;
        zzckh zzckhVar = this.zzb;
        int zza6 = zzexw.zza(zzexuVar3);
        zzcinVar6 = zzckhVar.zza;
        Context zzb7 = zzcinVar6.zzb();
        zzhjd.zzb(zzb7);
        zzhjeVar7 = this.zzb.zzad;
        zzcbh zzcbhVar = (zzcbh) zzhjeVar7.zzb();
        zzhjeVar8 = this.zzb.zze;
        zzgep zzgepVar9 = zzcbr.zza;
        zzhjd.zzb(zzgepVar9);
        zzhjeVar9 = this.zzb.zzaH;
        String zza7 = zzexv.zza(this.zza);
        zzbca zzbcaVar = new zzbca();
        zzhjeVar10 = this.zzb.zzad;
        zzhjeVar11 = this.zzb.zze;
        zzgep zzgepVar10 = zzcbr.zza;
        zzhjd.zzb(zzgepVar10);
        zzfzs zzs = zzfzs.zzs(zza2, zzb3, zza4, zzc, zzezzVar, zzeyiVar, new zzeyx(zzbcmVar, zzgepVar6, zzb6), new zzezj(zzbdjVar, zzgepVar7, zzexx.zza(this.zza)), new zzexs(zzcayVar2, zzgepVar8, zzeya.zza(zzexuVar2), zzeyb.zza(zzexuVar2), zzexw.zza(zzexuVar2)), new zzeyt(zzcayVar3, zza6, zzb7, zzcbhVar, (ScheduledExecutorService) zzhjeVar8.zzb(), zzgepVar9, zzexv.zza(this.zza)), (zzewr) zzhjeVar9.zzb(), zzeyp.zza(zza7, zzbcaVar, (zzcbh) zzhjeVar10.zzb(), (ScheduledExecutorService) zzhjeVar11.zzb(), zzgepVar10));
        zzflh zzflhVar = (zzflh) this.zzd.zzb();
        zzhjeVar12 = this.zzb.zzM;
        return new zzewu(zzb, zzgepVar, zzs, zzflhVar, (zzduh) zzhjeVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeyg
    public final zzfkn zzb() {
        return (zzfkn) this.zzn.zzb();
    }
}
