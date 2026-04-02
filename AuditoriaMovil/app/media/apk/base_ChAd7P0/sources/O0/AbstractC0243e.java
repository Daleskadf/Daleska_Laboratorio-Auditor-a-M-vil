package O0;

import H0.C0137q;
import e1.C0960z;
/* renamed from: O0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0243e implements g0 {

    /* renamed from: X  reason: collision with root package name */
    public K0.s f3696X;

    /* renamed from: Y  reason: collision with root package name */
    public int f3697Y;

    /* renamed from: Z  reason: collision with root package name */
    public e1.U f3698Z;

    /* renamed from: b  reason: collision with root package name */
    public final int f3700b;

    /* renamed from: d  reason: collision with root package name */
    public k0 f3702d;

    /* renamed from: e  reason: collision with root package name */
    public int f3703e;

    /* renamed from: e0  reason: collision with root package name */
    public H0.r[] f3704e0;
    public P0.k f;

    /* renamed from: f0  reason: collision with root package name */
    public long f3705f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f3706g0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3708i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3709j0;

    /* renamed from: l0  reason: collision with root package name */
    public h1.p f3711l0;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3699a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final M0.x f3701c = new M0.x((char) 0, 5);

    /* renamed from: h0  reason: collision with root package name */
    public long f3707h0 = Long.MIN_VALUE;

    /* renamed from: k0  reason: collision with root package name */
    public H0.V f3710k0 = H0.V.f1738a;

    public AbstractC0243e(int i7) {
        this.f3700b = i7;
    }

    public int A() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O0.C0250l f(java.lang.Exception r13, H0.r r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f3709j0
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f3709j0 = r3
            r3 = 0
            int r4 = r12.z(r14)     // Catch: java.lang.Throwable -> L16 O0.C0250l -> L1b
            r4 = r4 & 7
            r1.f3709j0 = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f3709j0 = r3
            throw r2
        L1b:
            r1.f3709j0 = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.i()
            int r7 = r1.f3703e
            O0.l r11 = new O0.l
            if (r0 != 0) goto L2a
            r9 = r2
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.AbstractC0243e.f(java.lang.Exception, H0.r, boolean, int):O0.l");
    }

    public void g() {
    }

    public S h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        if (this.f3707h0 == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j, boolean z7);

    public abstract void t(H0.r[] rVarArr, long j, long j8);

    public final int u(M0.x xVar, N0.f fVar, int i7) {
        e1.U u7 = this.f3698Z;
        u7.getClass();
        int g3 = u7.g(xVar, fVar, i7);
        if (g3 == -4) {
            if (fVar.c(4)) {
                this.f3707h0 = Long.MIN_VALUE;
                if (this.f3708i0) {
                    return -4;
                }
                return -3;
            }
            long j = fVar.f3345X + this.f3705f0;
            fVar.f3345X = j;
            this.f3707h0 = Math.max(this.f3707h0, j);
        } else if (g3 == -5) {
            H0.r rVar = (H0.r) xVar.f3211c;
            rVar.getClass();
            long j8 = rVar.f1891r;
            if (j8 != Long.MAX_VALUE) {
                C0137q a7 = rVar.a();
                a7.f1855q = j8 + this.f3705f0;
                xVar.f3211c = new H0.r(a7);
            }
        }
        return g3;
    }

    public abstract void v(long j, long j8);

    public final void w(H0.r[] rVarArr, e1.U u7, long j, long j8, C0960z c0960z) {
        K0.a.j(!this.f3708i0);
        this.f3698Z = u7;
        if (this.f3707h0 == Long.MIN_VALUE) {
            this.f3707h0 = j;
        }
        this.f3704e0 = rVarArr;
        this.f3705f0 = j8;
        t(rVarArr, j, j8);
    }

    public final void x() {
        boolean z7;
        if (this.f3697Y == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.f3701c.t();
        q();
    }

    public void y(float f, float f4) {
    }

    public abstract int z(H0.r rVar);

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    @Override // O0.g0
    public void b(int i7, Object obj) {
    }

    public void n(boolean z7, boolean z8) {
    }
}
