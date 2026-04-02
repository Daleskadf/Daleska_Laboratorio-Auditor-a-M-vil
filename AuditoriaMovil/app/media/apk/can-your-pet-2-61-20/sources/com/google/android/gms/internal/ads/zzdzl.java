package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdzl implements zzgea {
    final /* synthetic */ zzdzm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzl(zzdzm zzdzmVar) {
        this.zza = zzdzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        Pattern pattern;
        zzedz zzedzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
            pattern = zzdzm.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzedzVar = this.zza.zzf;
                zzedzVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzedz zzedzVar;
        zzedz zzedzVar2;
        zzffz zzffzVar = (zzffz) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
            zzedzVar = this.zza.zzf;
            zzedzVar.zzi(zzffzVar.zzb.zzb.zze);
            zzedzVar2 = this.zza.zzf;
            zzedzVar2.zzj(zzffzVar.zzb.zzb.zzf);
        }
    }
}
