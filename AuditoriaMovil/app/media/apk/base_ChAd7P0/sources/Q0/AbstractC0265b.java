package Q0;

import A3.t0;
import H0.C0126f;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* renamed from: Q0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0265b {
    public static A3.K a(C0126f c0126f) {
        boolean isDirectPlaybackSupported;
        A3.H o7 = A3.K.o();
        t0 it = C0268e.f4273e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (K0.x.f2529a >= K0.x.q(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) c0126f.a().f4b);
                if (isDirectPlaybackSupported) {
                    o7.a(num);
                }
            }
        }
        o7.a(2);
        return o7.g();
    }

    public static int b(int i7, int i8, C0126f c0126f) {
        boolean isDirectPlaybackSupported;
        for (int i9 = 10; i9 > 0; i9--) {
            int s7 = K0.x.s(i9);
            if (s7 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(s7).build(), (AudioAttributes) c0126f.a().f4b);
                if (isDirectPlaybackSupported) {
                    return i9;
                }
            }
        }
        return 0;
    }
}
