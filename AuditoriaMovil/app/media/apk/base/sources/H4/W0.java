package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class W0 extends com.google.protobuf.J {
    private static final W0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        W0 w02 = new W0();
        DEFAULT_INSTANCE = w02;
        com.google.protobuf.J.t(W0.class, w02);
    }

    public static U0 A() {
        return (U0) DEFAULT_INSTANCE.i();
    }

    public static void v(W0 w02, V0 v02) {
        w02.getClass();
        w02.op_ = v02.a();
    }

    public static void w(W0 w02, N0 n02) {
        w02.getClass();
        w02.operandType_ = n02;
        w02.operandTypeCase_ = 2;
    }

    public static W0 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new W0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (W0.class) {
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

    public final N0 y() {
        if (this.operandTypeCase_ == 2) {
            return (N0) this.operandType_;
        }
        return N0.w();
    }

    public final V0 z() {
        V0 v02;
        int i7 = this.op_;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            v02 = null;
                        } else {
                            v02 = V0.IS_NOT_NULL;
                        }
                    } else {
                        v02 = V0.IS_NOT_NAN;
                    }
                } else {
                    v02 = V0.IS_NULL;
                }
            } else {
                v02 = V0.IS_NAN;
            }
        } else {
            v02 = V0.OPERATOR_UNSPECIFIED;
        }
        if (v02 == null) {
            return V0.UNRECOGNIZED;
        }
        return v02;
    }
}
