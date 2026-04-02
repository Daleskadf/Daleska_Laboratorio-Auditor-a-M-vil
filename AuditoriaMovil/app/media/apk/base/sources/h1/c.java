package H1;

import H0.r;
import K0.q;
import a6.t0;
import java.util.Arrays;
import m1.AbstractC1428b;
import m1.t;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: n  reason: collision with root package name */
    public t f1931n;

    /* renamed from: o  reason: collision with root package name */
    public G1.e f1932o;

    @Override // H1.i
    public final long b(q qVar) {
        byte[] bArr = qVar.f2513a;
        if (bArr[0] == -1) {
            int i7 = (bArr[2] & ForkServer.ERROR) >> 4;
            if (i7 == 6 || i7 == 7) {
                qVar.H(4);
                qVar.B();
            }
            int t7 = AbstractC1428b.t(i7, qVar);
            qVar.G(0);
            return t7;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [G1.e, java.lang.Object] */
    @Override // H1.i
    public final boolean c(q qVar, long j, A.f fVar) {
        byte[] bArr = qVar.f2513a;
        t tVar = this.f1931n;
        if (tVar == null) {
            t tVar2 = new t(bArr, 17);
            this.f1931n = tVar2;
            fVar.f10b = tVar2.c(Arrays.copyOfRange(bArr, 9, qVar.f2515c), null);
            return true;
        }
        byte b5 = bArr[0];
        if ((b5 & Byte.MAX_VALUE) == 3) {
            t0 u7 = AbstractC1428b.u(qVar);
            t tVar3 = new t(tVar.f13987a, tVar.f13988b, tVar.f13989c, tVar.f13990d, tVar.f13991e, tVar.f13992g, tVar.f13993h, tVar.j, u7, tVar.f13996l);
            this.f1931n = tVar3;
            ?? obj = new Object();
            obj.f1365c = tVar3;
            obj.f1366d = u7;
            obj.f1363a = -1L;
            obj.f1364b = -1L;
            this.f1932o = obj;
            return true;
        } else if (b5 != -1) {
            return true;
        } else {
            G1.e eVar = this.f1932o;
            if (eVar != null) {
                eVar.f1363a = j;
                fVar.f11c = eVar;
            }
            ((r) fVar.f10b).getClass();
            return false;
        }
    }

    @Override // H1.i
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.f1931n = null;
            this.f1932o = null;
        }
    }
}
