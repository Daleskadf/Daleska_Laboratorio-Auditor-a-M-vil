package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f12716a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(char c8) {
        int i7 = c8 - '0';
        if (i7 < 0 || i7 > 9) {
            return -1;
        }
        return i7;
    }

    public final int hashCode() {
        return 182;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.w, java.lang.Object] */
    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            ((w) obj).getClass();
            return true;
        }
        return false;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
