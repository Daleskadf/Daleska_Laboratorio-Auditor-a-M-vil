package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286c extends AbstractC0797y {
    private static final C0286c DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0781h keyValue_ = AbstractC0781h.f9648b;
    private C0298i params_;
    private int version_;

    static {
        C0286c c0286c = new C0286c();
        DEFAULT_INSTANCE = c0286c;
        AbstractC0797y.v(C0286c.class, c0286c);
    }

    public static void A(C0286c c0286c, C0298i c0298i) {
        c0286c.getClass();
        c0298i.getClass();
        c0286c.params_ = c0298i;
    }

    public static C0284b E() {
        return (C0284b) DEFAULT_INSTANCE.j();
    }

    public static C0286c F(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0286c) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(C0286c c0286c) {
        c0286c.version_ = 0;
    }

    public static void z(C0286c c0286c, C0780g c0780g) {
        c0286c.getClass();
        c0286c.keyValue_ = c0780g;
    }

    public final AbstractC0781h B() {
        return this.keyValue_;
    }

    public final C0298i C() {
        C0298i c0298i = this.params_;
        if (c0298i == null) {
            return C0298i.z();
        }
        return c0298i;
    }

    public final int D() {
        return this.version_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0282a.f4747a[enumC0796x.ordinal()]) {
            case 1:
                return new C0286c();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0286c.class) {
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
