package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcc implements zzbar {
    final /* synthetic */ zzbcf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcc(zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbcf.zzh(this.zza);
        }
    }
}
