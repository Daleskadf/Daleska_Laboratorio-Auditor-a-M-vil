package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgev {
    public static zzgep zza(ExecutorService executorService) {
        zzgep zzgerVar;
        if (executorService instanceof zzgep) {
            return (zzgep) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgerVar = new zzgeu((ScheduledExecutorService) executorService);
        } else {
            zzgerVar = new zzger(executorService);
        }
        return zzgerVar;
    }

    public static Executor zzb() {
        return zzgds.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzgcs zzgcsVar) {
        executor.getClass();
        return executor == zzgds.INSTANCE ? executor : new zzgeq(executor, zzgcsVar);
    }
}
