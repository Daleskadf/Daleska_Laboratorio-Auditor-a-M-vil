package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlu implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdi zzc;
    private final /* synthetic */ zzld zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlu(zzld zzldVar, zzbd zzbdVar, String str, com.google.android.gms.internal.measurement.zzdi zzdiVar) {
        this.zza = zzbdVar;
        this.zzb = str;
        this.zzc = zzdiVar;
        this.zzd = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfs zzfsVar;
        try {
            zzfsVar = this.zzd.zzb;
            if (zzfsVar == null) {
                this.zzd.zzj().zzg().zza("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] zza = zzfsVar.zza(this.zza, this.zzb);
            this.zzd.zzaq();
            this.zzd.zzq().zza(this.zzc, zza);
        } catch (RemoteException e) {
            this.zzd.zzj().zzg().zza("Failed to send event to the service to bundle", e);
        } finally {
            this.zzd.zzq().zza(this.zzc, (byte[]) null);
        }
    }
}
