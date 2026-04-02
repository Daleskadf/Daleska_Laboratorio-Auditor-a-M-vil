package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class L0 extends AbstractC0797y {
    private static final L0 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = StringUtils.EMPTY;

    static {
        L0 l02 = new L0();
        DEFAULT_INSTANCE = l02;
        AbstractC0797y.v(L0.class, l02);
    }

    public static void A(L0 l02, EnumC0328x0 enumC0328x0) {
        l02.getClass();
        l02.status_ = enumC0328x0.a();
    }

    public static void B(L0 l02, int i7) {
        l02.keyId_ = i7;
    }

    public static K0 D() {
        return (K0) DEFAULT_INSTANCE.j();
    }

    public static void y(L0 l02, String str) {
        l02.getClass();
        str.getClass();
        l02.typeUrl_ = str;
    }

    public static void z(L0 l02, X0 x02) {
        l02.getClass();
        l02.outputPrefixType_ = x02.b();
    }

    public final int C() {
        return this.keyId_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (I0.f4736a[enumC0796x.ordinal()]) {
            case 1:
                return new L0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (L0.class) {
                        try {
                            com.google.crypto.tink.shaded.protobuf.a0 a0Var3 = PARSER;
                            com.google.crypto.tink.shaded.protobuf.a0 a0Var4 = a0Var3;
                            if (a0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                a0Var4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return a0Var2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
