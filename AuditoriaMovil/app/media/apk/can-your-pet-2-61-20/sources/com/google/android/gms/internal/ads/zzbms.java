package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbms implements Runnable {
    final /* synthetic */ zzbmv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbms(zzbmv zzbmvVar) {
        this.zza = zzbmvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbmv.zzc(this.zza);
    }
}
