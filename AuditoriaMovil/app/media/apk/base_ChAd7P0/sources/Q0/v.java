package Q0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
/* loaded from: classes.dex */
public abstract class v {
    /* JADX WARN: Type inference failed for: r0v2, types: [A.d, java.lang.Object] */
    public static C0274k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return C0274k.f4289d;
        }
        ?? obj = new Object();
        obj.f5a = true;
        obj.f7c = z7;
        return obj.a();
    }
}
