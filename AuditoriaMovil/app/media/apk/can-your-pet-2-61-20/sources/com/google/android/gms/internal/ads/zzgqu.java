package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgqu implements zzggh {
    private final zzgos zza;
    private final zzgrt zzb;
    private final zzgrt zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgqu(zzgos zzgosVar, zzgqt zzgqtVar) {
        zzgrt zzgrtVar;
        this.zza = zzgosVar;
        if (zzgosVar.zzg()) {
            zzgru zzb = zzgnp.zza().zzb();
            zzgrz zza = zzgnh.zza(zzgosVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzgrtVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzgrtVar = zzgnh.zza;
            this.zzb = zzgrtVar;
        }
        this.zzc = zzgrtVar;
    }
}
