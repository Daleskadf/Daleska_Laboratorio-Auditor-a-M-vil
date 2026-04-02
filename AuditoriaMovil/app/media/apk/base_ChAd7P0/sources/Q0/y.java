package Q0;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public abstract class y {
    public static void a(AudioTrack audioTrack, C0273j c0273j) {
        AudioDeviceInfo audioDeviceInfo;
        if (c0273j == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = c0273j.f4288a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
