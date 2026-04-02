package F6;

import K6.AbstractC0208a;
import java.util.concurrent.CancellationException;
import p6.AbstractC1700c;
/* loaded from: classes.dex */
public abstract class O extends M6.j {

    /* renamed from: c  reason: collision with root package name */
    public int f1236c;

    public O(int i7) {
        super(0L, M6.l.f3302g);
        this.f1236c = i7;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract n6.d e();

    public Throwable g(Object obj) {
        C0108v c0108v;
        if (obj instanceof C0108v) {
            c0108v = (C0108v) obj;
        } else {
            c0108v = null;
        }
        if (c0108v == null) {
            return null;
        }
        return c0108v.f1316a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            j3.f.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        H.l(e().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        J0 j02;
        InterfaceC0091h0 interfaceC0091h0;
        Object obj = l6.j.f13876a;
        B5.L l8 = this.f3295b;
        try {
            n6.d e7 = e();
            kotlin.jvm.internal.j.c(e7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            K6.h hVar = (K6.h) e7;
            AbstractC1700c abstractC1700c = hVar.f2780e;
            Object obj2 = hVar.f2778X;
            n6.i context = abstractC1700c.getContext();
            Object m7 = AbstractC0208a.m(context, obj2);
            if (m7 != AbstractC0208a.f) {
                j02 = H.x(abstractC1700c, context, m7);
            } else {
                j02 = null;
            }
            n6.i context2 = abstractC1700c.getContext();
            Object j = j();
            Throwable g3 = g(j);
            if (g3 == null && H.n(this.f1236c)) {
                interfaceC0091h0 = (InterfaceC0091h0) context2.get(C.f1216b);
            } else {
                interfaceC0091h0 = null;
            }
            if (interfaceC0091h0 != null && !interfaceC0091h0.isActive()) {
                CancellationException cancellationException = interfaceC0091h0.getCancellationException();
                c(j, cancellationException);
                abstractC1700c.resumeWith(org.slf4j.helpers.i.j(cancellationException));
            } else if (g3 != null) {
                abstractC1700c.resumeWith(org.slf4j.helpers.i.j(g3));
            } else {
                abstractC1700c.resumeWith(h(j));
            }
            if (j02 == null || j02.R()) {
                AbstractC0208a.g(context, m7);
            }
            try {
                l8.getClass();
            } catch (Throwable th) {
                obj = org.slf4j.helpers.i.j(th);
            }
            i(null, l6.f.a(obj));
        } catch (Throwable th2) {
            try {
                l8.getClass();
            } catch (Throwable th3) {
                obj = org.slf4j.helpers.i.j(th3);
            }
            i(th2, l6.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
