package s1;

import A3.I;
import A3.K;
import A3.e0;
import K0.q;
import java.util.List;
import m1.l;
import m1.n;
import m1.o;
import m1.p;
/* renamed from: s1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final q f15553a = new q(4);

    /* renamed from: b  reason: collision with root package name */
    public final q f15554b = new q(9);

    /* renamed from: c  reason: collision with root package name */
    public final q f15555c = new q(11);

    /* renamed from: d  reason: collision with root package name */
    public final q f15556d = new q();

    /* renamed from: e  reason: collision with root package name */
    public final C1763c f15557e;
    public m1.q f;

    /* renamed from: g  reason: collision with root package name */
    public int f15558g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15559h;

    /* renamed from: i  reason: collision with root package name */
    public long f15560i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f15561k;

    /* renamed from: l  reason: collision with root package name */
    public int f15562l;

    /* renamed from: m  reason: collision with root package name */
    public long f15563m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15564n;

    /* renamed from: o  reason: collision with root package name */
    public C1761a f15565o;

    /* renamed from: p  reason: collision with root package name */
    public C1764d f15566p;

    /* JADX WARN: Type inference failed for: r0v4, types: [s1.c, B0.b] */
    public C1762b() {
        ?? bVar = new B0.b(new n());
        bVar.f15567b = -9223372036854775807L;
        bVar.f15568c = new long[0];
        bVar.f15569d = new long[0];
        this.f15557e = bVar;
        this.f15558g = 1;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        if (j == 0) {
            this.f15558g = 1;
            this.f15559h = false;
        } else {
            this.f15558g = 3;
        }
        this.j = 0;
    }

    public final q b(l lVar) {
        int i7 = this.f15562l;
        q qVar = this.f15556d;
        byte[] bArr = qVar.f2513a;
        if (i7 > bArr.length) {
            qVar.E(new byte[Math.max(bArr.length * 2, i7)], 0);
        } else {
            qVar.G(0);
        }
        qVar.F(this.f15562l);
        lVar.f(qVar.f2513a, 0, this.f15562l, false);
        return qVar;
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        q qVar = this.f15553a;
        l lVar = (l) pVar;
        lVar.q(qVar.f2513a, 0, 3, false);
        qVar.G(0);
        if (qVar.x() != 4607062) {
            return false;
        }
        lVar.q(qVar.f2513a, 0, 2, false);
        qVar.G(0);
        if ((qVar.A() & 250) != 0) {
            return false;
        }
        lVar.q(qVar.f2513a, 0, 4, false);
        qVar.G(0);
        int h8 = qVar.h();
        lVar.f = 0;
        lVar.b(h8, false);
        lVar.q(qVar.f2513a, 0, 4, false);
        qVar.G(0);
        if (qVar.h() != 0) {
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
    public final void g(m1.q qVar) {
        this.f = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Type inference failed for: r1v53, types: [s1.a, B0.b] */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r30, H0.C0140u r31) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C1762b.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
