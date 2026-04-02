package H4;

import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
import java.util.List;
/* renamed from: H4.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197z extends com.google.protobuf.J {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C0197z DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private com.google.protobuf.U values_ = com.google.protobuf.A0.f9984d;

    static {
        C0197z c0197z = new C0197z();
        DEFAULT_INSTANCE = c0197z;
        com.google.protobuf.J.t(C0197z.class, c0197z);
    }

    public static void v(C0197z c0197z, Iterable iterable) {
        com.google.protobuf.U u7 = c0197z.values_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0197z.values_ = com.google.protobuf.J.p(u7);
        }
        AbstractC0828a.b((List) iterable, c0197z.values_);
    }

    public static void w(C0197z c0197z, boolean z7) {
        c0197z.before_ = z7;
    }

    public static C0197z y() {
        return DEFAULT_INSTANCE;
    }

    public static C0195y z() {
        return (C0195y) DEFAULT_INSTANCE.i();
    }

    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0193x.f2027a[i7.ordinal()]) {
            case 1:
                return new C0197z();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", p1.class, "before_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0197z.class) {
                        try {
                            interfaceC0872w0 = PARSER;
                            if (interfaceC0872w0 == null) {
                                interfaceC0872w0 = new com.google.protobuf.H(DEFAULT_INSTANCE);
                                PARSER = interfaceC0872w0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0872w0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean x() {
        return this.before_;
    }
}
