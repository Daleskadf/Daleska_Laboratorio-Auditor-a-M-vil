package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfou implements Runnable {
    final /* synthetic */ zzfoz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfou(zzfoz zzfozVar) {
        this.zza = zzfozVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfot zzfotVar;
        zzfotVar = this.zza.zzl;
        zzfotVar.zzb();
    }
}
