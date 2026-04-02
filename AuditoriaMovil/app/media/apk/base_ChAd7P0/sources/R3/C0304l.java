package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304l extends AbstractC0797y {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0304l DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private r aesCtrKey_;
    private C0307m0 hmacKey_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.l, com.google.crypto.tink.shaded.protobuf.y] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0304l.class, abstractC0797y);
    }

    public static void A(C0304l c0304l, C0307m0 c0307m0) {
        c0304l.getClass();
        c0307m0.getClass();
        c0304l.hmacKey_ = c0307m0;
    }

    public static C0302k E() {
        return (C0302k) DEFAULT_INSTANCE.j();
    }

    public static C0304l F(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0304l) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(C0304l c0304l) {
        c0304l.version_ = 0;
    }

    public static void z(C0304l c0304l, r rVar) {
        c0304l.getClass();
        rVar.getClass();
        c0304l.aesCtrKey_ = rVar;
    }

    public final r B() {
        r rVar = this.aesCtrKey_;
        if (rVar == null) {
            return r.B();
        }
        return rVar;
    }

    public final C0307m0 C() {
        C0307m0 c0307m0 = this.hmacKey_;
        if (c0307m0 == null) {
            return C0307m0.B();
        }
        return c0307m0;
    }

    public final int D() {
        return this.version_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0300j.f4756a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0304l.class) {
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
