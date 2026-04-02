package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0783j;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
import java.io.ByteArrayInputStream;
/* renamed from: R3.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299i0 extends AbstractC0797y {
    private static final C0299i0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER;
    private AbstractC0781h encryptedKeyset_ = AbstractC0781h.f9648b;
    private M0 keysetInfo_;

    static {
        C0299i0 c0299i0 = new C0299i0();
        DEFAULT_INSTANCE = c0299i0;
        AbstractC0797y.v(C0299i0.class, c0299i0);
    }

    public static C0297h0 B() {
        return (C0297h0) DEFAULT_INSTANCE.j();
    }

    public static C0299i0 C(ByteArrayInputStream byteArrayInputStream, C0787n c0787n) {
        AbstractC0797y u7 = AbstractC0797y.u(DEFAULT_INSTANCE, new C0783j(byteArrayInputStream), c0787n);
        AbstractC0797y.g(u7);
        return (C0299i0) u7;
    }

    public static void y(C0299i0 c0299i0, C0780g c0780g) {
        c0299i0.getClass();
        c0299i0.encryptedKeyset_ = c0780g;
    }

    public static void z(C0299i0 c0299i0, M0 m02) {
        c0299i0.getClass();
        c0299i0.keysetInfo_ = m02;
    }

    public final AbstractC0781h A() {
        return this.encryptedKeyset_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (AbstractC0295g0.f4755a[enumC0796x.ordinal()]) {
            case 1:
                return new C0299i0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (C0299i0.class) {
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
