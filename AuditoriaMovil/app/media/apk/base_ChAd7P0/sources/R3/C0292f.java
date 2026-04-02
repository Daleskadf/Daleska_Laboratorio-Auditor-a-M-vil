package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292f extends AbstractC0797y {
    private static final C0292f DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER;
    private int keySize_;
    private C0298i params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.y, R3.f] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0292f.class, abstractC0797y);
    }

    public static C0290e C() {
        return (C0290e) DEFAULT_INSTANCE.j();
    }

    public static C0292f D(AbstractC0781h abstractC0781h, C0787n c0787n) {
        return (C0292f) AbstractC0797y.t(DEFAULT_INSTANCE, abstractC0781h, c0787n);
    }

    public static void y(C0292f c0292f) {
        c0292f.keySize_ = 32;
    }

    public static void z(C0292f c0292f, C0298i c0298i) {
        c0292f.getClass();
        c0292f.params_ = c0298i;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0298i B() {
        C0298i c0298i = this.params_;
        if (c0298i == null) {
            return C0298i.z();
        }
        return c0298i;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0288d.f4750a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0292f.class) {
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
