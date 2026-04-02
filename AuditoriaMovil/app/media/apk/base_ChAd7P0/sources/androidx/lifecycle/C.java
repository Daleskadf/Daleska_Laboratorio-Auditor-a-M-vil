package androidx.lifecycle;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import q.C1705a;
import r.C1717b;
import r.C1718c;
import r.C1719d;
/* loaded from: classes.dex */
public class C {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f7879k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f7880a;

    /* renamed from: b  reason: collision with root package name */
    public final r.f f7881b;

    /* renamed from: c  reason: collision with root package name */
    public int f7882c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7883d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f7884e;
    public volatile Object f;

    /* renamed from: g  reason: collision with root package name */
    public int f7885g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7886h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7887i;
    public final G.c j;

    public C(Object obj) {
        this.f7880a = new Object();
        this.f7881b = new r.f();
        this.f7882c = 0;
        this.f = f7879k;
        this.j = new G.c(this, 9);
        this.f7884e = obj;
        this.f7885g = 0;
    }

    public static void a(String str) {
        C1705a.j0().f15318a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(AbstractC0059i.M("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(A a7) {
        if (!a7.f7873b) {
            return;
        }
        if (!a7.d()) {
            a7.a(false);
            return;
        }
        int i7 = a7.f7874c;
        int i8 = this.f7885g;
        if (i7 >= i8) {
            return;
        }
        a7.f7874c = i8;
        a7.f7872a.a(this.f7884e);
    }

    public final void c(A a7) {
        if (this.f7886h) {
            this.f7887i = true;
            return;
        }
        this.f7886h = true;
        do {
            this.f7887i = false;
            if (a7 != null) {
                b(a7);
                a7 = null;
            } else {
                r.f fVar = this.f7881b;
                fVar.getClass();
                C1719d c1719d = new C1719d(fVar);
                fVar.f15408c.put(c1719d, Boolean.FALSE);
                while (c1719d.hasNext()) {
                    b((A) ((Map.Entry) c1719d.next()).getValue());
                    if (this.f7887i) {
                        break;
                    }
                }
            }
        } while (this.f7887i);
        this.f7886h = false;
    }

    public Object d() {
        Object obj = this.f7884e;
        if (obj != f7879k) {
            return obj;
        }
        return null;
    }

    public final void e(InterfaceC0568u interfaceC0568u, D d7) {
        Object obj;
        a("observe");
        if (interfaceC0568u.h().f7946c == EnumC0563o.DESTROYED) {
            return;
        }
        z zVar = new z(this, interfaceC0568u, d7);
        r.f fVar = this.f7881b;
        C1718c e7 = fVar.e(d7);
        if (e7 != null) {
            obj = e7.f15400b;
        } else {
            C1718c c1718c = new C1718c(d7, zVar);
            fVar.f15409d++;
            C1718c c1718c2 = fVar.f15407b;
            if (c1718c2 == null) {
                fVar.f15406a = c1718c;
                fVar.f15407b = c1718c;
            } else {
                c1718c2.f15401c = c1718c;
                c1718c.f15402d = c1718c2;
                fVar.f15407b = c1718c;
            }
            obj = null;
        }
        A a7 = (A) obj;
        if (a7 != null && !a7.c(interfaceC0568u)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a7 != null) {
            return;
        }
        interfaceC0568u.h().a(zVar);
    }

    public final void f(D d7) {
        Object obj;
        a("observeForever");
        A a7 = new A(this, d7);
        r.f fVar = this.f7881b;
        C1718c e7 = fVar.e(d7);
        if (e7 != null) {
            obj = e7.f15400b;
        } else {
            C1718c c1718c = new C1718c(d7, a7);
            fVar.f15409d++;
            C1718c c1718c2 = fVar.f15407b;
            if (c1718c2 == null) {
                fVar.f15406a = c1718c;
                fVar.f15407b = c1718c;
            } else {
                c1718c2.f15401c = c1718c;
                c1718c.f15402d = c1718c2;
                fVar.f15407b = c1718c;
            }
            obj = null;
        }
        A a8 = (A) obj;
        if (!(a8 instanceof z)) {
            if (a8 != null) {
                return;
            }
            a7.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public final void i(Object obj) {
        boolean z7;
        synchronized (this.f7880a) {
            if (this.f == f7879k) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f = obj;
        }
        if (z7) {
            C1705a.j0().k0(this.j);
        }
    }

    public void j(D d7) {
        a("removeObserver");
        A a7 = (A) this.f7881b.f(d7);
        if (a7 == null) {
            return;
        }
        a7.b();
        a7.a(false);
    }

    public final void k(AbstractActivityC0032e abstractActivityC0032e) {
        a("removeObservers");
        Iterator it = this.f7881b.iterator();
        while (true) {
            C1717b c1717b = (C1717b) it;
            if (c1717b.hasNext()) {
                Map.Entry entry = (Map.Entry) c1717b.next();
                if (((A) entry.getValue()).c(abstractActivityC0032e)) {
                    j((D) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void l(Object obj) {
        a("setValue");
        this.f7885g++;
        this.f7884e = obj;
        c(null);
    }

    public C() {
        this.f7880a = new Object();
        this.f7881b = new r.f();
        this.f7882c = 0;
        Object obj = f7879k;
        this.f = obj;
        this.j = new G.c(this, 9);
        this.f7884e = obj;
        this.f7885g = -1;
    }

    public void g() {
    }

    public void h() {
    }
}
