package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzln implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdi zzb;
    private final /* synthetic */ zzld zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzln(zzld zzldVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzdi zzdiVar) {
        this.zza = zzoVar;
        this.zzb = zzdiVar;
        this.zzc = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        try {
            if (!this.zzc.zzk().zzn().zzj()) {
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zza((String) null);
                this.zzc.zzk().zze.zza(null);
                return;
            }
            zzfsVar = this.zzc.zzb;
            if (zzfsVar == null) {
                this.zzc.zzj().zzg().zza("Failed to get app instance id");
                return;
            }
            Preconditions.checkNotNull(this.zza);
            String zzb = zzfsVar.zzb(this.zza);
            if (zzb != null) {
                this.zzc.zzm().zza(zzb);
                this.zzc.zzk().zze.zza(zzb);
            }
            this.zzc.zzaq();
            this.zzc.zzq().zza(this.zzb, zzb);
        } catch (RemoteException e) {
            this.zzc.zzj().zzg().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzq().zza(this.zzb, (String) null);
        }
    }
}
