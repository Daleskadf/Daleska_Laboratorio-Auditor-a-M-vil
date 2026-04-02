package F6;

import h3.AbstractC1079a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o6.EnumC1565a;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class u0 implements InterfaceC0091h0, r, B0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1313a = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_state");

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1314b = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public u0(boolean z7) {
        U u7;
        if (z7) {
            u7 = H.j;
        } else {
            u7 = H.f1227i;
        }
        this._state = u7;
    }

    public static C0104q F(K6.k kVar) {
        while (kVar.h()) {
            K6.k d7 = kVar.d();
            if (d7 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K6.k.f2787b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (K6.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = d7;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof C0104q) {
                    return (C0104q) kVar;
                }
                if (kVar instanceof y0) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (o0Var.d()) {
                return "Cancelling";
            }
            if (!o0Var.e()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof InterfaceC0085e0) {
            if (((InterfaceC0085e0) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0108v) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static CancellationException M(u0 u0Var, Throwable th) {
        CancellationException cancellationException;
        u0Var.getClass();
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new C0093i0(u0Var.n(), th, u0Var);
        }
        return cancellationException;
    }

    public final void A(InterfaceC0091h0 interfaceC0091h0) {
        z0 z0Var = z0.f1325a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1314b;
        if (interfaceC0091h0 == null) {
            atomicReferenceFieldUpdater.set(this, z0Var);
            return;
        }
        interfaceC0091h0.start();
        InterfaceC0103p attachChild = interfaceC0091h0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (!(x() instanceof InterfaceC0085e0)) {
            attachChild.a();
            atomicReferenceFieldUpdater.set(this, z0Var);
        }
    }

    public boolean B() {
        return this instanceof C0090h;
    }

    public final boolean C(Object obj) {
        Object N7;
        do {
            N7 = N(x(), obj);
            if (N7 == H.f1223d) {
                return false;
            }
            if (N7 == H.f1224e) {
                return true;
            }
        } while (N7 == H.f);
        h(N7);
        return true;
    }

    public final Object D(Object obj) {
        Object N7;
        C0108v c0108v;
        do {
            N7 = N(x(), obj);
            if (N7 == H.f1223d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0108v) {
                    c0108v = (C0108v) obj;
                } else {
                    c0108v = null;
                }
                if (c0108v != null) {
                    th = c0108v.f1316a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (N7 == H.f);
        return N7;
    }

    public String E() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, F6.x] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [F6.u0, java.lang.Object] */
    public final void G(y0 y0Var, Throwable th) {
        Object f = y0Var.f();
        kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        K6.k kVar = (K6.k) f;
        ?? r12 = 0;
        while (!kVar.equals(y0Var)) {
            if (kVar instanceof AbstractC0095j0) {
                AbstractC0099l0 abstractC0099l0 = (AbstractC0099l0) kVar;
                try {
                    abstractC0099l0.j(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        j3.f.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + abstractC0099l0 + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.g();
            r12 = r12;
        }
        if (r12 != 0) {
            z(r12);
        }
        m(th);
    }

    public final void J(AbstractC0099l0 abstractC0099l0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K6.k kVar = new K6.k();
        abstractC0099l0.getClass();
        K6.k.f2787b.lazySet(kVar, abstractC0099l0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = K6.k.f2786a;
        atomicReferenceFieldUpdater2.lazySet(kVar, abstractC0099l0);
        loop0: while (true) {
            if (abstractC0099l0.f() == abstractC0099l0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0099l0, abstractC0099l0, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0099l0) != abstractC0099l0) {
                        break;
                    }
                }
                kVar.e(abstractC0099l0);
                break loop0;
            }
            break;
        }
        K6.k g3 = abstractC0099l0.g();
        do {
            atomicReferenceFieldUpdater = f1313a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0099l0, g3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0099l0);
    }

    public final int K(Object obj) {
        boolean z7 = obj instanceof U;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1313a;
        if (z7) {
            if (((U) obj).f1241a) {
                return 0;
            }
            U u7 = H.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            I();
            return 1;
        } else if (!(obj instanceof C0083d0)) {
            return 0;
        } else {
            y0 y0Var = ((C0083d0) obj).f1261a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            I();
            return 1;
        }
    }

    public final Object N(Object obj, Object obj2) {
        C0087f0 c0087f0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o0 o0Var;
        C0108v c0108v;
        C0104q c0104q;
        if (!(obj instanceof InterfaceC0085e0)) {
            return H.f1223d;
        }
        if (((obj instanceof U) || (obj instanceof AbstractC0099l0)) && !(obj instanceof C0104q) && !(obj2 instanceof C0108v)) {
            InterfaceC0085e0 interfaceC0085e0 = (InterfaceC0085e0) obj;
            if (obj2 instanceof InterfaceC0085e0) {
                c0087f0 = new C0087f0((InterfaceC0085e0) obj2);
            } else {
                c0087f0 = obj2;
            }
            do {
                atomicReferenceFieldUpdater = f1313a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0085e0, c0087f0)) {
                    H(obj2);
                    p(interfaceC0085e0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0085e0);
            return H.f;
        }
        InterfaceC0085e0 interfaceC0085e02 = (InterfaceC0085e0) obj;
        y0 w2 = w(interfaceC0085e02);
        if (w2 == null) {
            return H.f;
        }
        C0104q c0104q2 = null;
        if (interfaceC0085e02 instanceof o0) {
            o0Var = (o0) interfaceC0085e02;
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            o0Var = new o0(w2, null);
        }
        synchronized (o0Var) {
            if (o0Var.e()) {
                return H.f1223d;
            }
            o0.f1292b.set(o0Var, 1);
            if (o0Var != interfaceC0085e02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1313a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0085e02, o0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0085e02) {
                        return H.f;
                    }
                }
            }
            boolean d7 = o0Var.d();
            if (obj2 instanceof C0108v) {
                c0108v = (C0108v) obj2;
            } else {
                c0108v = null;
            }
            if (c0108v != null) {
                o0Var.a(c0108v.f1316a);
            }
            Throwable b5 = o0Var.b();
            if (d7) {
                b5 = null;
            }
            if (b5 != null) {
                G(w2, b5);
            }
            if (interfaceC0085e02 instanceof C0104q) {
                c0104q = (C0104q) interfaceC0085e02;
            } else {
                c0104q = null;
            }
            if (c0104q == null) {
                y0 c8 = interfaceC0085e02.c();
                if (c8 != null) {
                    c0104q2 = F(c8);
                }
            } else {
                c0104q2 = c0104q;
            }
            if (c0104q2 != null) {
                while (H.m(c0104q2.f1300e, false, new n0(this, o0Var, c0104q2, obj2), 1) == z0.f1325a) {
                    c0104q2 = F(c0104q2);
                    if (c0104q2 == null) {
                        return r(o0Var, obj2);
                    }
                }
                return H.f1224e;
            }
            return r(o0Var, obj2);
        }
    }

    @Override // F6.InterfaceC0091h0
    public final InterfaceC0103p attachChild(r rVar) {
        S m7 = H.m(this, true, new C0104q(rVar), 2);
        kotlin.jvm.internal.j.c(m7, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0103p) m7;
    }

    @Override // F6.InterfaceC0091h0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0093i0(n(), null, this);
        }
        l(cancellationException);
    }

    @Override // n6.i
    public final Object fold(Object obj, w6.p pVar) {
        return pVar.invoke(obj, this);
    }

    public final boolean g(InterfaceC0085e0 interfaceC0085e0, y0 y0Var, AbstractC0099l0 abstractC0099l0) {
        boolean z7;
        p0 p0Var = new p0(abstractC0099l0, this, interfaceC0085e0);
        do {
            K6.k d7 = y0Var.d();
            if (d7 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K6.k.f2787b;
                Object obj = atomicReferenceFieldUpdater.get(y0Var);
                while (true) {
                    d7 = (K6.k) obj;
                    if (!d7.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d7);
                }
            }
            K6.k.f2787b.lazySet(abstractC0099l0, d7);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = K6.k.f2786a;
            atomicReferenceFieldUpdater2.lazySet(abstractC0099l0, y0Var);
            p0Var.f1297c = y0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(d7, y0Var, p0Var)) {
                    if (p0Var.a(d7) == null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                } else if (atomicReferenceFieldUpdater2.get(d7) != y0Var) {
                    z7 = false;
                    break;
                }
            }
            if (z7) {
                return true;
            }
        } while (!z7);
        return false;
    }

    @Override // n6.i
    public final n6.g get(n6.h hVar) {
        return AbstractC1079a.j(this, hVar);
    }

    @Override // F6.InterfaceC0091h0
    public final CancellationException getCancellationException() {
        Object x7 = x();
        CancellationException cancellationException = null;
        if (x7 instanceof o0) {
            Throwable b5 = ((o0) x7).b();
            if (b5 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b5 instanceof CancellationException) {
                    cancellationException = (CancellationException) b5;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = n();
                    }
                    return new C0093i0(concat, b5, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(x7 instanceof InterfaceC0085e0)) {
            if (x7 instanceof C0108v) {
                return M(this, ((C0108v) x7).f1316a);
            }
            return new C0093i0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override // F6.InterfaceC0091h0
    public final D6.d getChildren() {
        return new D6.c(new q0(this, null), 1);
    }

    public Object getCompleted() {
        return s();
    }

    public final Throwable getCompletionExceptionOrNull() {
        C0108v c0108v;
        Object x7 = x();
        if (!(x7 instanceof InterfaceC0085e0)) {
            if (x7 instanceof C0108v) {
                c0108v = (C0108v) x7;
            } else {
                c0108v = null;
            }
            if (c0108v == null) {
                return null;
            }
            return c0108v.f1316a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // n6.g
    public final n6.h getKey() {
        return C.f1216b;
    }

    @Override // F6.InterfaceC0091h0
    public final InterfaceC0091h0 getParent() {
        InterfaceC0103p interfaceC0103p = (InterfaceC0103p) f1314b.get(this);
        if (interfaceC0103p != null) {
            return interfaceC0103p.getParent();
        }
        return null;
    }

    public void i(Object obj) {
        h(obj);
    }

    @Override // F6.InterfaceC0091h0
    public final S invokeOnCompletion(w6.l lVar) {
        return invokeOnCompletion(false, true, lVar);
    }

    @Override // F6.InterfaceC0091h0
    public boolean isActive() {
        Object x7 = x();
        if ((x7 instanceof InterfaceC0085e0) && ((InterfaceC0085e0) x7).isActive()) {
            return true;
        }
        return false;
    }

    public final Object j(n6.d dVar) {
        Object x7;
        do {
            x7 = x();
            if (!(x7 instanceof InterfaceC0085e0)) {
                if (!(x7 instanceof C0108v)) {
                    return H.w(x7);
                }
                throw ((C0108v) x7).f1316a;
            }
        } while (K(x7) < 0);
        m0 m0Var = new m0(this, AbstractC1740d.q(dVar));
        m0Var.s();
        m0Var.u(new C0094j(invokeOnCompletion(false, true, new T(m0Var, 2)), 1));
        Object r7 = m0Var.r();
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        return r7;
    }

    @Override // F6.InterfaceC0091h0
    public final Object join(n6.d dVar) {
        boolean z7;
        while (true) {
            Object x7 = x();
            if (!(x7 instanceof InterfaceC0085e0)) {
                z7 = false;
                break;
            } else if (K(x7) >= 0) {
                z7 = true;
                break;
            }
        }
        l6.j jVar = l6.j.f13876a;
        if (!z7) {
            H.g(dVar.getContext());
            return jVar;
        }
        C0100m c0100m = new C0100m(1, AbstractC1740d.q(dVar));
        c0100m.s();
        c0100m.u(new C0094j(invokeOnCompletion(false, true, new T(c0100m, 3)), 1));
        Object r7 = c0100m.r();
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        if (r7 != enumC1565a) {
            r7 = jVar;
        }
        if (r7 == enumC1565a) {
            return r7;
        }
        return jVar;
    }

    public final boolean k(Object obj) {
        boolean z7;
        K6.w wVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K6.w wVar2 = H.f1223d;
        if (v()) {
            do {
                Object x7 = x();
                if ((x7 instanceof InterfaceC0085e0) && (!(x7 instanceof o0) || !((o0) x7).e())) {
                    wVar2 = N(x7, new C0108v(false, q(obj)));
                } else {
                    wVar2 = H.f1223d;
                    break;
                }
            } while (wVar2 == H.f);
            if (wVar2 == H.f1224e) {
                return true;
            }
        }
        if (wVar2 == H.f1223d) {
            Throwable th = null;
            Throwable th2 = null;
            loop1: while (true) {
                Object x8 = x();
                if (x8 instanceof o0) {
                    synchronized (x8) {
                        try {
                            o0 o0Var = (o0) x8;
                            o0Var.getClass();
                            if (o0.f1294d.get(o0Var) == H.f1226h) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                wVar = H.f1225g;
                            } else {
                                boolean d7 = ((o0) x8).d();
                                if (th2 == null) {
                                    th2 = q(obj);
                                }
                                ((o0) x8).a(th2);
                                Throwable b5 = ((o0) x8).b();
                                if (!d7) {
                                    th = b5;
                                }
                                if (th != null) {
                                    G(((o0) x8).f1295a, th);
                                }
                                wVar = H.f1223d;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else if (x8 instanceof InterfaceC0085e0) {
                    if (th2 == null) {
                        th2 = q(obj);
                    }
                    InterfaceC0085e0 interfaceC0085e0 = (InterfaceC0085e0) x8;
                    if (interfaceC0085e0.isActive()) {
                        y0 w2 = w(interfaceC0085e0);
                        if (w2 == null) {
                            continue;
                        } else {
                            o0 o0Var2 = new o0(w2, th2);
                            do {
                                atomicReferenceFieldUpdater = f1313a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0085e0, o0Var2)) {
                                    G(w2, th2);
                                    wVar = H.f1223d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0085e0);
                        }
                    } else {
                        Object N7 = N(x8, new C0108v(false, th2));
                        if (N7 != H.f1223d) {
                            if (N7 != H.f) {
                                wVar2 = N7;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + x8).toString());
                        }
                    }
                } else {
                    wVar = H.f1225g;
                    break;
                }
            }
            wVar2 = wVar;
        }
        if (wVar2 != H.f1223d && wVar2 != H.f1224e) {
            if (wVar2 == H.f1225g) {
                return false;
            }
            h(wVar2);
        }
        return true;
    }

    public void l(CancellationException cancellationException) {
        k(cancellationException);
    }

    public final boolean m(Throwable th) {
        if (B()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC0103p interfaceC0103p = (InterfaceC0103p) f1314b.get(this);
        if (interfaceC0103p != null && interfaceC0103p != z0.f1325a) {
            if (interfaceC0103p.b(th) || z7) {
                return true;
            }
            return false;
        }
        return z7;
    }

    @Override // n6.i
    public final n6.i minusKey(n6.h hVar) {
        return AbstractC1079a.p(this, hVar);
    }

    public String n() {
        return "Job was cancelled";
    }

    public boolean o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (k(th) && u()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [F6.x, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, F6.x] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [F6.u0, java.lang.Object] */
    public final void p(InterfaceC0085e0 interfaceC0085e0, Object obj) {
        C0108v c0108v;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1314b;
        InterfaceC0103p interfaceC0103p = (InterfaceC0103p) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0103p != null) {
            interfaceC0103p.a();
            atomicReferenceFieldUpdater.set(this, z0.f1325a);
        }
        ?? r12 = 0;
        if (obj instanceof C0108v) {
            c0108v = (C0108v) obj;
        } else {
            c0108v = null;
        }
        if (c0108v != null) {
            th = c0108v.f1316a;
        } else {
            th = null;
        }
        if (interfaceC0085e0 instanceof AbstractC0099l0) {
            try {
                ((AbstractC0099l0) interfaceC0085e0).j(th);
                return;
            } catch (Throwable th2) {
                z(new RuntimeException("Exception in completion handler " + interfaceC0085e0 + " for " + ((Object) this), th2));
                return;
            }
        }
        y0 c8 = interfaceC0085e0.c();
        if (c8 != null) {
            Object f = c8.f();
            kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            K6.k kVar = (K6.k) f;
            while (!kVar.equals(c8)) {
                if (kVar instanceof AbstractC0099l0) {
                    AbstractC0099l0 abstractC0099l0 = (AbstractC0099l0) kVar;
                    try {
                        abstractC0099l0.j(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            j3.f.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + abstractC0099l0 + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.g();
                r12 = r12;
            }
            if (r12 != 0) {
                z(r12);
            }
        }
    }

    @Override // n6.i
    public final n6.i plus(n6.i iVar) {
        return AbstractC1079a.q(this, iVar);
    }

    public final Throwable q(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        u0 u0Var = (u0) ((B0) obj);
        Object x7 = u0Var.x();
        CancellationException cancellationException = null;
        if (x7 instanceof o0) {
            th = ((o0) x7).b();
        } else if (x7 instanceof C0108v) {
            th = ((C0108v) x7).f1316a;
        } else if (!(x7 instanceof InterfaceC0085e0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + x7).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            cancellationException = new C0093i0("Parent job is ".concat(L(x7)), th, u0Var);
        }
        return cancellationException;
    }

    public final Object r(o0 o0Var, Object obj) {
        C0108v c0108v;
        Throwable t7;
        Object obj2;
        Throwable th = null;
        if (obj instanceof C0108v) {
            c0108v = (C0108v) obj;
        } else {
            c0108v = null;
        }
        if (c0108v != null) {
            th = c0108v.f1316a;
        }
        synchronized (o0Var) {
            o0Var.d();
            ArrayList<Throwable> f = o0Var.f(th);
            t7 = t(o0Var, f);
            if (t7 != null && f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                for (Throwable th2 : f) {
                    if (th2 != t7 && th2 != t7 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        j3.f.a(t7, th2);
                    }
                }
            }
        }
        if (t7 != null && t7 != th) {
            obj = new C0108v(false, t7);
        }
        if (t7 != null && (m(t7) || y(t7))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0108v.f1315b.compareAndSet((C0108v) obj, 0, 1);
        }
        H(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1313a;
        if (obj instanceof InterfaceC0085e0) {
            obj2 = new C0087f0((InterfaceC0085e0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o0Var, obj2) && atomicReferenceFieldUpdater.get(this) == o0Var) {
        }
        p(o0Var, obj);
        return obj;
    }

    public final Object s() {
        Object x7 = x();
        if (!(x7 instanceof InterfaceC0085e0)) {
            if (!(x7 instanceof C0108v)) {
                return H.w(x7);
            }
            throw ((C0108v) x7).f1316a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // F6.InterfaceC0091h0
    public final boolean start() {
        int K7;
        do {
            K7 = K(x());
            if (K7 == 0) {
                return false;
            }
        } while (K7 != 1);
        return true;
    }

    public final Throwable t(o0 o0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!o0Var.d()) {
                return null;
            }
            return new C0093i0(n(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof G0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof G0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(E() + '{' + L(x()) + '}');
        sb.append('@');
        sb.append(H.j(this));
        return sb.toString();
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return this instanceof C0106t;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [F6.y0, K6.k] */
    public final y0 w(InterfaceC0085e0 interfaceC0085e0) {
        y0 c8 = interfaceC0085e0.c();
        if (c8 == null) {
            if (interfaceC0085e0 instanceof U) {
                return new K6.k();
            }
            if (interfaceC0085e0 instanceof AbstractC0099l0) {
                J((AbstractC0099l0) interfaceC0085e0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC0085e0).toString());
        }
        return c8;
    }

    public final Object x() {
        while (true) {
            Object obj = f1313a.get(this);
            if (!(obj instanceof K6.q)) {
                return obj;
            }
            ((K6.q) obj).a(this);
        }
    }

    public boolean y(Throwable th) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [F6.y0, K6.k] */
    @Override // F6.InterfaceC0091h0
    public final S invokeOnCompletion(boolean z7, boolean z8, w6.l lVar) {
        AbstractC0099l0 abstractC0099l0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z7) {
            abstractC0099l0 = lVar instanceof AbstractC0095j0 ? (AbstractC0095j0) lVar : null;
            if (abstractC0099l0 == null) {
                abstractC0099l0 = new C0089g0(lVar);
            }
        } else {
            abstractC0099l0 = lVar instanceof AbstractC0099l0 ? (AbstractC0099l0) lVar : null;
            if (abstractC0099l0 == null) {
                abstractC0099l0 = new T(lVar, 1);
            }
        }
        abstractC0099l0.f1281d = this;
        while (true) {
            Object x7 = x();
            if (x7 instanceof U) {
                U u7 = (U) x7;
                if (u7.f1241a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1313a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, x7, abstractC0099l0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != x7) {
                            break;
                        }
                    }
                    return abstractC0099l0;
                }
                ?? kVar = new K6.k();
                C0083d0 c0083d0 = u7.f1241a ? kVar : new C0083d0(kVar);
                do {
                    atomicReferenceFieldUpdater = f1313a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, u7, c0083d0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == u7);
            } else if (x7 instanceof InterfaceC0085e0) {
                y0 c8 = ((InterfaceC0085e0) x7).c();
                if (c8 == null) {
                    kotlin.jvm.internal.j.c(x7, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    J((AbstractC0099l0) x7);
                } else {
                    S s7 = z0.f1325a;
                    if (z7 && (x7 instanceof o0)) {
                        synchronized (x7) {
                            try {
                                th = ((o0) x7).b();
                                if (th != null) {
                                    if ((lVar instanceof C0104q) && !((o0) x7).e()) {
                                    }
                                }
                                if (g((InterfaceC0085e0) x7, c8, abstractC0099l0)) {
                                    if (th == null) {
                                        return abstractC0099l0;
                                    }
                                    s7 = abstractC0099l0;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z8) {
                            lVar.invoke(th);
                        }
                        return s7;
                    } else if (g((InterfaceC0085e0) x7, c8, abstractC0099l0)) {
                        return abstractC0099l0;
                    }
                }
            } else {
                if (z8) {
                    C0108v c0108v = x7 instanceof C0108v ? (C0108v) x7 : null;
                    lVar.invoke(c0108v != null ? c0108v.f1316a : null);
                }
                return z0.f1325a;
            }
        }
    }

    public void I() {
    }

    public void H(Object obj) {
    }

    public void h(Object obj) {
    }

    public void z(C0110x c0110x) {
        throw c0110x;
    }
}
