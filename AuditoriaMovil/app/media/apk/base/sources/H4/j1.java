package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class j1 extends com.google.protobuf.J {
    private static final j1 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        com.google.protobuf.J.t(j1.class, j1Var);
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (i1.f2014a[i7.ordinal()]) {
            case 1:
                return new j1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", com.google.protobuf.N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (j1.class) {
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
