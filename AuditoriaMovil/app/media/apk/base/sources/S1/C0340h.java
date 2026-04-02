package S1;

import D.AbstractC0059i;
import H0.C0137q;
import java.util.Collections;
import java.util.List;
/* renamed from: S1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340h implements InterfaceC0341i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5027a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5028b;

    /* renamed from: c  reason: collision with root package name */
    public long f5029c;

    /* renamed from: d  reason: collision with root package name */
    public int f5030d;

    /* renamed from: e  reason: collision with root package name */
    public int f5031e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5032g;

    public C0340h(List list) {
        this.f5027a = 0;
        this.f = list;
        this.f5032g = new m1.G[list.size()];
        this.f5029c = -9223372036854775807L;
    }

    @Override // S1.InterfaceC0341i
    public final void a() {
        switch (this.f5027a) {
            case 0:
                this.f5028b = false;
                this.f5029c = -9223372036854775807L;
                return;
            default:
                this.f5028b = false;
                this.f5029c = -9223372036854775807L;
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void b(K0.q qVar) {
        m1.G[] gArr;
        boolean z7;
        boolean z8;
        switch (this.f5027a) {
            case 0:
                if (this.f5028b) {
                    if (this.f5030d == 2) {
                        if (qVar.a() == 0) {
                            z8 = false;
                        } else {
                            if (qVar.u() != 32) {
                                this.f5028b = false;
                            }
                            this.f5030d--;
                            z8 = this.f5028b;
                        }
                        if (!z8) {
                            return;
                        }
                    }
                    if (this.f5030d == 1) {
                        if (qVar.a() == 0) {
                            z7 = false;
                        } else {
                            if (qVar.u() != 0) {
                                this.f5028b = false;
                            }
                            this.f5030d--;
                            z7 = this.f5028b;
                        }
                        if (!z7) {
                            return;
                        }
                    }
                    int i7 = qVar.f2514b;
                    int a7 = qVar.a();
                    for (m1.G g3 : (m1.G[]) this.f5032g) {
                        qVar.G(i7);
                        g3.d(a7, qVar);
                    }
                    this.f5031e += a7;
                    return;
                }
                return;
            default:
                K0.a.k((m1.G) this.f5032g);
                if (this.f5028b) {
                    int a8 = qVar.a();
                    int i8 = this.f5031e;
                    if (i8 < 10) {
                        int min = Math.min(a8, 10 - i8);
                        byte[] bArr = qVar.f2513a;
                        int i9 = qVar.f2514b;
                        K0.q qVar2 = (K0.q) this.f;
                        System.arraycopy(bArr, i9, qVar2.f2513a, this.f5031e, min);
                        if (this.f5031e + min == 10) {
                            qVar2.G(0);
                            if (73 == qVar2.u() && 68 == qVar2.u() && 51 == qVar2.u()) {
                                qVar2.H(3);
                                this.f5030d = qVar2.t() + 10;
                            } else {
                                K0.a.A("Id3Reader", "Discarding invalid ID3 tag");
                                this.f5028b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a8, this.f5030d - this.f5031e);
                    ((m1.G) this.f5032g).d(min2, qVar);
                    this.f5031e += min2;
                    return;
                }
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void c(boolean z7) {
        boolean z8;
        int i7;
        boolean z9;
        switch (this.f5027a) {
            case 0:
                if (this.f5028b) {
                    if (this.f5029c != -9223372036854775807L) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    K0.a.j(z8);
                    for (m1.G g3 : (m1.G[]) this.f5032g) {
                        g3.e(this.f5029c, 1, this.f5031e, 0, null);
                    }
                    this.f5028b = false;
                    return;
                }
                return;
            default:
                K0.a.k((m1.G) this.f5032g);
                if (this.f5028b && (i7 = this.f5030d) != 0 && this.f5031e == i7) {
                    if (this.f5029c != -9223372036854775807L) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    K0.a.j(z9);
                    ((m1.G) this.f5032g).e(this.f5029c, 1, this.f5030d, 0, null);
                    this.f5028b = false;
                    return;
                }
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void d(int i7, long j) {
        switch (this.f5027a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f5028b = true;
                    this.f5029c = j;
                    this.f5031e = 0;
                    this.f5030d = 2;
                    return;
                }
                return;
            default:
                if ((i7 & 4) != 0) {
                    this.f5028b = true;
                    this.f5029c = j;
                    this.f5030d = 0;
                    this.f5031e = 0;
                    return;
                }
                return;
        }
    }

    @Override // S1.InterfaceC0341i
    public final void e(m1.q qVar, H h8) {
        switch (this.f5027a) {
            case 0:
                int i7 = 0;
                while (true) {
                    m1.G[] gArr = (m1.G[]) this.f5032g;
                    if (i7 < gArr.length) {
                        G g3 = (G) ((List) this.f).get(i7);
                        h8.a();
                        h8.d();
                        m1.G s7 = qVar.s(h8.f4959c, 3);
                        C0137q c0137q = new C0137q();
                        h8.d();
                        c0137q.f1841a = (String) h8.f4961e;
                        c0137q.f1850l = H0.I.l("application/dvbsubs");
                        c0137q.f1853o = Collections.singletonList(g3.f4956b);
                        c0137q.f1844d = g3.f4955a;
                        AbstractC0059i.H(c0137q, s7);
                        gArr[i7] = s7;
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                h8.a();
                h8.d();
                m1.G s8 = qVar.s(h8.f4959c, 5);
                this.f5032g = s8;
                C0137q c0137q2 = new C0137q();
                h8.d();
                c0137q2.f1841a = (String) h8.f4961e;
                c0137q2.f1850l = H0.I.l("application/id3");
                AbstractC0059i.H(c0137q2, s8);
                return;
        }
    }

    public C0340h() {
        this.f5027a = 1;
        this.f = new K0.q(10);
        this.f5029c = -9223372036854775807L;
    }
}
