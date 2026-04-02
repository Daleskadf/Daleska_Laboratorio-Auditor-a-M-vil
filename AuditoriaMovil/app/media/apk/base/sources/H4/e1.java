package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class e1 extends com.google.protobuf.J {
    private static final e1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.google.protobuf.M expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        e1 e1Var = new e1();
        DEFAULT_INSTANCE = e1Var;
        com.google.protobuf.J.t(e1.class, e1Var);
    }

    public static void A(e1 e1Var, com.google.protobuf.M m7) {
        e1Var.getClass();
        e1Var.expectedCount_ = m7;
        e1Var.bitField0_ |= 1;
    }

    public static Z0 B() {
        return (Z0) DEFAULT_INSTANCE.i();
    }

    public static void v(e1 e1Var, d1 d1Var) {
        e1Var.getClass();
        e1Var.targetType_ = d1Var;
        e1Var.targetTypeCase_ = 2;
    }

    public static void w(e1 e1Var, C0151b1 c0151b1) {
        e1Var.getClass();
        e1Var.targetType_ = c0151b1;
        e1Var.targetTypeCase_ = 3;
    }

    public static void x(e1 e1Var, AbstractC0852m abstractC0852m) {
        e1Var.getClass();
        abstractC0852m.getClass();
        e1Var.resumeTypeCase_ = 4;
        e1Var.resumeType_ = abstractC0852m;
    }

    public static void y(e1 e1Var, com.google.protobuf.N0 n02) {
        e1Var.getClass();
        e1Var.resumeType_ = n02;
        e1Var.resumeTypeCase_ = 11;
    }

    public static void z(e1 e1Var, int i7) {
        e1Var.targetId_ = i7;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (Y0.f2003a[i7.ordinal()]) {
            case 1:
                return new e1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", d1.class, C0151b1.class, "targetId_", "once_", com.google.protobuf.N0.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (e1.class) {
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
