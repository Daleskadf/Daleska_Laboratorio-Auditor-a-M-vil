package e1;

import f1.AbstractC0983e;
import java.util.List;
/* renamed from: e1.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935E implements h1.r {

    /* renamed from: a  reason: collision with root package name */
    public final h1.r f10622a;

    /* renamed from: b  reason: collision with root package name */
    public final H0.W f10623b;

    public C0935E(h1.r rVar, H0.W w2) {
        this.f10622a = rVar;
        this.f10623b = w2;
    }

    @Override // h1.r
    public final boolean a(long j, AbstractC0983e abstractC0983e, List list) {
        return this.f10622a.a(j, abstractC0983e, list);
    }

    @Override // h1.r
    public final void b(boolean z7) {
        this.f10622a.b(z7);
    }

    @Override // h1.r
    public final boolean c(int i7, long j) {
        return this.f10622a.c(i7, j);
    }

    @Override // h1.r
    public final H0.r d(int i7) {
        return this.f10623b.f1742d[this.f10622a.f(i7)];
    }

    @Override // h1.r
    public final void e() {
        this.f10622a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0935E)) {
            return false;
        }
        C0935E c0935e = (C0935E) obj;
        if (this.f10622a.equals(c0935e.f10622a) && this.f10623b.equals(c0935e.f10623b)) {
            return true;
        }
        return false;
    }

    @Override // h1.r
    public final int f(int i7) {
        return this.f10622a.f(i7);
    }

    @Override // h1.r
    public final void g() {
        this.f10622a.g();
    }

    @Override // h1.r
    public final int h() {
        return this.f10622a.h();
    }

    public final int hashCode() {
        return this.f10622a.hashCode() + ((this.f10623b.hashCode() + 527) * 31);
    }

    @Override // h1.r
    public final H0.W i() {
        return this.f10623b;
    }

    @Override // h1.r
    public final H0.r j() {
        return this.f10623b.f1742d[this.f10622a.h()];
    }

    @Override // h1.r
    public final int k() {
        return this.f10622a.k();
    }

    @Override // h1.r
    public final int l() {
        return this.f10622a.l();
    }

    @Override // h1.r
    public final int length() {
        return this.f10622a.length();
    }

    @Override // h1.r
    public final boolean m(int i7, long j) {
        return this.f10622a.m(i7, j);
    }

    @Override // h1.r
    public final void n(float f) {
        this.f10622a.n(f);
    }

    @Override // h1.r
    public final Object o() {
        return this.f10622a.o();
    }

    @Override // h1.r
    public final void p() {
        this.f10622a.p();
    }

    @Override // h1.r
    public final void q(long j, long j8, long j9, List list, f1.m[] mVarArr) {
        this.f10622a.q(j, j8, j9, list, mVarArr);
    }

    @Override // h1.r
    public final int r(H0.r rVar) {
        return this.f10622a.u(this.f10623b.b(rVar));
    }

    @Override // h1.r
    public final void s() {
        this.f10622a.s();
    }

    @Override // h1.r
    public final int t(List list, long j) {
        return this.f10622a.t(list, j);
    }

    @Override // h1.r
    public final int u(int i7) {
        return this.f10622a.u(i7);
    }
}
