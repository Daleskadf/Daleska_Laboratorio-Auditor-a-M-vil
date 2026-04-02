package c6;

import a6.AbstractC0478g;
import a6.AbstractC0479h;
import a6.C0476e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class S0 extends AbstractC0478g {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ V0 f8580d;

    public S0(V0 v02) {
        this.f8580d = v02;
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0479h n(Q0.A a7, C0476e c0476e) {
        Executor executor;
        ScheduledExecutorService scheduledExecutorService;
        Z0 z02 = this.f8580d.f8607g;
        Logger logger = Z0.f8665g0;
        z02.getClass();
        Executor executor2 = c0476e.f7133b;
        if (executor2 == null) {
            executor = z02.f8709k;
        } else {
            executor = executor2;
        }
        Z0 z03 = this.f8580d.f8607g;
        C0644E c0644e = z03.f8704e0;
        if (z03.f8685M) {
            scheduledExecutorService = null;
        } else {
            scheduledExecutorService = this.f8580d.f8607g.f8708i.f8874a.f10388d;
        }
        C0708u c0708u = new C0708u(a7, executor, c0476e, c0644e, scheduledExecutorService, this.f8580d.f8607g.f8688P);
        this.f8580d.f8607g.getClass();
        c0708u.f9008p = this.f8580d.f8607g.f8715q;
        return c0708u;
    }
}
