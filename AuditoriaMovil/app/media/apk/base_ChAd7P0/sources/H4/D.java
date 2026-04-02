package H4;

import com.google.protobuf.C0851l0;
import com.google.protobuf.InterfaceC0872w0;
import j$.util.DesugarCollections;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class D extends com.google.protobuf.J {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final D DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.google.protobuf.N0 createTime_;
    private C0851l0 fields_ = C0851l0.f10083b;
    private String name_ = StringUtils.EMPTY;
    private com.google.protobuf.N0 updateTime_;

    static {
        D d7 = new D();
        DEFAULT_INSTANCE = d7;
        com.google.protobuf.J.t(D.class, d7);
    }

    public static B C() {
        return (B) DEFAULT_INSTANCE.i();
    }

    public static void v(D d7, String str) {
        d7.getClass();
        str.getClass();
        d7.name_ = str;
    }

    public static C0851l0 w(D d7) {
        C0851l0 c0851l0 = d7.fields_;
        if (!c0851l0.f10084a) {
            d7.fields_ = c0851l0.c();
        }
        return d7.fields_;
    }

    public static void x(D d7, com.google.protobuf.N0 n02) {
        d7.getClass();
        d7.updateTime_ = n02;
        d7.bitField0_ |= 2;
    }

    public static D y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.name_;
    }

    public final com.google.protobuf.N0 B() {
        com.google.protobuf.N0 n02 = this.updateTime_;
        if (n02 == null) {
            return com.google.protobuf.N0.x();
        }
        return n02;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (A.f1987a[i7.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", C.f1990a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (D.class) {
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

    public final Map z() {
        return DesugarCollections.unmodifiableMap(this.fields_);
    }
}
