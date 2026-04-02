package I4;

import androidx.datastore.preferences.protobuf.Y;
import java.io.IOException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class E {
    private static final /* synthetic */ E[] $VALUES;
    public static final E BIG_DECIMAL;
    public static final E DOUBLE;
    public static final E LAZILY_PARSED_NUMBER;
    public static final E LONG_OR_DOUBLE;

    static {
        E e7 = new E() { // from class: I4.A
            @Override // I4.E
            public final Number a(Q4.a aVar) {
                return Double.valueOf(aVar.u());
            }
        };
        DOUBLE = e7;
        E e8 = new E() { // from class: I4.B
            @Override // I4.E
            public final Number a(Q4.a aVar) {
                return new K4.j(aVar.B());
            }
        };
        LAZILY_PARSED_NUMBER = e8;
        E e9 = new E() { // from class: I4.C
            public static Double b(String str, Q4.a aVar) {
                boolean z7;
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (aVar.f4393b == z.LENIENT) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.p());
                    }
                    return valueOf;
                } catch (NumberFormatException e10) {
                    StringBuilder m7 = Y.m("Cannot parse ", str, "; at path ");
                    m7.append(aVar.p());
                    throw new RuntimeException(m7.toString(), e10);
                }
            }

            @Override // I4.E
            public final Number a(Q4.a aVar) {
                String B7 = aVar.B();
                if (B7.indexOf(46) >= 0) {
                    return b(B7, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(B7));
                } catch (NumberFormatException unused) {
                    return b(B7, aVar);
                }
            }
        };
        LONG_OR_DOUBLE = e9;
        E e10 = new E() { // from class: I4.D
            @Override // I4.E
            public final Number a(Q4.a aVar) {
                String B7 = aVar.B();
                try {
                    return K4.d.j(B7);
                } catch (NumberFormatException e11) {
                    StringBuilder m7 = Y.m("Cannot parse ", B7, "; at path ");
                    m7.append(aVar.p());
                    throw new RuntimeException(m7.toString(), e11);
                }
            }
        };
        BIG_DECIMAL = e10;
        $VALUES = new E[]{e7, e8, e9, e10};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }

    public abstract Number a(Q4.a aVar);
}
