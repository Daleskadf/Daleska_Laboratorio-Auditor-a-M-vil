package s4;

import H4.D;
import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
/* renamed from: s4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794d extends J {
    private static final C1794d DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    static {
        C1794d c1794d = new C1794d();
        DEFAULT_INSTANCE = c1794d;
        J.t(C1794d.class, c1794d);
    }

    public static C1792b E() {
        return (C1792b) DEFAULT_INSTANCE.i();
    }

    public static C1794d F(byte[] bArr) {
        return (C1794d) J.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(C1794d c1794d, boolean z7) {
        c1794d.hasCommittedMutations_ = z7;
    }

    public static void w(C1794d c1794d, g gVar) {
        c1794d.getClass();
        c1794d.documentType_ = gVar;
        c1794d.documentTypeCase_ = 1;
    }

    public static void x(C1794d c1794d, D d7) {
        c1794d.getClass();
        c1794d.documentType_ = d7;
        c1794d.documentTypeCase_ = 2;
    }

    public static void y(C1794d c1794d, n nVar) {
        c1794d.getClass();
        c1794d.documentType_ = nVar;
        c1794d.documentTypeCase_ = 3;
    }

    public final EnumC1793c A() {
        int i7 = this.documentTypeCase_;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return EnumC1793c.UNKNOWN_DOCUMENT;
                }
                return EnumC1793c.DOCUMENT;
            }
            return EnumC1793c.NO_DOCUMENT;
        }
        return EnumC1793c.DOCUMENTTYPE_NOT_SET;
    }

    public final boolean B() {
        return this.hasCommittedMutations_;
    }

    public final g C() {
        if (this.documentTypeCase_ == 1) {
            return (g) this.documentType_;
        }
        return g.x();
    }

    public final n D() {
        if (this.documentTypeCase_ == 3) {
            return (n) this.documentType_;
        }
        return n.x();
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (AbstractC1791a.f15687a[i7.ordinal()]) {
            case 1:
                return new C1794d();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", g.class, D.class, n.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (C1794d.class) {
                        try {
                            interfaceC0872w0 = PARSER;
                            if (interfaceC0872w0 == null) {
                                interfaceC0872w0 = new H(DEFAULT_INSTANCE);
                                PARSER = interfaceC0872w0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0872w0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final D z() {
        if (this.documentTypeCase_ == 2) {
            return (D) this.documentType_;
        }
        return D.y();
    }
}
