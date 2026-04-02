package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlj implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzld zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlj(zzld zzldVar, AtomicReference atomicReference, zzo zzoVar, Bundle bundle) {
        this.zza = atomicReference;
        this.zzb = zzoVar;
        this.zzc = bundle;
        this.zzd = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        synchronized (this.zza) {
            try {
                zzfsVar = this.zzd.zzb;
            } catch (RemoteException e) {
                this.zzd.zzj().zzg().zza("Failed to get trigger URIs; remote exception", e);
                this.zza.notify();
            }
            if (zzfsVar == null) {
                this.zzd.zzj().zzg().zza("Failed to get trigger URIs; not connected to service");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzfsVar.zza(this.zzb, this.zzc));
            this.zzd.zzaq();
            this.zza.notify();
        }
    }
}
