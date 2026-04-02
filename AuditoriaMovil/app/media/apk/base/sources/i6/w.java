package i6;

import A3.I;
import A3.K;
import a6.AbstractC0478g;
import a6.C0472a;
import a6.C0473b;
import a6.C0493w;
import a6.EnumC0486o;
import a6.M;
import a6.N;
import a6.O;
import a6.Q;
import a6.o0;
import a6.t0;
import c6.C1;
import c6.L0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class w extends Q {

    /* renamed from: m  reason: collision with root package name */
    public static final Logger f11569m = Logger.getLogger(w.class.getName());

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC0478g f11570g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11571h;
    public EnumC0486o j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f11573k;

    /* renamed from: l  reason: collision with root package name */
    public O f11574l;
    public final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final C1 f11572i = new C1();

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, a6.O] */
    public w(AbstractC0478g abstractC0478g) {
        this.f11570g = abstractC0478g;
        f11569m.log(Level.FINE, "Created");
        this.f11573k = new AtomicInteger(new Random().nextInt());
        this.f11574l = new Object();
    }

    @Override // a6.Q
    public final o0 a(N n7) {
        try {
            this.f11571h = true;
            t0 g3 = g(n7);
            o0 o0Var = (o0) g3.f7209b;
            if (!o0Var.e()) {
                return o0Var;
            }
            j();
            Iterator it = ((ArrayList) g3.f7210c).iterator();
            while (it.hasNext()) {
                C1122i c1122i = (C1122i) it.next();
                c1122i.f11523b.f();
                c1122i.f11525d = EnumC0486o.SHUTDOWN;
                f11569m.log(Level.FINE, "Child balancer {0} deleted", c1122i.f11522a);
            }
            return o0Var;
        } finally {
            this.f11571h = false;
        }
    }

    @Override // a6.Q
    public final void c(o0 o0Var) {
        if (this.j != EnumC0486o.READY) {
            this.f11570g.r(EnumC0486o.TRANSIENT_FAILURE, new L0(M.a(o0Var)));
        }
    }

    @Override // a6.Q
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f11569m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f;
        for (C1122i c1122i : linkedHashMap.values()) {
            c1122i.f11523b.f();
            c1122i.f11525d = EnumC0486o.SHUTDOWN;
            logger.log(Level.FINE, "Child balancer {0} deleted", c1122i.f11522a);
        }
        linkedHashMap.clear();
    }

    public final t0 g(N n7) {
        LinkedHashMap linkedHashMap;
        C1123j c1123j;
        C0493w c0493w;
        Level level = Level.FINE;
        Logger logger = f11569m;
        logger.log(level, "Received resolution result: {0}", n7);
        HashMap hashMap = new HashMap();
        List list = n7.f7096a;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.f;
            if (!hasNext) {
                break;
            }
            C1123j c1123j2 = new C1123j((C0493w) it.next());
            C1122i c1122i = (C1122i) linkedHashMap.get(c1123j2);
            if (c1122i != null) {
                hashMap.put(c1123j2, c1122i);
            } else {
                hashMap.put(c1123j2, new C1122i(this, c1123j2, this.f11572i, new L0(M.f7091e)));
            }
        }
        if (hashMap.isEmpty()) {
            o0 g3 = o0.f7180n.g("NameResolver returned no usable address. " + n7);
            c(g3);
            return new t0(18, g3, (Object) null);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            C1 c12 = ((C1122i) entry.getValue()).f11524c;
            ((C1122i) entry.getValue()).getClass();
            if (!linkedHashMap.containsKey(key)) {
                linkedHashMap.put(key, (C1122i) entry.getValue());
            } else {
                C1122i c1122i2 = (C1122i) linkedHashMap.get(key);
                if (c1122i2.f) {
                    c1122i2.f = false;
                }
            }
            C1122i c1122i3 = (C1122i) linkedHashMap.get(key);
            if (key instanceof C0493w) {
                c1123j = new C1123j((C0493w) key);
            } else {
                G.i.f("key is wrong type", key instanceof C1123j);
                c1123j = (C1123j) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c0493w = (C0493w) it2.next();
                    if (c1123j.equals(new C1123j(c0493w))) {
                        break;
                    }
                } else {
                    c0493w = null;
                    break;
                }
            }
            G.i.j(c0493w, key + " no longer present in load balancer children");
            C0473b c0473b = C0473b.f7115b;
            List singletonList = Collections.singletonList(c0493w);
            C0473b c0473b2 = C0473b.f7115b;
            C0472a c0472a = Q.f7102e;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(c0472a, bool);
            for (Map.Entry entry2 : c0473b2.f7116a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((C0472a) entry2.getKey(), entry2.getValue());
                }
            }
            N n8 = new N(singletonList, new C0473b(identityHashMap), null);
            ((C1122i) linkedHashMap.get(key)).getClass();
            if (!c1122i3.f) {
                c1122i3.f11523b.d(n8);
            }
        }
        ArrayList arrayList = new ArrayList();
        I listIterator = K.p(linkedHashMap.keySet()).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (!hashMap.containsKey(next)) {
                C1122i c1122i4 = (C1122i) linkedHashMap.get(next);
                if (!c1122i4.f) {
                    LinkedHashMap linkedHashMap2 = c1122i4.f11527g.f;
                    C1123j c1123j3 = c1122i4.f11522a;
                    linkedHashMap2.remove(c1123j3);
                    c1122i4.f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", c1123j3);
                }
                arrayList.add(c1122i4);
            }
        }
        return new t0(18, o0.f7173e, arrayList);
    }

    public final C1135v h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1122i) it.next()).f11526e);
        }
        return new C1135v(arrayList, this.f11573k);
    }

    public final void i(EnumC0486o enumC0486o, O o7) {
        if (enumC0486o != this.j || !o7.equals(this.f11574l)) {
            this.f11570g.r(enumC0486o, o7);
            this.j = enumC0486o;
            this.f11574l = o7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, a6.O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap r1 = r6.f
            java.util.Collection r2 = r1.values()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            i6.i r3 = (i6.C1122i) r3
            boolean r4 = r3.f
            if (r4 != 0) goto Lf
            a6.o r4 = r3.f11525d
            a6.o r5 = a6.EnumC0486o.READY
            if (r4 != r5) goto Lf
            r0.add(r3)
            goto Lf
        L29:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L64
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r0.next()
            i6.i r2 = (i6.C1122i) r2
            a6.o r2 = r2.f11525d
            a6.o r3 = a6.EnumC0486o.CONNECTING
            if (r2 == r3) goto L4d
            a6.o r4 = a6.EnumC0486o.IDLE
            if (r2 != r4) goto L37
        L4d:
            i6.u r0 = new i6.u
            r0.<init>()
            r6.i(r3, r0)
            goto L6d
        L56:
            a6.o r0 = a6.EnumC0486o.TRANSIENT_FAILURE
            java.util.Collection r1 = r1.values()
            i6.v r1 = r6.h(r1)
            r6.i(r0, r1)
            goto L6d
        L64:
            a6.o r1 = a6.EnumC0486o.READY
            i6.v r0 = r6.h(r0)
            r6.i(r1, r0)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.w.j():void");
    }
}
