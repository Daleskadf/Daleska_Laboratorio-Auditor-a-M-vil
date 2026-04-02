package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class Z0 extends AbstractC0797y {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final Z0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER;
    private String configName_ = StringUtils.EMPTY;
    private com.google.crypto.tink.shaded.protobuf.C entry_ = com.google.crypto.tink.shaded.protobuf.e0.f9639d;

    static {
        Z0 z02 = new Z0();
        DEFAULT_INSTANCE = z02;
        AbstractC0797y.v(Z0.class, z02);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (Y0.f4746a[enumC0796x.ordinal()]) {
            case 1:
                return new Z0();
            case 2:
                return new C0291e0(DEFAULT_INSTANCE, 4);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (Z0.class) {
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
