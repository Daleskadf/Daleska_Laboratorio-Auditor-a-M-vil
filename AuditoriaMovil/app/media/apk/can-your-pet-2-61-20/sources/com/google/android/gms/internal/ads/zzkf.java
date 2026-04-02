package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzkf {
    public static zzpb zza(Context context, zzko zzkoVar, boolean z, String str) {
        LogSessionId logSessionId;
        zzox zzb = zzox.zzb(context);
        if (zzb == null) {
            zzfe.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zzpb(logSessionId, str);
        }
        if (z) {
            zzkoVar.zzz(zzb);
        }
        return new zzpb(zzb.zza(), str);
    }
}
