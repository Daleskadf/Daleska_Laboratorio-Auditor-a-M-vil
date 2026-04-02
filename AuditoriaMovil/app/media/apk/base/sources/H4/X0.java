package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class X0 extends com.google.protobuf.J {
    private static final X0 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C0197z endAt_;
    private com.google.protobuf.U from_;
    private com.google.protobuf.M limit_;
    private int offset_;
    private com.google.protobuf.U orderBy_;
    private T0 select_;
    private C0197z startAt_;
    private Q0 where_;

    static {
        X0 x02 = new X0();
        DEFAULT_INSTANCE = x02;
        com.google.protobuf.J.t(X0.class, x02);
    }

    public X0() {
        com.google.protobuf.A0 a02 = com.google.protobuf.A0.f9984d;
        this.from_ = a02;
        this.orderBy_ = a02;
    }

    public static void A(X0 x02, com.google.protobuf.M m7) {
        x02.getClass();
        x02.limit_ = m7;
        x02.bitField0_ |= 16;
    }

    public static X0 B() {
        return DEFAULT_INSTANCE;
    }

    public static C0 O() {
        return (C0) DEFAULT_INSTANCE.i();
    }

    public static void v(X0 x02, E0 e02) {
        x02.getClass();
        com.google.protobuf.U u7 = x02.from_;
        if (!((AbstractC0830b) u7).f10056a) {
            x02.from_ = com.google.protobuf.J.p(u7);
        }
        x02.from_.add(e02);
    }

    public static void w(X0 x02, Q0 q0) {
        x02.getClass();
        q0.getClass();
        x02.where_ = q0;
        x02.bitField0_ |= 2;
    }

    public static void x(X0 x02, S0 s02) {
        x02.getClass();
        com.google.protobuf.U u7 = x02.orderBy_;
        if (!((AbstractC0830b) u7).f10056a) {
            x02.orderBy_ = com.google.protobuf.J.p(u7);
        }
        x02.orderBy_.add(s02);
    }

    public static void y(X0 x02, C0197z c0197z) {
        x02.getClass();
        x02.startAt_ = c0197z;
        x02.bitField0_ |= 4;
    }

    public static void z(X0 x02, C0197z c0197z) {
        x02.getClass();
        x02.endAt_ = c0197z;
        x02.bitField0_ |= 8;
    }

    public final C0197z C() {
        C0197z c0197z = this.endAt_;
        if (c0197z == null) {
            return C0197z.y();
        }
        return c0197z;
    }

    public final E0 D() {
        return (E0) this.from_.get(0);
    }

    public final int E() {
        return this.from_.size();
    }

    public final com.google.protobuf.M F() {
        com.google.protobuf.M m7 = this.limit_;
        if (m7 == null) {
            return com.google.protobuf.M.w();
        }
        return m7;
    }

    public final S0 G(int i7) {
        return (S0) this.orderBy_.get(i7);
    }

    public final int H() {
        return this.orderBy_.size();
    }

    public final C0197z I() {
        C0197z c0197z = this.startAt_;
        if (c0197z == null) {
            return C0197z.y();
        }
        return c0197z;
    }

    public final Q0 J() {
        Q0 q0 = this.where_;
        if (q0 == null) {
            return Q0.z();
        }
        return q0;
    }

    public final boolean K() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new X0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", E0.class, "where_", "orderBy_", S0.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (X0.class) {
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
