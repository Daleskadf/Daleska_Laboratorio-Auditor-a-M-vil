package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqo implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaqq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqo(zzaqq zzaqqVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzarb zzarbVar;
        zzarb zzarbVar2;
        zzarbVar = this.zzc.zza;
        zzarbVar.zza(this.zza, this.zzb);
        zzaqq zzaqqVar = this.zzc;
        zzarbVar2 = zzaqqVar.zza;
        zzarbVar2.zzb(zzaqqVar.toString());
    }
}
