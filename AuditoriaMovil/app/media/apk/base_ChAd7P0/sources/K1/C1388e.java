package k1;

import H0.C0137q;
import H0.I;
import H0.e0;
import K0.x;
import O0.F;
import Q0.A;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import g1.C1006c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: k1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388e {

    /* renamed from: m  reason: collision with root package name */
    public static final W1.c f13581m = new W1.c(1);

    /* renamed from: a  reason: collision with root package name */
    public final C1387d f13582a;

    /* renamed from: b  reason: collision with root package name */
    public final n f13583b;

    /* renamed from: c  reason: collision with root package name */
    public final r f13584c;

    /* renamed from: d  reason: collision with root package name */
    public final C1385b f13585d;

    /* renamed from: e  reason: collision with root package name */
    public final K0.s f13586e;
    public final CopyOnWriteArraySet f;

    /* renamed from: g  reason: collision with root package name */
    public H0.r f13587g;

    /* renamed from: h  reason: collision with root package name */
    public F f13588h;

    /* renamed from: i  reason: collision with root package name */
    public K0.u f13589i;
    public Pair j;

    /* renamed from: k  reason: collision with root package name */
    public int f13590k;

    /* renamed from: l  reason: collision with root package name */
    public int f13591l;

    public C1388e(A a7) {
        C1387d c1387d = new C1387d(this, (Context) a7.f4137c);
        this.f13582a = c1387d;
        K0.s sVar = (K0.s) a7.f4140g;
        this.f13586e = sVar;
        n nVar = (n) a7.f4138d;
        this.f13583b = nVar;
        nVar.f13659k = sVar;
        this.f13584c = new r(new C1006c(this), nVar);
        C1385b c1385b = (C1385b) a7.f;
        K0.a.k(c1385b);
        this.f13585d = c1385b;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f = copyOnWriteArraySet;
        this.f13591l = 0;
        copyOnWriteArraySet.add(c1387d);
    }

    public final void a(long j, long j8) {
        r rVar;
        K0.l lVar;
        int i7;
        if (this.f13590k == 0 && (i7 = (lVar = (rVar = this.f13584c).f).f2495c) != 0) {
            if (i7 != 0) {
                long j9 = ((long[]) lVar.f2497e)[lVar.f2494b];
                Long l8 = (Long) rVar.f13684e.i(j9);
                n nVar = rVar.f13681b;
                if (l8 != null && l8.longValue() != rVar.f13687i) {
                    rVar.f13687i = l8.longValue();
                    nVar.c(2);
                }
                int a7 = rVar.f13681b.a(j9, j, j8, rVar.f13687i, false, rVar.f13682c);
                boolean z7 = true;
                C1388e c1388e = (C1388e) rVar.f13680a.f11091a;
                if (a7 != 0 && a7 != 1) {
                    if (a7 != 2 && a7 != 3 && a7 != 4) {
                        if (a7 != 5) {
                            throw new IllegalStateException(String.valueOf(a7));
                        }
                        return;
                    }
                    rVar.j = j9;
                    lVar.T();
                    Iterator it = c1388e.f.iterator();
                    while (it.hasNext()) {
                        C1387d c1387d = (C1387d) it.next();
                        c1387d.f13580i.execute(new RunnableC1386c(c1387d, c1387d.f13579h, 1));
                    }
                    K0.a.k(null);
                    throw null;
                }
                rVar.j = j9;
                long T7 = lVar.T();
                e0 e0Var = (e0) rVar.f13683d.i(T7);
                if (e0Var != null && !e0Var.equals(e0.f1792e) && !e0Var.equals(rVar.f13686h)) {
                    rVar.f13686h = e0Var;
                    C0137q c0137q = new C0137q();
                    c0137q.f1856r = e0Var.f1793a;
                    c0137q.f1857s = e0Var.f1794b;
                    c0137q.f1850l = I.l("video/raw");
                    c1388e.f13587g = new H0.r(c0137q);
                    Iterator it2 = c1388e.f.iterator();
                    while (it2.hasNext()) {
                        C1387d c1387d2 = (C1387d) it2.next();
                        c1387d2.f13580i.execute(new RunnableC1386c(c1387d2, c1387d2.f13579h, e0Var));
                    }
                }
                if (nVar.f13654d == 3) {
                    z7 = false;
                }
                nVar.f13654d = 3;
                nVar.f13659k.getClass();
                nVar.f = x.M(SystemClock.elapsedRealtime());
                if (z7 && c1388e.j != null) {
                    Iterator it3 = c1388e.f.iterator();
                    while (it3.hasNext()) {
                        C1387d c1387d3 = (C1387d) it3.next();
                        c1387d3.f13580i.execute(new RunnableC1386c(c1387d3, c1387d3.f13579h, 2));
                    }
                }
                if (c1388e.f13588h != null) {
                    if (c1388e.f13587g == null) {
                        new C0137q().a();
                    }
                    F f = c1388e.f13588h;
                    c1388e.f13586e.getClass();
                    f.d(T7, System.nanoTime());
                }
                K0.a.k(null);
                throw null;
            }
            throw new NoSuchElementException();
        }
    }
}
