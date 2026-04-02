package S1;

import D.AbstractC0059i;
import H0.C0137q;
import java.util.List;
import m1.AbstractC1428b;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4934a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4935b;

    /* renamed from: c  reason: collision with root package name */
    public final m1.G[] f4936c;

    public E(int i7, List list) {
        this.f4934a = i7;
        switch (i7) {
            case 1:
                this.f4935b = list;
                this.f4936c = new m1.G[list.size()];
                return;
            default:
                this.f4935b = list;
                this.f4936c = new m1.G[list.size()];
                return;
        }
    }

    public void a(long j, K0.q qVar) {
        if (qVar.a() < 9) {
            return;
        }
        int h8 = qVar.h();
        int h9 = qVar.h();
        int u7 = qVar.u();
        if (h8 == 434 && h9 == 1195456820 && u7 == 3) {
            AbstractC1428b.g(j, qVar, this.f4936c);
        }
    }

    public final void b(m1.q qVar, H h8) {
        boolean z7;
        boolean z8;
        switch (this.f4934a) {
            case 0:
                int i7 = 0;
                while (true) {
                    m1.G[] gArr = this.f4936c;
                    if (i7 < gArr.length) {
                        h8.a();
                        h8.d();
                        m1.G s7 = qVar.s(h8.f4959c, 3);
                        H0.r rVar = (H0.r) this.f4935b.get(i7);
                        String str = rVar.f1886m;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        K0.a.d("Invalid closed caption MIME type provided: " + str, z7);
                        String str2 = rVar.f1876a;
                        if (str2 == null) {
                            h8.d();
                            str2 = (String) h8.f4961e;
                        }
                        C0137q c0137q = new C0137q();
                        c0137q.f1841a = str2;
                        c0137q.f1850l = H0.I.l(str);
                        c0137q.f1845e = rVar.f1880e;
                        c0137q.f1844d = rVar.f1879d;
                        c0137q.f1836E = rVar.f1870F;
                        c0137q.f1853o = rVar.f1889p;
                        AbstractC0059i.H(c0137q, s7);
                        gArr[i7] = s7;
                        i7++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i8 = 0;
                while (true) {
                    m1.G[] gArr2 = this.f4936c;
                    if (i8 < gArr2.length) {
                        h8.a();
                        h8.d();
                        m1.G s8 = qVar.s(h8.f4959c, 3);
                        H0.r rVar2 = (H0.r) this.f4935b.get(i8);
                        String str3 = rVar2.f1886m;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        K0.a.d("Invalid closed caption MIME type provided: " + str3, z8);
                        C0137q c0137q2 = new C0137q();
                        h8.d();
                        c0137q2.f1841a = (String) h8.f4961e;
                        c0137q2.f1850l = H0.I.l(str3);
                        c0137q2.f1845e = rVar2.f1880e;
                        c0137q2.f1844d = rVar2.f1879d;
                        c0137q2.f1836E = rVar2.f1870F;
                        c0137q2.f1853o = rVar2.f1889p;
                        AbstractC0059i.H(c0137q2, s8);
                        gArr2[i8] = s8;
                        i8++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
