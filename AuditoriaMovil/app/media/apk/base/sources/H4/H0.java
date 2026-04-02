package H4;

import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class H0 extends com.google.protobuf.J {
    private static final H0 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER;
    private com.google.protobuf.U filters_ = com.google.protobuf.A0.f9984d;
    private int op_;

    static {
        H0 h02 = new H0();
        DEFAULT_INSTANCE = h02;
        com.google.protobuf.J.t(H0.class, h02);
    }

    public static F0 A() {
        return (F0) DEFAULT_INSTANCE.i();
    }

    public static void v(H0 h02, G0 g02) {
        h02.getClass();
        h02.op_ = g02.a();
    }

    public static void w(H0 h02, ArrayList arrayList) {
        com.google.protobuf.U u7 = h02.filters_;
        if (!((AbstractC0830b) u7).f10056a) {
            h02.filters_ = com.google.protobuf.J.p(u7);
        }
        AbstractC0828a.b(arrayList, h02.filters_);
    }

    public static H0 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new H0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", Q0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (H0.class) {
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

    public final com.google.protobuf.U y() {
        return this.filters_;
    }

    public final G0 z() {
        G0 g02;
        int i7 = this.op_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    g02 = null;
                } else {
                    g02 = G0.OR;
                }
            } else {
                g02 = G0.AND;
            }
        } else {
            g02 = G0.OPERATOR_UNSPECIFIED;
        }
        if (g02 == null) {
            return G0.UNRECOGNIZED;
        }
        return g02;
    }
}
