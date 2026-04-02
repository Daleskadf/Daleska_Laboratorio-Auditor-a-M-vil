package H1;

import A3.K;
import H0.C0137q;
import H0.H;
import H0.I;
import H0.r;
import K0.q;
import java.util.ArrayList;
import java.util.Arrays;
import m1.AbstractC1428b;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f1947o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f1948p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    public boolean f1949n;

    public static boolean e(q qVar, byte[] bArr) {
        if (qVar.a() < bArr.length) {
            return false;
        }
        int i7 = qVar.f2514b;
        byte[] bArr2 = new byte[bArr.length];
        qVar.f(bArr2, 0, bArr.length);
        qVar.G(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // H1.i
    public final long b(q qVar) {
        byte[] bArr = qVar.f2513a;
        byte b5 = 0;
        byte b7 = bArr[0];
        if (bArr.length > 1) {
            b5 = bArr[1];
        }
        return (this.f1957i * AbstractC1428b.l(b7, b5)) / 1000000;
    }

    @Override // H1.i
    public final boolean c(q qVar, long j, A.f fVar) {
        if (e(qVar, f1947o)) {
            byte[] copyOf = Arrays.copyOf(qVar.f2513a, qVar.f2515c);
            int i7 = copyOf[9] & ForkServer.ERROR;
            ArrayList c8 = AbstractC1428b.c(copyOf);
            if (((r) fVar.f10b) != null) {
                return true;
            }
            C0137q c0137q = new C0137q();
            c0137q.f1850l = I.l("audio/opus");
            c0137q.f1864z = i7;
            c0137q.f1832A = 48000;
            c0137q.f1853o = c8;
            fVar.f10b = new r(c0137q);
            return true;
        } else if (e(qVar, f1948p)) {
            K0.a.k((r) fVar.f10b);
            if (this.f1949n) {
                return true;
            }
            this.f1949n = true;
            qVar.H(8);
            H s7 = AbstractC1428b.s(K.q(AbstractC1428b.v(qVar, false, false).f12550b));
            if (s7 == null) {
                return true;
            }
            C0137q a7 = ((r) fVar.f10b).a();
            a7.j = s7.d(((r) fVar.f10b).f1884k);
            fVar.f10b = new r(a7);
            return true;
        } else {
            K0.a.k((r) fVar.f10b);
            return false;
        }
    }

    @Override // H1.i
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.f1949n = false;
        }
    }
}
