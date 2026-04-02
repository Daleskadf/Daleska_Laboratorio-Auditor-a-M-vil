package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzro extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzrr zza;
    final /* synthetic */ zzrp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzro(zzrp zzrpVar, zzrr zzrrVar) {
        this.zza = zzrrVar;
        this.zzb = zzrpVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zzqk zzqkVar;
        boolean z;
        zzqk zzqkVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzrr zzrrVar = this.zzb.zza;
            zzqkVar = zzrrVar.zzq;
            if (zzqkVar != null) {
                z = zzrrVar.zzR;
                if (z) {
                    zzqkVar2 = zzrrVar.zzq;
                    zzqkVar2.zzb();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzqk zzqkVar;
        boolean z;
        zzqk zzqkVar2;
        audioTrack2 = this.zzb.zza.zzu;
        if (audioTrack.equals(audioTrack2)) {
            zzrr zzrrVar = this.zzb.zza;
            zzqkVar = zzrrVar.zzq;
            if (zzqkVar != null) {
                z = zzrrVar.zzR;
                if (z) {
                    zzqkVar2 = zzrrVar.zzq;
                    zzqkVar2.zzb();
                }
            }
        }
    }
}
