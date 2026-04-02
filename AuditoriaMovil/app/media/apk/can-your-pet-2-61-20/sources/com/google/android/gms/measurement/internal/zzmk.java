package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzmo;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmk<T extends Context & zzmo> {
    private final T zza;

    public final int zza(final Intent intent, int i, final int i2) {
        final zzfz zzj = zzhm.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmm
                @Override // java.lang.Runnable
                public final void run() {
                    zzmk.this.zza(i2, zzj, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhq(zzni.zza(this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    private final zzfz zzc() {
        return zzhm.zza(this.zza, null, null).zzj();
    }

    public zzmk(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzfz zzfzVar, Intent intent) {
        if (this.zza.zza(i)) {
            zzfzVar.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzp().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzfz zzfzVar, JobParameters jobParameters) {
        zzfzVar.zzp().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    public final void zza() {
        zzhm.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    public final void zzb() {
        zzhm.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
            return;
        }
        zzc().zzp().zza("onRebind called. action", intent.getAction());
    }

    private final void zza(Runnable runnable) {
        zzni zza = zzni.zza(this.zza);
        zza.zzl().zzb(new zzml(this, zza, runnable));
    }

    public final boolean zza(final JobParameters jobParameters) {
        final zzfz zzj = zzhm.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmj
                @Override // java.lang.Runnable
                public final void run() {
                    zzmk.this.zza(zzj, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
