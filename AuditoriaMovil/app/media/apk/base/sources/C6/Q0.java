package c6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.EnumC0486o;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class Q0 extends AbstractC0478g {

    /* renamed from: d  reason: collision with root package name */
    public E.e f8567d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Z0 f8568e;

    public Q0(Z0 z02) {
        this.f8568e = z02;
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0471A g(a6.L l8) {
        Z0 z02 = this.f8568e;
        z02.f8714p.e();
        G.i.o("Channel is being terminated", !z02.f8684L);
        return new Y0(z02, l8);
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0478g h() {
        return this.f8568e.f8690R;
    }

    @Override // a6.AbstractC0478g
    public final ScheduledExecutorService i() {
        return this.f8568e.j;
    }

    @Override // a6.AbstractC0478g
    public final a6.u0 j() {
        return this.f8568e.f8714p;
    }

    @Override // a6.AbstractC0478g
    public final void q() {
        Z0 z02 = this.f8568e;
        z02.f8714p.e();
        z02.f8714p.execute(new G.c(this, 14));
    }

    @Override // a6.AbstractC0478g
    public final void r(EnumC0486o enumC0486o, a6.O o7) {
        Z0 z02 = this.f8568e;
        z02.f8714p.e();
        G.i.j(enumC0486o, "newState");
        G.i.j(o7, "newPicker");
        z02.f8714p.execute(new H2.a(this, o7, enumC0486o, 5));
    }
}
