package H4;

import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186t0 extends com.google.protobuf.J {
    private static final C0186t0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER;
    private int bitField0_;
    private N0 field_;

    /* JADX WARN: Type inference failed for: r0v0, types: [H4.t0, com.google.protobuf.J] */
    static {
        ?? j = new com.google.protobuf.J();
        DEFAULT_INSTANCE = j;
        com.google.protobuf.J.t(C0186t0.class, j);
    }

    public static void v(C0186t0 c0186t0, N0 n02) {
        c0186t0.getClass();
        c0186t0.field_ = n02;
        c0186t0.bitField0_ |= 1;
    }

    public static C0184s0 w() {
        return (C0184s0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0182r0.f2022a[i7.ordinal()]) {
            case 1:
                return new com.google.protobuf.J();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0186t0.class) {
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
