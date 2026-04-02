package com.google.android.gms.tagmanager;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzaz implements Runnable {
    final /* synthetic */ zzav zza;
    final /* synthetic */ zzbd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(zzbd zzbdVar, zzav zzavVar) {
        this.zzb = zzbdVar;
        this.zza = zzavVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(zzbd.zzf(this.zzb));
    }
}
