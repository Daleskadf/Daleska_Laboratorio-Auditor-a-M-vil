package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* renamed from: H4.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187u extends com.google.protobuf.J {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0187u DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = StringUtils.EMPTY;
    private com.google.protobuf.U writes_ = com.google.protobuf.A0.f9984d;
    private AbstractC0852m transaction_ = AbstractC0852m.f10085b;

    static {
        C0187u c0187u = new C0187u();
        DEFAULT_INSTANCE = c0187u;
        com.google.protobuf.J.t(C0187u.class, c0187u);
    }

    public static void v(C0187u c0187u, String str) {
        c0187u.getClass();
        str.getClass();
        c0187u.database_ = str;
    }

    public static void w(C0187u c0187u, t1 t1Var) {
        c0187u.getClass();
        com.google.protobuf.U u7 = c0187u.writes_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0187u.writes_ = com.google.protobuf.J.p(u7);
        }
        c0187u.writes_.add(t1Var);
    }

    public static C0187u x() {
        return DEFAULT_INSTANCE;
    }

    public static C0185t y() {
        return (C0185t) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0183s.f2023a[i7.ordinal()]) {
            case 1:
                return new C0187u();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", t1.class, "transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0187u.class) {
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
}
