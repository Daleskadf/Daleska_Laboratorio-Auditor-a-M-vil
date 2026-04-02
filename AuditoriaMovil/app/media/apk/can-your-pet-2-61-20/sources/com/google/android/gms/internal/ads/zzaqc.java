package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqc extends Thread {
    private static final boolean zza = zzarc.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaqa zzd;
    private volatile boolean zze = false;
    private final zzard zzf;
    private final zzaqh zzg;

    public zzaqc(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaqa zzaqaVar, zzaqh zzaqhVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaqaVar;
        this.zzg = zzaqhVar;
        this.zzf = new zzard(this, blockingQueue2, zzaqhVar);
    }

    private void zzc() throws InterruptedException {
        zzaqq zzaqqVar = (zzaqq) this.zzb.take();
        zzaqqVar.zzm("cache-queue-take");
        zzaqqVar.zzt(1);
        try {
            zzaqqVar.zzw();
            zzapz zza2 = this.zzd.zza(zzaqqVar.zzj());
            if (zza2 == null) {
                zzaqqVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaqqVar)) {
                    this.zzc.put(zzaqqVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaqqVar.zzm("cache-hit-expired");
                    zzaqqVar.zze(zza2);
                    if (!this.zzf.zzc(zzaqqVar)) {
                        this.zzc.put(zzaqqVar);
                    }
                } else {
                    zzaqqVar.zzm("cache-hit");
                    zzaqw zzh = zzaqqVar.zzh(new zzaqm(zza2.zza, zza2.zzg));
                    zzaqqVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzaqqVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzaqqVar.zzj(), true);
                        zzaqqVar.zze(null);
                        if (!this.zzf.zzc(zzaqqVar)) {
                            this.zzc.put(zzaqqVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaqqVar.zzm("cache-hit-refresh-needed");
                        zzaqqVar.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzaqqVar)) {
                            this.zzg.zzb(zzaqqVar, zzh, new zzaqb(this, zzaqqVar));
                        } else {
                            this.zzg.zzb(zzaqqVar, zzh, null);
                        }
                    } else {
                        this.zzg.zzb(zzaqqVar, zzh, null);
                    }
                }
            }
        } finally {
            zzaqqVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzarc.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (!this.zze) {
                    zzarc.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
