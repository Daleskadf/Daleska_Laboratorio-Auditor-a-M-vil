package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqb implements Runnable {
    final /* synthetic */ zzaqq zza;
    final /* synthetic */ zzaqc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqb(zzaqc zzaqcVar, zzaqq zzaqqVar) {
        this.zza = zzaqqVar;
        this.zzb = zzaqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
