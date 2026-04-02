package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
/* renamed from: H4.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178p extends com.google.protobuf.J {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0178p DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private AbstractC0852m bitmap_ = AbstractC0852m.f10085b;
    private int padding_;

    static {
        C0178p c0178p = new C0178p();
        DEFAULT_INSTANCE = c0178p;
        com.google.protobuf.J.t(C0178p.class, c0178p);
    }

    public static C0178p w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0176o.f2018a[i7.ordinal()]) {
            case 1:
                return new C0178p();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0178p.class) {
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

    public final AbstractC0852m v() {
        return this.bitmap_;
    }

    public final int x() {
        return this.padding_;
    }
}
