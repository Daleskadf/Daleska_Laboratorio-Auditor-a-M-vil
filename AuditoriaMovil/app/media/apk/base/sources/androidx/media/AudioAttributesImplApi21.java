package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f7957a;

    /* renamed from: b  reason: collision with root package name */
    public int f7958b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f7957a.equals(((AudioAttributesImplApi21) obj).f7957a);
    }

    public final int hashCode() {
        return this.f7957a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f7957a;
    }
}
