package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzckr implements zzfao {
    private final zzckh zza;
    private final zzckr zzb = this;
    private final zzhje zzc;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckr(zzckh zzckhVar, Context context, String str, zzckq zzckqVar) {
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzhje zzhjeVar3;
        zzhje zzhjeVar4;
        zzhje zzhjeVar5;
        zzhje zzhjeVar6;
        zzhje zzhjeVar7;
        zzhje zzhjeVar8;
        zzhje zzhjeVar9;
        this.zza = zzckhVar;
        zzhiv zza = zzhiw.zza(context);
        this.zzc = zza;
        zzhiv zza2 = zzhiw.zza(str);
        this.zzd = zza2;
        zzhjeVar = zzckhVar.zzaD;
        zzhjeVar2 = zzckhVar.zzaE;
        zzfdg zzfdgVar = new zzfdg(zza, zzhjeVar, zzhjeVar2);
        this.zze = zzfdgVar;
        zzhjeVar3 = zzckhVar.zzaD;
        zzhje zzc = zzhiu.zzc(new zzfbm(zzhjeVar3));
        this.zzf = zzc;
        zzhjeVar4 = zzckhVar.zzc;
        zzhjeVar5 = zzckhVar.zzO;
        zzfgk zza3 = zzfgk.zza();
        zzhjeVar6 = zzckhVar.zzl;
        zzhje zzc2 = zzhiu.zzc(new zzfbo(zza, zzhjeVar4, zzhjeVar5, zzfdgVar, zzc, zza3, zzhjeVar6));
        this.zzg = zzc2;
        zzhjeVar7 = zzckhVar.zzO;
        zzhjeVar8 = zzckhVar.zzl;
        zzhjeVar9 = zzckhVar.zzM;
        this.zzh = zzhiu.zzc(new zzfbu(zzhjeVar7, zza, zza2, zzc2, zzc, zzhjeVar8, zzhjeVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzfao
    public final zzfbt zza() {
        return (zzfbt) this.zzh.zzb();
    }
}
