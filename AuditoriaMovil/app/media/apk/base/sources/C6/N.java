package c6;

import a6.AbstractC0482k;
import a6.C0476e;
import a6.C0489s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class N implements InterfaceC0672h1 {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f8506c;

    /* renamed from: d  reason: collision with root package name */
    public final a6.u0 f8507d;

    /* renamed from: e  reason: collision with root package name */
    public L f8508e;
    public L f;

    /* renamed from: g  reason: collision with root package name */
    public L f8509g;

    /* renamed from: h  reason: collision with root package name */
    public A.c f8510h;
    public a6.o0 j;

    /* renamed from: k  reason: collision with root package name */
    public a6.O f8512k;

    /* renamed from: l  reason: collision with root package name */
    public long f8513l;

    /* renamed from: a  reason: collision with root package name */
    public final a6.H f8504a = a6.H.a(N.class, null);

    /* renamed from: b  reason: collision with root package name */
    public final Object f8505b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public Collection f8511i = new LinkedHashSet();

    public N(Executor executor, a6.u0 u0Var) {
        this.f8506c = executor;
        this.f8507d = u0Var;
    }

    @Override // c6.InterfaceC0672h1
    public final void a(a6.o0 o0Var) {
        L l8;
        synchronized (this.f8505b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = o0Var;
                this.f8507d.b(new RunnableC0646G(5, this, o0Var));
                if (!h() && (l8 = this.f8509g) != null) {
                    this.f8507d.b(l8);
                    this.f8509g = null;
                }
                this.f8507d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.InterfaceC0720y
    public final InterfaceC0711v b(Q0.A a7, a6.e0 e0Var, C0476e c0476e, AbstractC0482k[] abstractC0482kArr) {
        InterfaceC0711v z7;
        try {
            D1 d12 = new D1(a7, e0Var, c0476e);
            a6.O o7 = null;
            long j = -1;
            while (true) {
                synchronized (this.f8505b) {
                    a6.o0 o0Var = this.j;
                    if (o0Var != null) {
                        z7 = new Z(o0Var, EnumC0714w.PROCESSED, abstractC0482kArr);
                        break;
                    }
                    a6.O o8 = this.f8512k;
                    if (o8 == null) {
                        z7 = g(d12, abstractC0482kArr);
                        break;
                    } else if (o7 != null && j == this.f8513l) {
                        z7 = g(d12, abstractC0482kArr);
                        break;
                    } else {
                        j = this.f8513l;
                        InterfaceC0720y f = AbstractC0671h0.f(o8.a(d12), Boolean.TRUE.equals(c0476e.f));
                        if (f != null) {
                            z7 = f.b(d12.f8440c, d12.f8439b, d12.f8438a, abstractC0482kArr);
                            break;
                        }
                        o7 = o8;
                    }
                }
            }
            return z7;
        } finally {
            this.f8507d.a();
        }
    }

    @Override // a6.G
    public final a6.H c() {
        return this.f8504a;
    }

    @Override // c6.InterfaceC0672h1
    public final void d(a6.o0 o0Var) {
        Collection<M> collection;
        L l8;
        a(o0Var);
        synchronized (this.f8505b) {
            try {
                collection = this.f8511i;
                l8 = this.f8509g;
                this.f8509g = null;
                if (!collection.isEmpty()) {
                    this.f8511i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l8 != null) {
            for (M m7 : collection) {
                P r7 = m7.r(new Z(o0Var, EnumC0714w.REFUSED, m7.f8499l));
                if (r7 != null) {
                    r7.run();
                }
            }
            this.f8507d.execute(l8);
        }
    }

    @Override // c6.InterfaceC0672h1
    public final Runnable e(InterfaceC0669g1 interfaceC0669g1) {
        A.c cVar = (A.c) interfaceC0669g1;
        this.f8510h = cVar;
        this.f8508e = new L(cVar, 0);
        this.f = new L(cVar, 1);
        this.f8509g = new L(cVar, 2);
        return null;
    }

    public final M g(D1 d12, AbstractC0482k[] abstractC0482kArr) {
        int size;
        M m7 = new M(this, d12, abstractC0482kArr);
        this.f8511i.add(m7);
        synchronized (this.f8505b) {
            size = this.f8511i.size();
        }
        if (size == 1) {
            this.f8507d.b(this.f8508e);
        }
        for (AbstractC0482k abstractC0482k : abstractC0482kArr) {
            abstractC0482k.a();
        }
        return m7;
    }

    public final boolean h() {
        boolean z7;
        synchronized (this.f8505b) {
            z7 = !this.f8511i.isEmpty();
        }
        return z7;
    }

    public final void i(a6.O o7) {
        L l8;
        synchronized (this.f8505b) {
            this.f8512k = o7;
            this.f8513l++;
            if (o7 != null && h()) {
                ArrayList arrayList = new ArrayList(this.f8511i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    M m7 = (M) it.next();
                    a6.M a7 = o7.a(m7.j);
                    C0476e c0476e = m7.j.f8438a;
                    InterfaceC0720y f = AbstractC0671h0.f(a7, Boolean.TRUE.equals(c0476e.f));
                    if (f != null) {
                        Executor executor = this.f8506c;
                        Executor executor2 = c0476e.f7133b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C0489s c0489s = m7.f8498k;
                        C0489s a8 = c0489s.a();
                        try {
                            D1 d12 = m7.j;
                            InterfaceC0711v b5 = f.b(d12.f8440c, d12.f8439b, d12.f8438a, m7.f8499l);
                            c0489s.c(a8);
                            P r7 = m7.r(b5);
                            if (r7 != null) {
                                executor.execute(r7);
                            }
                            arrayList2.add(m7);
                        } catch (Throwable th) {
                            c0489s.c(a8);
                            throw th;
                        }
                    }
                }
                synchronized (this.f8505b) {
                    try {
                        if (!h()) {
                            return;
                        }
                        this.f8511i.removeAll(arrayList2);
                        if (this.f8511i.isEmpty()) {
                            this.f8511i = new LinkedHashSet();
                        }
                        if (!h()) {
                            this.f8507d.b(this.f);
                            if (this.j != null && (l8 = this.f8509g) != null) {
                                this.f8507d.b(l8);
                                this.f8509g = null;
                            }
                        }
                        this.f8507d.a();
                    } finally {
                    }
                }
            }
        }
    }
}
