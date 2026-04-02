package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293f0 extends AbstractC0797y {
    private static final C0293f0 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER;

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.f0, com.google.crypto.tink.shaded.protobuf.y] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0293f0.class, abstractC0797y);
    }

    public static C0293f0 y() {
        return DEFAULT_INSTANCE;
    }

    public static C0293f0 z(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0293f0) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0289d0.f4751a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new C0291e0(DEFAULT_INSTANCE, 0);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0293f0.class) {
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
