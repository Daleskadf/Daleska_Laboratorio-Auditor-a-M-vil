package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zznh implements Runnable {
    private final /* synthetic */ zzns zza;
    private final /* synthetic */ zzni zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznh(zzni zzniVar, zzns zznsVar) {
        this.zza = zznsVar;
        this.zzb = zzniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}
