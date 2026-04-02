package e1;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: e1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0936a {

    /* renamed from: X  reason: collision with root package name */
    public P0.k f10770X;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10771a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f10772b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final T0.d f10773c = new T0.d(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: d  reason: collision with root package name */
    public final T0.d f10774d = new T0.d(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e  reason: collision with root package name */
    public Looper f10775e;
    public H0.V f;

    public final T0.d a(C0960z c0960z) {
        return new T0.d(this.f10773c.f5289c, 0, c0960z);
    }

    public abstract InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j);

    public final void c(InterfaceC0931A interfaceC0931A) {
        HashSet hashSet = this.f10772b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC0931A);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(InterfaceC0931A interfaceC0931A) {
        this.f10775e.getClass();
        HashSet hashSet = this.f10772b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC0931A);
        if (isEmpty) {
            f();
        }
    }

    public H0.V g() {
        return null;
    }

    public abstract H0.C h();

    public boolean i() {
        return true;
    }

    public abstract void k();

    public final void l(InterfaceC0931A interfaceC0931A, M0.C c8, P0.k kVar) {
        boolean z7;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f10775e;
        if (looper != null && looper != myLooper) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.e(z7);
        this.f10770X = kVar;
        H0.V v6 = this.f;
        this.f10771a.add(interfaceC0931A);
        if (this.f10775e == null) {
            this.f10775e = myLooper;
            this.f10772b.add(interfaceC0931A);
            m(c8);
        } else if (v6 != null) {
            e(interfaceC0931A);
            interfaceC0931A.a(this, v6);
        }
    }

    public abstract void m(M0.C c8);

    public final void n(H0.V v6) {
        this.f = v6;
        Iterator it = this.f10771a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0931A) it.next()).a(this, v6);
        }
    }

    public abstract void o(InterfaceC0958x interfaceC0958x);

    public final void p(InterfaceC0931A interfaceC0931A) {
        ArrayList arrayList = this.f10771a;
        arrayList.remove(interfaceC0931A);
        if (arrayList.isEmpty()) {
            this.f10775e = null;
            this.f = null;
            this.f10770X = null;
            this.f10772b.clear();
            q();
            return;
        }
        c(interfaceC0931A);
    }

    public abstract void q();

    public final void r(T0.e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10774d.f5289c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            T0.c cVar = (T0.c) it.next();
            if (cVar.f5286a == eVar) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
    }

    public final void s(InterfaceC0934D interfaceC0934D) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10773c.f5289c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            if (c0933c.f10621b == interfaceC0934D) {
                copyOnWriteArrayList.remove(c0933c);
            }
        }
    }

    public abstract void t(H0.C c8);

    public void d() {
    }

    public void f() {
    }
}
