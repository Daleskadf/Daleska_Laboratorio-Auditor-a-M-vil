package K6;

import F6.AbstractC0077a0;
import F6.B;
import F6.C0108v;
import F6.C0109w;
import F6.F0;
import F6.H;
import F6.O;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.C1445f;
import p6.AbstractC1700c;
import p6.InterfaceC1701d;
/* loaded from: classes.dex */
public final class h extends O implements InterfaceC1701d, n6.d {

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2777Y = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: X  reason: collision with root package name */
    public final Object f2778X;
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final B f2779d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1700c f2780e;
    public Object f;

    public h(B b5, AbstractC1700c abstractC1700c) {
        super(-1);
        this.f2779d = b5;
        this.f2780e = abstractC1700c;
        this.f = AbstractC0208a.f2767c;
        this.f2778X = AbstractC0208a.l(abstractC1700c.getContext());
    }

    @Override // F6.O
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0109w) {
            ((C0109w) obj).f1319b.invoke(cancellationException);
        }
    }

    @Override // p6.InterfaceC1701d
    public final InterfaceC1701d getCallerFrame() {
        AbstractC1700c abstractC1700c = this.f2780e;
        if (!(abstractC1700c instanceof InterfaceC1701d)) {
            return null;
        }
        return abstractC1700c;
    }

    @Override // n6.d
    public final n6.i getContext() {
        return this.f2780e.getContext();
    }

    @Override // F6.O
    public final Object j() {
        Object obj = this.f;
        this.f = AbstractC0208a.f2767c;
        return obj;
    }

    @Override // n6.d
    public final void resumeWith(Object obj) {
        Object c0108v;
        AbstractC1700c abstractC1700c = this.f2780e;
        n6.i context = abstractC1700c.getContext();
        Throwable a7 = l6.f.a(obj);
        if (a7 == null) {
            c0108v = obj;
        } else {
            c0108v = new C0108v(false, a7);
        }
        B b5 = this.f2779d;
        if (b5.d()) {
            this.f = c0108v;
            this.f1236c = 0;
            b5.c(context, this);
            return;
        }
        AbstractC0077a0 a8 = F0.a();
        if (a8.f1252c >= 4294967296L) {
            this.f = c0108v;
            this.f1236c = 0;
            C1445f c1445f = a8.f1254e;
            if (c1445f == null) {
                c1445f = new C1445f();
                a8.f1254e = c1445f;
            }
            c1445f.addLast(this);
            return;
        }
        a8.m(true);
        try {
            n6.i context2 = abstractC1700c.getContext();
            Object m7 = AbstractC0208a.m(context2, this.f2778X);
            abstractC1700c.resumeWith(obj);
            AbstractC0208a.g(context2, m7);
            do {
            } while (a8.o());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2779d + ", " + H.v(this.f2780e) + ']';
    }

    @Override // F6.O
    public final n6.d e() {
        return this;
    }
}
