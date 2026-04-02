package Q0;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public abstract class K {
    public static void a(q qVar, Object obj) {
        C0273j c0273j;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        I i7 = (I) qVar;
        if (audioDeviceInfo == null) {
            c0273j = null;
        } else {
            i7.getClass();
            c0273j = new C0273j(audioDeviceInfo);
        }
        i7.f4197c0 = c0273j;
        C0272i c0272i = i7.f4226y;
        if (c0272i != null) {
            c0272i.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = i7.f4224w;
        if (audioTrack != null) {
            y.a(audioTrack, i7.f4197c0);
        }
    }
}
