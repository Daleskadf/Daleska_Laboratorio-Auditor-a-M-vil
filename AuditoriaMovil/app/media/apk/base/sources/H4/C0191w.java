package H4;

import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191w extends com.google.protobuf.J {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C0191w DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.protobuf.N0 commitTime_;
    private com.google.protobuf.U writeResults_ = com.google.protobuf.A0.f9984d;

    static {
        C0191w c0191w = new C0191w();
        DEFAULT_INSTANCE = c0191w;
        com.google.protobuf.J.t(C0191w.class, c0191w);
    }

    public static C0191w w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0189v.f2025a[i7.ordinal()]) {
            case 1:
                return new C0191w();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", B1.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0191w.class) {
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

    public final com.google.protobuf.N0 v() {
        com.google.protobuf.N0 n02 = this.commitTime_;
        if (n02 == null) {
            return com.google.protobuf.N0.x();
        }
        return n02;
    }

    public final B1 x(int i7) {
        return (B1) this.writeResults_.get(i7);
    }

    public final int y() {
        return this.writeResults_.size();
    }
}
