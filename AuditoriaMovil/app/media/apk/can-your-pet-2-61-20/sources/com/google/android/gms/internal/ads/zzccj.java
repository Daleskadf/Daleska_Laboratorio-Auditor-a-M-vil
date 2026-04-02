package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzccj implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzccr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccj(zzccr zzccrVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzccrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccs zzccsVar;
        zzccs zzccsVar2;
        zzccr.zzl(this.zzb, this.zza);
        zzccr zzccrVar = this.zzb;
        zzccsVar = zzccrVar.zzq;
        if (zzccsVar != null) {
            zzccsVar2 = zzccrVar.zzq;
            zzccsVar2.zzf();
        }
    }
}
