package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzr extends TimerTask {
    final /* synthetic */ MediaQueue zza;

    public zzr(MediaQueue mediaQueue) {
        this.zza = mediaQueue;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MediaQueue.zzj(this.zza);
    }
}
