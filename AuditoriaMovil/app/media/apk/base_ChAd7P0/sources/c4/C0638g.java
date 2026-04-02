package c4;

import D.RunnableC0053c;
import H4.W;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k4.C1395a;
import k4.InterfaceC1396b;
import k4.InterfaceC1397c;
import w4.InterfaceC1956b;
/* renamed from: c4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638g implements InterfaceC0633b {

    /* renamed from: h  reason: collision with root package name */
    public static final C0637f f8385h = new C0637f(0);

    /* renamed from: e  reason: collision with root package name */
    public final l f8390e;

    /* renamed from: g  reason: collision with root package name */
    public final InterfaceC0636e f8391g;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8386a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8387b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8388c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f8389d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public C0638g(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC0636e interfaceC0636e) {
        l lVar = new l(executor);
        this.f8390e = lVar;
        this.f8391g = interfaceC0636e;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0632a.c(lVar, l.class, InterfaceC1397c.class, InterfaceC1396b.class));
        arrayList3.add(C0632a.c(this, C0638g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0632a c0632a = (C0632a) it.next();
            if (c0632a != null) {
                arrayList3.add(c0632a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1956b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f8391g.b(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e7) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C0632a) it4.next()).f8376b.toArray();
                int length = array.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Object obj = array[i7];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f8389d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f8389d.add(obj.toString());
                        }
                        i7++;
                    }
                }
            }
            if (this.f8386a.isEmpty()) {
                G.i.w(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f8386a.keySet());
                arrayList6.addAll(arrayList3);
                G.i.w(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C0632a c0632a2 = (C0632a) it5.next();
                this.f8386a.put(c0632a2, new n(new U3.d(1, this, c0632a2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            h(this.f8386a, bool.booleanValue());
        }
    }

    @Override // c4.InterfaceC0633b
    public final Object a(Class cls) {
        return b(r.a(cls));
    }

    @Override // c4.InterfaceC0633b
    public final Object b(r rVar) {
        InterfaceC1956b f = f(rVar);
        if (f == null) {
            return null;
        }
        return f.get();
    }

    @Override // c4.InterfaceC0633b
    public final p c(r rVar) {
        InterfaceC1956b f = f(rVar);
        if (f == null) {
            return new p(p.f8408c, p.f8409d);
        }
        if (f instanceof p) {
            return (p) f;
        }
        return new p(null, f);
    }

    @Override // c4.InterfaceC0633b
    public final Set d(r rVar) {
        InterfaceC1956b interfaceC1956b;
        synchronized (this) {
            interfaceC1956b = (o) this.f8388c.get(rVar);
            if (interfaceC1956b == null) {
                interfaceC1956b = f8385h;
            }
        }
        return (Set) interfaceC1956b.get();
    }

    @Override // c4.InterfaceC0633b
    public final InterfaceC1956b e(Class cls) {
        return f(r.a(cls));
    }

    @Override // c4.InterfaceC0633b
    public final synchronized InterfaceC1956b f(r rVar) {
        W.f(rVar, "Null interface requested.");
        return (InterfaceC1956b) this.f8387b.get(rVar);
    }

    @Override // c4.InterfaceC0633b
    public final p g(Class cls) {
        return c(r.a(cls));
    }

    public final void h(HashMap hashMap, boolean z7) {
        ArrayDeque<C1395a> arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            InterfaceC1956b interfaceC1956b = (InterfaceC1956b) entry.getValue();
            int i7 = ((C0632a) entry.getKey()).f8378d;
            if (i7 == 1 || (i7 == 2 && z7)) {
                interfaceC1956b.get();
            }
        }
        l lVar = this.f8390e;
        synchronized (lVar) {
            arrayDeque = lVar.f8401b;
            if (arrayDeque != null) {
                lVar.f8401b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (C1395a c1395a : arrayDeque) {
                lVar.a(c1395a);
            }
        }
    }

    public final void i(boolean z7) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f;
        Boolean valueOf = Boolean.valueOf(z7);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f8386a);
        }
        h(hashMap, z7);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, c4.o] */
    public final void j() {
        boolean z7;
        for (C0632a c0632a : this.f8386a.keySet()) {
            for (j jVar : c0632a.f8377c) {
                if (jVar.f8398b == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                r rVar = jVar.f8397a;
                if (z7) {
                    HashMap hashMap = this.f8388c;
                    if (!hashMap.containsKey(rVar)) {
                        Set emptySet = Collections.emptySet();
                        ?? obj = new Object();
                        obj.f8407b = null;
                        obj.f8406a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f8406a.addAll(emptySet);
                        hashMap.put(rVar, obj);
                    }
                }
                HashMap hashMap2 = this.f8387b;
                if (hashMap2.containsKey(rVar)) {
                    continue;
                } else {
                    int i7 = jVar.f8398b;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            hashMap2.put(rVar, new p(p.f8408c, p.f8409d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + c0632a + ": " + rVar);
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0632a c0632a = (C0632a) it.next();
            if (c0632a.f8379e == 0) {
                InterfaceC1956b interfaceC1956b = (InterfaceC1956b) this.f8386a.get(c0632a);
                for (r rVar : c0632a.f8376b) {
                    HashMap hashMap = this.f8387b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, interfaceC1956b);
                    } else {
                        arrayList2.add(new RunnableC0053c(27, (p) ((InterfaceC1956b) hashMap.get(rVar)), interfaceC1956b));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, c4.o] */
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8386a.entrySet()) {
            C0632a c0632a = (C0632a) entry.getKey();
            if (c0632a.f8379e != 0) {
                InterfaceC1956b interfaceC1956b = (InterfaceC1956b) entry.getValue();
                for (r rVar : c0632a.f8376b) {
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, new HashSet());
                    }
                    ((Set) hashMap.get(rVar)).add(interfaceC1956b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f8388c;
            if (!hashMap2.containsKey(key)) {
                ?? obj = new Object();
                obj.f8407b = null;
                obj.f8406a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f8406a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap2.get(entry2.getKey());
                for (InterfaceC1956b interfaceC1956b2 : (Set) entry2.getValue()) {
                    arrayList.add(new RunnableC0053c(28, oVar, interfaceC1956b2));
                }
            }
        }
        return arrayList;
    }
}
