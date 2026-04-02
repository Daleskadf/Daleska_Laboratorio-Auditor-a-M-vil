package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzboy implements zzcby {
    final /* synthetic */ zzbow zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboy(zzbpb zzbpbVar, zzbow zzbowVar) {
        this.zza = zzbowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhI)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
