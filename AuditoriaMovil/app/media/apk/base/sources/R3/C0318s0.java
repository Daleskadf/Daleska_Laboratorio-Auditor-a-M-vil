package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* renamed from: R3.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318s0 extends AbstractC0797y {
    private static final C0318s0 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.s0, com.google.crypto.tink.shaded.protobuf.y] */
    static {
        ?? abstractC0797y = new AbstractC0797y();
        DEFAULT_INSTANCE = abstractC0797y;
        AbstractC0797y.v(C0318s0.class, abstractC0797y);
    }

    public static C0318s0 A() {
        return DEFAULT_INSTANCE;
    }

    public static C0316r0 D() {
        return (C0316r0) DEFAULT_INSTANCE.j();
    }

    public static void y(C0318s0 c0318s0, EnumC0301j0 enumC0301j0) {
        c0318s0.getClass();
        c0318s0.hash_ = enumC0301j0.a();
    }

    public static void z(C0318s0 c0318s0, int i7) {
        c0318s0.tagSize_ = i7;
    }

    public final EnumC0301j0 B() {
        EnumC0301j0 enumC0301j0;
        int i7 = this.hash_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                enumC0301j0 = null;
                            } else {
                                enumC0301j0 = EnumC0301j0.SHA224;
                            }
                        } else {
                            enumC0301j0 = EnumC0301j0.SHA512;
                        }
                    } else {
                        enumC0301j0 = EnumC0301j0.SHA256;
                    }
                } else {
                    enumC0301j0 = EnumC0301j0.SHA384;
                }
            } else {
                enumC0301j0 = EnumC0301j0.SHA1;
            }
        } else {
            enumC0301j0 = EnumC0301j0.UNKNOWN_HASH;
        }
        if (enumC0301j0 == null) {
            return EnumC0301j0.UNRECOGNIZED;
        }
        return enumC0301j0;
    }

    public final int C() {
        return this.tagSize_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0315q0.f4761a[enumC0796x.ordinal()]) {
            case 1:
                return new AbstractC0797y();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0318s0.class) {
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
