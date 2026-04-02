package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzkj implements Runnable {
    private final /* synthetic */ zzav zza;
    private final /* synthetic */ zzjc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkj(zzjc zzjcVar, zzav zzavVar) {
        this.zza = zzavVar;
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb.zzk().zza(this.zza)) {
            this.zzb.zzj().zzp().zza("Setting DMA consent. consent", this.zza);
            if (this.zzb.zze().zza(zzbf.zzcp) && this.zzb.zzo().zzan()) {
                this.zzb.zzo().zzai();
                return;
            } else {
                this.zzb.zzo().zza(false);
                return;
            }
        }
        this.zzb.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.zza.zza()));
    }
}
