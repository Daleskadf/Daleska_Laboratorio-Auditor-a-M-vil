package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzccl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzccr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccl(zzccr zzccrVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccs zzccsVar;
        zzccs zzccsVar2;
        zzccr zzccrVar = this.zzc;
        zzccsVar = zzccrVar.zzq;
        if (zzccsVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzccsVar2 = zzccrVar.zzq;
            zzccsVar2.zzb(str, str2);
        }
    }
}
