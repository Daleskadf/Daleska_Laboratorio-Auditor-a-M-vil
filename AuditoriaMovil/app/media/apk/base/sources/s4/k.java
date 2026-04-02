package s4;

import H4.C0151b1;
import H4.d1;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.B0;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
/* loaded from: classes.dex */
public final class k extends J {
    private static final k DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private N0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private N0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC0852m resumeToken_ = AbstractC0852m.f10085b;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        J.t(k.class, kVar);
    }

    public static void A(k kVar, N0 n02) {
        kVar.getClass();
        kVar.snapshotVersion_ = n02;
        kVar.bitField0_ |= 1;
    }

    public static void B(k kVar, AbstractC0852m abstractC0852m) {
        kVar.getClass();
        abstractC0852m.getClass();
        kVar.resumeToken_ = abstractC0852m;
    }

    public static void C(k kVar, long j) {
        kVar.lastListenSequenceNumber_ = j;
    }

    public static i L() {
        return (i) DEFAULT_INSTANCE.i();
    }

    public static k M(byte[] bArr) {
        return (k) J.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(k kVar, d1 d1Var) {
        kVar.getClass();
        kVar.targetType_ = d1Var;
        kVar.targetTypeCase_ = 5;
    }

    public static void w(k kVar, C0151b1 c0151b1) {
        kVar.getClass();
        kVar.targetType_ = c0151b1;
        kVar.targetTypeCase_ = 6;
    }

    public static void x(k kVar, N0 n02) {
        kVar.getClass();
        kVar.lastLimboFreeSnapshotVersion_ = n02;
        kVar.bitField0_ |= 2;
    }

    public static void y(k kVar) {
        kVar.lastLimboFreeSnapshotVersion_ = null;
        kVar.bitField0_ &= -3;
    }

    public static void z(k kVar, int i7) {
        kVar.targetId_ = i7;
    }

    public final C0151b1 D() {
        if (this.targetTypeCase_ == 6) {
            return (C0151b1) this.targetType_;
        }
        return C0151b1.w();
    }

    public final N0 E() {
        N0 n02 = this.lastLimboFreeSnapshotVersion_;
        if (n02 == null) {
            return N0.x();
        }
        return n02;
    }

    public final long F() {
        return this.lastListenSequenceNumber_;
    }

    public final d1 G() {
        if (this.targetTypeCase_ == 5) {
            return (d1) this.targetType_;
        }
        return d1.x();
    }

    public final AbstractC0852m H() {
        return this.resumeToken_;
    }

    public final N0 I() {
        N0 n02 = this.snapshotVersion_;
        if (n02 == null) {
            return N0.x();
        }
        return n02;
    }

    public final int J() {
        return this.targetId_;
    }

    public final j K() {
        int i7 = this.targetTypeCase_;
        if (i7 != 0) {
            if (i7 != 5) {
                if (i7 != 6) {
                    return null;
                }
                return j.DOCUMENTS;
            }
            return j.QUERY;
        }
        return j.TARGETTYPE_NOT_SET;
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (h.f15689a[i7.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", d1.class, C0151b1.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (k.class) {
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
}
