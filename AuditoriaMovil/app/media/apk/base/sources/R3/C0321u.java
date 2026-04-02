package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321u extends AbstractC0797y {
    private static final C0321u DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER;
    private int keySize_;
    private C0327x params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.y, R3.u] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0321u.class, abstractC0797y);
    }

    public static C0321u A() {
        return DEFAULT_INSTANCE;
    }

    public static C0319t D() {
        return (C0319t) DEFAULT_INSTANCE.j();
    }

    public static void y(C0321u c0321u, C0327x c0327x) {
        c0321u.getClass();
        c0321u.params_ = c0327x;
    }

    public static void z(C0321u c0321u, int i7) {
        c0321u.keySize_ = i7;
    }

    public final int B() {
        return this.keySize_;
    }

    public final C0327x C() {
        C0327x c0327x = this.params_;
        if (c0327x == null) {
            return C0327x.z();
        }
        return c0327x;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0317s.f4762a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0321u.class) {
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
