package androidx.media;

import android.media.AudioAttributes;
import e2.AbstractC0961a;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0961a abstractC0961a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f7957a = (AudioAttributes) abstractC0961a.g(audioAttributesImplApi21.f7957a, 1);
        audioAttributesImplApi21.f7958b = abstractC0961a.f(audioAttributesImplApi21.f7958b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0961a abstractC0961a) {
        abstractC0961a.getClass();
        abstractC0961a.k(audioAttributesImplApi21.f7957a, 1);
        abstractC0961a.j(audioAttributesImplApi21.f7958b, 2);
    }
}
