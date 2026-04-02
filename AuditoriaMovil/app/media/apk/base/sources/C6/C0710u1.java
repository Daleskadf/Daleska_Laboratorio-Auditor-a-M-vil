package c6;

import a6.AbstractC0471A;
import c1.RunnableC0626c;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: c6.u1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710u1 extends a6.O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9011a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f9012b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final Object f9013c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a6.Q f9014d;

    public C0710u1(C0716w1 c0716w1, C0716w1 c0716w12) {
        this.f9014d = c0716w1;
        G.i.j(c0716w12, "pickFirstLeafLoadBalancer");
        this.f9013c = c0716w12;
    }

    @Override // a6.O
    public final a6.M a(D1 d12) {
        switch (this.f9011a) {
            case 0:
                if (this.f9012b.compareAndSet(false, true)) {
                    a6.u0 j = ((C0716w1) this.f9014d).f.j();
                    C0716w1 c0716w1 = (C0716w1) this.f9013c;
                    Objects.requireNonNull(c0716w1);
                    j.execute(new RunnableC0626c(c0716w1, 3));
                }
                return a6.M.f7091e;
            default:
                if (this.f9012b.compareAndSet(false, true)) {
                    ((B1) this.f9014d).f.j().execute(new G.c(this, 17));
                }
                return a6.M.f7091e;
        }
    }

    public C0710u1(B1 b12, AbstractC0471A abstractC0471A) {
        this.f9014d = b12;
        G.i.j(abstractC0471A, "subchannel");
        this.f9013c = abstractC0471A;
    }
}
