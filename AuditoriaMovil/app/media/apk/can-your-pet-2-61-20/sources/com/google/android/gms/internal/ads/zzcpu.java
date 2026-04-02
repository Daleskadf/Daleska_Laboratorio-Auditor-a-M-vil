package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcpu implements zzgea {
    final /* synthetic */ zzcpw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpu(zzcpw zzcpwVar) {
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfgu zzfguVar;
        zzfmp zzfmpVar;
        zzffz zzffzVar;
        zzffn zzffnVar;
        zzffn zzffnVar2;
        Context context;
        zzcpw zzcpwVar = this.zza;
        String str = (String) obj;
        zzfguVar = zzcpwVar.zzh;
        zzfmpVar = zzcpwVar.zzg;
        zzffzVar = zzcpwVar.zze;
        zzffnVar = zzcpwVar.zzf;
        zzffnVar2 = zzcpwVar.zzf;
        List zzd = zzfmpVar.zzd(zzffzVar, zzffnVar, false, "", str, zzffnVar2.zzc);
        zzcpw zzcpwVar2 = this.zza;
        zzcbh zzo = com.google.android.gms.ads.internal.zzu.zzo();
        context = zzcpwVar2.zza;
        zzfguVar.zzc(zzd, true == zzo.zzz(context) ? 2 : 1);
    }
}
