package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrw implements zzqk {
    final /* synthetic */ zzrx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrw(zzrx zzrxVar, zzrv zzrvVar) {
        this.zza = zzrxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zza(Exception exc) {
        zzfe.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzrx.zzae(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zzb() {
        zzrx zzrxVar = this.zza;
        if (zzrx.zzad(zzrxVar) != null) {
            zzrx.zzad(zzrxVar).zzb();
        }
    }
}
