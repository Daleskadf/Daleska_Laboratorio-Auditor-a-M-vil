package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181q0 extends com.google.protobuf.J {
    private static final C0181q0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.protobuf.N0 readTime_;
    private C0154d result_;
    private AbstractC0852m transaction_ = AbstractC0852m.f10085b;

    static {
        C0181q0 c0181q0 = new C0181q0();
        DEFAULT_INSTANCE = c0181q0;
        com.google.protobuf.J.t(C0181q0.class, c0181q0);
    }

    public static C0181q0 v() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0179p0.f2019a[i7.ordinal()]) {
            case 1:
                return new C0181q0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0181q0.class) {
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

    public final C0154d w() {
        C0154d c0154d = this.result_;
        if (c0154d == null) {
            return C0154d.w();
        }
        return c0154d;
    }
}
