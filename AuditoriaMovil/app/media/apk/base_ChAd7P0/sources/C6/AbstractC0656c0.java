package c6;

import D.AbstractC0055e;
import a6.AbstractC0479h;
import a6.C0476e;
import a6.EnumC0486o;
import java.util.concurrent.TimeUnit;
/* renamed from: c6.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0656c0 extends a6.U {

    /* renamed from: d  reason: collision with root package name */
    public final Z0 f8798d;

    public AbstractC0656c0(Z0 z02) {
        this.f8798d = z02;
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0479h n(Q0.A a7, C0476e c0476e) {
        return this.f8798d.f8721w.n(a7, c0476e);
    }

    @Override // a6.U
    public final boolean s(long j, TimeUnit timeUnit) {
        return this.f8798d.f8686N.await(j, timeUnit);
    }

    @Override // a6.U
    public final void t() {
        this.f8798d.t();
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8798d, "delegate");
        return C7.toString();
    }

    @Override // a6.U
    public final EnumC0486o u() {
        return this.f8798d.u();
    }

    @Override // a6.U
    public final void v(EnumC0486o enumC0486o, t4.q qVar) {
        this.f8798d.v(enumC0486o, qVar);
    }
}
