package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import java.util.Set;
import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbp extends TimerTask {
    final /* synthetic */ RemoteMediaClient zza;
    final /* synthetic */ zzbq zzb;

    public zzbp(zzbq zzbqVar, RemoteMediaClient remoteMediaClient) {
        this.zzb = zzbqVar;
        this.zza = remoteMediaClient;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Set set;
        Handler handler;
        long j10;
        zzbq zzbqVar = this.zzb;
        RemoteMediaClient remoteMediaClient = zzbqVar.zza;
        set = zzbqVar.zzb;
        remoteMediaClient.zzr(set);
        handler = this.zzb.zza.zzc;
        j10 = this.zzb.zzc;
        handler.postDelayed(this, j10);
    }
}
