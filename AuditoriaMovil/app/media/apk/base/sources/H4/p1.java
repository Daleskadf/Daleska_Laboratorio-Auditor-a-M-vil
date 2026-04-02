package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.EnumC0870v0;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
import p5.C1697c;
/* loaded from: classes.dex */
public final class p1 extends com.google.protobuf.J {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final p1 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.protobuf.J.t(p1.class, p1Var);
    }

    public static void A(C0160g c0160g, p1 p1Var) {
        p1Var.getClass();
        c0160g.getClass();
        p1Var.valueType_ = c0160g;
        p1Var.valueTypeCase_ = 9;
    }

    public static void B(p1 p1Var, C0163h0 c0163h0) {
        p1Var.getClass();
        c0163h0.getClass();
        p1Var.valueType_ = c0163h0;
        p1Var.valueTypeCase_ = 6;
    }

    public static void C(p1 p1Var, EnumC0870v0 enumC0870v0) {
        p1Var.getClass();
        p1Var.valueType_ = Integer.valueOf(enumC0870v0.a());
        p1Var.valueTypeCase_ = 11;
    }

    public static void D(p1 p1Var, boolean z7) {
        p1Var.valueTypeCase_ = 1;
        p1Var.valueType_ = Boolean.valueOf(z7);
    }

    public static void E(p1 p1Var, long j) {
        p1Var.valueTypeCase_ = 2;
        p1Var.valueType_ = Long.valueOf(j);
    }

    public static void F(p1 p1Var, double d7) {
        p1Var.valueTypeCase_ = 3;
        p1Var.valueType_ = Double.valueOf(d7);
    }

    public static p1 J() {
        return DEFAULT_INSTANCE;
    }

    public static n1 T() {
        return (n1) DEFAULT_INSTANCE.i();
    }

    public static void v(p1 p1Var, com.google.protobuf.N0 n02) {
        p1Var.getClass();
        p1Var.valueType_ = n02;
        p1Var.valueTypeCase_ = 10;
    }

    public static void w(p1 p1Var, String str) {
        p1Var.getClass();
        str.getClass();
        p1Var.valueTypeCase_ = 17;
        p1Var.valueType_ = str;
    }

    public static void x(p1 p1Var, AbstractC0852m abstractC0852m) {
        p1Var.getClass();
        abstractC0852m.getClass();
        p1Var.valueTypeCase_ = 18;
        p1Var.valueType_ = abstractC0852m;
    }

    public static void y(p1 p1Var, String str) {
        p1Var.getClass();
        str.getClass();
        p1Var.valueTypeCase_ = 5;
        p1Var.valueType_ = str;
    }

    public static void z(p1 p1Var, C1697c c1697c) {
        p1Var.getClass();
        p1Var.valueType_ = c1697c;
        p1Var.valueTypeCase_ = 8;
    }

    public final C0160g G() {
        if (this.valueTypeCase_ == 9) {
            return (C0160g) this.valueType_;
        }
        return C0160g.y();
    }

    public final boolean H() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final AbstractC0852m I() {
        if (this.valueTypeCase_ == 18) {
            return (AbstractC0852m) this.valueType_;
        }
        return AbstractC0852m.f10085b;
    }

    public final double K() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final C1697c L() {
        if (this.valueTypeCase_ == 8) {
            return (C1697c) this.valueType_;
        }
        return C1697c.x();
    }

    public final long M() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final C0163h0 N() {
        if (this.valueTypeCase_ == 6) {
            return (C0163h0) this.valueType_;
        }
        return C0163h0.w();
    }

    public final String O() {
        if (this.valueTypeCase_ == 5) {
            return (String) this.valueType_;
        }
        return StringUtils.EMPTY;
    }

    public final String P() {
        if (this.valueTypeCase_ == 17) {
            return (String) this.valueType_;
        }
        return StringUtils.EMPTY;
    }

    public final com.google.protobuf.N0 Q() {
        if (this.valueTypeCase_ == 10) {
            return (com.google.protobuf.N0) this.valueType_;
        }
        return com.google.protobuf.N0.x();
    }

    public final o1 R() {
        int i7 = this.valueTypeCase_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 17) {
                                    if (i7 != 18) {
                                        switch (i7) {
                                            case 8:
                                                return o1.GEO_POINT_VALUE;
                                            case 9:
                                                return o1.ARRAY_VALUE;
                                            case 10:
                                                return o1.TIMESTAMP_VALUE;
                                            case 11:
                                                return o1.NULL_VALUE;
                                            default:
                                                return null;
                                        }
                                    }
                                    return o1.BYTES_VALUE;
                                }
                                return o1.STRING_VALUE;
                            }
                            return o1.MAP_VALUE;
                        }
                        return o1.REFERENCE_VALUE;
                    }
                    return o1.DOUBLE_VALUE;
                }
                return o1.INTEGER_VALUE;
            }
            return o1.BOOLEAN_VALUE;
        }
        return o1.VALUETYPE_NOT_SET;
    }

    public final boolean S() {
        if (this.valueTypeCase_ == 11) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (m1.f2017a[i7.ordinal()]) {
            case 1:
                return new p1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C0163h0.class, C1697c.class, C0160g.class, com.google.protobuf.N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (p1.class) {
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
