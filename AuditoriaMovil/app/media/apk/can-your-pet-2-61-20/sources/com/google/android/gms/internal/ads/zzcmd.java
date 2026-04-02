package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcmd implements zzffh {
    private final zzckh zza;
    private final zzcmd zzb = this;
    private final zzhje zzc;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcmd(zzckh zzckhVar, Context context, String str, zzcmc zzcmcVar) {
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzhje zzhjeVar3;
        zzhje zzhjeVar4;
        zzhje zzhjeVar5;
        zzhje zzhjeVar6;
        zzhje zzhjeVar7;
        zzhje zzhjeVar8;
        this.zza = zzckhVar;
        zzhiv zza = zzhiw.zza(context);
        this.zzc = zza;
        zzhjeVar = zzckhVar.zzaD;
        zzhjeVar2 = zzckhVar.zzaE;
        zzfdh zzfdhVar = new zzfdh(zza, zzhjeVar, zzhjeVar2);
        this.zzd = zzfdhVar;
        zzhjeVar3 = zzckhVar.zzaD;
        zzhje zzc = zzhiu.zzc(new zzfer(zzhjeVar3));
        this.zze = zzc;
        zzhje zzc2 = zzhiu.zzc(zzfgf.zza());
        this.zzf = zzc2;
        zzhjeVar4 = zzckhVar.zzc;
        zzhjeVar5 = zzckhVar.zzO;
        zzhje zzc3 = zzhiu.zzc(new zzffb(zza, zzhjeVar4, zzhjeVar5, zzfdhVar, zzc, zzfgk.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzhiu.zzc(new zzffl(zzc3, zzc, zzc2));
        zzhiv zzc4 = zzhiw.zzc(str);
        this.zzi = zzc4;
        zzhjeVar6 = zzckhVar.zzl;
        zzhjeVar7 = zzckhVar.zzQ;
        zzhjeVar8 = zzckhVar.zzM;
        this.zzj = zzhiu.zzc(new zzfff(zzc4, zzc3, zza, zzc, zzc2, zzhjeVar6, zzhjeVar7, zzhjeVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final zzffe zza() {
        return (zzffe) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final zzffk zzb() {
        return (zzffk) this.zzh.zzb();
    }
}
