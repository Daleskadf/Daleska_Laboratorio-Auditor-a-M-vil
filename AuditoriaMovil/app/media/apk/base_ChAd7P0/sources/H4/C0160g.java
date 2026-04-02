package H4;

import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
import java.util.List;
/* renamed from: H4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160g extends com.google.protobuf.J implements InterfaceC0162h {
    private static final C0160g DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.U values_ = com.google.protobuf.A0.f9984d;

    static {
        C0160g c0160g = new C0160g();
        DEFAULT_INSTANCE = c0160g;
        com.google.protobuf.J.t(C0160g.class, c0160g);
    }

    public static C0158f B() {
        return (C0158f) DEFAULT_INSTANCE.i();
    }

    public static void v(C0160g c0160g, p1 p1Var) {
        c0160g.getClass();
        p1Var.getClass();
        com.google.protobuf.U u7 = c0160g.values_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0160g.values_ = com.google.protobuf.J.p(u7);
        }
        c0160g.values_.add(p1Var);
    }

    public static void w(C0160g c0160g, List list) {
        com.google.protobuf.U u7 = c0160g.values_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0160g.values_ = com.google.protobuf.J.p(u7);
        }
        AbstractC0828a.b(list, c0160g.values_);
    }

    public static void x(C0160g c0160g, int i7) {
        com.google.protobuf.U u7 = c0160g.values_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0160g.values_ = com.google.protobuf.J.p(u7);
        }
        c0160g.values_.remove(i7);
    }

    public static C0160g y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.values_.size();
    }

    @Override // H4.InterfaceC0162h
    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0156e.f2008a[i7.ordinal()]) {
            case 1:
                return new C0160g();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", p1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0160g.class) {
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

    public final p1 z(int i7) {
        return (p1) this.values_.get(i7);
    }
}
