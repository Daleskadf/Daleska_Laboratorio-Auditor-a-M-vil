package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0775b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
/* loaded from: classes.dex */
public final class M0 extends AbstractC0797y {
    private static final M0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.C keyInfo_ = com.google.crypto.tink.shaded.protobuf.e0.f9639d;
    private int primaryKeyId_;

    static {
        M0 m02 = new M0();
        DEFAULT_INSTANCE = m02;
        AbstractC0797y.v(M0.class, m02);
    }

    public static J0 B() {
        return (J0) DEFAULT_INSTANCE.j();
    }

    public static void y(M0 m02, int i7) {
        m02.primaryKeyId_ = i7;
    }

    public static void z(M0 m02, L0 l02) {
        int i7;
        m02.getClass();
        com.google.crypto.tink.shaded.protobuf.C c8 = m02.keyInfo_;
        if (!((AbstractC0775b) c8).f9632a) {
            int size = c8.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            m02.keyInfo_ = c8.a(i7);
        }
        m02.keyInfo_.add(l02);
    }

    public final L0 A() {
        return (L0) this.keyInfo_.get(0);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (I0.f4736a[enumC0796x.ordinal()]) {
            case 1:
                return new M0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", L0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (M0.class) {
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
