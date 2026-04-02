package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzccr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccn(zzccr zzccrVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccs zzccsVar;
        zzccs zzccsVar2;
        zzccr zzccrVar = this.zzc;
        zzccsVar = zzccrVar.zzq;
        if (zzccsVar != null) {
            int i = this.zza;
            int i2 = this.zzb;
            zzccsVar2 = zzccrVar.zzq;
            zzccsVar2.zzj(i, i2);
        }
    }
}
