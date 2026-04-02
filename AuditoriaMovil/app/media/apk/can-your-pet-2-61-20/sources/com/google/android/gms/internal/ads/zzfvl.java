package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfvl extends zzfvh {
    final /* synthetic */ zzfvr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvl(zzfvr zzfvrVar) {
        this.zza = zzfvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfvg zzfvgVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfvg zzfvgVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzfvgVar2 = this.zza.zzc;
                    zzfvgVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfvr zzfvrVar = this.zza;
            iInterface = zzfvrVar.zzn;
            if (iInterface != null) {
                zzfvgVar = zzfvrVar.zzc;
                zzfvgVar.zzc("Unbind from service.", new Object[0]);
                zzfvr zzfvrVar2 = this.zza;
                context = zzfvrVar2.zzb;
                serviceConnection = zzfvrVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
