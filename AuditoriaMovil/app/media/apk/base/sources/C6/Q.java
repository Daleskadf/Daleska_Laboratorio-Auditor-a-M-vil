package c6;

import a1.C0415A;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class Q implements InterfaceC0717x, g7.a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f8564a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8565b;

    /* renamed from: c  reason: collision with root package name */
    public Collection f8566c;

    public Q() {
        this.f8564a = false;
        this.f8565b = new ConcurrentHashMap();
        this.f8566c = new LinkedBlockingQueue();
    }

    @Override // c6.InterfaceC0717x
    public void O(a6.o0 o0Var, EnumC0714w enumC0714w, a6.e0 e0Var) {
        b(new RunnableC0649a(this, o0Var, enumC0714w, e0Var, 1));
    }

    @Override // c6.InterfaceC0717x
    public void Q(a6.e0 e0Var) {
        b(new RunnableC0646G(12, this, e0Var));
    }

    @Override // c6.InterfaceC0717x
    public void X(C0415A c0415a) {
        if (this.f8564a) {
            ((InterfaceC0717x) this.f8565b).X(c0415a);
        } else {
            b(new RunnableC0646G(11, this, c0415a));
        }
    }

    @Override // g7.a
    public synchronized g7.b a(String str) {
        org.slf4j.helpers.g gVar;
        gVar = (org.slf4j.helpers.g) ((ConcurrentHashMap) this.f8565b).get(str);
        if (gVar == null) {
            gVar = new org.slf4j.helpers.g(str, (LinkedBlockingQueue) this.f8566c, this.f8564a);
            ((ConcurrentHashMap) this.f8565b).put(str, gVar);
        }
        return gVar;
    }

    public void b(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.f8564a) {
                    ((List) this.f8566c).add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        List<Runnable> list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (((List) this.f8566c).isEmpty()) {
                        this.f8566c = null;
                        this.f8564a = true;
                        return;
                    }
                    list = (List) this.f8566c;
                    this.f8566c = arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            list.clear();
            arrayList = list;
        }
    }

    @Override // c6.InterfaceC0717x
    public void n() {
        if (this.f8564a) {
            ((InterfaceC0717x) this.f8565b).n();
        } else {
            b(new G.c(this, 11));
        }
    }

    public Q(InterfaceC0717x interfaceC0717x) {
        this.f8566c = new ArrayList();
        this.f8565b = interfaceC0717x;
    }
}
