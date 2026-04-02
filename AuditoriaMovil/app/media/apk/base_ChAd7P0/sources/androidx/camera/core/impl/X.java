package androidx.camera.core.impl;

import D.AbstractC0059i;
import a1.C0415A;
import b3.C0585f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import n4.C1526l;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public int f7589a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7590b;

    /* renamed from: c  reason: collision with root package name */
    public Object f7591c;

    /* renamed from: d  reason: collision with root package name */
    public Object f7592d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7593e;
    public final Object f;

    public X(c0 c0Var) {
        this.f7591c = new Object();
        this.f7589a = 0;
        this.f7590b = false;
        this.f7593e = new HashMap();
        this.f = new CopyOnWriteArraySet();
        this.f7592d = new AtomicReference(c0Var);
    }

    public H.k a() {
        Object obj = ((AtomicReference) this.f7592d).get();
        if (obj instanceof AbstractC0504f) {
            ((AbstractC0504f) obj).getClass();
            return new H.k(null, 1);
        }
        return H.i.c(obj);
    }

    public void b(String str) {
        String M7 = AbstractC0059i.M("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (this.f7590b) {
            u4.q.d("OnlineStateTracker", "%s", M7);
            this.f7590b = false;
            return;
        }
        u4.q.a("OnlineStateTracker", "%s", M7);
    }

    public void c(n4.z zVar) {
        boolean z7;
        a6.t0 t0Var;
        if (zVar != ((n4.z) this.f7591c)) {
            this.f7591c = zVar;
            n4.J e7 = ((n4.y) ((C0585f) ((X5.E) this.f).f6409b).f8171b).e();
            e7.a("handleOnlineStateChange");
            ArrayList arrayList = new ArrayList();
            Iterator it = e7.f14293c.entrySet().iterator();
            while (true) {
                z7 = false;
                if (!it.hasNext()) {
                    break;
                }
                C5.e eVar = ((n4.F) ((Map.Entry) it.next()).getValue()).f14287c;
                if (eVar.f577a && zVar == n4.z.OFFLINE) {
                    eVar.f577a = false;
                    t0Var = eVar.b(new K5.d((q4.i) eVar.f580d, new C0415A(16), (e4.e) eVar.f582g, false, 4), null, false);
                } else {
                    t0Var = new a6.t0(29, (Object) null, Collections.emptyList());
                }
                m5.d.i("OnlineState should not affect limbo documents.", ((List) t0Var.f7210c).isEmpty(), new Object[0]);
                n4.T t7 = (n4.T) t0Var.f7209b;
                if (t7 != null) {
                    arrayList.add(t7);
                }
            }
            e7.f14301m.S(arrayList);
            E.e eVar2 = e7.f14301m;
            eVar2.f923e = zVar;
            for (C1526l c1526l : ((HashMap) eVar2.f921c).values()) {
                Iterator it2 = c1526l.f14346a.iterator();
                while (it2.hasNext()) {
                    n4.E e8 = (n4.E) it2.next();
                    e8.f14284e = zVar;
                    n4.T t8 = e8.f;
                    if (t8 != null && !e8.f14283d && e8.d(t8, zVar)) {
                        e8.c(e8.f);
                        z7 = true;
                    }
                }
            }
            if (z7) {
                eVar2.W();
            }
        }
    }

    public void d(n4.z zVar) {
        p4.P p7 = (p4.P) this.f7592d;
        if (p7 != null) {
            p7.b();
            this.f7592d = null;
        }
        this.f7589a = 0;
        if (zVar == n4.z.ONLINE) {
            this.f7590b = false;
        }
        c(zVar);
    }

    public X(u4.e eVar, X5.E e7) {
        this.f7593e = eVar;
        this.f = e7;
        this.f7591c = n4.z.UNKNOWN;
        this.f7590b = true;
    }
}
