package H4;

import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* renamed from: H4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174n extends com.google.protobuf.J {
    private static final C0174n DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.protobuf.N0 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private AbstractC0852m transaction_ = AbstractC0852m.f10085b;

    static {
        C0174n c0174n = new C0174n();
        DEFAULT_INSTANCE = c0174n;
        com.google.protobuf.J.t(C0174n.class, c0174n);
    }

    public static C0174n v() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0170l.f2015a[i7.ordinal()]) {
            case 1:
                return new C0174n();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", D.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0174n.class) {
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

    public final D w() {
        if (this.resultCase_ == 1) {
            return (D) this.result_;
        }
        return D.y();
    }

    public final String x() {
        if (this.resultCase_ == 2) {
            return (String) this.result_;
        }
        return StringUtils.EMPTY;
    }

    public final com.google.protobuf.N0 y() {
        com.google.protobuf.N0 n02 = this.readTime_;
        if (n02 == null) {
            return com.google.protobuf.N0.x();
        }
        return n02;
    }

    public final EnumC0172m z() {
        int i7 = this.resultCase_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return EnumC0172m.MISSING;
            }
            return EnumC0172m.FOUND;
        }
        return EnumC0172m.RESULT_NOT_SET;
    }
}
