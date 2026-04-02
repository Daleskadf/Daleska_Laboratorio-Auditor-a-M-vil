package F4;

import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class g extends J {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final g DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = StringUtils.EMPTY;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        J.t(g.class, gVar);
    }

    public static d B() {
        return (d) DEFAULT_INSTANCE.i();
    }

    public static void v(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.fieldPath_ = str;
    }

    public static void w(g gVar, e eVar) {
        gVar.getClass();
        gVar.valueMode_ = Integer.valueOf(eVar.a());
        gVar.valueModeCase_ = 2;
    }

    public static void x(g gVar, c cVar) {
        gVar.getClass();
        gVar.valueMode_ = Integer.valueOf(cVar.a());
        gVar.valueModeCase_ = 3;
    }

    public final f A() {
        int i7 = this.valueModeCase_;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return null;
                }
                return f.ARRAY_CONFIG;
            }
            return f.ORDER;
        }
        return f.VALUEMODE_NOT_SET;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (a.f1196a[i7.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
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
        return this.fieldPath_;
    }

    public final e z() {
        e eVar;
        if (this.valueModeCase_ == 2) {
            int intValue = ((Integer) this.valueMode_).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        eVar = null;
                    } else {
                        eVar = e.DESCENDING;
                    }
                } else {
                    eVar = e.ASCENDING;
                }
            } else {
                eVar = e.ORDER_UNSPECIFIED;
            }
            if (eVar == null) {
                return e.UNRECOGNIZED;
            }
            return eVar;
        }
        return e.ORDER_UNSPECIFIED;
    }
}
