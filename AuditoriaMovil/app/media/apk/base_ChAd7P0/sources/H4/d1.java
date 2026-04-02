package H4;

import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class d1 extends com.google.protobuf.J {
    private static final d1 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = StringUtils.EMPTY;

    static {
        d1 d1Var = new d1();
        DEFAULT_INSTANCE = d1Var;
        com.google.protobuf.J.t(d1.class, d1Var);
    }

    public static c1 A() {
        return (c1) DEFAULT_INSTANCE.i();
    }

    public static void v(d1 d1Var, X0 x02) {
        d1Var.getClass();
        d1Var.queryType_ = x02;
        d1Var.queryTypeCase_ = 2;
    }

    public static void w(d1 d1Var, String str) {
        d1Var.getClass();
        str.getClass();
        d1Var.parent_ = str;
    }

    public static d1 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (Y0.f2003a[i7.ordinal()]) {
            case 1:
                return new d1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", X0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (d1.class) {
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

    public final String y() {
        return this.parent_;
    }

    public final X0 z() {
        if (this.queryTypeCase_ == 2) {
            return (X0) this.queryType_;
        }
        return X0.B();
    }
}
