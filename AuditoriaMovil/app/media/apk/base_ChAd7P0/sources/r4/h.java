package r4;

import H4.p1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final q4.h f15496a;

    /* renamed from: b  reason: collision with root package name */
    public final m f15497b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15498c;

    public h(q4.h hVar, m mVar) {
        this(hVar, mVar, new ArrayList());
    }

    public static h c(q4.n nVar, f fVar) {
        if (nVar.c()) {
            if (fVar == null || !fVar.f15493a.isEmpty()) {
                q4.h hVar = nVar.f15362a;
                if (fVar == null) {
                    if (nVar.e()) {
                        return new h(hVar, m.f15508c);
                    }
                    return new o(hVar, nVar.f15366e, m.f15508c, new ArrayList());
                }
                q4.o oVar = nVar.f15366e;
                q4.o oVar2 = new q4.o();
                HashSet hashSet = new HashSet();
                Iterator it = fVar.f15493a.iterator();
                while (it.hasNext()) {
                    q4.k kVar = (q4.k) it.next();
                    if (!hashSet.contains(kVar)) {
                        if (oVar.f(kVar) == null && kVar.f15351a.size() > 1) {
                            kVar = (q4.k) kVar.k();
                        }
                        oVar2.g(oVar.f(kVar), kVar);
                        hashSet.add(kVar);
                    }
                }
                return new l(hVar, oVar2, new f(hashSet), m.f15508c);
            }
            return null;
        }
        return null;
    }

    public abstract f a(q4.n nVar, f fVar, U3.p pVar);

    public abstract void b(q4.n nVar, j jVar);

    public abstract f d();

    public final boolean e(h hVar) {
        if (this.f15496a.equals(hVar.f15496a) && this.f15497b.equals(hVar.f15497b)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f15497b.hashCode() + (this.f15496a.f15357a.hashCode() * 31);
    }

    public final String g() {
        return "key=" + this.f15496a + ", precondition=" + this.f15497b;
    }

    public final HashMap h(U3.p pVar, q4.n nVar) {
        List<g> list = this.f15498c;
        HashMap hashMap = new HashMap(list.size());
        for (g gVar : list) {
            p pVar2 = gVar.f15495b;
            q4.o oVar = nVar.f15366e;
            q4.k kVar = gVar.f15494a;
            hashMap.put(kVar, pVar2.c(oVar.f(kVar), pVar));
        }
        return hashMap;
    }

    public final HashMap i(q4.n nVar, ArrayList arrayList) {
        boolean z7;
        List list = this.f15498c;
        HashMap hashMap = new HashMap(list.size());
        if (list.size() == arrayList.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("server transform count (%d) should match field transform count (%d)", z7, Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g gVar = (g) list.get(i7);
            p pVar = gVar.f15495b;
            q4.o oVar = nVar.f15366e;
            q4.k kVar = gVar.f15494a;
            hashMap.put(kVar, pVar.b(oVar.f(kVar), (p1) arrayList.get(i7)));
        }
        return hashMap;
    }

    public final void j(q4.n nVar) {
        m5.d.i("Can only apply a mutation to a document with the same key", nVar.f15362a.equals(this.f15496a), new Object[0]);
    }

    public h(q4.h hVar, m mVar, List list) {
        this.f15496a = hVar;
        this.f15497b = mVar;
        this.f15498c = list;
    }
}
