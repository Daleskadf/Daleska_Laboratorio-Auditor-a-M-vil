package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzjn implements FutureCallback<Object> {
    private final /* synthetic */ zzna zza;
    private final /* synthetic */ zzjc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(zzjc zzjcVar, zzna zznaVar) {
        this.zza = zznaVar;
        this.zzb = zzjcVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) {
        int i;
        int i2;
        int i3;
        int i4;
        this.zzb.zzt();
        this.zzb.zzh = false;
        if (!this.zzb.zze().zza(zzbf.zzcj)) {
            this.zzb.zzap();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
            return;
        }
        this.zzb.zzaj().add(this.zza);
        i = this.zzb.zzi;
        if (i > 64) {
            this.zzb.zzi = 1;
            this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzfz.zza(this.zzb.zzg().zzad()), zzfz.zza(th.toString()));
            return;
        }
        zzgb zzu = this.zzb.zzj().zzu();
        Object zza = zzfz.zza(this.zzb.zzg().zzad());
        i2 = this.zzb.zzi;
        zzu.zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zza, zzfz.zza(String.valueOf(i2)), zzfz.zza(th.toString()));
        zzjc zzjcVar = this.zzb;
        i3 = zzjcVar.zzi;
        zzjc.zzb(zzjcVar, i3);
        zzjc zzjcVar2 = this.zzb;
        i4 = zzjcVar2.zzi;
        zzjcVar2.zzi = i4 << 1;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        if (this.zzb.zze().zza(zzbf.zzcj)) {
            SparseArray<Long> zzh = this.zzb.zzk().zzh();
            zzh.put(this.zza.zzc, Long.valueOf(this.zza.zzb));
            this.zzb.zzk().zza(zzh);
            this.zzb.zzh = false;
            this.zzb.zzi = 1;
            this.zzb.zzj().zzc().zza("Successfully registered trigger URI", this.zza.zza);
            this.zzb.zzap();
            return;
        }
        this.zzb.zzh = false;
        this.zzb.zzap();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }
}
