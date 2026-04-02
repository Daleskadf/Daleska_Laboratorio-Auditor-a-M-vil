package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzclz implements zzfdt {
    private final zzckh zza;
    private final zzclz zzb = this;
    private final zzhje zzc;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclz(zzckh zzckhVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcly zzclyVar) {
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzhje zzhjeVar3;
        zzhje zzhjeVar4;
        zzhje zzhjeVar5;
        zzhje zzhjeVar6;
        zzhje zzhjeVar7;
        this.zza = zzckhVar;
        zzhiv zza = zzhiw.zza(context);
        this.zzc = zza;
        zzhiv zza2 = zzhiw.zza(zzqVar);
        this.zzd = zza2;
        zzhiv zza3 = zzhiw.zza(str);
        this.zze = zza3;
        zzhjeVar = zzckhVar.zzM;
        zzhje zzc = zzhiu.zzc(new zzeob(zzhjeVar));
        this.zzf = zzc;
        zzhjeVar2 = zzckhVar.zzaD;
        zzhje zzc2 = zzhiu.zzc(new zzfer(zzhjeVar2));
        this.zzg = zzc2;
        zzhjeVar3 = zzckhVar.zzc;
        zzhjeVar4 = zzckhVar.zzO;
        zzhje zzc3 = zzhiu.zzc(new zzfdr(zza, zzhjeVar3, zzhjeVar4, zzc, zzc2, zzfgk.zza()));
        this.zzh = zzc3;
        zzhjeVar5 = zzckhVar.zzl;
        zzhjeVar6 = zzckhVar.zzQ;
        zzhjeVar7 = zzckhVar.zzM;
        this.zzi = zzhiu.zzc(new zzeoj(zza, zza2, zza3, zzc3, zzc, zzc2, zzhjeVar5, zzhjeVar6, zzhjeVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final zzeoi zza() {
        return (zzeoi) this.zzi.zzb();
    }
}
