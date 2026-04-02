package I1;

import A3.I;
import A3.K;
import A3.e0;
import H0.C0140u;
import java.util.List;
import m1.C;
import m1.o;
import m1.p;
import m1.q;
import u1.C1866a;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2172a;

    /* renamed from: b  reason: collision with root package name */
    public final o f2173b;

    public a(int i7, byte b5) {
        this.f2172a = i7;
        switch (i7) {
            case 1:
                this.f2173b = new C(16973, 2, "image/bmp");
                return;
            default:
                this.f2173b = new C(35152, 2, "image/png");
                return;
        }
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        switch (this.f2172a) {
            case 0:
                ((C) this.f2173b).a(j, j8);
                return;
            case 1:
                ((C) this.f2173b).a(j, j8);
                return;
            default:
                this.f2173b.a(j, j8);
                return;
        }
    }

    @Override // m1.o
    public final o c() {
        int i7 = this.f2172a;
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        switch (this.f2172a) {
            case 0:
                return ((C) this.f2173b).e(pVar);
            case 1:
                return ((C) this.f2173b).e(pVar);
            default:
                return this.f2173b.e(pVar);
        }
    }

    @Override // m1.o
    public final List f() {
        switch (this.f2172a) {
            case 0:
                I i7 = K.f98b;
                return e0.f138e;
            case 1:
                I i8 = K.f98b;
                return e0.f138e;
            default:
                I i9 = K.f98b;
                return e0.f138e;
        }
    }

    @Override // m1.o
    public final void g(q qVar) {
        switch (this.f2172a) {
            case 0:
                ((C) this.f2173b).g(qVar);
                return;
            case 1:
                ((C) this.f2173b).g(qVar);
                return;
            default:
                this.f2173b.g(qVar);
                return;
        }
    }

    @Override // m1.o
    public final int i(p pVar, C0140u c0140u) {
        switch (this.f2172a) {
            case 0:
                return ((C) this.f2173b).i(pVar, c0140u);
            case 1:
                return ((C) this.f2173b).i(pVar, c0140u);
            default:
                return this.f2173b.i(pVar, c0140u);
        }
    }

    @Override // m1.o
    public final void release() {
        switch (this.f2172a) {
            case 0:
            case 1:
                return;
            default:
                this.f2173b.release();
                return;
        }
    }

    public a(int i7) {
        this.f2172a = 2;
        if ((i7 & 1) != 0) {
            this.f2173b = new C(65496, 2, "image/jpeg");
        } else {
            this.f2173b = new C1866a();
        }
    }

    private final void b() {
    }

    private final void d() {
    }
}
