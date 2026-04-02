package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcck implements Runnable {
    final /* synthetic */ zzccr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcck(zzccr zzccrVar) {
        this.zza = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccs zzccsVar;
        zzccs zzccsVar2;
        zzccr zzccrVar = this.zza;
        zzccsVar = zzccrVar.zzq;
        if (zzccsVar != null) {
            zzccsVar2 = zzccrVar.zzq;
            zzccsVar2.zza();
        }
    }
}
