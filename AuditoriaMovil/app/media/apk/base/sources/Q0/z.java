package Q0;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public abstract class z {
    public static void a(AudioTrack audioTrack, P0.k kVar) {
        LogSessionId logSessionId;
        boolean equals;
        P0.j jVar = kVar.f3953b;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.f3951a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
