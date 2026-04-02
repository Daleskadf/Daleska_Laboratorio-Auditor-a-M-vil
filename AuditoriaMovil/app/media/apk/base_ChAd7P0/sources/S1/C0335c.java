package S1;

import A3.K;
import A3.e0;
import H0.C0140u;
import java.util.List;
import org.apache.tika.fork.ForkServer;
/* renamed from: S1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335c implements m1.o {

    /* renamed from: a  reason: collision with root package name */
    public final C0334b f4977a = new C0334b(null, 0, 1);

    /* renamed from: b  reason: collision with root package name */
    public final K0.q f4978b = new K0.q(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4979c;

    @Override // m1.o
    public final void a(long j, long j8) {
        this.f4979c = false;
        this.f4977a.a();
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        m1.l lVar;
        int i7;
        K0.q qVar = new K0.q(10);
        int i8 = 0;
        while (true) {
            lVar = (m1.l) pVar;
            lVar.q(qVar.f2513a, 0, 10, false);
            qVar.G(0);
            if (qVar.x() != 4801587) {
                break;
            }
            qVar.H(3);
            int t7 = qVar.t();
            i8 += t7 + 10;
            lVar.b(t7, false);
        }
        lVar.f = 0;
        lVar.b(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            lVar.q(qVar.f2513a, 0, 7, false);
            qVar.G(0);
            int A7 = qVar.A();
            if (A7 != 44096 && A7 != 44097) {
                lVar.f = 0;
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                lVar.b(i10, false);
                i9 = 0;
            } else {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.f2513a;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i12 = ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR);
                    if (i12 == 65535) {
                        i12 = ((bArr[4] & ForkServer.ERROR) << 16) | ((bArr[5] & ForkServer.ERROR) << 8) | (bArr[6] & ForkServer.ERROR);
                    } else {
                        i11 = 4;
                    }
                    if (A7 == 44097) {
                        i11 += 2;
                    }
                    i7 = i12 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                lVar.b(i7 - 7, false);
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
        this.f4977a.e(qVar, new H(0, 1));
        qVar.h();
        qVar.x(new m1.s(-9223372036854775807L));
    }

    @Override // m1.o
    public final int i(m1.p pVar, C0140u c0140u) {
        K0.q qVar = this.f4978b;
        int read = ((m1.l) pVar).read(qVar.f2513a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        qVar.G(0);
        qVar.F(read);
        boolean z7 = this.f4979c;
        C0334b c0334b = this.f4977a;
        if (!z7) {
            c0334b.f4976n = 0L;
            this.f4979c = true;
        }
        c0334b.b(qVar);
        return 0;
    }

    @Override // m1.o
    public final void release() {
    }
}
