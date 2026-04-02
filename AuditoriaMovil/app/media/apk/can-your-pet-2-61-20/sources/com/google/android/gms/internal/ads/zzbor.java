package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbor implements zzcca {
    final /* synthetic */ zzbpb zza;
    final /* synthetic */ zzfkw zzb;
    final /* synthetic */ zzbpc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbor(zzbpc zzbpcVar, zzbpb zzbpbVar, zzfkw zzfkwVar) {
        this.zza = zzbpbVar;
        this.zzb = zzfkwVar;
        this.zzc = zzbpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbpb zzbpbVar;
        zzflk zzflkVar;
        zzflk zzflkVar2;
        zzbpb zzbpbVar2;
        zzbpb zzbpbVar3;
        zzbnx zzbnxVar = (zzbnx) obj;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbpc zzbpcVar = this.zzc;
            zzbpbVar = zzbpcVar.zzh;
            if (zzbpbVar != null) {
                zzbpb zzbpbVar4 = this.zza;
                zzbpbVar2 = zzbpcVar.zzh;
                if (zzbpbVar4 != zzbpbVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbpbVar3 = this.zzc.zzh;
                    zzbpbVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbfm.zzd.zze()).booleanValue()) {
                zzbpc zzbpcVar2 = this.zzc;
                zzflkVar = zzbpcVar2.zze;
                if (zzflkVar != null) {
                    zzflkVar2 = zzbpcVar2.zze;
                    zzfkw zzfkwVar = this.zzb;
                    zzfkwVar.zzg(true);
                    zzflkVar2.zzb(zzfkwVar.zzm());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
