package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzlc implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzky zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlc(zzky zzkyVar, long j) {
        this.zza = j;
        this.zzb = zzkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}
