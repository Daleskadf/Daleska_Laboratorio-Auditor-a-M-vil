package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class L0 extends com.google.protobuf.J {
    private static final L0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private N0 field_;
    private int op_;
    private p1 value_;

    /* JADX WARN: Type inference failed for: r0v0, types: [H4.L0, com.google.protobuf.J] */
    static {
        ?? j = new com.google.protobuf.J();
        DEFAULT_INSTANCE = j;
        com.google.protobuf.J.t(L0.class, j);
    }

    public static J0 C() {
        return (J0) DEFAULT_INSTANCE.i();
    }

    public static void v(L0 l02, N0 n02) {
        l02.getClass();
        l02.field_ = n02;
        l02.bitField0_ |= 1;
    }

    public static void w(L0 l02, K0 k02) {
        l02.getClass();
        l02.op_ = k02.a();
    }

    public static void x(L0 l02, p1 p1Var) {
        l02.getClass();
        p1Var.getClass();
        l02.value_ = p1Var;
        l02.bitField0_ |= 2;
    }

    public static L0 y() {
        return DEFAULT_INSTANCE;
    }

    public final K0 A() {
        K0 k02;
        switch (this.op_) {
            case 0:
                k02 = K0.OPERATOR_UNSPECIFIED;
                break;
            case 1:
                k02 = K0.LESS_THAN;
                break;
            case 2:
                k02 = K0.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                k02 = K0.GREATER_THAN;
                break;
            case 4:
                k02 = K0.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                k02 = K0.EQUAL;
                break;
            case 6:
                k02 = K0.NOT_EQUAL;
                break;
            case 7:
                k02 = K0.ARRAY_CONTAINS;
                break;
            case 8:
                k02 = K0.IN;
                break;
            case 9:
                k02 = K0.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                k02 = K0.NOT_IN;
                break;
            default:
                k02 = null;
                break;
        }
        if (k02 == null) {
            return K0.UNRECOGNIZED;
        }
        return k02;
    }

    public final p1 B() {
        p1 p1Var = this.value_;
        if (p1Var == null) {
            return p1.J();
        }
        return p1Var;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new com.google.protobuf.J();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (L0.class) {
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

    public final N0 z() {
        N0 n02 = this.field_;
        if (n02 == null) {
            return N0.w();
        }
        return n02;
    }
}
