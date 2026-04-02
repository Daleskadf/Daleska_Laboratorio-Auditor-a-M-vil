package androidx.lifecycle;

import androidx.lifecycle.d;
import i.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: b  reason: collision with root package name */
    public i.a f2569b;

    /* renamed from: c  reason: collision with root package name */
    public d.c f2570c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f2571d;

    /* renamed from: e  reason: collision with root package name */
    public int f2572e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2573f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2574g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f2575h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2576i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d.c f2577a;

        /* renamed from: b  reason: collision with root package name */
        public e f2578b;

        public a(f fVar, d.c cVar) {
            this.f2578b = j.f(fVar);
            this.f2577a = cVar;
        }

        public void a(g gVar, d.b bVar) {
            d.c b10 = bVar.b();
            this.f2577a = h.k(this.f2577a, b10);
            this.f2578b.a(gVar, bVar);
            this.f2577a = b10;
        }
    }

    public h(g gVar) {
        this(gVar, true);
    }

    public static d.c k(d.c cVar, d.c cVar2) {
        if (cVar2 != null && cVar2.compareTo(cVar) < 0) {
            return cVar2;
        }
        return cVar;
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        boolean z10;
        f("addObserver");
        d.c cVar = this.f2570c;
        d.c cVar2 = d.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = d.c.INITIALIZED;
        }
        a aVar = new a(fVar, cVar2);
        if (((a) this.f2569b.f(fVar, aVar)) != null || (gVar = (g) this.f2571d.get()) == null) {
            return;
        }
        if (this.f2572e == 0 && !this.f2573f) {
            z10 = false;
        } else {
            z10 = true;
        }
        d.c e10 = e(fVar);
        this.f2572e++;
        while (aVar.f2577a.compareTo(e10) < 0 && this.f2569b.contains(fVar)) {
            n(aVar.f2577a);
            d.b c10 = d.b.c(aVar.f2577a);
            if (c10 != null) {
                aVar.a(gVar, c10);
                m();
                e10 = e(fVar);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f2577a);
            }
        }
        if (!z10) {
            p();
        }
        this.f2572e--;
    }

    @Override // androidx.lifecycle.d
    public d.c b() {
        return this.f2570c;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        f("removeObserver");
        this.f2569b.g(fVar);
    }

    public final void d(g gVar) {
        Iterator descendingIterator = this.f2569b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f2574g) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f2577a.compareTo(this.f2570c) > 0 && !this.f2574g && this.f2569b.contains(entry.getKey())) {
                d.b a10 = d.b.a(aVar.f2577a);
                if (a10 != null) {
                    n(a10.b());
                    aVar.a(gVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f2577a);
                }
            }
        }
    }

    public final d.c e(f fVar) {
        d.c cVar;
        ArrayList arrayList;
        Map.Entry h10 = this.f2569b.h(fVar);
        d.c cVar2 = null;
        if (h10 != null) {
            cVar = ((a) h10.getValue()).f2577a;
        } else {
            cVar = null;
        }
        if (!this.f2575h.isEmpty()) {
            cVar2 = (d.c) this.f2575h.get(arrayList.size() - 1);
        }
        return k(k(this.f2570c, cVar), cVar2);
    }

    public final void f(String str) {
        if (this.f2576i && !h.a.e().b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    public final void g(g gVar) {
        b.d c10 = this.f2569b.c();
        while (c10.hasNext() && !this.f2574g) {
            Map.Entry entry = (Map.Entry) c10.next();
            a aVar = (a) entry.getValue();
            while (aVar.f2577a.compareTo(this.f2570c) < 0 && !this.f2574g && this.f2569b.contains(entry.getKey())) {
                n(aVar.f2577a);
                d.b c11 = d.b.c(aVar.f2577a);
                if (c11 != null) {
                    aVar.a(gVar, c11);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f2577a);
                }
            }
        }
    }

    public void h(d.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.b());
    }

    public final boolean i() {
        if (this.f2569b.size() == 0) {
            return true;
        }
        d.c cVar = ((a) this.f2569b.a().getValue()).f2577a;
        d.c cVar2 = ((a) this.f2569b.d().getValue()).f2577a;
        if (cVar == cVar2 && this.f2570c == cVar2) {
            return true;
        }
        return false;
    }

    public void j(d.c cVar) {
        f("markState");
        o(cVar);
    }

    public final void l(d.c cVar) {
        if (this.f2570c == cVar) {
            return;
        }
        this.f2570c = cVar;
        if (!this.f2573f && this.f2572e == 0) {
            this.f2573f = true;
            p();
            this.f2573f = false;
            return;
        }
        this.f2574g = true;
    }

    public final void m() {
        ArrayList arrayList = this.f2575h;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(d.c cVar) {
        this.f2575h.add(cVar);
    }

    public void o(d.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    public final void p() {
        g gVar = (g) this.f2571d.get();
        if (gVar != null) {
            while (!i()) {
                this.f2574g = false;
                if (this.f2570c.compareTo(((a) this.f2569b.a().getValue()).f2577a) < 0) {
                    d(gVar);
                }
                Map.Entry d10 = this.f2569b.d();
                if (!this.f2574g && d10 != null && this.f2570c.compareTo(((a) d10.getValue()).f2577a) > 0) {
                    g(gVar);
                }
            }
            this.f2574g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public h(g gVar, boolean z10) {
        this.f2569b = new i.a();
        this.f2572e = 0;
        this.f2573f = false;
        this.f2574g = false;
        this.f2575h = new ArrayList();
        this.f2571d = new WeakReference(gVar);
        this.f2570c = d.c.INITIALIZED;
        this.f2576i = z10;
    }
}
