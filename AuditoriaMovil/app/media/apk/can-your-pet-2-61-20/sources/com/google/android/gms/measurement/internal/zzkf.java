package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzkf implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzjc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkf(zzjc zzjcVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Long.valueOf(this.zzb.zze().zzc(this.zzb.zzg().zzad(), zzbf.zzam)));
            this.zza.notify();
        }
    }
}
