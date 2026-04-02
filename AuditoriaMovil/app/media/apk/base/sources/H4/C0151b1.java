package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.b1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151b1 extends com.google.protobuf.J {
    private static final C0151b1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private com.google.protobuf.U documents_ = com.google.protobuf.A0.f9984d;

    static {
        C0151b1 c0151b1 = new C0151b1();
        DEFAULT_INSTANCE = c0151b1;
        com.google.protobuf.J.t(C0151b1.class, c0151b1);
    }

    public static void v(C0151b1 c0151b1, String str) {
        c0151b1.getClass();
        str.getClass();
        com.google.protobuf.U u7 = c0151b1.documents_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0151b1.documents_ = com.google.protobuf.J.p(u7);
        }
        c0151b1.documents_.add(str);
    }

    public static C0151b1 w() {
        return DEFAULT_INSTANCE;
    }

    public static C0148a1 z() {
        return (C0148a1) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (Y0.f2003a[i7.ordinal()]) {
            case 1:
                return new C0151b1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0151b1.class) {
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

    public final String x() {
        return (String) this.documents_.get(0);
    }

    public final int y() {
        return this.documents_.size();
    }
}
