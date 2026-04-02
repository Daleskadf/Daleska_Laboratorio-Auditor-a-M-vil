package H4;

import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171l0 extends com.google.protobuf.J {
    private static final C0171l0 DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        C0171l0 c0171l0 = new C0171l0();
        DEFAULT_INSTANCE = c0171l0;
        com.google.protobuf.J.t(C0171l0.class, c0171l0);
    }

    public static C0167j0 B() {
        return (C0167j0) DEFAULT_INSTANCE.i();
    }

    public static void v(C0171l0 c0171l0, boolean z7) {
        c0171l0.conditionTypeCase_ = 1;
        c0171l0.conditionType_ = Boolean.valueOf(z7);
    }

    public static void w(C0171l0 c0171l0, com.google.protobuf.N0 n02) {
        c0171l0.getClass();
        c0171l0.conditionType_ = n02;
        c0171l0.conditionTypeCase_ = 2;
    }

    public static C0171l0 y() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.protobuf.N0 A() {
        if (this.conditionTypeCase_ == 2) {
            return (com.google.protobuf.N0) this.conditionType_;
        }
        return com.google.protobuf.N0.x();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0165i0.f2013a[i7.ordinal()]) {
            case 1:
                return new C0171l0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", com.google.protobuf.N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0171l0.class) {
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

    public final EnumC0169k0 x() {
        int i7 = this.conditionTypeCase_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return EnumC0169k0.UPDATE_TIME;
            }
            return EnumC0169k0.EXISTS;
        }
        return EnumC0169k0.CONDITIONTYPE_NOT_SET;
    }

    public final boolean z() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }
}
