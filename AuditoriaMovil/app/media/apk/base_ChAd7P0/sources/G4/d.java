package G4;

import H4.X0;
import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class d extends J {
    private static final d DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = StringUtils.EMPTY;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        J.t(d.class, dVar);
    }

    public static b B() {
        return (b) DEFAULT_INSTANCE.i();
    }

    public static d C(byte[] bArr) {
        return (d) J.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.parent_ = str;
    }

    public static void w(d dVar, X0 x02) {
        dVar.getClass();
        x02.getClass();
        dVar.queryType_ = x02;
        dVar.queryTypeCase_ = 2;
    }

    public static void x(d dVar, c cVar) {
        dVar.getClass();
        dVar.limitType_ = cVar.a();
    }

    public final X0 A() {
        if (this.queryTypeCase_ == 2) {
            return (X0) this.queryType_;
        }
        return X0.B();
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (a.f1592a[i7.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", X0.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (d.class) {
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

    public final c y() {
        c cVar;
        int i7 = this.limitType_;
        if (i7 != 0) {
            if (i7 != 1) {
                cVar = null;
            } else {
                cVar = c.LAST;
            }
        } else {
            cVar = c.FIRST;
        }
        if (cVar == null) {
            return c.UNRECOGNIZED;
        }
        return cVar;
    }

    public final String z() {
        return this.parent_;
    }
}
