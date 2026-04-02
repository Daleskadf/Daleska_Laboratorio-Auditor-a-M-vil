package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzkz implements Runnable {
    private final /* synthetic */ zzky zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkz(zzky zzkyVar) {
        this.zza = zzkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkv zzkvVar;
        zzky zzkyVar = this.zza;
        zzkvVar = zzkyVar.zzh;
        zzkyVar.zza = zzkvVar;
    }
}
