package Q0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
/* loaded from: classes.dex */
public abstract class w {
    /* JADX WARN: Type inference failed for: r4v1, types: [A.d, java.lang.Object] */
    public static C0274k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
        int playbackOffloadSupport;
        boolean z8;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0274k.f4289d;
        }
        ?? obj = new Object();
        if (K0.x.f2529a > 32 && playbackOffloadSupport == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        obj.f5a = true;
        obj.f6b = z8;
        obj.f7c = z7;
        return obj.a();
    }
}
