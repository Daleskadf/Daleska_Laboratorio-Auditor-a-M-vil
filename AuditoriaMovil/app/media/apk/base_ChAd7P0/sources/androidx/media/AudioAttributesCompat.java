package androidx.media;

import android.util.SparseIntArray;
import e2.InterfaceC0963c;
/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC0963c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f7955b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f7956a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f7956a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f7956a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f7956a);
    }

    public final int hashCode() {
        return this.f7956a.hashCode();
    }

    public final String toString() {
        return this.f7956a.toString();
    }
}
