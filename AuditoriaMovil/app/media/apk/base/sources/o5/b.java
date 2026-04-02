package o5;

import com.google.protobuf.A0;
import com.google.protobuf.B0;
import com.google.protobuf.C0836e;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import com.google.protobuf.U;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b extends J {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private int code_;
    private String message_ = StringUtils.EMPTY;
    private U details_ = A0.f9984d;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        J.t(b.class, bVar);
    }

    public static b w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (AbstractC1564a.f14601a[i7.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C0836e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (b.class) {
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

    public final int v() {
        return this.code_;
    }

    public final String x() {
        return this.message_;
    }
}
