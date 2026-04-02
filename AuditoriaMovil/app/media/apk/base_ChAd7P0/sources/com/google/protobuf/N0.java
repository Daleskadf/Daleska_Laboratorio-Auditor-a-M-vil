package com.google.protobuf;
/* loaded from: classes.dex */
public final class N0 extends J {
    private static final N0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.J, com.google.protobuf.N0] */
    static {
        ?? j = new J();
        DEFAULT_INSTANCE = j;
        J.t(N0.class, j);
    }

    public static M0 A() {
        return (M0) DEFAULT_INSTANCE.i();
    }

    public static void v(N0 n02, long j) {
        n02.seconds_ = j;
    }

    public static void w(N0 n02, int i7) {
        n02.nanos_ = i7;
    }

    public static N0 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (L0.f10020a[i7.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (N0.class) {
                        try {
                            interfaceC0872w0 = PARSER;
                            if (interfaceC0872w0 == null) {
                                interfaceC0872w0 = new H(DEFAULT_INSTANCE);
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

    public final int y() {
        return this.nanos_;
    }

    public final long z() {
        return this.seconds_;
    }
}
