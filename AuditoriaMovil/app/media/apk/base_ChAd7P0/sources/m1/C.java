package m1;

import A3.I;
import A3.K;
import A3.e0;
import D.AbstractC0059i;
import H0.C0137q;
import H0.C0140u;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
/* loaded from: classes.dex */
public final class C implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f13886a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13887b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13888c;

    /* renamed from: d  reason: collision with root package name */
    public int f13889d;

    /* renamed from: e  reason: collision with root package name */
    public int f13890e;
    public q f;

    /* renamed from: g  reason: collision with root package name */
    public G f13891g;

    public C(int i7, int i8, String str) {
        this.f13886a = i7;
        this.f13887b = i8;
        this.f13888c = str;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        if (j == 0 || this.f13890e == 1) {
            this.f13890e = 1;
            this.f13889d = 0;
        }
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        boolean z7;
        int i7 = this.f13887b;
        int i8 = this.f13886a;
        if (i8 != -1 && i7 != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        K0.q qVar = new K0.q(i7);
        ((l) pVar).q(qVar.f2513a, 0, i7, false);
        if (qVar.A() == i8) {
            return true;
        }
        return false;
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [m1.A, java.lang.Object] */
    @Override // m1.o
    public final void g(q qVar) {
        this.f = qVar;
        G s7 = qVar.s(RecognitionOptions.UPC_E, 4);
        this.f13891g = s7;
        C0137q c0137q = new C0137q();
        c0137q.f1850l = H0.I.l(this.f13888c);
        AbstractC0059i.H(c0137q, s7);
        this.f.h();
        this.f.x(new Object());
        this.f13890e = 1;
    }

    @Override // m1.o
    public final int i(p pVar, C0140u c0140u) {
        int i7 = this.f13890e;
        if (i7 != 1) {
            if (i7 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        G g3 = this.f13891g;
        g3.getClass();
        int b5 = g3.b(pVar, RecognitionOptions.UPC_E, true);
        if (b5 == -1) {
            this.f13890e = 2;
            this.f13891g.e(0L, 1, this.f13889d, 0, null);
            this.f13889d = 0;
        } else {
            this.f13889d += b5;
        }
        return 0;
    }

    @Override // m1.o
    public final void release() {
    }
}
