package X0;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public abstract class p {
    public static void a(h hVar, P0.k kVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        P0.j jVar = kVar.f3953b;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.f3951a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = hVar.f6281b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
