package com.google.protobuf;
/* loaded from: classes.dex */
public final class M extends J {
    private static final M DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.M, com.google.protobuf.J] */
    static {
        ?? j = new J();
        DEFAULT_INSTANCE = j;
        J.t(M.class, j);
    }

    public static void v(M m7, int i7) {
        m7.value_ = i7;
    }

    public static M w() {
        return DEFAULT_INSTANCE;
    }

    public static L y() {
        return (L) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (K.f10016a[i7.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (M.class) {
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

    public final int x() {
        return this.value_;
    }
}
