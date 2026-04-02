package R3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0775b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0794v;
import com.google.crypto.tink.shaded.protobuf.AbstractC0797y;
import com.google.crypto.tink.shaded.protobuf.C0783j;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import com.google.crypto.tink.shaded.protobuf.EnumC0796x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class H0 extends AbstractC0797y {
    private static final H0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.C key_ = com.google.crypto.tink.shaded.protobuf.e0.f9639d;
    private int primaryKeyId_;

    static {
        H0 h02 = new H0();
        DEFAULT_INSTANCE = h02;
        AbstractC0797y.v(H0.class, h02);
    }

    public static E0 E() {
        return (E0) DEFAULT_INSTANCE.j();
    }

    public static H0 F(ByteArrayInputStream byteArrayInputStream, C0787n c0787n) {
        AbstractC0797y u7 = AbstractC0797y.u(DEFAULT_INSTANCE, new C0783j(byteArrayInputStream), c0787n);
        AbstractC0797y.g(u7);
        return (H0) u7;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, B2.c] */
    public static H0 G(byte[] bArr, C0787n c0787n) {
        H0 h02 = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC0797y s7 = h02.s();
        try {
            com.google.crypto.tink.shaded.protobuf.d0 d0Var = com.google.crypto.tink.shaded.protobuf.d0.f9635c;
            d0Var.getClass();
            com.google.crypto.tink.shaded.protobuf.g0 a7 = d0Var.a(s7.getClass());
            ?? obj = new Object();
            c0787n.getClass();
            a7.f(s7, bArr, 0, length, obj);
            a7.b(s7);
            AbstractC0797y.g(s7);
            return (H0) s7;
        } catch (com.google.crypto.tink.shaded.protobuf.F e7) {
            if (e7.f9600a) {
                throw new IOException(e7.getMessage(), e7);
            }
            throw e7;
        } catch (com.google.crypto.tink.shaded.protobuf.i0 e8) {
            throw new IOException(e8.getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof com.google.crypto.tink.shaded.protobuf.F) {
                throw ((com.google.crypto.tink.shaded.protobuf.F) e9.getCause());
            }
            throw new IOException(e9.getMessage(), e9);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.F.g();
        }
    }

    public static void y(H0 h02, int i7) {
        h02.primaryKeyId_ = i7;
    }

    public static void z(H0 h02, G0 g02) {
        int i7;
        h02.getClass();
        com.google.crypto.tink.shaded.protobuf.C c8 = h02.key_;
        if (!((AbstractC0775b) c8).f9632a) {
            int size = c8.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            h02.key_ = c8.a(i7);
        }
        h02.key_.add(g02);
    }

    public final G0 A(int i7) {
        return (G0) this.key_.get(i7);
    }

    public final int B() {
        return this.key_.size();
    }

    public final List C() {
        return this.key_;
    }

    public final int D() {
        return this.primaryKeyId_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.a0, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0797y
    public final Object k(EnumC0796x enumC0796x) {
        switch (D0.f4733a[enumC0796x.ordinal()]) {
            case 1:
                return new H0();
            case 2:
                return new AbstractC0794v(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", G0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a0 a0Var = PARSER;
                com.google.crypto.tink.shaded.protobuf.a0 a0Var2 = a0Var;
                if (a0Var == null) {
                    synchronized (H0.class) {
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
