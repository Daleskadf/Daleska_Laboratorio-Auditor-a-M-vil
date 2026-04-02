package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzclp implements zzdvr {
    private final Context zza;
    private final zzblx zzb;
    private final zzckh zzc;
    private final zzclp zzd = this;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclp(zzckh zzckhVar, Context context, zzblx zzblxVar, zzclo zzcloVar) {
        this.zzc = zzckhVar;
        this.zza = context;
        this.zzb = zzblxVar;
        zzhiv zza = zzhiw.zza(this);
        this.zze = zza;
        zzhiv zza2 = zzhiw.zza(zzblxVar);
        this.zzf = zza2;
        zzdvn zzdvnVar = new zzdvn(zza2);
        this.zzg = zzdvnVar;
        this.zzh = zzhiu.zzc(new zzdvp(zza, zzdvnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdvr
    public final zzdvi zzb() {
        return new zzclj(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdvr
    public final zzdvo zzd() {
        return (zzdvo) this.zzh.zzb();
    }
}
