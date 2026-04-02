package H4;

import com.google.protobuf.InterfaceC0872w0;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class E0 extends com.google.protobuf.J {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final E0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0872w0 PARSER;
    private boolean allDescendants_;
    private String collectionId_ = StringUtils.EMPTY;

    static {
        E0 e02 = new E0();
        DEFAULT_INSTANCE = e02;
        com.google.protobuf.J.t(E0.class, e02);
    }

    public static void v(E0 e02, String str) {
        e02.getClass();
        str.getClass();
        e02.collectionId_ = str;
    }

    public static void w(E0 e02) {
        e02.allDescendants_ = true;
    }

    public static D0 z() {
        return (D0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.J
    public final Object j(com.google.protobuf.I i7) {
        switch (B0.f1989a[i7.ordinal()]) {
            case 1:
                return new E0();
            case 2:
                return new com.google.protobuf.G(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (E0.class) {
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

    public final boolean x() {
        return this.allDescendants_;
    }

    public final String y() {
        return this.collectionId_;
    }
}
