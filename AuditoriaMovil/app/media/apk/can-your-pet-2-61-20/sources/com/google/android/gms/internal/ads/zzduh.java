package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduh {
    private final zzdum zza;
    private final Executor zzb;
    private final Map zzc;

    public zzduh(zzdum zzdumVar, Executor executor) {
        this.zza = zzdumVar;
        this.zzc = zzdumVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdum zzb(zzduh zzduhVar) {
        return zzduhVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzduh zzduhVar) {
        return zzduhVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzduh zzduhVar) {
        return zzduhVar.zzb;
    }

    public final zzdug zza() {
        zzdug zzdugVar = new zzdug(this);
        zzdug.zza(zzdugVar);
        return zzdugVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlp)).booleanValue()) {
            zzdug zza = zza();
            zza.zzb("action", "pecr");
            zza.zzf();
        }
    }
}
