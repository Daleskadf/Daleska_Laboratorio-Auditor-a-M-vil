package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlo implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzld zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlo(zzld zzldVar, AtomicReference atomicReference, zzo zzoVar) {
        this.zza = atomicReference;
        this.zzb = zzoVar;
        this.zzc = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e) {
                this.zzc.zzj().zzg().zza("Failed to get app instance id", e);
                this.zza.notify();
            }
            if (!this.zzc.zzk().zzn().zzj()) {
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zza((String) null);
                this.zzc.zzk().zze.zza(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzfsVar = this.zzc.zzb;
            if (zzfsVar == null) {
                this.zzc.zzj().zzg().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzfsVar.zzb(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzm().zza(str);
                this.zzc.zzk().zze.zza(str);
            }
            this.zzc.zzaq();
            this.zza.notify();
        }
    }
}
