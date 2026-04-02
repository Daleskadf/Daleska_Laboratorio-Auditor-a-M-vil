package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class K extends com.google.protobuf.J {
    private static final K DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER;
    private com.google.protobuf.U fieldPaths_ = com.google.protobuf.A0.f9984d;

    static {
        K k2 = new K();
        DEFAULT_INSTANCE = k2;
        com.google.protobuf.J.t(K.class, k2);
    }

    public static void v(K k2, String str) {
        k2.getClass();
        str.getClass();
        com.google.protobuf.U u7 = k2.fieldPaths_;
        if (!((AbstractC0830b) u7).f10056a) {
            k2.fieldPaths_ = com.google.protobuf.J.p(u7);
        }
        k2.fieldPaths_.add(str);
    }

    public static K w() {
        return DEFAULT_INSTANCE;
    }

    public static J z() {
        return (J) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (I.f1993a[i7.ordinal()]) {
            case 1:
                return new K();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (K.class) {
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

    public final String x(int i7) {
        return (String) this.fieldPaths_.get(i7);
    }

    public final int y() {
        return this.fieldPaths_.size();
    }
}
