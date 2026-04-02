package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class t1 extends com.google.protobuf.J {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final t1 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0171l0 currentDocument_;
    private Object operation_;
    private K updateMask_;
    private int operationCase_ = 0;
    private com.google.protobuf.U updateTransforms_ = com.google.protobuf.A0.f9984d;

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        com.google.protobuf.J.t(t1.class, t1Var);
    }

    public static void A(t1 t1Var, String str) {
        t1Var.getClass();
        str.getClass();
        t1Var.operationCase_ = 5;
        t1Var.operation_ = str;
    }

    public static r1 N() {
        return (r1) DEFAULT_INSTANCE.i();
    }

    public static r1 O(t1 t1Var) {
        com.google.protobuf.G i7 = DEFAULT_INSTANCE.i();
        if (!i7.f10005a.equals(t1Var)) {
            i7.d();
            com.google.protobuf.G.e(i7.f10006b, t1Var);
        }
        return (r1) i7;
    }

    public static t1 P(byte[] bArr) {
        return (t1) com.google.protobuf.J.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(t1 t1Var, K k2) {
        t1Var.getClass();
        t1Var.updateMask_ = k2;
        t1Var.bitField0_ |= 1;
    }

    public static void w(t1 t1Var, S s7) {
        t1Var.getClass();
        s7.getClass();
        com.google.protobuf.U u7 = t1Var.updateTransforms_;
        if (!((AbstractC0830b) u7).f10056a) {
            t1Var.updateTransforms_ = com.google.protobuf.J.p(u7);
        }
        t1Var.updateTransforms_.add(s7);
    }

    public static void x(t1 t1Var, D d7) {
        t1Var.getClass();
        t1Var.operation_ = d7;
        t1Var.operationCase_ = 1;
    }

    public static void y(t1 t1Var, C0171l0 c0171l0) {
        t1Var.getClass();
        t1Var.currentDocument_ = c0171l0;
        t1Var.bitField0_ |= 2;
    }

    public static void z(t1 t1Var, String str) {
        t1Var.getClass();
        str.getClass();
        t1Var.operationCase_ = 2;
        t1Var.operation_ = str;
    }

    public final C0171l0 B() {
        C0171l0 c0171l0 = this.currentDocument_;
        if (c0171l0 == null) {
            return C0171l0.y();
        }
        return c0171l0;
    }

    public final String C() {
        if (this.operationCase_ == 2) {
            return (String) this.operation_;
        }
        return StringUtils.EMPTY;
    }

    public final s1 D() {
        int i7 = this.operationCase_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            return null;
                        }
                        return s1.TRANSFORM;
                    }
                    return s1.VERIFY;
                }
                return s1.DELETE;
            }
            return s1.UPDATE;
        }
        return s1.OPERATION_NOT_SET;
    }

    public final T E() {
        if (this.operationCase_ == 6) {
            return (T) this.operation_;
        }
        return T.v();
    }

    public final D F() {
        if (this.operationCase_ == 1) {
            return (D) this.operation_;
        }
        return D.y();
    }

    public final K G() {
        K k2 = this.updateMask_;
        if (k2 == null) {
            return K.w();
        }
        return k2;
    }

    public final com.google.protobuf.U H() {
        return this.updateTransforms_;
    }

    public final String I() {
        if (this.operationCase_ == 5) {
            return (String) this.operation_;
        }
        return StringUtils.EMPTY;
    }

    public final boolean J() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        if (this.operationCase_ == 6) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (this.operationCase_ == 1) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (q1.f2021a[i7.ordinal()]) {
            case 1:
                return new t1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", D.class, "updateMask_", "currentDocument_", T.class, "updateTransforms_", S.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (t1.class) {
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
