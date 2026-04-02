package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfvk extends zzfvh {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfvh zzb;
    final /* synthetic */ zzfvr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvk(zzfvr zzfvrVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfvh zzfvhVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzfvhVar;
        this.zzc = zzfvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfvg zzfvgVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzfvr.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzfvgVar = this.zzc.zzc;
                zzfvgVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzfvr.zzp(this.zzc, this.zzb);
        }
    }
}
