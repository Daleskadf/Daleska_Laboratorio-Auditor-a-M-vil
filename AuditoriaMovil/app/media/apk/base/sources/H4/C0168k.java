package H4;

import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* renamed from: H4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168k extends com.google.protobuf.J {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0168k DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private K mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = StringUtils.EMPTY;
    private com.google.protobuf.U documents_ = com.google.protobuf.A0.f9984d;

    static {
        C0168k c0168k = new C0168k();
        DEFAULT_INSTANCE = c0168k;
        com.google.protobuf.J.t(C0168k.class, c0168k);
    }

    public static void v(C0168k c0168k, String str) {
        c0168k.getClass();
        str.getClass();
        c0168k.database_ = str;
    }

    public static void w(C0168k c0168k, String str) {
        c0168k.getClass();
        str.getClass();
        com.google.protobuf.U u7 = c0168k.documents_;
        if (!((AbstractC0830b) u7).f10056a) {
            c0168k.documents_ = com.google.protobuf.J.p(u7);
        }
        c0168k.documents_.add(str);
    }

    public static C0168k x() {
        return DEFAULT_INSTANCE;
    }

    public static C0166j y() {
        return (C0166j) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (AbstractC0164i.f2012a[i7.ordinal()]) {
            case 1:
                return new C0168k();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", l1.class, com.google.protobuf.N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C0168k.class) {
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
