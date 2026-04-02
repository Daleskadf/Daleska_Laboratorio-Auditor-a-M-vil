package S1;

import A3.K;
import A3.e0;
import H0.C0140u;
import java.util.List;
import m1.AbstractC1428b;
import org.apache.tika.fork.ForkServer;
/* renamed from: S1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333a implements m1.o {

    /* renamed from: a  reason: collision with root package name */
    public final C0334b f4962a = new C0334b();

    /* renamed from: b  reason: collision with root package name */
    public final K0.q f4963b = new K0.q(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4964c;

    @Override // m1.o
    public final void a(long j, long j8) {
        this.f4964c = false;
        this.f4962a.a();
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        m1.l lVar;
        int h8;
        K0.q qVar = new K0.q(10);
        int i7 = 0;
        while (true) {
            lVar = (m1.l) pVar;
            lVar.q(qVar.f2513a, 0, 10, false);
            qVar.G(0);
            if (qVar.x() != 4801587) {
                break;
            }
            qVar.H(3);
            int t7 = qVar.t();
            i7 += t7 + 10;
            lVar.b(t7, false);
        }
        lVar.f = 0;
        lVar.b(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            lVar.q(qVar.f2513a, 0, 6, false);
            qVar.G(0);
            if (qVar.A() != 2935) {
                lVar.f = 0;
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                lVar.b(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.f2513a;
                if (bArr.length < 6) {
                    h8 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    h8 = ((((bArr[2] & 7) << 8) | (bArr[3] & ForkServer.ERROR)) + 1) * 2;
                } else {
                    byte b5 = bArr[4];
                    h8 = AbstractC1428b.h((b5 & 192) >> 6, b5 & 63);
                }
                if (h8 == -1) {
                    return false;
                }
                lVar.b(h8 - 6, false);
            }
        }
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        this.f4962a.e(qVar, new H(0, 1));
        qVar.h();
        qVar.x(new m1.s(-9223372036854775807L));
    }

    @Override // m1.o
    public final int i(m1.p pVar, C0140u c0140u) {
        K0.q qVar = this.f4963b;
        int read = ((m1.l) pVar).read(qVar.f2513a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        qVar.G(0);
        qVar.F(read);
        boolean z7 = this.f4964c;
        C0334b c0334b = this.f4962a;
        if (!z7) {
            c0334b.f4976n = 0L;
            this.f4964c = true;
        }
        c0334b.b(qVar);
        return 0;
    }

    @Override // m1.o
    public final void release() {
    }
}
