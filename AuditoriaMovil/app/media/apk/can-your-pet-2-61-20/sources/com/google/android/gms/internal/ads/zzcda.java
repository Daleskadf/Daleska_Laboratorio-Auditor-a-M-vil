package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcda implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcdb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcda(zzcdb zzcdbVar, boolean z) {
        this.zza = z;
        this.zzb = zzcdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
