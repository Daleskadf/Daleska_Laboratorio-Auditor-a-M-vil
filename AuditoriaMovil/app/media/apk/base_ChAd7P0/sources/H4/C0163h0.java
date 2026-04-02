package H4;

import com.google.protobuf.C0851l0;
import com.google.protobuf.InterfaceC0872w0;
import j$.util.DesugarCollections;
import java.util.Map;
/* renamed from: H4.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163h0 extends com.google.protobuf.J {
    private static final C0163h0 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER;
    private C0851l0 fields_ = C0851l0.f10083b;

    static {
        C0163h0 c0163h0 = new C0163h0();
        DEFAULT_INSTANCE = c0163h0;
        com.google.protobuf.J.t(C0163h0.class, c0163h0);
    }

    public static C0159f0 B() {
        return (C0159f0) DEFAULT_INSTANCE.i();
    }

    public static C0851l0 v(C0163h0 c0163h0) {
        C0851l0 c0851l0 = c0163h0.fields_;
        if (!c0851l0.f10084a) {
            c0163h0.fields_ = c0851l0.c();
        }
        return c0163h0.fields_;
    }

    public static C0163h0 w() {
        return DEFAULT_INSTANCE;
    }

    public final p1 A(String str) {
        str.getClass();
        C0851l0 c0851l0 = this.fields_;
        if (c0851l0.containsKey(str)) {
            return (p1) c0851l0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0157e0.f2009a[i7.ordinal()]) {
            case 1:
                return new C0163h0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", AbstractC0161g0.f2011a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0163h0.class) {
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

    public final int x() {
        return this.fields_.size();
    }

    public final Map y() {
        return DesugarCollections.unmodifiableMap(this.fields_);
    }

    public final p1 z(String str) {
        str.getClass();
        C0851l0 c0851l0 = this.fields_;
        if (c0851l0.containsKey(str)) {
            return (p1) c0851l0.get(str);
        }
        return null;
    }
}
