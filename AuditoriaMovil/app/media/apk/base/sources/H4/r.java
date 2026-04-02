package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class r extends com.google.protobuf.J {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final r DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private int bitField0_;
    private C0178p bits_;
    private int hashCount_;

    /* JADX WARN: Type inference failed for: r0v0, types: [H4.r, com.google.protobuf.J] */
    static {
        ?? j = new com.google.protobuf.J();
        DEFAULT_INSTANCE = j;
        com.google.protobuf.J.t(r.class, j);
    }

    public static r w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0180q.f2020a[i7.ordinal()]) {
            case 1:
                return new com.google.protobuf.J();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (r.class) {
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

    public final C0178p v() {
        C0178p c0178p = this.bits_;
        if (c0178p == null) {
            return C0178p.w();
        }
        return c0178p;
    }

    public final int x() {
        return this.hashCount_;
    }

    public final boolean y() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
