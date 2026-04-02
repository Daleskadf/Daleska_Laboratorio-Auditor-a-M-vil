package b1;

import K0.p;
import K0.x;
import a1.C0434k;
import m1.AbstractC1428b;
import m1.C1429c;
import m1.G;
import m1.q;
/* renamed from: b1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8095a;

    /* renamed from: c  reason: collision with root package name */
    public G f8097c;

    /* renamed from: d  reason: collision with root package name */
    public int f8098d;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f8100g;

    /* renamed from: b  reason: collision with root package name */
    public final p f8096b = new p();

    /* renamed from: e  reason: collision with root package name */
    public long f8099e = -9223372036854775807L;

    public C0575b(C0434k c0434k) {
        this.f8095a = c0434k;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8099e = j;
        this.f8100g = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        boolean z7;
        if (this.f8099e == -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.f8099e = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 1);
        this.f8097c = s7;
        s7.c(this.f8095a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        int u7 = qVar.u() & 3;
        int u8 = qVar.u() & 255;
        long p02 = f7.a.p0(this.f8100g, j, this.f8099e, this.f8095a.f6841b);
        if (u7 != 0) {
            if (u7 != 1 && u7 != 2) {
                if (u7 != 3) {
                    throw new IllegalArgumentException(String.valueOf(u7));
                }
            } else {
                int i8 = this.f8098d;
                if (i8 > 0) {
                    G g3 = this.f8097c;
                    int i9 = x.f2529a;
                    g3.e(this.f, 1, i8, 0, null);
                    this.f8098d = 0;
                }
            }
            int a7 = qVar.a();
            G g4 = this.f8097c;
            g4.getClass();
            g4.d(a7, qVar);
            int i10 = this.f8098d + a7;
            this.f8098d = i10;
            this.f = p02;
            if (z7 && u7 == 3) {
                G g8 = this.f8097c;
                int i11 = x.f2529a;
                g8.e(p02, 1, i10, 0, null);
                this.f8098d = 0;
                return;
            }
            return;
        }
        int i12 = this.f8098d;
        if (i12 > 0) {
            G g9 = this.f8097c;
            int i13 = x.f2529a;
            g9.e(this.f, 1, i12, 0, null);
            this.f8098d = 0;
        }
        if (u8 == 1) {
            int a8 = qVar.a();
            G g10 = this.f8097c;
            g10.getClass();
            g10.d(a8, qVar);
            G g11 = this.f8097c;
            int i14 = x.f2529a;
            g11.e(p02, 1, a8, 0, null);
            return;
        }
        byte[] bArr = qVar.f2513a;
        p pVar = this.f8096b;
        pVar.getClass();
        pVar.p(bArr, bArr.length);
        pVar.u(2);
        for (int i15 = 0; i15 < u8; i15++) {
            C1429c o7 = AbstractC1428b.o(pVar);
            G g12 = this.f8097c;
            g12.getClass();
            int i16 = o7.f13931d;
            g12.d(i16, qVar);
            G g13 = this.f8097c;
            int i17 = x.f2529a;
            g13.e(p02, 1, o7.f13931d, 0, null);
            p02 += (o7.f13932e / o7.f13929b) * 1000000;
            pVar.u(i16);
        }
    }
}
