package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class h1 extends com.google.protobuf.J {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final h1 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private o5.b cause_;
    private com.google.protobuf.N0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private com.google.protobuf.T targetIds_ = com.google.protobuf.P.f10022d;
    private AbstractC0852m resumeToken_ = AbstractC0852m.f10085b;

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        com.google.protobuf.J.t(h1.class, h1Var);
    }

    public static h1 w() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return ((com.google.protobuf.P) this.targetIds_).size();
    }

    public final com.google.protobuf.T B() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (f1.f2010a[i7.ordinal()]) {
            case 1:
                return new h1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (h1.class) {
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

    public final o5.b v() {
        o5.b bVar = this.cause_;
        if (bVar == null) {
            return o5.b.w();
        }
        return bVar;
    }

    public final com.google.protobuf.N0 x() {
        com.google.protobuf.N0 n02 = this.readTime_;
        if (n02 == null) {
            return com.google.protobuf.N0.x();
        }
        return n02;
    }

    public final AbstractC0852m y() {
        return this.resumeToken_;
    }

    public final g1 z() {
        g1 g1Var;
        int i7 = this.targetChangeType_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            g1Var = null;
                        } else {
                            g1Var = g1.RESET;
                        }
                    } else {
                        g1Var = g1.CURRENT;
                    }
                } else {
                    g1Var = g1.REMOVE;
                }
            } else {
                g1Var = g1.ADD;
            }
        } else {
            g1Var = g1.NO_CHANGE;
        }
        if (g1Var == null) {
            return g1.UNRECOGNIZED;
        }
        return g1Var;
    }
}
