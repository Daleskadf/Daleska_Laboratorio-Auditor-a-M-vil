package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbos implements zzcby {
    final /* synthetic */ zzbpb zza;
    final /* synthetic */ zzfkw zzb;
    final /* synthetic */ zzbpc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbos(zzbpc zzbpcVar, zzbpb zzbpbVar, zzfkw zzfkwVar) {
        this.zza = zzbpbVar;
        this.zzb = zzfkwVar;
        this.zzc = zzbpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void zza() {
        Object obj;
        zzflk zzflkVar;
        zzflk zzflkVar2;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        obj = this.zzc.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
                zzbpc zzbpcVar = this.zzc;
                zzflkVar = zzbpcVar.zze;
                if (zzflkVar != null) {
                    zzflkVar2 = zzbpcVar.zze;
                    zzfkw zzfkwVar = this.zzb;
                    zzfkwVar.zzc("Failed loading new engine");
                    zzfkwVar.zzg(false);
                    zzflkVar2.zzb(zzfkwVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
