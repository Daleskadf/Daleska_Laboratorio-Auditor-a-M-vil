package com.google.android.gms.tagmanager;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzba implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzbd zzbdVar, String str) {
        this.zzb = zzbdVar;
        this.zza = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbd.zzg(this.zzb, this.zza);
    }
}
