package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcjz extends zzeye {
    private final zzezl zza;
    private final zzckh zzb;
    private final zzcjz zzc = this;
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
    public /* synthetic */ zzcjz(zzckh zzckhVar, zzezl zzezlVar, zzcjy zzcjyVar) {
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzhje zzhjeVar3;
        this.zzb = zzckhVar;
        this.zza = zzezlVar;
        zzezn zzeznVar = new zzezn(zzezlVar);
        this.zzd = zzeznVar;
        zzhje zzc = zzhiu.zzc(zzdtc.zza());
        this.zze = zzc;
        zzhje zzc2 = zzhiu.zzc(zzdta.zza());
        this.zzf = zzc2;
        zzhje zzc3 = zzhiu.zzc(zzdte.zza());
        this.zzg = zzc3;
        zzhje zzc4 = zzhiu.zzc(zzdtg.zza());
        this.zzh = zzc4;
        zzhiy zzc5 = zzhiz.zzc(4);
        zzc5.zzb(zzfkh.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfkh.BUILD_URL, zzc2);
        zzc5.zzb(zzfkh.HTTP, zzc3);
        zzc5.zzb(zzfkh.PRE_PROCESS, zzc4);
        zzhiz zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhjeVar = zzckhVar.zzh;
        zzhje zzc7 = zzhiu.zzc(new zzdth(zzeznVar, zzhjeVar, zzfji.zza(), zzc6));
        this.zzj = zzc7;
        zzhji zza = zzhjj.zza(0, 1);
        zza.zza(zzc7);
        zzhjj zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfkq zzfkqVar = new zzfkq(zzc8);
        this.zzl = zzfkqVar;
        zzfji zza2 = zzfji.zza();
        zzhjeVar2 = zzckhVar.zze;
        this.zzm = zzhiu.zzc(new zzfkp(zza2, zzhjeVar2, zzfkqVar));
        zzhjeVar3 = zzckhVar.zzz;
        this.zzn = zzhiu.zzc(new zzfli(zzhjeVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzeye
    public final zzewu zza() {
        zzcin zzcinVar;
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzcinVar = this.zzb.zza;
        Context zzb = zzcinVar.zzb();
        zzhjd.zzb(zzb);
        zzcav zzcavVar = new zzcav();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        zzezf zzezfVar = new zzezf(zzcavVar, zzgepVar, zzezm.zza(this.zza));
        zzgep zzgepVar2 = zzcbr.zza;
        zzhjd.zzb(zzgepVar2);
        zzhjeVar = this.zzb.zze;
        zzflh zzflhVar = (zzflh) this.zzn.zzb();
        zzhjeVar2 = this.zzb.zzM;
        zzduh zzduhVar = (zzduh) zzhjeVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeuz(zzezfVar, 0L, (ScheduledExecutorService) zzhjeVar.zzb()));
        return new zzewu(zzb, zzgepVar2, hashSet, zzflhVar, zzduhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeye
    public final zzfkn zzb() {
        return (zzfkn) this.zzm.zzb();
    }
}
