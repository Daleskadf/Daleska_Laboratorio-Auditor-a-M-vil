package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqk extends Thread {
    private final BlockingQueue zza;
    private final zzaqj zzb;
    private final zzaqa zzc;
    private volatile boolean zzd = false;
    private final zzaqh zze;

    public zzaqk(BlockingQueue blockingQueue, zzaqj zzaqjVar, zzaqa zzaqaVar, zzaqh zzaqhVar) {
        this.zza = blockingQueue;
        this.zzb = zzaqjVar;
        this.zzc = zzaqaVar;
        this.zze = zzaqhVar;
    }

    private void zzb() throws InterruptedException {
        zzaqq zzaqqVar = (zzaqq) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaqqVar.zzt(3);
        try {
            try {
                zzaqqVar.zzm("network-queue-take");
                zzaqqVar.zzw();
                TrafficStats.setThreadStatsTag(zzaqqVar.zzc());
                zzaqm zza = this.zzb.zza(zzaqqVar);
                zzaqqVar.zzm("network-http-complete");
                if (!zza.zze || !zzaqqVar.zzv()) {
                    zzaqw zzh = zzaqqVar.zzh(zza);
                    zzaqqVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzaqqVar.zzj(), zzh.zzb);
                        zzaqqVar.zzm("network-cache-written");
                    }
                    zzaqqVar.zzq();
                    this.zze.zzb(zzaqqVar, zzh, null);
                    zzaqqVar.zzs(zzh);
                } else {
                    zzaqqVar.zzp("not-modified");
                    zzaqqVar.zzr();
                }
            } catch (zzaqz e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqqVar, e);
                zzaqqVar.zzr();
            } catch (Exception e2) {
                zzarc.zzc(e2, "Unhandled exception %s", e2.toString());
                zzaqz zzaqzVar = new zzaqz(e2);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqqVar, zzaqzVar);
                zzaqqVar.zzr();
            }
        } finally {
            zzaqqVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (!this.zzd) {
                    zzarc.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
