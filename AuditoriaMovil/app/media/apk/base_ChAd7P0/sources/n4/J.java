package n4;

import O0.RunnableC0240b;
import O0.d0;
import a6.n0;
import a6.o0;
import a6.t0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import l4.C1422f;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
import p4.AbstractC1684n;
import p4.C1673c;
import p4.C1683m;
import p4.C1685o;
import p4.EnumC1670A;
import p4.RunnableC1682l;
import p4.Y;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final C1683m f14291a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f14292b;

    /* renamed from: l  reason: collision with root package name */
    public C1422f f14300l;

    /* renamed from: m  reason: collision with root package name */
    public E.e f14301m;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14293c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f14294d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f14295e = new LinkedHashSet();
    public final HashMap f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f14296g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final C1608t f14297h = new C1608t(4);

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f14298i = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public final B5.L f14299k = new B5.L(1, 1);
    public final HashMap j = new HashMap();

    public J(C1683m c1683m, d0 d0Var, C1422f c1422f) {
        this.f14291a = c1683m;
        this.f14292b = d0Var;
        this.f14300l = c1422f;
    }

    public static void e(o0 o0Var, String str, Object... objArr) {
        n0 n0Var = o0Var.f7183a;
        String str2 = o0Var.f7184b;
        if (str2 == null) {
            str2 = StringUtils.EMPTY;
        }
        if ((n0Var == n0.FAILED_PRECONDITION && str2.contains("requires an index")) || n0Var == n0.PERMISSION_DENIED) {
            u4.q.d("Firestore", "%s: %s", String.format(str, objArr), o0Var);
        }
    }

    public final void a(String str) {
        boolean z7;
        if (this.f14301m != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Trying to call %s before setting callback", z7, str);
    }

    public final void b(e4.c cVar, F3.o oVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f14293c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C1683m c1683m = this.f14291a;
            if (hasNext) {
                F f = (F) ((Map.Entry) it.next()).getValue();
                C5.e eVar = f.f14287c;
                t4.w wVar = null;
                K5.d e7 = eVar.e(cVar, null);
                boolean z7 = false;
                if (e7.f2698b) {
                    e7 = eVar.e((e4.c) c1683m.b(f.f14285a, false).f14880b, e7);
                }
                int i7 = f.f14286b;
                if (oVar != null) {
                    wVar = (t4.w) ((Map) oVar.f1179c).get(Integer.valueOf(i7));
                }
                if (oVar != null) {
                    if (((Map) oVar.f1180d).get(Integer.valueOf(i7)) != null) {
                        z7 = true;
                    }
                }
                t0 b5 = f.f14287c.b(e7, wVar, z7);
                l(i7, (List) b5.f7210c);
                T t7 = (T) b5.f7209b;
                if (t7 != null) {
                    arrayList.add(t7);
                    ArrayList arrayList3 = new ArrayList();
                    K1.d dVar = q4.h.f15355b;
                    e4.e eVar2 = new e4.e(arrayList3, dVar);
                    e4.e eVar3 = new e4.e(new ArrayList(), dVar);
                    Iterator it2 = t7.f14324d.iterator();
                    while (it2.hasNext()) {
                        C1521g c1521g = (C1521g) it2.next();
                        int i8 = AbstractC1684n.f15277a[c1521g.f14338a.ordinal()];
                        q4.n nVar = c1521g.f14339b;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                eVar3 = eVar3.e(nVar.f15362a);
                            }
                        } else {
                            eVar2 = eVar2.e(nVar.f15362a);
                        }
                    }
                    arrayList2.add(new C1685o(i7, t7.f14325e, eVar2, eVar3));
                }
            } else {
                this.f14301m.S(arrayList);
                c1683m.f15266a.G("notifyLocalViewChanges", new RunnableC1682l(c1683m, arrayList2, 0));
                return;
            }
        }
    }

    public final void c(F3.o oVar) {
        boolean z7;
        a("handleRemoteEvent");
        for (Map.Entry entry : ((Map) oVar.f1179c).entrySet()) {
            t4.w wVar = (t4.w) entry.getValue();
            I i7 = (I) this.f14296g.get((Integer) entry.getKey());
            if (i7 != null) {
                int size = wVar.f15851c.f10876a.size();
                e4.e eVar = wVar.f15852d;
                int size2 = eVar.f10876a.size() + size;
                e4.e eVar2 = wVar.f15853e;
                if (eVar2.f10876a.size() + size2 <= 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("Limbo resolution for single document contains multiple changes.", z7, new Object[0]);
                if (wVar.f15851c.f10876a.size() > 0) {
                    i7.f14290b = true;
                } else if (eVar.f10876a.size() > 0) {
                    m5.d.i("Received change for limbo target document without add.", i7.f14290b, new Object[0]);
                } else if (eVar2.f10876a.size() > 0) {
                    m5.d.i("Received remove for limbo target document without add.", i7.f14290b, new Object[0]);
                    i7.f14290b = false;
                }
            }
        }
        C1683m c1683m = this.f14291a;
        b((e4.c) c1683m.f15266a.F("Apply remote event", new M.b(c1683m, oVar, (q4.q) oVar.f1178b, 4)), oVar);
    }

    public final int d(D d7, boolean z7) {
        boolean z8;
        a("listen");
        HashMap hashMap = this.f14293c;
        m5.d.i("We already listen to query: %s", !hashMap.containsKey(d7), d7);
        L i7 = d7.i();
        C1683m c1683m = this.f14291a;
        Y a7 = c1683m.a(i7);
        int i8 = a7.f15236b;
        C1608t b5 = c1683m.b(d7, true);
        S s7 = S.NONE;
        HashMap hashMap2 = this.f14294d;
        if (hashMap2.get(Integer.valueOf(i8)) != null) {
            s7 = (S) ((F) hashMap.get((D) ((List) hashMap2.get(Integer.valueOf(i8))).get(0))).f14287c.f579c;
        }
        if (s7 == S.SYNCED) {
            z8 = true;
        } else {
            z8 = false;
        }
        e4.e eVar = q4.h.f15356c;
        t4.w wVar = new t4.w(a7.f15240g, z8, eVar, eVar, eVar);
        C5.e eVar2 = new C5.e(d7, (e4.e) b5.f14881c);
        t0 b7 = eVar2.b(eVar2.e((e4.c) b5.f14880b, null), wVar, false);
        l(i8, (List) b7.f7210c);
        hashMap.put(d7, new F(d7, i8, eVar2));
        if (!hashMap2.containsKey(Integer.valueOf(i8))) {
            hashMap2.put(Integer.valueOf(i8), new ArrayList(1));
        }
        ((List) hashMap2.get(Integer.valueOf(i8))).add(d7);
        this.f14301m.S(Collections.singletonList((T) b7.f7209b));
        if (z7) {
            this.f14292b.g(a7);
        }
        return a7.f15236b;
    }

    public final void f(int i7, o0 o0Var) {
        Map map = (Map) this.f14298i.get(this.f14300l);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i7);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(valueOf);
            if (taskCompletionSource != null) {
                if (o0Var != null) {
                    taskCompletionSource.setException(u4.u.h(o0Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(valueOf);
            }
        }
    }

    public final void g() {
        while (true) {
            LinkedHashSet linkedHashSet = this.f14295e;
            if (!linkedHashSet.isEmpty()) {
                HashMap hashMap = this.f;
                if (hashMap.size() < 100) {
                    Iterator it = linkedHashSet.iterator();
                    q4.h hVar = (q4.h) it.next();
                    it.remove();
                    B5.L l8 = this.f14299k;
                    int i7 = l8.f327a;
                    l8.f327a = i7 + 2;
                    this.f14296g.put(Integer.valueOf(i7), new I(hVar));
                    hashMap.put(hVar, Integer.valueOf(i7));
                    this.f14292b.g(new Y(new D(hVar.f15357a, null).i(), i7, -1L, EnumC1670A.LIMBO_RESOLUTION));
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void h(int i7, o0 o0Var) {
        HashMap hashMap = this.f14294d;
        for (D d7 : (List) hashMap.get(Integer.valueOf(i7))) {
            this.f14293c.remove(d7);
            if (!o0Var.e()) {
                HashMap hashMap2 = (HashMap) this.f14301m.f921c;
                C1526l c1526l = (C1526l) hashMap2.get(d7);
                if (c1526l != null) {
                    Iterator it = c1526l.f14346a.iterator();
                    while (it.hasNext()) {
                        ((E) it.next()).f14282c.a(null, u4.u.h(o0Var));
                    }
                }
                hashMap2.remove(d7);
                e(o0Var, "Listen for %s failed", d7);
            }
        }
        hashMap.remove(Integer.valueOf(i7));
        C1608t c1608t = this.f14297h;
        e4.e m02 = c1608t.m0(i7);
        c1608t.o0(i7);
        Iterator it2 = m02.iterator();
        while (true) {
            e4.d dVar = (e4.d) it2;
            if (((Iterator) dVar.f10875b).hasNext()) {
                q4.h hVar = (q4.h) dVar.next();
                if (!c1608t.v(hVar)) {
                    i(hVar);
                }
            } else {
                return;
            }
        }
    }

    public final void i(q4.h hVar) {
        this.f14295e.remove(hVar);
        HashMap hashMap = this.f;
        Integer num = (Integer) hashMap.get(hVar);
        if (num != null) {
            this.f14292b.q(num.intValue());
            hashMap.remove(hVar);
            this.f14296g.remove(num);
            g();
        }
    }

    public final void j(int i7) {
        HashMap hashMap = this.j;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            for (TaskCompletionSource taskCompletionSource : (List) hashMap.get(Integer.valueOf(i7))) {
                taskCompletionSource.setResult(null);
            }
            hashMap.remove(Integer.valueOf(i7));
        }
    }

    public final void k(D d7, boolean z7) {
        boolean z8;
        a("stopListening");
        HashMap hashMap = this.f14293c;
        F f = (F) hashMap.get(d7);
        if (f != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        m5.d.i("Trying to stop listening to a query not found", z8, new Object[0]);
        hashMap.remove(d7);
        int i7 = f.f14286b;
        List list = (List) this.f14294d.get(Integer.valueOf(i7));
        list.remove(d7);
        if (list.isEmpty()) {
            C1683m c1683m = this.f14291a;
            c1683m.f15266a.G("Release target", new RunnableC0240b(c1683m, i7, 2));
            if (z7) {
                this.f14292b.q(i7);
            }
            h(i7, o0.f7173e);
        }
    }

    public final void l(int i7, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            int i8 = H.f14288a[xVar.f14372a.ordinal()];
            C1608t c1608t = this.f14297h;
            q4.h hVar = xVar.f14373b;
            if (i8 != 1) {
                if (i8 == 2) {
                    u4.q.a("J", "Document no longer in limbo: %s", hVar);
                    c1608t.getClass();
                    C1673c c1673c = new C1673c(hVar, i7);
                    c1608t.f14880b = ((e4.e) c1608t.f14880b).h(c1673c);
                    c1608t.f14881c = ((e4.e) c1608t.f14881c).h(c1673c);
                    if (!c1608t.v(hVar)) {
                        i(hVar);
                    }
                } else {
                    m5.d.g("Unknown limbo change type: %s", xVar.f14372a);
                    throw null;
                }
            } else {
                c1608t.getClass();
                C1673c c1673c2 = new C1673c(hVar, i7);
                c1608t.f14880b = ((e4.e) c1608t.f14880b).e(c1673c2);
                c1608t.f14881c = ((e4.e) c1608t.f14881c).e(c1673c2);
                if (!this.f.containsKey(hVar)) {
                    LinkedHashSet linkedHashSet = this.f14295e;
                    if (!linkedHashSet.contains(hVar)) {
                        u4.q.a("J", "New document in limbo: %s", hVar);
                        linkedHashSet.add(hVar);
                        g();
                    }
                }
            }
        }
    }
}
