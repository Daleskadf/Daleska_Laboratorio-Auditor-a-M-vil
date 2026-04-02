package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcn extends zzcbw {
    final /* synthetic */ zzbct zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcn(zzbct zzbctVar) {
        this.zza = zzbctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzbct.zze(this.zza);
        return super.cancel(z);
    }
}
