package S0;

import A3.K;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k extends m implements R0.i {
    public final n f;

    public k(long j, H0.r rVar, K k2, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(rVar, k2, nVar, arrayList, arrayList2, arrayList3);
        this.f = nVar;
    }

    @Override // R0.i
    public final long C(long j, long j8) {
        n nVar = this.f;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b5 = nVar.b(j, j8) + nVar.c(j, j8);
        return (nVar.e(b5, j) + nVar.g(b5)) - nVar.f4901i;
    }

    @Override // R0.i
    public final j D(long j) {
        return this.f.h(this, j);
    }

    @Override // R0.i
    public final boolean I() {
        return this.f.i();
    }

    @Override // R0.i
    public final long R() {
        return this.f.f4897d;
    }

    @Override // S0.m
    public final String a() {
        return null;
    }

    @Override // R0.i
    public final long b(long j) {
        return this.f.g(j);
    }

    @Override // R0.i
    public final long b0(long j) {
        return this.f.d(j);
    }

    @Override // R0.i
    public final long c(long j, long j8) {
        return this.f.f(j, j8);
    }

    @Override // R0.i
    public final long c0(long j, long j8) {
        return this.f.b(j, j8);
    }

    @Override // S0.m
    public final j e() {
        return null;
    }

    @Override // R0.i
    public final long k(long j, long j8) {
        return this.f.e(j, j8);
    }

    @Override // R0.i
    public final long r(long j, long j8) {
        return this.f.c(j, j8);
    }

    @Override // S0.m
    public final R0.i d() {
        return this;
    }
}
