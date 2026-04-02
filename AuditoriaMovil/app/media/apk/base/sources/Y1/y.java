package Y1;

import H4.W;
import a1.C0415A;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c4.C0632a;
import c4.InterfaceC0635d;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import t4.RunnableC1822b;
import t5.C1832d;
import t5.C1833e;
import t5.C1834f;
import t5.InterfaceC1835g;
/* loaded from: classes.dex */
public final class y implements InterfaceC1835g {

    /* renamed from: X  reason: collision with root package name */
    public final Object f6695X;

    /* renamed from: a  reason: collision with root package name */
    public int f6696a;

    /* renamed from: b  reason: collision with root package name */
    public int f6697b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f6698c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractCollection f6699d;

    /* renamed from: e  reason: collision with root package name */
    public final Collection f6700e;
    public Object f;

    public y(int i7, int i8) {
        this.f6699d = new LinkedList();
        this.f6700e = new HashSet();
        this.f = new HashSet();
        this.f6695X = new HashMap();
        this.f6698c = "Sqflite";
        this.f6696a = i7;
        this.f6697b = i8;
    }

    @Override // t5.InterfaceC1835g
    public void a(C1832d c1832d, Runnable runnable) {
        C0415A c0415a;
        if (c1832d == null) {
            c0415a = null;
        } else {
            c0415a = new C0415A(c1832d);
        }
        C1833e c1833e = new C1833e(c0415a, runnable);
        synchronized (this) {
            ((LinkedList) this.f6699d).add(c1833e);
            Iterator it = new HashSet((HashSet) this.f6700e).iterator();
            while (it.hasNext()) {
                g((C1834f) it.next());
            }
        }
    }

    @Override // t5.InterfaceC1835g
    public synchronized void b() {
        try {
            Iterator it = ((HashSet) this.f6700e).iterator();
            while (it.hasNext()) {
                ((C1834f) it.next()).a();
            }
            Iterator it2 = ((HashSet) this.f).iterator();
            while (it2.hasNext()) {
                ((C1834f) it2.next()).a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(c4.j jVar) {
        if (!((HashSet) this.f6699d).contains(jVar.f8397a)) {
            ((HashSet) this.f6700e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C0632a d() {
        boolean z7;
        if (((InterfaceC0635d) this.f) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return new C0632a((String) this.f6698c, new HashSet((HashSet) this.f6699d), new HashSet((HashSet) this.f6700e), this.f6696a, this.f6697b, (InterfaceC0635d) this.f, (HashSet) this.f6695X);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public synchronized C1833e e(C1834f c1834f) {
        C1833e c1833e;
        try {
            ListIterator listIterator = ((LinkedList) this.f6699d).listIterator();
            while (true) {
                C1834f c1834f2 = null;
                if (!listIterator.hasNext()) {
                    return null;
                }
                c1833e = (C1833e) listIterator.next();
                if (c1833e.a() != null) {
                    c1834f2 = (C1834f) ((HashMap) this.f6695X).get(c1833e.a());
                }
                if (c1834f2 == null || c1834f2 == c1834f) {
                    break;
                }
            }
            listIterator.remove();
            return c1833e;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f6695X;
        if (i7 >= 0 && i7 < recyclerView.f8027S0.a()) {
            C c8 = recyclerView.f8027S0;
            boolean z7 = c8.f6599c;
            ArrayList arrayList = (ArrayList) this.f6698c;
            if (arrayList.size() <= 0) {
                ArrayList arrayList2 = (ArrayList) recyclerView.f8040d.f4684d;
                if (arrayList2.size() <= 0) {
                    ArrayList arrayList3 = (ArrayList) this.f6699d;
                    if (arrayList3.size() <= 0) {
                        int p02 = recyclerView.f8039c.p0(i7, 0);
                        if (p02 >= 0) {
                            throw null;
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i7 + "(offset:" + p02 + ").state:" + c8.a() + recyclerView.h());
                    }
                    arrayList3.get(0).getClass();
                    throw new ClassCastException();
                }
                RecyclerView.j((View) arrayList2.get(0));
                throw null;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        throw new IndexOutOfBoundsException("Invalid item position " + i7 + "(" + i7 + "). Item count:" + recyclerView.f8027S0.a() + recyclerView.h());
    }

    public synchronized void g(C1834f c1834f) {
        try {
            C1833e e7 = e(c1834f);
            if (e7 != null) {
                ((HashSet) this.f).add(c1834f);
                ((HashSet) this.f6700e).remove(c1834f);
                if (e7.a() != null) {
                    ((HashMap) this.f6695X).put(e7.a(), c1834f);
                }
                c1834f.f15883d.post(new RunnableC1822b(5, c1834f, e7));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void h() {
        s sVar = ((RecyclerView) this.f6695X).f8044g0;
        this.f6697b = this.f6696a;
        ArrayList arrayList = (ArrayList) this.f6699d;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.size() > this.f6697b) {
            if (arrayList.get(size) == null) {
                int[] iArr = RecyclerView.f8005c1;
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override // t5.InterfaceC1835g
    public synchronized void start() {
        for (int i7 = 0; i7 < this.f6696a; i7++) {
            C1834f c1834f = new C1834f(((String) this.f6698c) + i7, this.f6697b);
            c1834f.b(new RunnableC1822b(6, this, c1834f));
            ((HashSet) this.f6700e).add(c1834f);
        }
    }

    public y(Class cls, Class[] clsArr) {
        this.f6698c = null;
        HashSet hashSet = new HashSet();
        this.f6699d = hashSet;
        this.f6700e = new HashSet();
        this.f6696a = 0;
        this.f6697b = 0;
        this.f6695X = new HashSet();
        hashSet.add(c4.r.a(cls));
        for (Class cls2 : clsArr) {
            W.f(cls2, "Null interface");
            ((HashSet) this.f6699d).add(c4.r.a(cls2));
        }
    }

    public y(c4.r rVar, c4.r[] rVarArr) {
        this.f6698c = null;
        HashSet hashSet = new HashSet();
        this.f6699d = hashSet;
        this.f6700e = new HashSet();
        this.f6696a = 0;
        this.f6697b = 0;
        this.f6695X = new HashSet();
        hashSet.add(rVar);
        for (c4.r rVar2 : rVarArr) {
            W.f(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f6699d, rVarArr);
    }

    public y(RecyclerView recyclerView) {
        this.f6695X = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6698c = arrayList;
        this.f6699d = new ArrayList();
        this.f6700e = DesugarCollections.unmodifiableList(arrayList);
        this.f6696a = 2;
        this.f6697b = 2;
    }
}
