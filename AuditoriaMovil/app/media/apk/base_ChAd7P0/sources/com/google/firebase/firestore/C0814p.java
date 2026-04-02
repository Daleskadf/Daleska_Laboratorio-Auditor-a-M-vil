package com.google.firebase.firestore;

import D.AbstractC0055e;
import D.C0054d;
import H4.p1;
import b3.C0585f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l4.C1418b;
import n4.C1516b;
import n4.C1523i;
import n4.C1533t;
/* renamed from: com.google.firebase.firestore.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814p {

    /* renamed from: a  reason: collision with root package name */
    public final q4.h f9838a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f9839b;

    public C0814p(q4.h hVar, FirebaseFirestore firebaseFirestore) {
        hVar.getClass();
        this.f9838a = hVar;
        this.f9839b = firebaseFirestore;
    }

    public final C0813o a(Executor executor, C1523i c1523i, InterfaceC0816s interfaceC0816s) {
        C0813o c0813o;
        C1516b c1516b = new C1516b(executor, new Q5.a(2, this, interfaceC0816s));
        n4.D d7 = new n4.D(this.f9838a.f15357a, null);
        R1.j jVar = this.f9839b.f9754k;
        synchronized (jVar) {
            jVar.n0();
            C1533t c1533t = (C1533t) jVar.f4683c;
            c0813o = new C0813o(c1516b, c1533t, c1533t.b(d7, c1523i, c1516b), 0);
        }
        return c0813o;
    }

    public final Task b() {
        Task f;
        List singletonList = Collections.singletonList(new r4.h(this.f9838a, r4.m.f15508c));
        R1.j jVar = this.f9839b.f9754k;
        synchronized (jVar) {
            jVar.n0();
            f = ((C1533t) jVar.f4683c).f(singletonList);
        }
        return f.continueWith(u4.k.f16005b, u4.u.f16019a);
    }

    public final Task c(n0 n0Var) {
        Task continueWith;
        if (n0Var == n0.CACHE) {
            R1.j jVar = this.f9839b.f9754k;
            synchronized (jVar) {
                jVar.n0();
                C1533t c1533t = (C1533t) jVar.f4683c;
                c1533t.e();
                continueWith = c1533t.f14363d.f15988a.a(new n4.r(0, c1533t, this.f9838a)).continueWith(new C1418b(3));
            }
            return continueWith.continueWith(u4.k.f16005b, new X5.E(this, 6));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C1523i c1523i = new C1523i();
        c1523i.f14342a = true;
        c1523i.f14343b = true;
        c1523i.f14344c = true;
        taskCompletionSource2.setResult(a(u4.k.f16005b, c1523i, new C0812n(taskCompletionSource, taskCompletionSource2, n0Var, 0)));
        return taskCompletionSource.getTask();
    }

    public final String d() {
        return this.f9838a.f15357a.c();
    }

    public final Task e(Object obj, l0 l0Var) {
        n4.O P7;
        Task f;
        AbstractC0055e.b(obj, "Provided data must not be null.");
        AbstractC0055e.b(l0Var, "Provided options must not be null.");
        if (l0Var.f9826a) {
            P7 = this.f9839b.f9752h.N(obj, l0Var.f9827b);
        } else {
            P7 = this.f9839b.f9752h.P(obj);
        }
        List singletonList = Collections.singletonList(P7.a(this.f9838a, r4.m.f15508c));
        R1.j jVar = this.f9839b.f9754k;
        synchronized (jVar) {
            jVar.n0();
            f = ((C1533t) jVar.f4683c).f(singletonList);
        }
        return f.continueWith(u4.k.f16005b, u4.u.f16019a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0814p)) {
            return false;
        }
        C0814p c0814p = (C0814p) obj;
        if (this.f9838a.equals(c0814p.f9838a) && this.f9839b.equals(c0814p.f9839b)) {
            return true;
        }
        return false;
    }

    public final Task f(C0818u c0818u, Object obj, Object... objArr) {
        boolean z7;
        Task f;
        boolean z8;
        q4.k kVar;
        C0585f c0585f = this.f9839b.f9752h;
        C1418b c1418b = u4.u.f16019a;
        if (objArr.length % 2 != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c0818u);
            arrayList.add(obj);
            Collections.addAll(arrayList, objArr);
            for (int i7 = 0; i7 < arrayList.size(); i7 += 2) {
                Object obj2 = arrayList.get(i7);
                if (!(obj2 instanceof String) && !(obj2 instanceof C0818u)) {
                    throw new IllegalArgumentException("Excepted field name at argument position " + (i7 + 2) + " but got " + obj2 + " in call to update.  The arguments to update should alternate between field names and values");
                }
            }
            if (arrayList.size() % 2 == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            m5.d.i("Expected fieldAndValues to contain an even number of elements", z7, new Object[0]);
            R1.j jVar = new R1.j(n4.P.Update);
            C0054d Q02 = jVar.Q0();
            q4.o oVar = new q4.o();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object next2 = it.next();
                boolean z9 = next instanceof String;
                if (!z9 && !(next instanceof C0818u)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                m5.d.i("Expected argument to be String or FieldPath.", z8, new Object[0]);
                if (z9) {
                    kVar = C0818u.a((String) next).f9851a;
                } else {
                    kVar = ((C0818u) next).f9851a;
                }
                if (next2 instanceof C0821x) {
                    Q02.a(kVar);
                } else {
                    p1 C7 = c0585f.C(next2, Q02.f(kVar));
                    if (C7 != null) {
                        Q02.a(kVar);
                        oVar.g(C7, kVar);
                    }
                }
            }
            List singletonList = Collections.singletonList(new r4.l(this.f9838a, oVar, new r4.f((HashSet) jVar.f4683c), r4.m.a(true), DesugarCollections.unmodifiableList((ArrayList) jVar.f4684d)));
            R1.j jVar2 = this.f9839b.f9754k;
            synchronized (jVar2) {
                jVar2.n0();
                f = ((C1533t) jVar2.f4683c).f(singletonList);
            }
            return f.continueWith(u4.k.f16005b, u4.u.f16019a);
        }
        throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
    }

    public final int hashCode() {
        return this.f9839b.hashCode() + (this.f9838a.f15357a.hashCode() * 31);
    }
}
