package F6;

import K6.AbstractC0208a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.C1445f;
import o6.EnumC1565a;
import p6.InterfaceC1701d;
/* renamed from: F6.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0100m extends O implements InterfaceC0098l, InterfaceC1701d, L0 {
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    public final n6.d f1284d;

    /* renamed from: e  reason: collision with root package name */
    public final n6.i f1285e;
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C0100m.class, "_decisionAndIndex");

    /* renamed from: X  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1282X = AtomicReferenceFieldUpdater.newUpdater(C0100m.class, Object.class, "_state");

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1283Y = AtomicReferenceFieldUpdater.newUpdater(C0100m.class, Object.class, "_parentHandle");

    public C0100m(int i7, n6.d dVar) {
        super(i7);
        this.f1284d = dVar;
        this.f1285e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0078b.f1255a;
    }

    public static Object C(A0 a02, Object obj, int i7, w6.l lVar) {
        AbstractC0096k abstractC0096k;
        if (!(obj instanceof C0108v) && H.n(i7)) {
            if (lVar != null || (a02 instanceof AbstractC0096k)) {
                if (a02 instanceof AbstractC0096k) {
                    abstractC0096k = (AbstractC0096k) a02;
                } else {
                    abstractC0096k = null;
                }
                return new C0107u(obj, abstractC0096k, lVar, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void x(A0 a02, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + a02 + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i7, w6.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1282X;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof A0) {
                Object C7 = C((A0) obj2, obj, i7, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C7)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i7);
                return;
            }
            if (obj2 instanceof C0101n) {
                C0101n c0101n = (C0101n) obj2;
                c0101n.getClass();
                if (C0101n.f1287c.compareAndSet(c0101n, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, c0101n.f1316a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(B b5) {
        K6.h hVar;
        B b7;
        int i7;
        l6.j jVar = l6.j.f13876a;
        n6.d dVar = this.f1284d;
        if (dVar instanceof K6.h) {
            hVar = (K6.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            b7 = hVar.f2779d;
        } else {
            b7 = null;
        }
        if (b7 == b5) {
            i7 = 4;
        } else {
            i7 = this.f1236c;
        }
        A(jVar, i7, null);
    }

    public final K6.w D(Object obj, w6.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1282X;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj2 instanceof A0;
            K6.w wVar = H.f1220a;
            if (z7) {
                Object C7 = C((A0) obj2, obj, this.f1236c, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C7)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                return wVar;
            }
            boolean z8 = obj2 instanceof C0107u;
            return null;
        }
    }

    @Override // F6.L0
    public final void a(K6.u uVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        v(uVar);
    }

    @Override // F6.InterfaceC0098l
    public final void b(Object obj, w6.l lVar) {
        A(obj, this.f1236c, lVar);
    }

    @Override // F6.O
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1282X;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof A0)) {
                if (obj2 instanceof C0108v) {
                    return;
                }
                if (obj2 instanceof C0107u) {
                    C0107u c0107u = (C0107u) obj2;
                    if (c0107u.f1312e == null) {
                        C0107u a7 = C0107u.a(c0107u, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a7)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        AbstractC0096k abstractC0096k = c0107u.f1309b;
                        if (abstractC0096k != null) {
                            k(abstractC0096k, cancellationException);
                        }
                        w6.l lVar = c0107u.f1310c;
                        if (lVar != null) {
                            l(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                C0107u c0107u2 = new C0107u(obj2, (AbstractC0096k) null, (w6.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0107u2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed");
        }
    }

    @Override // F6.InterfaceC0098l
    public final K6.w d(Object obj, w6.l lVar) {
        return D(obj, lVar);
    }

    @Override // F6.O
    public final n6.d e() {
        return this.f1284d;
    }

    @Override // F6.InterfaceC0098l
    public final void f(Object obj) {
        p(this.f1236c);
    }

    @Override // F6.O
    public final Throwable g(Object obj) {
        Throwable g3 = super.g(obj);
        if (g3 == null) {
            return null;
        }
        return g3;
    }

    @Override // p6.InterfaceC1701d
    public final InterfaceC1701d getCallerFrame() {
        n6.d dVar = this.f1284d;
        if (dVar instanceof InterfaceC1701d) {
            return (InterfaceC1701d) dVar;
        }
        return null;
    }

    @Override // n6.d
    public final n6.i getContext() {
        return this.f1285e;
    }

    @Override // F6.O
    public final Object h(Object obj) {
        if (obj instanceof C0107u) {
            return ((C0107u) obj).f1308a;
        }
        return obj;
    }

    @Override // F6.O
    public final Object j() {
        return f1282X.get(this);
    }

    public final void k(AbstractC0096k abstractC0096k, Throwable th) {
        try {
            abstractC0096k.a(th);
        } catch (Throwable th2) {
            H.l(this.f1285e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(w6.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            H.l(this.f1285e, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(K6.u uVar, Throwable th) {
        n6.i iVar = this.f1285e;
        int i7 = f.get(this) & 536870911;
        if (i7 != 536870911) {
            try {
                uVar.g(i7, iVar);
                return;
            } catch (Throwable th2) {
                H.l(iVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1282X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = false;
            if (!(obj instanceof A0)) {
                return false;
            }
            if ((obj instanceof AbstractC0096k) || (obj instanceof K6.u)) {
                z7 = true;
            }
            C0101n c0101n = new C0101n(this, th, z7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0101n)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            A0 a02 = (A0) obj;
            if (a02 instanceof AbstractC0096k) {
                k((AbstractC0096k) obj, th);
            } else if (a02 instanceof K6.u) {
                m((K6.u) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f1236c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1283Y;
        S s7 = (S) atomicReferenceFieldUpdater.get(this);
        if (s7 == null) {
            return;
        }
        s7.a();
        atomicReferenceFieldUpdater.set(this, z0.f1325a);
    }

    public final void p(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        boolean z7;
        do {
            atomicIntegerFieldUpdater = f;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    if (i7 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    n6.d dVar = this.f1284d;
                    if (!z7 && (dVar instanceof K6.h) && H.n(i7) == H.n(this.f1236c)) {
                        B b5 = ((K6.h) dVar).f2779d;
                        n6.i context = ((K6.h) dVar).f2780e.getContext();
                        if (b5.d()) {
                            b5.c(context, this);
                            return;
                        }
                        AbstractC0077a0 a7 = F0.a();
                        if (a7.f1252c >= 4294967296L) {
                            C1445f c1445f = a7.f1254e;
                            if (c1445f == null) {
                                c1445f = new C1445f();
                                a7.f1254e = c1445f;
                            }
                            c1445f.addLast(this);
                            return;
                        }
                        a7.m(true);
                        try {
                            H.t(this, dVar, true);
                            do {
                            } while (a7.o());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    H.t(this, dVar, z7);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public Throwable q(u0 u0Var) {
        return u0Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean w2 = w();
        do {
            atomicIntegerFieldUpdater = f;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    if (w2) {
                        z();
                    }
                    Object obj = f1282X.get(this);
                    if (!(obj instanceof C0108v)) {
                        if (H.n(this.f1236c)) {
                            InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) this.f1285e.get(C.f1216b);
                            if (interfaceC0091h0 != null && !interfaceC0091h0.isActive()) {
                                CancellationException cancellationException = interfaceC0091h0.getCancellationException();
                                c(obj, cancellationException);
                                throw cancellationException;
                            }
                        }
                        return h(obj);
                    }
                    throw ((C0108v) obj).f1316a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((S) f1283Y.get(this)) == null) {
            t();
        }
        if (w2) {
            z();
        }
        return EnumC1565a.COROUTINE_SUSPENDED;
    }

    @Override // n6.d
    public final void resumeWith(Object obj) {
        Throwable a7 = l6.f.a(obj);
        if (a7 != null) {
            obj = new C0108v(false, a7);
        }
        A(obj, this.f1236c, null);
    }

    public final void s() {
        S t7 = t();
        if (t7 != null && !(f1282X.get(this) instanceof A0)) {
            t7.a();
            f1283Y.set(this, z0.f1325a);
        }
    }

    public final S t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) this.f1285e.get(C.f1216b);
        if (interfaceC0091h0 == null) {
            return null;
        }
        S m7 = H.m(interfaceC0091h0, true, new C0102o(this), 2);
        do {
            atomicReferenceFieldUpdater = f1283Y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m7;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(H.v(this.f1284d));
        sb.append("){");
        Object obj = f1282X.get(this);
        if (obj instanceof A0) {
            str = "Active";
        } else if (obj instanceof C0101n) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(H.j(this));
        return sb.toString();
    }

    public final void u(w6.l lVar) {
        AbstractC0096k c0094j;
        if (lVar instanceof AbstractC0096k) {
            c0094j = (AbstractC0096k) lVar;
        } else {
            c0094j = new C0094j(lVar, 2);
        }
        v(c0094j);
    }

    public final void v(A0 a02) {
        boolean z7;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1282X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0078b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof AbstractC0096k) {
                z7 = true;
            } else {
                z7 = obj instanceof K6.u;
            }
            Throwable th = null;
            if (!z7) {
                if (obj instanceof C0108v) {
                    C0108v c0108v = (C0108v) obj;
                    c0108v.getClass();
                    if (C0108v.f1315b.compareAndSet(c0108v, 0, 1)) {
                        if (obj instanceof C0101n) {
                            if (!(obj instanceof C0108v)) {
                                c0108v = null;
                            }
                            if (c0108v != null) {
                                th = c0108v.f1316a;
                            }
                            if (a02 instanceof AbstractC0096k) {
                                k((AbstractC0096k) a02, th);
                                return;
                            }
                            kotlin.jvm.internal.j.c(a02, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m((K6.u) a02, th);
                            return;
                        }
                        return;
                    }
                    x(a02, obj);
                    throw null;
                } else if (obj instanceof C0107u) {
                    C0107u c0107u = (C0107u) obj;
                    if (c0107u.f1309b == null) {
                        if (a02 instanceof K6.u) {
                            return;
                        }
                        kotlin.jvm.internal.j.c(a02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC0096k abstractC0096k = (AbstractC0096k) a02;
                        Throwable th2 = c0107u.f1312e;
                        if (th2 != null) {
                            k(abstractC0096k, th2);
                            return;
                        }
                        C0107u a7 = C0107u.a(c0107u, abstractC0096k, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a7)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        return;
                    }
                    x(a02, obj);
                    throw null;
                } else if (a02 instanceof K6.u) {
                    return;
                } else {
                    kotlin.jvm.internal.j.c(a02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    C0107u c0107u2 = new C0107u(obj, (AbstractC0096k) a02, (w6.l) null, (CancellationException) null, 28);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0107u2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                }
            }
            x(a02, obj);
            throw null;
        }
    }

    public final boolean w() {
        if (this.f1236c == 2) {
            n6.d dVar = this.f1284d;
            kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (K6.h.f2777Y.get((K6.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        K6.h hVar;
        n6.d dVar = this.f1284d;
        Throwable th = null;
        if (dVar instanceof K6.h) {
            hVar = (K6.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K6.h.f2777Y;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                K6.w wVar = AbstractC0208a.f2768d;
                if (obj == wVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, wVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != wVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                o();
                n(th);
            }
        }
    }
}
