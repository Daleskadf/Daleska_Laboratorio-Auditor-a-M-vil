package r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class l extends h {

    /* renamed from: d  reason: collision with root package name */
    public final q4.o f15506d;

    /* renamed from: e  reason: collision with root package name */
    public final f f15507e;

    public l(q4.h hVar, q4.o oVar, f fVar, m mVar) {
        this(hVar, oVar, fVar, mVar, new ArrayList());
    }

    @Override // r4.h
    public final f a(q4.n nVar, f fVar, U3.p pVar) {
        j(nVar);
        if (!this.f15497b.b(nVar)) {
            return fVar;
        }
        HashMap h8 = h(pVar, nVar);
        HashMap k2 = k();
        q4.o oVar = nVar.f15366e;
        oVar.h(k2);
        oVar.h(h8);
        nVar.a(nVar.f15364c, nVar.f15366e);
        nVar.f = q4.l.HAS_LOCAL_MUTATIONS;
        nVar.f15364c = q4.q.f15370b;
        if (fVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(fVar.f15493a);
        hashSet.addAll(this.f15507e.f15493a);
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f15498c) {
            arrayList.add(gVar.f15494a);
        }
        hashSet.addAll(arrayList);
        return new f(hashSet);
    }

    @Override // r4.h
    public final void b(q4.n nVar, j jVar) {
        j(nVar);
        if (!this.f15497b.b(nVar)) {
            nVar.f15364c = jVar.f15503a;
            nVar.f15363b = q4.m.UNKNOWN_DOCUMENT;
            nVar.f15366e = new q4.o();
            nVar.f = q4.l.HAS_COMMITTED_MUTATIONS;
            return;
        }
        HashMap i7 = i(nVar, jVar.f15504b);
        q4.o oVar = nVar.f15366e;
        oVar.h(k());
        oVar.h(i7);
        nVar.a(jVar.f15503a, nVar.f15366e);
        nVar.f = q4.l.HAS_COMMITTED_MUTATIONS;
    }

    @Override // r4.h
    public final f d() {
        return this.f15507e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (e(lVar) && this.f15506d.equals(lVar.f15506d) && this.f15498c.equals(lVar.f15498c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15506d.hashCode() + (f() * 31);
    }

    public final HashMap k() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f15507e.f15493a.iterator();
        while (it.hasNext()) {
            q4.k kVar = (q4.k) it.next();
            if (!kVar.h()) {
                hashMap.put(kVar, this.f15506d.f(kVar));
            }
        }
        return hashMap;
    }

    public final String toString() {
        return "PatchMutation{" + g() + ", mask=" + this.f15507e + ", value=" + this.f15506d + "}";
    }

    public l(q4.h hVar, q4.o oVar, f fVar, m mVar, List list) {
        super(hVar, mVar, list);
        this.f15506d = oVar;
        this.f15507e = fVar;
    }
}
