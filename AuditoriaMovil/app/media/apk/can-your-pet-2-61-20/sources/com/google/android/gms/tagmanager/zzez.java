package com.google.android.gms.tagmanager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzez implements Runnable {
    final /* synthetic */ zzfe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzez(zzfe zzfeVar) {
        this.zza = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcc zzccVar;
        zzccVar = this.zza.zzd;
        zzccVar.zza();
    }
}
