package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcb implements Runnable {
    final /* synthetic */ zzbcf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcb(zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcf.zzh(this.zza);
    }
}
