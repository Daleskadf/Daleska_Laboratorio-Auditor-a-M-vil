package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqf;
import kotlinx.coroutines.DebugKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmr implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzms zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmr(zzms zzmsVar, long j, long j2) {
        this.zzc = zzmsVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmu
            @Override // java.lang.Runnable
            public final void run() {
                zzmr zzmrVar = zzmr.this;
                zzms zzmsVar = zzmrVar.zzc;
                long j = zzmrVar.zza;
                long j2 = zzmrVar.zzb;
                zzmsVar.zza.zzt();
                zzmsVar.zza.zzj().zzc().zza("Application going to the background");
                zzmsVar.zza.zzk().zzn.zza(true);
                zzmsVar.zza.zza(true);
                if (!zzmsVar.zza.zze().zzv()) {
                    if (zzmsVar.zza.zze().zza(zzbf.zzcm)) {
                        zzmsVar.zza.zza(false, false, j2);
                        zzmsVar.zza.zzb.zzb(j2);
                    } else {
                        zzmsVar.zza.zzb.zzb(j2);
                        zzmsVar.zza.zza(false, false, j2);
                    }
                }
                if (zzqf.zza() && zzmsVar.zza.zze().zza(zzbf.zzcd)) {
                    zzmsVar.zza.zzj().zzn().zza("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    zzmsVar.zza.zzm().zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, new Bundle());
                }
            }
        });
    }
}
