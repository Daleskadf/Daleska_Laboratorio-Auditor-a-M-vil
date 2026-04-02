package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zztl {
    public static void zza(zztd zztdVar, zzpb zzpbVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId zza = zzpbVar.zza();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = zztdVar.zzb;
        stringId = zza.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
