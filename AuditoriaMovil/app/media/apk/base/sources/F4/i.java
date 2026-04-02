package F4;

import com.google.protobuf.A0;
import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import com.google.protobuf.U;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class i extends J {
    private static final i DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = StringUtils.EMPTY;
    private U fields_ = A0.f9984d;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        J.t(i.class, iVar);
    }

    public static void v(i iVar, h hVar) {
        iVar.getClass();
        iVar.queryScope_ = hVar.a();
    }

    public static void w(i iVar, g gVar) {
        iVar.getClass();
        U u7 = iVar.fields_;
        if (!((AbstractC0830b) u7).f10056a) {
            iVar.fields_ = J.p(u7);
        }
        iVar.fields_.add(gVar);
    }

    public static b y() {
        return (b) DEFAULT_INSTANCE.i();
    }

    public static i z(byte[] bArr) {
        return (i) J.r(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (a.f1196a[i7.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", g.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (i.class) {
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

    public final U x() {
        return this.fields_;
    }
}
