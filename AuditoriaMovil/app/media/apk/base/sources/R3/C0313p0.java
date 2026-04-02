package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313p0 extends AbstractC0797y {
    private static final C0313p0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private C0318s0 params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.p0, com.google.crypto.tink.shaded.protobuf.y] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0313p0.class, abstractC0797y);
    }

    public static C0313p0 A() {
        return DEFAULT_INSTANCE;
    }

    public static C0311o0 D() {
        return (C0311o0) DEFAULT_INSTANCE.j();
    }

    public static C0313p0 E(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0313p0) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(C0313p0 c0313p0, C0318s0 c0318s0) {
        c0313p0.getClass();
        c0313p0.params_ = c0318s0;
    }

    public static void z(C0313p0 c0313p0, int i7) {
        c0313p0.keySize_ = i7;
    }

    public final int B() {
        return this.keySize_;
    }

    public final C0318s0 C() {
        C0318s0 c0318s0 = this.params_;
        if (c0318s0 == null) {
            return C0318s0.A();
        }
        return c0318s0;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0309n0.f4759a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0313p0.class) {
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
