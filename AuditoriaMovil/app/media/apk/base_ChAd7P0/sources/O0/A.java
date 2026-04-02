package O0;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
/* loaded from: classes.dex */
public abstract class A {
    public static P0.k a(Context context, H h8, boolean z7, String str) {
        PlaybackSession createPlaybackSession;
        P0.i iVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager b5 = P0.g.b(context.getSystemService("media_metrics"));
        if (b5 != null) {
            createPlaybackSession = b5.createPlaybackSession();
            iVar = new P0.i(context, createPlaybackSession);
        } else {
            iVar = null;
        }
        if (iVar == null) {
            K0.a.A("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new P0.k(logSessionId, str);
        }
        if (z7) {
            h8.getClass();
            P0.d dVar = h8.f3529m0;
            dVar.getClass();
            dVar.f.a(iVar);
        }
        sessionId = iVar.f3928c.getSessionId();
        return new P0.k(sessionId, str);
    }
}
