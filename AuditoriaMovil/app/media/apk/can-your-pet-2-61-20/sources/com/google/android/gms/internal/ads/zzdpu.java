package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpu implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcgz zzb;
    private final Context zzc;
    private final zzduh zzd;
    private final zzefd zze;
    private final Executor zzf;
    private final zzawo zzg;
    private final VersionInfoParcel zzh;
    private final zzfmt zzi;
    private final zzefo zzj;
    private final zzfgm zzk;

    public zzdpu(Context context, Executor executor, zzawo zzawoVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcgz zzcgzVar, zzefd zzefdVar, zzfmt zzfmtVar, zzduh zzduhVar, zzefo zzefoVar, zzfgm zzfgmVar) {
        this.zzc = context;
        this.zzf = executor;
        this.zzg = zzawoVar;
        this.zzh = versionInfoParcel;
        this.zza = zzaVar;
        this.zzb = zzcgzVar;
        this.zze = zzefdVar;
        this.zzi = zzfmtVar;
        this.zzd = zzduhVar;
        this.zzj = zzefoVar;
        this.zzk = zzfgmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Context zza(zzdpu zzdpuVar) {
        return zzdpuVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzawo zzb(zzdpu zzdpuVar) {
        return zzdpuVar.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdpu zzdpuVar) {
        return zzdpuVar.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdpu zzdpuVar) {
        return zzdpuVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzcgz zze(zzdpu zzdpuVar) {
        return zzdpuVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzduh zzf(zzdpu zzdpuVar) {
        return zzdpuVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzefd zzg(zzdpu zzdpuVar) {
        return zzdpuVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzefo zzh(zzdpu zzdpuVar) {
        return zzdpuVar.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfgm zzi(zzdpu zzdpuVar) {
        return zzdpuVar.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfmt zzj(zzdpu zzdpuVar) {
        return zzdpuVar.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Executor zzk(zzdpu zzdpuVar) {
        return zzdpuVar.zzf;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdpx zzdpxVar = new zzdpx(this);
        zzdpxVar.zzk();
        return zzdpxVar;
    }
}
