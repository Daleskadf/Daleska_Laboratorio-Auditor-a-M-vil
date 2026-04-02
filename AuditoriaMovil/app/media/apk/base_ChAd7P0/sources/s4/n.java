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
public final class n extends J {
    private static final n DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = StringUtils.EMPTY;
    private N0 version_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        J.t(n.class, nVar);
    }

    public static m A() {
        return (m) DEFAULT_INSTANCE.i();
    }

    public static void v(n nVar, String str) {
        nVar.getClass();
        str.getClass();
        nVar.name_ = str;
    }

    public static void w(n nVar, N0 n02) {
        nVar.getClass();
        nVar.version_ = n02;
        nVar.bitField0_ |= 1;
    }

    public static n x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (l.f15690a[i7.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (n.class) {
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
        N0 n02 = this.version_;
        if (n02 == null) {
            return N0.x();
        }
        return n02;
    }
}
