package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class S0 extends com.google.protobuf.J {
    private static final S0 DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER;
    private int bitField0_;
    private int direction_;
    private N0 field_;

    /* JADX WARN: Type inference failed for: r0v0, types: [H4.S0, com.google.protobuf.J] */
    static {
        ?? j = new com.google.protobuf.J();
        DEFAULT_INSTANCE = j;
        com.google.protobuf.J.t(S0.class, j);
    }

    public static void v(S0 s02, N0 n02) {
        s02.getClass();
        s02.field_ = n02;
        s02.bitField0_ |= 1;
    }

    public static void w(S0 s02, I0 i02) {
        s02.getClass();
        s02.direction_ = i02.a();
    }

    public static R0 z() {
        return (R0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new com.google.protobuf.J();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (S0.class) {
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

    public final I0 x() {
        I0 i02;
        int i7 = this.direction_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    i02 = null;
                } else {
                    i02 = I0.DESCENDING;
                }
            } else {
                i02 = I0.ASCENDING;
            }
        } else {
            i02 = I0.DIRECTION_UNSPECIFIED;
        }
        if (i02 == null) {
            return I0.UNRECOGNIZED;
        }
        return i02;
    }

    public final N0 y() {
        N0 n02 = this.field_;
        if (n02 == null) {
            return N0.w();
        }
        return n02;
    }
}
