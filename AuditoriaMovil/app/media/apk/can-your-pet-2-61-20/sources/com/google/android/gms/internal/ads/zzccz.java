package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccz implements Runnable {
    final /* synthetic */ zzcdb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccz(zzcdb zzcdbVar) {
        this.zza = zzcdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
