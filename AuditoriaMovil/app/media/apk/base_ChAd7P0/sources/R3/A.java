package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* loaded from: classes.dex */
public final class A extends AbstractC0797y {
    private static final A DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0781h keyValue_ = AbstractC0781h.f9648b;
    private G params_;
    private int version_;

    static {
        A a7 = new A();
        DEFAULT_INSTANCE = a7;
        AbstractC0797y.v(A.class, a7);
    }

    public static void A(A a7, C0780g c0780g) {
        a7.getClass();
        a7.keyValue_ = c0780g;
    }

    public static C0331z E() {
        return (C0331z) DEFAULT_INSTANCE.j();
    }

    public static A F(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (A) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(A a7) {
        a7.version_ = 0;
    }

    public static void z(A a7, G g3) {
        a7.getClass();
        g3.getClass();
        a7.params_ = g3;
    }

    public final AbstractC0781h B() {
        return this.keyValue_;
    }

    public final G C() {
        G g3 = this.params_;
        if (g3 == null) {
            return G.z();
        }
        return g3;
    }

    public final int D() {
        return this.version_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0329y.f4765a[enumC0796x.ordinal()]) {
            case 1:
                return new A();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (A.class) {
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
