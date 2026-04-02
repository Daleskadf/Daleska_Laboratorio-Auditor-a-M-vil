package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlp implements Runnable {
    private final /* synthetic */ zzkv zza;
    private final /* synthetic */ zzld zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlp(zzld zzldVar, zzkv zzkvVar) {
        this.zza = zzkvVar;
        this.zzb = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        zzfsVar = this.zzb.zzb;
        if (zzfsVar == null) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzkv zzkvVar = this.zza;
            if (zzkvVar == null) {
                zzfsVar.zza(0L, (String) null, (String) null, this.zzb.zza().getPackageName());
            } else {
                zzfsVar.zza(zzkvVar.zzc, this.zza.zza, this.zza.zzb, this.zzb.zza().getPackageName());
            }
            this.zzb.zzaq();
        } catch (RemoteException e) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to the service", e);
        }
    }
}
