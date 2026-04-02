package androidx.media;

import android.media.AudioAttributes;
import e2.AbstractC0961a;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC0961a abstractC0961a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f7957a = (AudioAttributes) abstractC0961a.g(audioAttributesImplApi26.f7957a, 1);
        audioAttributesImplApi26.f7958b = abstractC0961a.f(audioAttributesImplApi26.f7958b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC0961a abstractC0961a) {
        abstractC0961a.getClass();
        abstractC0961a.k(audioAttributesImplApi26.f7957a, 1);
        abstractC0961a.j(audioAttributesImplApi26.f7958b, 2);
    }
}
