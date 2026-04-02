package H4;

import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* renamed from: H4.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177o0 extends com.google.protobuf.J {
    private static final C0177o0 DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = StringUtils.EMPTY;

    static {
        C0177o0 c0177o0 = new C0177o0();
        DEFAULT_INSTANCE = c0177o0;
        com.google.protobuf.J.t(C0177o0.class, c0177o0);
    }

    public static void v(C0177o0 c0177o0, String str) {
        c0177o0.getClass();
        str.getClass();
        c0177o0.parent_ = str;
    }

    public static void w(C0177o0 c0177o0, A0 a02) {
        c0177o0.getClass();
        c0177o0.queryType_ = a02;
        c0177o0.queryTypeCase_ = 2;
    }

    public static C0177o0 x() {
        return DEFAULT_INSTANCE;
    }

    public static C0175n0 y() {
        return (C0175n0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0173m0.f2016a[i7.ordinal()]) {
            case 1:
                return new C0177o0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", A0.class, l1.class, com.google.protobuf.N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0177o0.class) {
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
