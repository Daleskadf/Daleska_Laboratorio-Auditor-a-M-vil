package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class A0 extends AbstractC0797y {
    private static final A0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = StringUtils.EMPTY;
    private AbstractC0781h value_ = AbstractC0781h.f9648b;

    static {
        A0 a02 = new A0();
        DEFAULT_INSTANCE = a02;
        AbstractC0797y.v(A0.class, a02);
    }

    public static void A(A0 a02, X0 x02) {
        a02.getClass();
        a02.outputPrefixType_ = x02.b();
    }

    public static A0 B() {
        return DEFAULT_INSTANCE;
    }

    public static C0332z0 F() {
        return (C0332z0) DEFAULT_INSTANCE.j();
    }

    public static void y(A0 a02, String str) {
        a02.getClass();
        str.getClass();
        a02.typeUrl_ = str;
    }

    public static void z(A0 a02, C0780g c0780g) {
        a02.getClass();
        a02.value_ = c0780g;
    }

    public final X0 C() {
        X0 a7 = X0.a(this.outputPrefixType_);
        if (a7 == null) {
            return X0.UNRECOGNIZED;
        }
        return a7;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0781h E() {
        return this.value_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0330y0.f4766a[enumC0796x.ordinal()]) {
            case 1:
                return new A0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (A0.class) {
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
