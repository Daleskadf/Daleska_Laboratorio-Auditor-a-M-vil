package s4;

import H4.t1;
import com.google.protobuf.A0;
import com.google.protobuf.AbstractC0830b;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.B0;
import com.google.protobuf.C0871w;
import com.google.protobuf.G;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.U;
/* loaded from: classes.dex */
public final class q extends J {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final q DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC0872w0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private U baseWrites_;
    private int batchId_;
    private int bitField0_;
    private N0 localWriteTime_;
    private U writes_;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        J.t(q.class, qVar);
    }

    public q() {
        A0 a02 = A0.f9984d;
        this.writes_ = a02;
        this.baseWrites_ = a02;
    }

    public static p F() {
        return (p) DEFAULT_INSTANCE.i();
    }

    public static q G(AbstractC0852m abstractC0852m) {
        q qVar = DEFAULT_INSTANCE;
        C0871w a7 = C0871w.a();
        J6.b r7 = abstractC0852m.r();
        J s7 = J.s(qVar, r7, a7);
        r7.b(0);
        J.f(s7);
        J.f(s7);
        return (q) s7;
    }

    public static q H(byte[] bArr) {
        return (q) J.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(q qVar, int i7) {
        qVar.batchId_ = i7;
    }

    public static void w(q qVar, t1 t1Var) {
        qVar.getClass();
        U u7 = qVar.baseWrites_;
        if (!((AbstractC0830b) u7).f10056a) {
            qVar.baseWrites_ = J.p(u7);
        }
        qVar.baseWrites_.add(t1Var);
    }

    public static void x(q qVar, t1 t1Var) {
        qVar.getClass();
        U u7 = qVar.writes_;
        if (!((AbstractC0830b) u7).f10056a) {
            qVar.writes_ = J.p(u7);
        }
        qVar.writes_.add(t1Var);
    }

    public static void y(q qVar, N0 n02) {
        qVar.getClass();
        qVar.localWriteTime_ = n02;
        qVar.bitField0_ |= 1;
    }

    public final int A() {
        return this.baseWrites_.size();
    }

    public final int B() {
        return this.batchId_;
    }

    public final N0 C() {
        N0 n02 = this.localWriteTime_;
        if (n02 == null) {
            return N0.x();
        }
        return n02;
    }

    public final t1 D(int i7) {
        return (t1) this.writes_.get(i7);
    }

    public final int E() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.J
    public final Object j(I i7) {
        switch (o.f15691a[i7.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new G(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", t1.class, "localWriteTime_", "baseWrites_", t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0872w0 interfaceC0872w0 = PARSER;
                if (interfaceC0872w0 == null) {
                    synchronized (q.class) {
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

    public final t1 z(int i7) {
        return (t1) this.baseWrites_.get(i7);
    }
}
