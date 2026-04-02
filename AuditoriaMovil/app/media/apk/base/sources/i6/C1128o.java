package i6;

import D.AbstractC0055e;
import a6.AbstractC0482k;
import a6.C0473b;
import a6.e0;
import a6.o0;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: i6.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128o extends AbstractC0482k {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0482k f11548b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1130q f11549c;

    public C1128o(C1130q c1130q, AbstractC0482k abstractC0482k) {
        this.f11549c = c1130q;
        this.f11548b = abstractC0482k;
    }

    @Override // a6.AbstractC0482k
    public final void a() {
        this.f11548b.a();
    }

    @Override // a6.AbstractC0482k
    public final void b() {
        this.f11548b.b();
    }

    @Override // a6.AbstractC0482k
    public final void c(int i7) {
        this.f11548b.c(i7);
    }

    @Override // a6.AbstractC0482k
    public final void d(int i7, long j) {
        this.f11548b.d(i7, j);
    }

    @Override // a6.AbstractC0482k
    public final void e(e0 e0Var) {
        this.f11548b.e(e0Var);
    }

    @Override // a6.AbstractC0482k
    public final void f(long j) {
        this.f11548b.f(j);
    }

    @Override // a6.AbstractC0482k
    public final void g(long j) {
        this.f11548b.g(j);
    }

    @Override // a6.AbstractC0482k
    public final void h() {
        this.f11548b.h();
    }

    @Override // a6.AbstractC0482k
    public final void i(int i7) {
        this.f11548b.i(i7);
    }

    @Override // a6.AbstractC0482k
    public final void j(int i7, long j, long j8) {
        this.f11548b.j(i7, j, j8);
    }

    @Override // a6.AbstractC0482k
    public final void k(long j) {
        this.f11548b.k(j);
    }

    @Override // a6.AbstractC0482k
    public final void l(long j) {
        this.f11548b.l(j);
    }

    @Override // a6.AbstractC0482k
    public final void m(o0 o0Var) {
        C1124k c1124k = this.f11549c.f11551a;
        boolean e7 = o0Var.e();
        C1127n c1127n = c1124k.f11530a;
        if (c1127n.f11546e != null || c1127n.f != null) {
            if (e7) {
                ((AtomicLong) c1124k.f11531b.f7209b).getAndIncrement();
            } else {
                ((AtomicLong) c1124k.f11531b.f7210c).getAndIncrement();
            }
        }
        this.f11548b.m(o0Var);
    }

    @Override // a6.AbstractC0482k
    public final void n(C0473b c0473b, e0 e0Var) {
        this.f11548b.n(c0473b, e0Var);
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f11548b, "delegate");
        return C7.toString();
    }
}
