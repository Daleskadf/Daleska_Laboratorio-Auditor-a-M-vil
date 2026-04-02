package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287c0 extends AbstractC0797y {
    private static final C0287c0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0781h keyValue_ = AbstractC0781h.f9648b;
    private int version_;

    static {
        C0287c0 c0287c0 = new C0287c0();
        DEFAULT_INSTANCE = c0287c0;
        AbstractC0797y.v(C0287c0.class, c0287c0);
    }

    public static C0285b0 C() {
        return (C0285b0) DEFAULT_INSTANCE.j();
    }

    public static C0287c0 D(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0287c0) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(C0287c0 c0287c0) {
        c0287c0.version_ = 0;
    }

    public static void z(C0287c0 c0287c0, C0780g c0780g) {
        c0287c0.getClass();
        c0287c0.keyValue_ = c0780g;
    }

    public final AbstractC0781h A() {
        return this.keyValue_;
    }

    public final int B() {
        return this.version_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0283a0.f4748a[enumC0796x.ordinal()]) {
            case 1:
                return new C0287c0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0287c0.class) {
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
