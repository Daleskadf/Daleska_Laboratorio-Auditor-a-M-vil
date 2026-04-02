package U1;

import A3.I;
import A3.K;
import A3.e0;
import H0.C0140u;
import K0.q;
import java.util.List;
import m1.C;
import m1.l;
import m1.o;
import m1.p;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5714a;

    /* renamed from: b  reason: collision with root package name */
    public final q f5715b;

    /* renamed from: c  reason: collision with root package name */
    public final C f5716c;

    public a(int i7) {
        this.f5714a = i7;
        switch (i7) {
            case 1:
                this.f5715b = new q(4);
                this.f5716c = new C(-1, -1, "image/avif");
                return;
            case 2:
                this.f5715b = new q(4);
                this.f5716c = new C(-1, -1, "image/heif");
                return;
            default:
                this.f5715b = new q(4);
                this.f5716c = new C(-1, -1, "image/webp");
                return;
        }
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        switch (this.f5714a) {
            case 0:
                this.f5716c.a(j, j8);
                return;
            case 1:
                this.f5716c.a(j, j8);
                return;
            default:
                this.f5716c.a(j, j8);
                return;
        }
    }

    @Override // m1.o
    public final o c() {
        int i7 = this.f5714a;
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        switch (this.f5714a) {
            case 0:
                q qVar = this.f5715b;
                qVar.D(4);
                l lVar = (l) pVar;
                lVar.q(qVar.f2513a, 0, 4, false);
                if (qVar.w() != 1380533830) {
                    return false;
                }
                lVar.b(4, false);
                qVar.D(4);
                lVar.q(qVar.f2513a, 0, 4, false);
                if (qVar.w() != 1464156752) {
                    return false;
                }
                return true;
            case 1:
                l lVar2 = (l) pVar;
                lVar2.b(4, false);
                q qVar2 = this.f5715b;
                qVar2.D(4);
                lVar2.q(qVar2.f2513a, 0, 4, false);
                if (qVar2.w() != 1718909296) {
                    return false;
                }
                qVar2.D(4);
                lVar2.q(qVar2.f2513a, 0, 4, false);
                if (qVar2.w() != 1635150182) {
                    return false;
                }
                return true;
            default:
                l lVar3 = (l) pVar;
                lVar3.b(4, false);
                q qVar3 = this.f5715b;
                qVar3.D(4);
                lVar3.q(qVar3.f2513a, 0, 4, false);
                if (qVar3.w() != 1718909296) {
                    return false;
                }
                qVar3.D(4);
                lVar3.q(qVar3.f2513a, 0, 4, false);
                if (qVar3.w() != 1751476579) {
                    return false;
                }
                return true;
        }
    }

    @Override // m1.o
    public final List f() {
        switch (this.f5714a) {
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
    public final void g(m1.q qVar) {
        switch (this.f5714a) {
            case 0:
                this.f5716c.g(qVar);
                return;
            case 1:
                this.f5716c.g(qVar);
                return;
            default:
                this.f5716c.g(qVar);
                return;
        }
    }

    @Override // m1.o
    public final int i(p pVar, C0140u c0140u) {
        switch (this.f5714a) {
            case 0:
                return this.f5716c.i(pVar, c0140u);
            case 1:
                return this.f5716c.i(pVar, c0140u);
            default:
                return this.f5716c.i(pVar, c0140u);
        }
    }

    @Override // m1.o
    public final void release() {
        int i7 = this.f5714a;
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void h() {
    }
}
