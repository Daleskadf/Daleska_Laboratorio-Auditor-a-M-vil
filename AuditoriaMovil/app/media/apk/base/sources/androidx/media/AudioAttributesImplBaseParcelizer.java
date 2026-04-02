package androidx.media;

import e2.AbstractC0961a;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0961a abstractC0961a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f7959a = abstractC0961a.f(audioAttributesImplBase.f7959a, 1);
        audioAttributesImplBase.f7960b = abstractC0961a.f(audioAttributesImplBase.f7960b, 2);
        audioAttributesImplBase.f7961c = abstractC0961a.f(audioAttributesImplBase.f7961c, 3);
        audioAttributesImplBase.f7962d = abstractC0961a.f(audioAttributesImplBase.f7962d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0961a abstractC0961a) {
        abstractC0961a.getClass();
        abstractC0961a.j(audioAttributesImplBase.f7959a, 1);
        abstractC0961a.j(audioAttributesImplBase.f7960b, 2);
        abstractC0961a.j(audioAttributesImplBase.f7961c, 3);
        abstractC0961a.j(audioAttributesImplBase.f7962d, 4);
    }
}
