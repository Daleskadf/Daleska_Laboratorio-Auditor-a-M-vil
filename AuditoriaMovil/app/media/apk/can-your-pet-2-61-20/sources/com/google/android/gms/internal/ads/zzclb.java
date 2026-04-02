package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzclb implements zzfcc {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzckh zzd;
    private final zzclb zze = this;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;
    private final zzhje zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclb(zzckh zzckhVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcla zzclaVar) {
        zzhje zzhjeVar;
        zzhje zzhjeVar2;
        zzhje zzhjeVar3;
        this.zzd = zzckhVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhiv zza = zzhiw.zza(context);
        this.zzf = zza;
        zzhiv zza2 = zzhiw.zza(zzqVar);
        this.zzg = zza2;
        zzhjeVar = zzckhVar.zzM;
        zzhje zzc = zzhiu.zzc(new zzeob(zzhjeVar));
        this.zzh = zzc;
        zzhje zzc2 = zzhiu.zzc(zzeog.zza());
        this.zzi = zzc2;
        zzhje zzc3 = zzhiu.zzc(zzddo.zza());
        this.zzj = zzc3;
        zzhjeVar2 = zzckhVar.zzc;
        zzhjeVar3 = zzckhVar.zzO;
        this.zzk = zzhiu.zzc(new zzfca(zza, zzhjeVar2, zza2, zzhjeVar3, zzc, zzc2, zzfgk.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final zzeng zza() {
        zzcin zzcinVar;
        zzhje zzhjeVar;
        zzfbz zzfbzVar = (zzfbz) this.zzk.zzb();
        zzeoa zzeoaVar = (zzeoa) this.zzh.zzb();
        zzcinVar = this.zzd.zza;
        VersionInfoParcel zze = zzcinVar.zze();
        zzhjd.zzb(zze);
        zzhjeVar = this.zzd.zzM;
        return new zzeng(this.zza, this.zzb, this.zzc, zzfbzVar, zzeoaVar, zze, (zzduh) zzhjeVar.zzb());
    }
}
