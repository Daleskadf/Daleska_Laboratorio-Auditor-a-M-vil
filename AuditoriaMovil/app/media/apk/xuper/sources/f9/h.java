package f9;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.hpplay.sdk.source.common.global.Constant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y8.a;
import y8.k1;
import y8.o0;
import y8.p;
import y8.q;
import y8.x;
/* loaded from: classes3.dex */
public final class h extends o0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a.c f13403h = a.c.a("state-info");

    /* renamed from: i  reason: collision with root package name */
    public static final k1 f13404i = k1.f19889f.r("no subchannels ready");

    /* renamed from: c  reason: collision with root package name */
    public final o0.d f13405c;

    /* renamed from: f  reason: collision with root package name */
    public p f13408f;

    /* renamed from: d  reason: collision with root package name */
    public final Map f13406d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public e f13409g = new b(f13404i);

    /* renamed from: e  reason: collision with root package name */
    public final Random f13407e = new Random();

    /* loaded from: classes3.dex */
    public class a implements o0.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o0.h f13410a;

        public a(o0.h hVar) {
            this.f13410a = hVar;
        }

        @Override // y8.o0.j
        public void a(q qVar) {
            h.this.k(this.f13410a, qVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final k1 f13412a;

        public b(k1 k1Var) {
            super(null);
            this.f13412a = (k1) Preconditions.checkNotNull(k1Var, Constant.KEY_STATUS);
        }

        @Override // y8.o0.i
        public o0.e a(o0.f fVar) {
            if (this.f13412a.p()) {
                return o0.e.g();
            }
            return o0.e.f(this.f13412a);
        }

        @Override // f9.h.e
        public boolean b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (Objects.equal(this.f13412a, bVar.f13412a) || (this.f13412a.p() && bVar.f13412a.p())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return MoreObjects.toStringHelper((Class<?>) b.class).add(Constant.KEY_STATUS, this.f13412a).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends e {

        /* renamed from: c  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f13413c = AtomicIntegerFieldUpdater.newUpdater(c.class, c8.b.f5629b);

        /* renamed from: a  reason: collision with root package name */
        public final List f13414a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f13415b;

        public c(List list, int i10) {
            super(null);
            Preconditions.checkArgument(!list.isEmpty(), "empty list");
            this.f13414a = list;
            this.f13415b = i10 - 1;
        }

        @Override // y8.o0.i
        public o0.e a(o0.f fVar) {
            return o0.e.h(c());
        }

        @Override // f9.h.e
        public boolean b(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            if (cVar != this && (this.f13414a.size() != cVar.f13414a.size() || !new HashSet(this.f13414a).containsAll(cVar.f13414a))) {
                return false;
            }
            return true;
        }

        public final o0.h c() {
            int size = this.f13414a.size();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13413c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i10 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i10);
                incrementAndGet = i10;
            }
            return (o0.h) this.f13414a.get(incrementAndGet);
        }

        public String toString() {
            return MoreObjects.toStringHelper((Class<?>) c.class).add("list", this.f13414a).toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public Object f13416a;

        public d(Object obj) {
            this.f13416a = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class e extends o0.i {
        public e() {
        }

        public abstract boolean b(e eVar);

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public h(o0.d dVar) {
        this.f13405c = (o0.d) Preconditions.checkNotNull(dVar, "helper");
    }

    public static List g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o0.h hVar = (o0.h) it.next();
            if (j(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static d h(o0.h hVar) {
        return (d) Preconditions.checkNotNull((d) hVar.c().b(f13403h), "STATE_INFO");
    }

    public static boolean j(o0.h hVar) {
        if (((q) h(hVar).f13416a).c() == p.READY) {
            return true;
        }
        return false;
    }

    public static Set l(Set set, Set set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static Map n(List list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            hashMap.put(o(xVar), xVar);
        }
        return hashMap;
    }

    public static x o(x xVar) {
        return new x(xVar.a());
    }

    @Override // y8.o0
    public boolean a(o0.g gVar) {
        if (gVar.a().isEmpty()) {
            k1 k1Var = k1.f19904u;
            c(k1Var.r("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        List a10 = gVar.a();
        Set keySet = this.f13406d.keySet();
        Map n10 = n(a10);
        Set<x> l10 = l(keySet, n10.keySet());
        for (Map.Entry entry : n10.entrySet()) {
            x xVar = (x) entry.getKey();
            x xVar2 = (x) entry.getValue();
            o0.h hVar = (o0.h) this.f13406d.get(xVar);
            if (hVar != null) {
                hVar.h(Collections.singletonList(xVar2));
            } else {
                o0.h hVar2 = (o0.h) Preconditions.checkNotNull(this.f13405c.a(o0.b.c().e(xVar2).f(y8.a.c().d(f13403h, new d(q.a(p.IDLE))).a()).b()), "subchannel");
                hVar2.g(new a(hVar2));
                this.f13406d.put(xVar, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (x xVar3 : l10) {
            arrayList.add((o0.h) this.f13406d.remove(xVar3));
        }
        p();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m((o0.h) it.next());
        }
        return true;
    }

    @Override // y8.o0
    public void c(k1 k1Var) {
        if (this.f13408f != p.READY) {
            q(p.TRANSIENT_FAILURE, new b(k1Var));
        }
    }

    @Override // y8.o0
    public void e() {
        for (o0.h hVar : i()) {
            m(hVar);
        }
        this.f13406d.clear();
    }

    public Collection i() {
        return this.f13406d.values();
    }

    public final void k(o0.h hVar, q qVar) {
        if (this.f13406d.get(o(hVar.a())) != hVar) {
            return;
        }
        p c10 = qVar.c();
        p pVar = p.TRANSIENT_FAILURE;
        if (c10 == pVar || qVar.c() == p.IDLE) {
            this.f13405c.e();
        }
        p c11 = qVar.c();
        p pVar2 = p.IDLE;
        if (c11 == pVar2) {
            hVar.e();
        }
        d h10 = h(hVar);
        if (((q) h10.f13416a).c().equals(pVar) && (qVar.c().equals(p.CONNECTING) || qVar.c().equals(pVar2))) {
            return;
        }
        h10.f13416a = qVar;
        p();
    }

    public final void m(o0.h hVar) {
        hVar.f();
        h(hVar).f13416a = q.a(p.SHUTDOWN);
    }

    public final void p() {
        p pVar;
        List g10 = g(i());
        if (g10.isEmpty()) {
            k1 k1Var = f13404i;
            boolean z10 = false;
            for (o0.h hVar : i()) {
                q qVar = (q) h(hVar).f13416a;
                z10 = (qVar.c() == p.CONNECTING || qVar.c() == p.IDLE) ? true : true;
                if (k1Var == f13404i || !k1Var.p()) {
                    k1Var = qVar.d();
                }
            }
            if (z10) {
                pVar = p.CONNECTING;
            } else {
                pVar = p.TRANSIENT_FAILURE;
            }
            q(pVar, new b(k1Var));
            return;
        }
        q(p.READY, new c(g10, this.f13407e.nextInt(g10.size())));
    }

    public final void q(p pVar, e eVar) {
        if (pVar != this.f13408f || !eVar.b(this.f13409g)) {
            this.f13405c.f(pVar, eVar);
            this.f13408f = pVar;
            this.f13409g = eVar;
        }
    }
}
