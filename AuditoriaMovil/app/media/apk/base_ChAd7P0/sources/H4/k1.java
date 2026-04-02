package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class k1 extends com.google.protobuf.J {
    private static final k1 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
    private AbstractC0852m retryTransaction_ = AbstractC0852m.f10085b;

    static {
        k1 k1Var = new k1();
        DEFAULT_INSTANCE = k1Var;
        com.google.protobuf.J.t(k1.class, k1Var);
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (i1.f2014a[i7.ordinal()]) {
            case 1:
                return new k1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (k1.class) {
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
