package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0851l0;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class x1 extends com.google.protobuf.J {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final x1 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C0851l0 labels_ = C0851l0.f10083b;
    private String database_ = StringUtils.EMPTY;
    private String streamId_ = StringUtils.EMPTY;
    private com.google.protobuf.U writes_ = com.google.protobuf.A0.f9984d;
    private AbstractC0852m streamToken_ = AbstractC0852m.f10085b;

    static {
        x1 x1Var = new x1();
        DEFAULT_INSTANCE = x1Var;
        com.google.protobuf.J.t(x1.class, x1Var);
    }

    public static void v(x1 x1Var, String str) {
        x1Var.getClass();
        str.getClass();
        x1Var.database_ = str;
    }

    public static void w(x1 x1Var, AbstractC0852m abstractC0852m) {
        x1Var.getClass();
        abstractC0852m.getClass();
        x1Var.streamToken_ = abstractC0852m;
    }

    public static void x(x1 x1Var, t1 t1Var) {
        x1Var.getClass();
        com.google.protobuf.U u7 = x1Var.writes_;
        if (!((AbstractC0830b) u7).f10056a) {
            x1Var.writes_ = com.google.protobuf.J.p(u7);
        }
        x1Var.writes_.add(t1Var);
    }

    public static x1 y() {
        return DEFAULT_INSTANCE;
    }

    public static v1 z() {
        return (v1) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (u1.f2024a[i7.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", t1.class, "streamToken_", "labels_", w1.f2026a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (x1.class) {
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
