package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class V extends com.google.protobuf.J {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final V DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private r unchangedNames_;

    /* JADX WARN: Type inference failed for: r0v0, types: [H4.V, com.google.protobuf.J] */
    static {
        ?? j = new com.google.protobuf.J();
        DEFAULT_INSTANCE = j;
        com.google.protobuf.J.t(V.class, j);
    }

    public static V w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (U.f1996a[i7.ordinal()]) {
            case 1:
                return new com.google.protobuf.J();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (V.class) {
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

    public final int v() {
        return this.count_;
    }

    public final int x() {
        return this.targetId_;
    }

    public final r y() {
        r rVar = this.unchangedNames_;
        if (rVar == null) {
            return r.w();
        }
        return rVar;
    }
}
