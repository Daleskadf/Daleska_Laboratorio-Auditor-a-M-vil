package a6;

import D.AbstractC0059i;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final BitSet f7117d;

    /* renamed from: a  reason: collision with root package name */
    public final String f7118a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7119b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7120c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c8 = '0'; c8 <= '9'; c8 = (char) (c8 + 1)) {
            bitSet.set(c8);
        }
        for (char c9 = 'a'; c9 <= 'z'; c9 = (char) (c9 + 1)) {
            bitSet.set(c9);
        }
        f7117d = bitSet;
    }

    public b0(Object obj, String str, boolean z7) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        G.i.j(lowerCase, "name");
        G.i.f("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            e0.f7139c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i7 = 0; i7 < lowerCase.length(); i7++) {
            char charAt = lowerCase.charAt(i7);
            if ((!z7 || charAt != ':' || i7 != 0) && !f7117d.get(charAt)) {
                throw new IllegalArgumentException(H4.W.z("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.f7118a = lowerCase;
        this.f7119b = lowerCase.getBytes(z3.h.f16884a);
        this.f7120c = obj;
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f7118a.equals(((b0) obj).f7118a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7118a.hashCode();
    }

    public final String toString() {
        return AbstractC0059i.D(new StringBuilder("Key{name='"), this.f7118a, "'}");
    }
}
