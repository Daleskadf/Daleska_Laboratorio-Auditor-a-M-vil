package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* loaded from: classes.dex */
public final class G0 extends AbstractC0797y {
    private static final G0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private C0326w0 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.y, R3.G0] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(G0.class, abstractC0797y);
    }

    public static void A(G0 g02, EnumC0328x0 enumC0328x0) {
        g02.getClass();
        g02.status_ = enumC0328x0.a();
    }

    public static void B(G0 g02, int i7) {
        g02.keyId_ = i7;
    }

    public static F0 H() {
        return (F0) DEFAULT_INSTANCE.j();
    }

    public static void y(G0 g02, C0326w0 c0326w0) {
        g02.getClass();
        g02.keyData_ = c0326w0;
    }

    public static void z(G0 g02, X0 x02) {
        g02.getClass();
        g02.outputPrefixType_ = x02.b();
    }

    public final C0326w0 C() {
        C0326w0 c0326w0 = this.keyData_;
        if (c0326w0 == null) {
            return C0326w0.B();
        }
        return c0326w0;
    }

    public final int D() {
        return this.keyId_;
    }

    public final X0 E() {
        X0 a7 = X0.a(this.outputPrefixType_);
        if (a7 == null) {
            return X0.UNRECOGNIZED;
        }
        return a7;
    }

    public final EnumC0328x0 F() {
        EnumC0328x0 enumC0328x0;
        int i7 = this.status_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        enumC0328x0 = null;
                    } else {
                        enumC0328x0 = EnumC0328x0.DESTROYED;
                    }
                } else {
                    enumC0328x0 = EnumC0328x0.DISABLED;
                }
            } else {
                enumC0328x0 = EnumC0328x0.ENABLED;
            }
        } else {
            enumC0328x0 = EnumC0328x0.UNKNOWN_STATUS;
        }
        if (enumC0328x0 == null) {
            return EnumC0328x0.UNRECOGNIZED;
        }
        return enumC0328x0;
    }

    public final boolean G() {
        if (this.keyData_ != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (D0.f4733a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (G0.class) {
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
