package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmt {
    protected long zza;
    final /* synthetic */ zzmn zzb;
    private long zzc;
    private final zzat zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(long j) {
        long j2 = j - this.zza;
        this.zza = j;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzmt zzmtVar) {
        zzmtVar.zzb.zzt();
        zzmtVar.zza(false, false, zzmtVar.zzb.zzb().elapsedRealtime());
        zzmtVar.zzb.zzc().zza(zzmtVar.zzb.zzb().elapsedRealtime());
    }

    public zzmt(zzmn zzmnVar) {
        this.zzb = zzmnVar;
        this.zzd = new zzmw(this, zzmnVar.zzu);
        long elapsedRealtime = zzmnVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzd.zza();
        this.zzc = 0L;
        this.zza = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j) {
        this.zzd.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(long j) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j;
        this.zza = j;
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j2 = j - this.zzc;
        if (!z && j2 < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = zza(j);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzny.zza(this.zzb.zzn().zza(!this.zzb.zze().zzv()), bundle, true);
        if (!z2) {
            this.zzb.zzm().zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zzc = j;
        this.zzd.zza();
        this.zzd.zza(zzbf.zzba.zza(null).longValue());
        return true;
    }
}
