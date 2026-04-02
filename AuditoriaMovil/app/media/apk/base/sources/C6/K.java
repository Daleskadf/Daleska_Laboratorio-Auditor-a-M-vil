package c6;

import a6.AbstractC0471A;
import com.google.protobuf.AbstractC0828a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class K extends AbstractC0471A {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0471A f8484a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f8485b;

    /* renamed from: c  reason: collision with root package name */
    public List f8486c = new ArrayList();

    public K(AbstractC0471A abstractC0471A) {
        this.f8484a = abstractC0471A;
    }

    @Override // a6.AbstractC0471A
    public final void g(a6.o0 o0Var, a6.e0 e0Var) {
        q(new H2.a(this, o0Var, e0Var, 3));
    }

    @Override // a6.AbstractC0471A
    public final void h(a6.e0 e0Var) {
        if (this.f8485b) {
            this.f8484a.h(e0Var);
        } else {
            q(new RunnableC0646G(3, this, e0Var));
        }
    }

    @Override // a6.AbstractC0471A
    public final void i(AbstractC0828a abstractC0828a) {
        if (this.f8485b) {
            this.f8484a.i(abstractC0828a);
        } else {
            q(new RunnableC0646G(4, this, abstractC0828a));
        }
    }

    @Override // a6.AbstractC0471A
    public final void j() {
        if (this.f8485b) {
            this.f8484a.j();
        } else {
            q(new G.c(this, 10));
        }
    }

    public final void q(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.f8485b) {
                    this.f8486c.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
