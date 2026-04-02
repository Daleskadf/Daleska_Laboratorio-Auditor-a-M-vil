package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class B1 extends com.google.protobuf.J {
    private static final B1 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.protobuf.U transformResults_ = com.google.protobuf.A0.f9984d;
    private com.google.protobuf.N0 updateTime_;

    static {
        B1 b12 = new B1();
        DEFAULT_INSTANCE = b12;
        com.google.protobuf.J.t(B1.class, b12);
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (A1.f1988a[i7.ordinal()]) {
            case 1:
                return new B1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", p1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (B1.class) {
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

    public final p1 v(int i7) {
        return (p1) this.transformResults_.get(i7);
    }

    public final int w() {
        return this.transformResults_.size();
    }

    public final com.google.protobuf.N0 x() {
        com.google.protobuf.N0 n02 = this.updateTime_;
        if (n02 == null) {
            return com.google.protobuf.N0.x();
        }
        return n02;
    }
}
