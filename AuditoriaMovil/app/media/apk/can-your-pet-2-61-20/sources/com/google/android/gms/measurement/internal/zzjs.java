package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzjs implements Runnable {
    private final /* synthetic */ zzjc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjs(zzjc zzjcVar) {
        this.zza = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }
}
