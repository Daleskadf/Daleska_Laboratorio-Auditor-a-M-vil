package H4;

import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class T extends com.google.protobuf.J {
    private static final T DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC0872w0 PARSER;
    private String document_ = StringUtils.EMPTY;
    private com.google.protobuf.U fieldTransforms_ = com.google.protobuf.A0.f9984d;

    static {
        T t7 = new T();
        DEFAULT_INSTANCE = t7;
        com.google.protobuf.J.t(T.class, t7);
    }

    public static T v() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (N.f1995a[i7.ordinal()]) {
            case 1:
                return new T();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", S.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (T.class) {
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

    public final com.google.protobuf.U w() {
        return this.fieldTransforms_;
    }
}
