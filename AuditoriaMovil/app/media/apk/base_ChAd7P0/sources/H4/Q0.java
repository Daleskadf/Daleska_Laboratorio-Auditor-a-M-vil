package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class Q0 extends com.google.protobuf.J {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final Q0 DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        Q0 q0 = new Q0();
        DEFAULT_INSTANCE = q0;
        com.google.protobuf.J.t(Q0.class, q0);
    }

    public static O0 D() {
        return (O0) DEFAULT_INSTANCE.i();
    }

    public static void v(Q0 q0, L0 l02) {
        q0.getClass();
        q0.filterType_ = l02;
        q0.filterTypeCase_ = 2;
    }

    public static void w(Q0 q0, W0 w02) {
        q0.getClass();
        q0.filterType_ = w02;
        q0.filterTypeCase_ = 3;
    }

    public static void x(Q0 q0, H0 h02) {
        q0.getClass();
        q0.filterType_ = h02;
        q0.filterTypeCase_ = 1;
    }

    public static Q0 z() {
        return DEFAULT_INSTANCE;
    }

    public final L0 A() {
        if (this.filterTypeCase_ == 2) {
            return (L0) this.filterType_;
        }
        return L0.y();
    }

    public final P0 B() {
        int i7 = this.filterTypeCase_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return P0.UNARY_FILTER;
                }
                return P0.FIELD_FILTER;
            }
            return P0.COMPOSITE_FILTER;
        }
        return P0.FILTERTYPE_NOT_SET;
    }

    public final W0 C() {
        if (this.filterTypeCase_ == 3) {
            return (W0) this.filterType_;
        }
        return W0.x();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new Q0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", H0.class, L0.class, W0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (Q0.class) {
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

    public final H0 y() {
        if (this.filterTypeCase_ == 1) {
            return (H0) this.filterType_;
        }
        return H0.x();
    }
}
