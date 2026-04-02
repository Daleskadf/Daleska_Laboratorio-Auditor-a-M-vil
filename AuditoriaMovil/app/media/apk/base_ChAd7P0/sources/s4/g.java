package s4;

import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class g extends J {
    private static final g DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = StringUtils.EMPTY;
    private N0 readTime_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        J.t(g.class, gVar);
    }

    public static C1796f A() {
        return (C1796f) DEFAULT_INSTANCE.i();
    }

    public static void v(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.name_ = str;
    }

    public static void w(g gVar, N0 n02) {
        gVar.getClass();
        gVar.readTime_ = n02;
        gVar.bitField0_ |= 1;
    }

    public static g x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (AbstractC1795e.f15688a[i7.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (g.class) {
                        try {
                            interfaceC0872w0 = PARSER;
                            if (interfaceC0872w0 == null) {
                                interfaceC0872w0 = new H(DEFAULT_INSTANCE);
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
        return this.name_;
    }

    public final N0 z() {
        N0 n02 = this.readTime_;
        if (n02 == null) {
            return N0.x();
        }
        return n02;
    }
}
