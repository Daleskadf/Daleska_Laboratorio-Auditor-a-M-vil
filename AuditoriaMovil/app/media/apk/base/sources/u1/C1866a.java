package u1;

import A3.I;
import A3.K;
import A3.e0;
import J2.e;
import java.util.List;
import m1.l;
import m1.o;
import m1.p;
import m1.q;
import m1.s;
/* renamed from: u1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866a implements o {

    /* renamed from: b  reason: collision with root package name */
    public q f15959b;

    /* renamed from: c  reason: collision with root package name */
    public int f15960c;

    /* renamed from: d  reason: collision with root package name */
    public int f15961d;

    /* renamed from: e  reason: collision with root package name */
    public int f15962e;

    /* renamed from: g  reason: collision with root package name */
    public B1.a f15963g;

    /* renamed from: h  reason: collision with root package name */
    public l f15964h;

    /* renamed from: i  reason: collision with root package name */
    public e f15965i;
    public G1.q j;

    /* renamed from: a  reason: collision with root package name */
    public final K0.q f15958a = new K0.q(6);
    public long f = -1;

    @Override // m1.o
    public final void a(long j, long j8) {
        if (j == 0) {
            this.f15960c = 0;
            this.j = null;
        } else if (this.f15960c == 5) {
            G1.q qVar = this.j;
            qVar.getClass();
            qVar.a(j, j8);
        }
    }

    public final void b() {
        q qVar = this.f15959b;
        qVar.getClass();
        qVar.h();
        this.f15959b.x(new s(-9223372036854775807L));
        this.f15960c = 6;
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        l lVar = (l) pVar;
        K0.q qVar = this.f15958a;
        qVar.D(2);
        lVar.q(qVar.f2513a, 0, 2, false);
        if (qVar.A() != 65496) {
            return false;
        }
        qVar.D(2);
        lVar.q(qVar.f2513a, 0, 2, false);
        int A7 = qVar.A();
        this.f15961d = A7;
        if (A7 == 65504) {
            qVar.D(2);
            lVar.q(qVar.f2513a, 0, 2, false);
            lVar.b(qVar.A() - 2, false);
            qVar.D(2);
            lVar.q(qVar.f2513a, 0, 2, false);
            this.f15961d = qVar.A();
        }
        if (this.f15961d != 65505) {
            return false;
        }
        lVar.b(2, false);
        qVar.D(6);
        lVar.q(qVar.f2513a, 0, 6, false);
        if (qVar.w() != 1165519206 || qVar.A() != 0) {
            return false;
        }
        return true;
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        this.f15959b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r27, H0.C0140u r28) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1866a.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
        G1.q qVar = this.j;
        if (qVar != null) {
            qVar.getClass();
        }
    }
}
