package H4;

import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* renamed from: H4.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196y0 extends com.google.protobuf.J {
    public static final int ALIAS_FIELD_NUMBER = 7;
    public static final int AVG_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final C0196y0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private Object operator_;
    private int operatorCase_ = 0;
    private String alias_ = StringUtils.EMPTY;

    static {
        C0196y0 c0196y0 = new C0196y0();
        DEFAULT_INSTANCE = c0196y0;
        com.google.protobuf.J.t(C0196y0.class, c0196y0);
    }

    public static void v(C0196y0 c0196y0, C0190v0 c0190v0) {
        c0196y0.getClass();
        c0190v0.getClass();
        c0196y0.operator_ = c0190v0;
        c0196y0.operatorCase_ = 1;
    }

    public static void w(C0196y0 c0196y0, C0194x0 c0194x0) {
        c0196y0.getClass();
        c0196y0.operator_ = c0194x0;
        c0196y0.operatorCase_ = 2;
    }

    public static void x(C0196y0 c0196y0, C0186t0 c0186t0) {
        c0196y0.getClass();
        c0196y0.operator_ = c0186t0;
        c0196y0.operatorCase_ = 3;
    }

    public static void y(C0196y0 c0196y0, String str) {
        c0196y0.getClass();
        str.getClass();
        c0196y0.alias_ = str;
    }

    public static C0188u0 z() {
        return (C0188u0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0182r0.f2022a[i7.ordinal()]) {
            case 1:
                return new C0196y0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", C0190v0.class, C0194x0.class, C0186t0.class, "alias_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0196y0.class) {
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
