package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310o extends AbstractC0797y {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0310o DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER;
    private C0321u aesCtrKeyFormat_;
    private C0313p0 hmacKeyFormat_;

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.o, com.google.crypto.tink.shaded.protobuf.y] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0310o.class, abstractC0797y);
    }

    public static C0308n C() {
        return (C0308n) DEFAULT_INSTANCE.j();
    }

    public static C0310o D(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0310o) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(C0310o c0310o, C0321u c0321u) {
        c0310o.getClass();
        c0310o.aesCtrKeyFormat_ = c0321u;
    }

    public static void z(C0310o c0310o, C0313p0 c0313p0) {
        c0310o.getClass();
        c0310o.hmacKeyFormat_ = c0313p0;
    }

    public final C0321u A() {
        C0321u c0321u = this.aesCtrKeyFormat_;
        if (c0321u == null) {
            return C0321u.A();
        }
        return c0321u;
    }

    public final C0313p0 B() {
        C0313p0 c0313p0 = this.hmacKeyFormat_;
        if (c0313p0 == null) {
            return C0313p0.A();
        }
        return c0313p0;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0306m.f4758a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0310o.class) {
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
