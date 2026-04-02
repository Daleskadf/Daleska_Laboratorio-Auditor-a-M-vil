package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbq {
    final /* synthetic */ RemoteMediaClient zza;
    private final Set<RemoteMediaClient.ProgressListener> zzb = new HashSet();
    private final long zzc;
    private final Runnable zzd;
    private boolean zze;

    public zzbq(RemoteMediaClient remoteMediaClient, long j10) {
        this.zza = remoteMediaClient;
        this.zzc = j10;
        this.zzd = new zzbp(this, remoteMediaClient);
    }

    public final long zzb() {
        return this.zzc;
    }

    public final void zzd(RemoteMediaClient.ProgressListener progressListener) {
        this.zzb.add(progressListener);
    }

    public final void zze(RemoteMediaClient.ProgressListener progressListener) {
        this.zzb.remove(progressListener);
    }

    public final void zzf() {
        RemoteMediaClient.zza(this.zza).removeCallbacks(this.zzd);
        this.zze = true;
        RemoteMediaClient.zza(this.zza).postDelayed(this.zzd, this.zzc);
    }

    public final void zzg() {
        RemoteMediaClient.zza(this.zza).removeCallbacks(this.zzd);
        this.zze = false;
    }

    public final boolean zzh() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean zzi() {
        return this.zze;
    }
}
