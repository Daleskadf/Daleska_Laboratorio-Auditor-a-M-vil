package androidx.lifecycle;

import D.AbstractC0059i;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import q.C1705a;
import r.C1716a;
import r.C1718c;
/* renamed from: androidx.lifecycle.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570w extends AbstractC0564p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7944a;

    /* renamed from: b  reason: collision with root package name */
    public C1716a f7945b;

    /* renamed from: c  reason: collision with root package name */
    public EnumC0563o f7946c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f7947d;

    /* renamed from: e  reason: collision with root package name */
    public int f7948e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7949g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f7950h;

    /* renamed from: i  reason: collision with root package name */
    public final I6.s f7951i;

    public C0570w(InterfaceC0568u interfaceC0568u) {
        new AtomicReference(null);
        this.f7944a = true;
        this.f7945b = new C1716a();
        EnumC0563o enumC0563o = EnumC0563o.INITIALIZED;
        this.f7946c = enumC0563o;
        this.f7950h = new ArrayList();
        this.f7947d = new WeakReference(interfaceC0568u);
        this.f7951i = new I6.s(enumC0563o == null ? J6.l.f2445a : enumC0563o);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.v, java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC0564p
    public final void a(InterfaceC0567t observer) {
        InterfaceC0566s c0554f;
        InterfaceC0568u interfaceC0568u;
        ArrayList arrayList = this.f7950h;
        Object obj = null;
        kotlin.jvm.internal.j.e(observer, "observer");
        d("addObserver");
        EnumC0563o enumC0563o = this.f7946c;
        EnumC0563o initialState = EnumC0563o.DESTROYED;
        if (enumC0563o != initialState) {
            initialState = EnumC0563o.INITIALIZED;
        }
        kotlin.jvm.internal.j.e(initialState, "initialState");
        ?? obj2 = new Object();
        HashMap hashMap = AbstractC0571x.f7952a;
        boolean z7 = observer instanceof InterfaceC0566s;
        boolean z8 = observer instanceof DefaultLifecycleObserver;
        boolean z9 = false;
        if (z7 && z8) {
            c0554f = new C0554f((DefaultLifecycleObserver) observer, (InterfaceC0566s) observer);
        } else if (z8) {
            c0554f = new C0554f((DefaultLifecycleObserver) observer, (InterfaceC0566s) null);
        } else if (z7) {
            c0554f = (InterfaceC0566s) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC0571x.b(cls) == 2) {
                Object obj3 = AbstractC0571x.f7953b.get(cls);
                kotlin.jvm.internal.j.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0556h[] interfaceC0556hArr = new InterfaceC0556h[size];
                    if (size <= 0) {
                        c0554f = new Z1.b(interfaceC0556hArr, 1);
                    } else {
                        AbstractC0571x.a((Constructor) list.get(0), observer);
                        throw null;
                    }
                } else {
                    AbstractC0571x.a((Constructor) list.get(0), observer);
                    throw null;
                }
            } else {
                c0554f = new C0554f(observer);
            }
        }
        obj2.f7943b = c0554f;
        obj2.f7942a = initialState;
        C1716a c1716a = this.f7945b;
        C1718c e7 = c1716a.e(observer);
        if (e7 != null) {
            obj = e7.f15400b;
        } else {
            HashMap hashMap2 = c1716a.f15395e;
            C1718c c1718c = new C1718c(observer, obj2);
            c1716a.f15409d++;
            C1718c c1718c2 = c1716a.f15407b;
            if (c1718c2 == null) {
                c1716a.f15406a = c1718c;
                c1716a.f15407b = c1718c;
            } else {
                c1718c2.f15401c = c1718c;
                c1718c.f15402d = c1718c2;
                c1716a.f15407b = c1718c;
            }
            hashMap2.put(observer, c1718c);
        }
        if (((C0569v) obj) != null || (interfaceC0568u = (InterfaceC0568u) this.f7947d.get()) == null) {
            return;
        }
        if (this.f7948e != 0 || this.f) {
            z9 = true;
        }
        EnumC0563o c8 = c(observer);
        this.f7948e++;
        while (obj2.f7942a.compareTo(c8) < 0 && this.f7945b.f15395e.containsKey(observer)) {
            arrayList.add(obj2.f7942a);
            C0560l c0560l = EnumC0562n.Companion;
            EnumC0563o enumC0563o2 = obj2.f7942a;
            c0560l.getClass();
            EnumC0562n a7 = C0560l.a(enumC0563o2);
            if (a7 != null) {
                obj2.a(interfaceC0568u, a7);
                arrayList.remove(arrayList.size() - 1);
                c8 = c(observer);
            } else {
                throw new IllegalStateException("no event up from " + obj2.f7942a);
            }
        }
        if (!z9) {
            h();
        }
        this.f7948e--;
    }

    @Override // androidx.lifecycle.AbstractC0564p
    public final void b(InterfaceC0567t observer) {
        kotlin.jvm.internal.j.e(observer, "observer");
        d("removeObserver");
        this.f7945b.f(observer);
    }

    public final EnumC0563o c(InterfaceC0567t interfaceC0567t) {
        C1718c c1718c;
        EnumC0563o enumC0563o;
        C0569v c0569v;
        HashMap hashMap = this.f7945b.f15395e;
        EnumC0563o enumC0563o2 = null;
        if (hashMap.containsKey(interfaceC0567t)) {
            c1718c = ((C1718c) hashMap.get(interfaceC0567t)).f15402d;
        } else {
            c1718c = null;
        }
        if (c1718c != null && (c0569v = (C0569v) c1718c.f15400b) != null) {
            enumC0563o = c0569v.f7942a;
        } else {
            enumC0563o = null;
        }
        ArrayList arrayList = this.f7950h;
        if (!arrayList.isEmpty()) {
            enumC0563o2 = (EnumC0563o) arrayList.get(arrayList.size() - 1);
        }
        EnumC0563o state1 = this.f7946c;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (enumC0563o == null || enumC0563o.compareTo(state1) >= 0) {
            enumC0563o = state1;
        }
        if (enumC0563o2 == null || enumC0563o2.compareTo(enumC0563o) >= 0) {
            return enumC0563o;
        }
        return enumC0563o2;
    }

    public final void d(String str) {
        if (this.f7944a) {
            C1705a.j0().f15318a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0059i.M("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0562n event) {
        kotlin.jvm.internal.j.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0563o enumC0563o) {
        EnumC0563o enumC0563o2 = this.f7946c;
        if (enumC0563o2 == enumC0563o) {
            return;
        }
        if (enumC0563o2 == EnumC0563o.INITIALIZED && enumC0563o == EnumC0563o.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0563o + ", but was " + this.f7946c + " in component " + this.f7947d.get()).toString());
        }
        this.f7946c = enumC0563o;
        if (!this.f && this.f7948e == 0) {
            this.f = true;
            h();
            this.f = false;
            if (this.f7946c == EnumC0563o.DESTROYED) {
                this.f7945b = new C1716a();
                return;
            }
            return;
        }
        this.f7949g = true;
    }

    public final void g(EnumC0563o state) {
        kotlin.jvm.internal.j.e(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        r9.f7949g = false;
        r0 = r9.f7946c;
        r1 = r9.f7951i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = J6.l.f2445a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1.F(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0570w.h():void");
    }
}
