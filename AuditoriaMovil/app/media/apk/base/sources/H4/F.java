package H4;

import com.google.protobuf.InterfaceC0872w0;
/* loaded from: classes.dex */
public final class F extends com.google.protobuf.J {
    private static final F DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private D document_;
    private com.google.protobuf.T removedTargetIds_;
    private com.google.protobuf.T targetIds_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;

    static {
        F f = new F();
        DEFAULT_INSTANCE = f;
        com.google.protobuf.J.t(F.class, f);
    }

    public F() {
        com.google.protobuf.P p7 = com.google.protobuf.P.f10022d;
        this.targetIds_ = p7;
        this.removedTargetIds_ = p7;
    }

    public static F v() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (E.f1991a[i7.ordinal()]) {
            case 1:
                return new F();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (F.class) {
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

    public final D w() {
        D d7 = this.document_;
        if (d7 == null) {
            return D.y();
        }
        return d7;
    }

    public final com.google.protobuf.T x() {
        return this.removedTargetIds_;
    }

    public final com.google.protobuf.T y() {
        return this.targetIds_;
    }
}
