package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbon implements zzbky {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbpb zzb;
    final /* synthetic */ zzbnx zzc;
    final /* synthetic */ zzbpc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbon(zzbpc zzbpcVar, long j, zzbpb zzbpbVar, zzbnx zzbnxVar) {
        this.zza = j;
        this.zzb = zzbpbVar;
        this.zzc = zzbnxVar;
        this.zzd = zzbpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        zzbpd zzbpdVar = (zzbpd) obj;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zza;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + currentTimeMillis + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbnx zzbnxVar = this.zzc;
                zzbnxVar.zzq("/log", zzbkx.zzg);
                zzbnxVar.zzq("/result", zzbkx.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
