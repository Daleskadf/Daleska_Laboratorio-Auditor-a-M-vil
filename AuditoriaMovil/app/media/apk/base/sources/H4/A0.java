package H4;

import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class A0 extends com.google.protobuf.J {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final A0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private com.google.protobuf.U aggregations_ = com.google.protobuf.A0.f9984d;

    static {
        A0 a02 = new A0();
        DEFAULT_INSTANCE = a02;
        com.google.protobuf.J.t(A0.class, a02);
    }

    public static void v(A0 a02, X0 x02) {
        a02.getClass();
        x02.getClass();
        a02.queryType_ = x02;
        a02.queryTypeCase_ = 1;
    }

    public static void w(A0 a02, ArrayList arrayList) {
        com.google.protobuf.U u7 = a02.aggregations_;
        if (!((AbstractC0830b) u7).f10056a) {
            a02.aggregations_ = com.google.protobuf.J.p(u7);
        }
        AbstractC0828a.b(arrayList, a02.aggregations_);
    }

    public static C0198z0 x() {
        return (C0198z0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0182r0.f2022a[i7.ordinal()]) {
            case 1:
                return new A0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", X0.class, "aggregations_", C0196y0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (A0.class) {
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
}
