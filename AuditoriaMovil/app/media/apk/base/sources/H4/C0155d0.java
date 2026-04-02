package H4;

import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155d0 extends com.google.protobuf.J {
    private static final C0155d0 DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        C0155d0 c0155d0 = new C0155d0();
        DEFAULT_INSTANCE = c0155d0;
        com.google.protobuf.J.t(C0155d0.class, c0155d0);
    }

    public static C0155d0 v() {
        return DEFAULT_INSTANCE;
    }

    public final EnumC0153c0 A() {
        int i7 = this.responseTypeCase_;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                return null;
                            }
                            return EnumC0153c0.DOCUMENT_REMOVE;
                        }
                        return EnumC0153c0.FILTER;
                    }
                    return EnumC0153c0.DOCUMENT_DELETE;
                }
                return EnumC0153c0.DOCUMENT_CHANGE;
            }
            return EnumC0153c0.TARGET_CHANGE;
        }
        return EnumC0153c0.RESPONSETYPE_NOT_SET;
    }

    public final h1 B() {
        if (this.responseTypeCase_ == 2) {
            return (h1) this.responseType_;
        }
        return h1.w();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0150b0.f2007a[i7.ordinal()]) {
            case 1:
                return new C0155d0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", h1.class, F.class, H.class, V.class, M.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0155d0.class) {
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

    public final F w() {
        if (this.responseTypeCase_ == 3) {
            return (F) this.responseType_;
        }
        return F.v();
    }

    public final H x() {
        if (this.responseTypeCase_ == 4) {
            return (H) this.responseType_;
        }
        return H.v();
    }

    public final M y() {
        if (this.responseTypeCase_ == 6) {
            return (M) this.responseType_;
        }
        return M.v();
    }

    public final V z() {
        if (this.responseTypeCase_ == 5) {
            return (V) this.responseType_;
        }
        return V.w();
    }
}
