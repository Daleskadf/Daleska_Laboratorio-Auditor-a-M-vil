package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzss implements zzte {
    private final zzfxh zzb;
    private final zzfxh zzc;
    private boolean zzd;

    public zzss(int i) {
        zzsq zzsqVar = new zzsq(i);
        zzsr zzsrVar = new zzsr(i);
        this.zzb = zzsqVar;
        this.zzc = zzsrVar;
        this.zzd = true;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        String zzr;
        zzr = zzsu.zzr(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzr);
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        String zzr;
        zzr = zzsu.zzr(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzr);
    }

    public final zzsu zzc(zztd zztdVar) throws IOException {
        MediaCodec mediaCodec;
        zztg zzsyVar;
        int i;
        zzsu zzsuVar;
        String str = zztdVar.zza.zza;
        zzsu zzsuVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.zzd) {
                        zzam zzamVar = zztdVar.zzc;
                        if (zzfx.zza >= 34 && zzcb.zzh(zzamVar.zzm)) {
                            zzsyVar = new zzuf(mediaCodec);
                            i = 4;
                            zzsuVar = new zzsu(mediaCodec, zza(((zzsq) this.zzb).zza), zzsyVar, null);
                            Trace.endSection();
                            zzsu.zzh(zzsuVar, zztdVar.zzb, zztdVar.zzd, null, i);
                            return zzsuVar;
                        }
                    }
                    Trace.endSection();
                    zzsu.zzh(zzsuVar, zztdVar.zzb, zztdVar.zzd, null, i);
                    return zzsuVar;
                } catch (Exception e) {
                    e = e;
                    zzsuVar2 = zzsuVar;
                    if (zzsuVar2 != null) {
                        zzsuVar2.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                zzsyVar = new zzsy(mediaCodec, zzb(((zzsr) this.zzc).zza));
                i = 0;
                zzsuVar = new zzsu(mediaCodec, zza(((zzsq) this.zzb).zza), zzsyVar, null);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final /* bridge */ /* synthetic */ zztf zzd(zztd zztdVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzd = true;
    }
}
