package H4;

import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class S extends com.google.protobuf.J {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final S DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = StringUtils.EMPTY;

    static {
        S s7 = new S();
        DEFAULT_INSTANCE = s7;
        com.google.protobuf.J.t(S.class, s7);
    }

    public static O G() {
        return (O) DEFAULT_INSTANCE.i();
    }

    public static void v(S s7, C0160g c0160g) {
        s7.getClass();
        s7.transformType_ = c0160g;
        s7.transformTypeCase_ = 6;
    }

    public static void w(S s7, String str) {
        s7.getClass();
        str.getClass();
        s7.fieldPath_ = str;
    }

    public static void x(S s7, C0160g c0160g) {
        s7.getClass();
        s7.transformType_ = c0160g;
        s7.transformTypeCase_ = 7;
    }

    public static void y(S s7, P p7) {
        s7.getClass();
        s7.transformType_ = Integer.valueOf(p7.a());
        s7.transformTypeCase_ = 2;
    }

    public static void z(S s7, p1 p1Var) {
        s7.getClass();
        p1Var.getClass();
        s7.transformType_ = p1Var;
        s7.transformTypeCase_ = 3;
    }

    public final C0160g A() {
        if (this.transformTypeCase_ == 6) {
            return (C0160g) this.transformType_;
        }
        return C0160g.y();
    }

    public final String B() {
        return this.fieldPath_;
    }

    public final p1 C() {
        if (this.transformTypeCase_ == 3) {
            return (p1) this.transformType_;
        }
        return p1.J();
    }

    public final C0160g D() {
        if (this.transformTypeCase_ == 7) {
            return (C0160g) this.transformType_;
        }
        return C0160g.y();
    }

    public final P E() {
        P p7;
        if (this.transformTypeCase_ == 2) {
            int intValue = ((Integer) this.transformType_).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    p7 = null;
                } else {
                    p7 = P.REQUEST_TIME;
                }
            } else {
                p7 = P.SERVER_VALUE_UNSPECIFIED;
            }
            if (p7 == null) {
                return P.UNRECOGNIZED;
            }
            return p7;
        }
        return P.SERVER_VALUE_UNSPECIFIED;
    }

    public final Q F() {
        int i7 = this.transformTypeCase_;
        if (i7 != 0) {
            switch (i7) {
                case 2:
                    return Q.SET_TO_SERVER_VALUE;
                case 3:
                    return Q.INCREMENT;
                case 4:
                    return Q.MAXIMUM;
                case 5:
                    return Q.MINIMUM;
                case 6:
                    return Q.APPEND_MISSING_ELEMENTS;
                case 7:
                    return Q.REMOVE_ALL_FROM_ARRAY;
                default:
                    return null;
            }
        }
        return Q.TRANSFORMTYPE_NOT_SET;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (N.f1995a[i7.ordinal()]) {
            case 1:
                return new S();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", p1.class, p1.class, p1.class, C0160g.class, C0160g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (S.class) {
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
