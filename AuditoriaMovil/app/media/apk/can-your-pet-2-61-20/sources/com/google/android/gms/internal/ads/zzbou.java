package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbou implements zzcca {
    final /* synthetic */ zzbow zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbou(zzbow zzbowVar) {
        this.zza = zzbowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbpb zzbpbVar;
        zzbpd zzbpdVar = (zzbpd) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbpbVar = this.zza.zzb;
        zzbpbVar.zzd();
    }
}
