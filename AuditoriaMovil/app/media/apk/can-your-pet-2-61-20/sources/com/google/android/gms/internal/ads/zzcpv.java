package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpv implements zzgea {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcpw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpv(zzcpw zzcpwVar, String str) {
        this.zza = str;
        this.zzb = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzfgu zzfguVar;
        zzfmp zzfmpVar;
        zzffz zzffzVar;
        zzffn zzffnVar;
        List zzu;
        zzcpw zzcpwVar = this.zzb;
        zzfguVar = zzcpwVar.zzh;
        zzfmpVar = zzcpwVar.zzg;
        zzffzVar = zzcpwVar.zze;
        zzffnVar = zzcpwVar.zzf;
        zzu = zzcpwVar.zzu();
        zzfguVar.zza(zzfmpVar.zzd(zzffzVar, zzffnVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfgu zzfguVar;
        zzfmp zzfmpVar;
        zzffz zzffzVar;
        zzffn zzffnVar;
        List zzu;
        zzcpw zzcpwVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzfguVar = zzcpwVar.zzh;
        zzfmpVar = zzcpwVar.zzg;
        zzffzVar = zzcpwVar.zze;
        zzffnVar = zzcpwVar.zzf;
        zzu = zzcpwVar.zzu();
        zzfguVar.zza(zzfmpVar.zzd(zzffzVar, zzffnVar, false, str, str2, zzu));
    }
}
