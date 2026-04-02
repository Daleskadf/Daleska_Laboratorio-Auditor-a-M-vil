package f1;

import H0.r;
import M0.B;
import a6.t0;
import e1.T;
import m1.G;
/* loaded from: classes.dex */
public final class n extends AbstractC0979a {

    /* renamed from: j0  reason: collision with root package name */
    public final int f11046j0;

    /* renamed from: k0  reason: collision with root package name */
    public final r f11047k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f11048l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f11049m0;

    public n(M0.h hVar, M0.l lVar, r rVar, int i7, Object obj, long j, long j8, long j9, int i8, r rVar2) {
        super(hVar, lVar, rVar, i7, obj, j, j8, -9223372036854775807L, -9223372036854775807L, j9);
        this.f11046j0 = i8;
        this.f11047k0 = rVar2;
    }

    @Override // i1.k
    public final void b() {
        T[] tArr;
        B b5 = this.f11002Z;
        t0 t0Var = this.f10980h0;
        K0.a.k(t0Var);
        for (T t7 : (T[]) t0Var.f7210c) {
            if (t7.f10728F != 0) {
                t7.f10728F = 0L;
                t7.f10753z = true;
            }
        }
        G W7 = t0Var.W(this.f11046j0);
        W7.c(this.f11047k0);
        try {
            long e7 = b5.e(this.f11004b.a(this.f11048l0));
            if (e7 != -1) {
                e7 += this.f11048l0;
            }
            m1.l lVar = new m1.l(this.f11002Z, this.f11048l0, e7);
            for (int i7 = 0; i7 != -1; i7 = W7.b(lVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true)) {
                this.f11048l0 += i7;
            }
            W7.e(this.f11000X, 1, (int) this.f11048l0, 0, null);
            m5.d.a(b5);
            this.f11049m0 = true;
        } catch (Throwable th) {
            m5.d.a(b5);
            throw th;
        }
    }

    @Override // f1.l
    public final boolean c() {
        return this.f11049m0;
    }

    @Override // i1.k
    public final void k() {
    }
}
