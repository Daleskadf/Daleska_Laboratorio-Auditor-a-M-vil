package H4;

import com.google.protobuf.C0851l0;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* renamed from: H4.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147a0 extends com.google.protobuf.J {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0147a0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C0851l0 labels_ = C0851l0.f10083b;
    private String database_ = StringUtils.EMPTY;

    static {
        C0147a0 c0147a0 = new C0147a0();
        DEFAULT_INSTANCE = c0147a0;
        com.google.protobuf.J.t(C0147a0.class, c0147a0);
    }

    public static Y A() {
        return (Y) DEFAULT_INSTANCE.i();
    }

    public static C0851l0 v(C0147a0 c0147a0) {
        C0851l0 c0851l0 = c0147a0.labels_;
        if (!c0851l0.f10084a) {
            c0147a0.labels_ = c0851l0.c();
        }
        return c0147a0.labels_;
    }

    public static void w(C0147a0 c0147a0, String str) {
        c0147a0.getClass();
        str.getClass();
        c0147a0.database_ = str;
    }

    public static void x(C0147a0 c0147a0, e1 e1Var) {
        c0147a0.getClass();
        c0147a0.targetChange_ = e1Var;
        c0147a0.targetChangeCase_ = 2;
    }

    public static void y(C0147a0 c0147a0, int i7) {
        c0147a0.targetChangeCase_ = 3;
        c0147a0.targetChange_ = Integer.valueOf(i7);
    }

    public static C0147a0 z() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (X.f2002a[i7.ordinal()]) {
            case 1:
                return new C0147a0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", e1.class, "labels_", Z.f2004a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0147a0.class) {
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
