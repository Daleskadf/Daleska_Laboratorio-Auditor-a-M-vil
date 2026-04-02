package D;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class U extends P {

    /* renamed from: o0  reason: collision with root package name */
    public final Executor f663o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Object f664p0 = new Object();
    public b0 q0;

    /* renamed from: r0  reason: collision with root package name */
    public T f665r0;

    public U(Executor executor) {
        this.f663o0 = executor;
    }

    @Override // D.P
    public final b0 a(androidx.camera.core.impl.T t7) {
        return t7.acquireLatestImage();
    }

    @Override // D.P
    public final void d() {
        synchronized (this.f664p0) {
            try {
                b0 b0Var = this.q0;
                if (b0Var != null) {
                    b0Var.close();
                    this.q0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D.P
    public final void f(b0 b0Var) {
        synchronized (this.f664p0) {
            try {
                if (!this.f658n0) {
                    b0Var.close();
                } else if (this.f665r0 != null) {
                    if (b0Var.h().b() <= this.f665r0.f615b.h().b()) {
                        b0Var.close();
                    } else {
                        b0 b0Var2 = this.q0;
                        if (b0Var2 != null) {
                            b0Var2.close();
                        }
                        this.q0 = b0Var;
                    }
                } else {
                    T t7 = new T(b0Var, this);
                    this.f665r0 = t7;
                    E3.b c8 = c(t7);
                    C5.i iVar = new C5.i(t7, 6);
                    c8.a(new H.h(0, c8, iVar), j3.f.r());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
