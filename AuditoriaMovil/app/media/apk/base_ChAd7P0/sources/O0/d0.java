package O0;

import H4.C0147a0;
import H4.C0148a1;
import H4.C0151b1;
import H4.Z0;
import H4.d1;
import H4.e1;
import a6.o0;
import android.os.Handler;
import android.os.Looper;
import b3.C0585f;
import c1.RunnableC0626c;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.N0;
import e1.AbstractC0936a;
import e1.C0953s;
import e1.C0956v;
import e1.InterfaceC0931A;
import e1.InterfaceC0958x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import p.C1608t;
import p4.C1683m;
import p4.EnumC1670A;
import t4.AbstractC1823c;
import t4.C1819G;
import t4.C1820H;
import w.C1908S;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3686a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3687b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3688c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3689d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3690e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3691g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f3692h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3693i;
    public final Object j;

    /* renamed from: k  reason: collision with root package name */
    public Object f3694k;

    /* renamed from: l  reason: collision with root package name */
    public Object f3695l;

    public d0(N n7, P0.d dVar, K0.u uVar, P0.k kVar) {
        this.f3688c = kVar;
        this.f3691g = n7;
        this.f3694k = new e1.X();
        this.f3690e = new IdentityHashMap();
        this.f3686a = new HashMap();
        this.f3689d = new ArrayList();
        this.f3693i = dVar;
        this.j = uVar;
        this.f = new HashMap();
        this.f3692h = new HashSet();
    }

    public H0.V a(int i7, ArrayList arrayList, e1.X x7) {
        if (!arrayList.isEmpty()) {
            this.f3694k = x7;
            for (int i8 = i7; i8 < arrayList.size() + i7; i8++) {
                c0 c0Var = (c0) arrayList.get(i8 - i7);
                ArrayList arrayList2 = (ArrayList) this.f3689d;
                if (i8 > 0) {
                    c0 c0Var2 = (c0) arrayList2.get(i8 - 1);
                    c0Var.f3677d = c0Var2.f3674a.f10847j0.f10826b.o() + c0Var2.f3677d;
                    c0Var.f3678e = false;
                    c0Var.f3676c.clear();
                } else {
                    c0Var.f3677d = 0;
                    c0Var.f3678e = false;
                    c0Var.f3676c.clear();
                }
                int o7 = c0Var.f3674a.f10847j0.f10826b.o();
                for (int i9 = i8; i9 < arrayList2.size(); i9++) {
                    ((c0) arrayList2.get(i9)).f3677d += o7;
                }
                arrayList2.add(i8, c0Var);
                this.f3686a.put(c0Var.f3675b, c0Var);
                if (this.f3687b) {
                    i(c0Var);
                    if (((IdentityHashMap) this.f3690e).isEmpty()) {
                        ((HashSet) this.f3692h).add(c0Var);
                    } else {
                        b0 b0Var = (b0) ((HashMap) this.f).get(c0Var);
                        if (b0Var != null) {
                            b0Var.f3669a.c(b0Var.f3670b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public H0.V b() {
        ArrayList arrayList = (ArrayList) this.f3689d;
        if (arrayList.isEmpty()) {
            return H0.V.f1738a;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c0 c0Var = (c0) arrayList.get(i8);
            c0Var.f3677d = i7;
            i7 += c0Var.f3674a.f10847j0.f10826b.o();
        }
        return new j0(arrayList, (e1.X) this.f3694k);
    }

    public void c() {
        C1819G c1819g = (C1819G) this.f3693i;
        if (c1819g.d()) {
            c1819g.a(t4.u.Initial, o0.f7173e);
        }
        C1820H c1820h = (C1820H) this.j;
        if (c1820h.d()) {
            c1820h.a(t4.u.Initial, o0.f7173e);
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f3695l;
        if (!arrayDeque.isEmpty()) {
            u4.q.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.f3694k = null;
    }

    public void d() {
        Iterator it = ((HashSet) this.f3692h).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var.f3676c.isEmpty()) {
                b0 b0Var = (b0) ((HashMap) this.f).get(c0Var);
                if (b0Var != null) {
                    b0Var.f3669a.c(b0Var.f3670b);
                }
                it.remove();
            }
        }
    }

    public void e() {
        this.f3687b = true;
        AbstractC0852m g3 = ((C1683m) this.f3690e).f15268c.g();
        C1820H c1820h = (C1820H) this.j;
        c1820h.getClass();
        g3.getClass();
        c1820h.f15777u = g3;
        if (n()) {
            p();
        } else {
            ((androidx.camera.core.impl.X) this.f3692h).d(n4.z.UNKNOWN);
        }
        f();
    }

    public void f() {
        int i7;
        C1820H c1820h;
        boolean z7;
        ArrayDeque arrayDeque = (ArrayDeque) this.f3695l;
        if (arrayDeque.isEmpty()) {
            i7 = -1;
        } else {
            i7 = ((r4.i) arrayDeque.getLast()).f15499a;
        }
        while (true) {
            boolean z8 = this.f3687b;
            c1820h = (C1820H) this.j;
            if (!z8 || arrayDeque.size() >= 10) {
                break;
            }
            r4.i d7 = ((C1683m) this.f3690e).f15268c.d(i7);
            if (d7 == null) {
                if (arrayDeque.size() == 0 && c1820h.c() && c1820h.f15789b == null) {
                    c1820h.f15789b = c1820h.f.b(c1820h.f15793g, AbstractC1823c.f15785p, c1820h.f15792e);
                }
            } else {
                if (this.f3687b && arrayDeque.size() < 10) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("addToWritePipeline called when pipeline is full", z7, new Object[0]);
                arrayDeque.add(d7);
                if (c1820h.c() && c1820h.f15776t) {
                    c1820h.j(d7.f15502d);
                }
                i7 = d7.f15499a;
            }
        }
        if (o()) {
            m5.d.i("startWriteStream() called when shouldStartWriteStream() is false.", o(), new Object[0]);
            c1820h.g();
        }
    }

    public void g(p4.Y y2) {
        Integer valueOf = Integer.valueOf(y2.f15236b);
        HashMap hashMap = this.f3686a;
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, y2);
        if (n()) {
            p();
        } else if (((C1819G) this.f3693i).c()) {
            m(y2);
        }
    }

    public void h(c0 c0Var) {
        if (c0Var.f3678e && c0Var.f3676c.isEmpty()) {
            b0 b0Var = (b0) ((HashMap) this.f).remove(c0Var);
            b0Var.getClass();
            X x7 = b0Var.f3670b;
            AbstractC0936a abstractC0936a = b0Var.f3669a;
            abstractC0936a.p(x7);
            M0.x xVar = b0Var.f3671c;
            abstractC0936a.s(xVar);
            abstractC0936a.r(xVar);
            ((HashSet) this.f3692h).remove(c0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e1.A, O0.X] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, e1.C] */
    public void i(c0 c0Var) {
        C0956v c0956v = c0Var.f3674a;
        ?? r12 = new InterfaceC0931A() { // from class: O0.X
            @Override // e1.InterfaceC0931A
            public final void a(AbstractC0936a abstractC0936a, H0.V v6) {
                K0.u uVar = ((N) d0.this.f3691g).f3576Y;
                uVar.d(2);
                uVar.e(22);
            }
        };
        M0.x xVar = new M0.x(6, this, c0Var);
        ((HashMap) this.f).put(c0Var, new b0(c0956v, r12, xVar));
        int i7 = K0.x.f2529a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0956v.getClass();
        T0.d dVar = c0956v.f10773c;
        dVar.getClass();
        ?? obj = new Object();
        obj.f10620a = handler;
        obj.f10621b = xVar;
        dVar.f5289c.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        T0.d dVar2 = c0956v.f10774d;
        dVar2.getClass();
        ?? obj2 = new Object();
        obj2.f5286a = xVar;
        dVar2.f5289c.add(obj2);
        c0956v.l(r12, (M0.C) this.f3695l, (P0.k) this.f3688c);
    }

    public void j(InterfaceC0958x interfaceC0958x) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f3690e;
        c0 c0Var = (c0) identityHashMap.remove(interfaceC0958x);
        c0Var.getClass();
        c0Var.f3674a.o(interfaceC0958x);
        c0Var.f3676c.remove(((C0953s) interfaceC0958x).f10835a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        h(c0Var);
    }

    public void k(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            ArrayList arrayList = (ArrayList) this.f3689d;
            c0 c0Var = (c0) arrayList.remove(i9);
            this.f3686a.remove(c0Var.f3675b);
            int i10 = -c0Var.f3674a.f10847j0.f10826b.o();
            for (int i11 = i9; i11 < arrayList.size(); i11++) {
                ((c0) arrayList.get(i11)).f3677d += i10;
            }
            c0Var.f3678e = true;
            if (this.f3687b) {
                h(c0Var);
            }
        }
    }

    public void l(int i7) {
        ((C1908S) this.f3694k).b(i7).f15855a++;
        C1819G c1819g = (C1819G) this.f3693i;
        m5.d.i("Unwatching targets requires an open stream", c1819g.c(), new Object[0]);
        H4.Y A7 = C0147a0.A();
        A7.d();
        C0147a0.w((C0147a0) A7.f10006b, (String) c1819g.f15773s.f14881c);
        A7.d();
        C0147a0.y((C0147a0) A7.f10006b, i7);
        c1819g.i((C0147a0) A7.b());
    }

    public void m(p4.Y y2) {
        String str;
        ((C1908S) this.f3694k).b(y2.f15236b).f15855a++;
        if (!y2.f15240g.isEmpty() || y2.f15239e.compareTo(q4.q.f15370b) > 0) {
            y2 = new p4.Y(y2.f15235a, y2.f15236b, y2.f15237c, y2.f15238d, y2.f15239e, y2.f, y2.f15240g, Integer.valueOf(((C0585f) this.f3689d).H(y2.f15236b).f10876a.size()));
        }
        C1819G c1819g = (C1819G) this.f3693i;
        m5.d.i("Watching queries requires an open stream", c1819g.c(), new Object[0]);
        H4.Y A7 = C0147a0.A();
        C1608t c1608t = c1819g.f15773s;
        A7.d();
        C0147a0.w((C0147a0) A7.f10006b, (String) c1608t.f14881c);
        Z0 B7 = e1.B();
        n4.L l8 = y2.f15235a;
        if (l8.f()) {
            C0148a1 z7 = C0151b1.z();
            String Y3 = C1608t.Y((q4.f) c1608t.f14880b, l8.f14306d);
            z7.d();
            C0151b1.v((C0151b1) z7.f10006b, Y3);
            B7.d();
            e1.w((e1) B7.f10006b, (C0151b1) z7.b());
        } else {
            d1 X7 = c1608t.X(l8);
            B7.d();
            e1.v((e1) B7.f10006b, X7);
        }
        B7.d();
        e1.z((e1) B7.f10006b, y2.f15236b);
        AbstractC0852m abstractC0852m = y2.f15240g;
        boolean isEmpty = abstractC0852m.isEmpty();
        q4.q qVar = y2.f15239e;
        if (isEmpty && qVar.compareTo(q4.q.f15370b) > 0) {
            N0 Z6 = C1608t.Z(qVar.f15371a);
            B7.d();
            e1.y((e1) B7.f10006b, Z6);
        } else {
            B7.d();
            e1.x((e1) B7.f10006b, abstractC0852m);
        }
        Integer num = y2.f15241h;
        if (num != null && (!abstractC0852m.isEmpty() || qVar.compareTo(q4.q.f15370b) > 0)) {
            com.google.protobuf.L y3 = com.google.protobuf.M.y();
            int intValue = num.intValue();
            y3.d();
            com.google.protobuf.M.v((com.google.protobuf.M) y3.f10006b, intValue);
            B7.d();
            e1.A((e1) B7.f10006b, (com.google.protobuf.M) y3.b());
        }
        A7.d();
        C0147a0.x((C0147a0) A7.f10006b, (e1) B7.b());
        int[] iArr = t4.r.f15839d;
        EnumC1670A enumC1670A = y2.f15238d;
        int i7 = iArr[enumC1670A.ordinal()];
        HashMap hashMap = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        str = "limbo-document";
                    } else {
                        m5.d.g("Unrecognized query purpose: %s", enumC1670A);
                        throw null;
                    }
                } else {
                    str = "existence-filter-mismatch-bloom";
                }
            } else {
                str = "existence-filter-mismatch";
            }
        } else {
            str = null;
        }
        if (str != null) {
            hashMap = new HashMap(1);
            hashMap.put("goog-listen-tags", str);
        }
        if (hashMap != null) {
            A7.d();
            C0147a0.v((C0147a0) A7.f10006b).putAll(hashMap);
        }
        c1819g.i((C0147a0) A7.b());
    }

    public boolean n() {
        if (this.f3687b && !((C1819G) this.f3693i).d() && !this.f3686a.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f3687b && !((C1820H) this.j).d() && !((ArrayDeque) this.f3695l).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w.S] */
    public void p() {
        boolean z7;
        m5.d.i("startWatchStream() called when shouldStartWatchStream() is false.", n(), new Object[0]);
        ?? obj = new Object();
        obj.f16113b = new HashMap();
        obj.f16114c = new HashMap();
        obj.f16115d = new HashMap();
        obj.f16116e = new HashMap();
        obj.f = (q4.f) this.f3688c;
        obj.f16112a = this;
        this.f3694k = obj;
        ((C1819G) this.f3693i).g();
        androidx.camera.core.impl.X x7 = (androidx.camera.core.impl.X) this.f3692h;
        if (x7.f7589a == 0) {
            x7.c(n4.z.UNKNOWN);
            if (((p4.P) x7.f7592d) == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            m5.d.i("onlineStateTimer shouldn't be started yet", z7, new Object[0]);
            x7.f7592d = ((u4.e) x7.f7593e).b(u4.d.ONLINE_STATE_TIMEOUT, 10000L, new RunnableC0626c(x7, 18));
        }
    }

    public void q(int i7) {
        boolean z7;
        HashMap hashMap = this.f3686a;
        if (((p4.Y) hashMap.remove(Integer.valueOf(i7))) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("stopListening called on target no currently watched: %d", z7, Integer.valueOf(i7));
        C1819G c1819g = (C1819G) this.f3693i;
        if (c1819g.c()) {
            l(i7);
        }
        if (hashMap.isEmpty()) {
            if (c1819g.c()) {
                if (c1819g.c() && c1819g.f15789b == null) {
                    c1819g.f15789b = c1819g.f.b(c1819g.f15793g, AbstractC1823c.f15785p, c1819g.f15792e);
                }
            } else if (this.f3687b) {
                ((androidx.camera.core.impl.X) this.f3692h).d(n4.z.UNKNOWN);
            }
        }
    }

    public d0(q4.f fVar, C0585f c0585f, C1683m c1683m, t4.i iVar, u4.e eVar, E.e eVar2) {
        this.f3687b = false;
        this.f3688c = fVar;
        this.f3689d = c0585f;
        this.f3690e = c1683m;
        this.f = iVar;
        this.f3691g = eVar2;
        this.f3686a = new HashMap();
        this.f3695l = new ArrayDeque();
        this.f3692h = new androidx.camera.core.impl.X(eVar, new X5.E(c0585f, 21));
        t4.s sVar = new t4.s(this);
        iVar.getClass();
        this.f3693i = new C1819G(iVar.f15806c, iVar.f15805b, iVar.f15804a, sVar);
        t4.t tVar = new t4.t(this);
        this.j = new C1820H(iVar.f15806c, iVar.f15805b, iVar.f15804a, tVar);
        p4.H h8 = new p4.H(2, this, eVar);
        synchronized (((ArrayList) eVar2.f923e)) {
            ((ArrayList) eVar2.f923e).add(h8);
        }
    }
}
