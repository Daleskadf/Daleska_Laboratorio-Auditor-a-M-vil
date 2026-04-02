package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbzy extends zzcae {
    private final Clock zzb;
    private final zzbzy zzc = this;
    private final zzhje zzd;
    private final zzhje zze;
    private final zzhje zzf;
    private final zzhje zzg;
    private final zzhje zzh;
    private final zzhje zzi;
    private final zzhje zzj;
    private final zzhje zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbzy(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcad zzcadVar, zzbzx zzbzxVar) {
        this.zzb = clock;
        zzhiv zza = zzhiw.zza(context);
        this.zzd = zza;
        zzhiv zza2 = zzhiw.zza(zzgVar);
        this.zze = zza2;
        zzhiv zza3 = zzhiw.zza(zzcadVar);
        this.zzf = zza3;
        this.zzg = zzhiu.zzc(new zzbzq(zza, zza2, zza3));
        zzhiv zza4 = zzhiw.zza(clock);
        this.zzh = zza4;
        zzhje zzc = zzhiu.zzc(new zzbzs(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbzu zzbzuVar = new zzbzu(zza4, zzc);
        this.zzj = zzbzuVar;
        this.zzk = zzhiu.zzc(new zzcaj(zza, zzbzuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    final zzbzp zza() {
        return (zzbzp) this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzcae
    public final zzbzt zzb() {
        return new zzbzt(this.zzb, (zzbzr) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    final zzcai zzc() {
        return (zzcai) this.zzk.zzb();
    }
}
