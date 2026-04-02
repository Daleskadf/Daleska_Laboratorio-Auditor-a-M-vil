package H4;

import com.google.protobuf.C0851l0;
import com.google.protobuf.InterfaceC0872w0;
import j$.util.DesugarCollections;
import java.util.Map;
/* renamed from: H4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154d extends com.google.protobuf.J {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C0154d DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER;
    private C0851l0 aggregateFields_ = C0851l0.f10083b;

    static {
        C0154d c0154d = new C0154d();
        DEFAULT_INSTANCE = c0154d;
        com.google.protobuf.J.t(C0154d.class, c0154d);
    }

    public static C0154d w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0146a.f2005a[i7.ordinal()]) {
            case 1:
                return new C0154d();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", AbstractC0149b.f2006a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0154d.class) {
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

    public final Map v() {
        return DesugarCollections.unmodifiableMap(this.aggregateFields_);
    }
}
