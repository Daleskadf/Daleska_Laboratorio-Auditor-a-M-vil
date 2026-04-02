package androidx.media;

import e2.AbstractC0961a;
import e2.InterfaceC0963c;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0961a abstractC0961a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC0963c interfaceC0963c = audioAttributesCompat.f7956a;
        if (abstractC0961a.e(1)) {
            interfaceC0963c = abstractC0961a.h();
        }
        audioAttributesCompat.f7956a = (AudioAttributesImpl) interfaceC0963c;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0961a abstractC0961a) {
        abstractC0961a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f7956a;
        abstractC0961a.i(1);
        abstractC0961a.l(audioAttributesImpl);
    }
}
