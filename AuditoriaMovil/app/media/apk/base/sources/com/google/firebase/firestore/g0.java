package com.google.firebase.firestore;

import D.AbstractC0055e;
import D.AbstractC0059i;
import H4.C0158f;
import H4.C0160g;
import H4.n1;
import H4.p1;
import b3.C0585f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l4.C1418b;
import n4.AbstractC1530p;
import n4.C1513B;
import n4.C1516b;
import n4.C1517c;
import n4.C1519e;
import n4.C1523i;
import n4.C1529o;
import n4.C1533t;
import n4.EnumC1512A;
import n4.EnumC1514C;
import n4.EnumC1528n;
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final n4.D f9808a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f9809b;

    public g0(n4.D d7, FirebaseFirestore firebaseFirestore) {
        this.f9808a = d7;
        firebaseFirestore.getClass();
        this.f9809b = firebaseFirestore;
    }

    public static void i(Object obj, EnumC1528n enumC1528n) {
        if ((obj instanceof List) && ((List) obj).size() != 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + enumC1528n.toString() + "' filters.");
    }

    public final C0813o a(Executor executor, C1523i c1523i, InterfaceC0816s interfaceC0816s) {
        C0813o c0813o;
        n4.D d7 = this.f9808a;
        if (d7.f14278i.equals(EnumC1514C.LIMIT_TO_LAST) && d7.f14271a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        C1516b c1516b = new C1516b(executor, new Q5.a(3, this, interfaceC0816s));
        R1.j jVar = this.f9809b.f9754k;
        synchronized (jVar) {
            jVar.n0();
            C1533t c1533t = (C1533t) jVar.f4683c;
            c0813o = new C0813o(c1516b, c1533t, c1533t.b(this.f9808a, c1523i, c1516b), 1);
        }
        return c0813o;
    }

    public final C1517c b(String str, boolean z7, Object[] objArr) {
        n4.D d7 = this.f9808a;
        int length = objArr.length;
        List list = d7.f14271a;
        if (length <= list.size()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < objArr.length; i7++) {
                Object obj = objArr[i7];
                boolean equals = ((C1513B) list.get(i7)).f14268b.equals(q4.k.f15360b);
                FirebaseFirestore firebaseFirestore = this.f9809b;
                if (equals) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (d7.f14276g != null || !str2.contains("/")) {
                            q4.p pVar = (q4.p) d7.f.b(q4.p.l(str2));
                            if (q4.h.e(pVar)) {
                                arrayList.add(q4.s.k(firebaseFirestore.f9748c, new q4.h(pVar)));
                            } else {
                                throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + pVar + "' is not because it contains an odd number of segments.");
                            }
                        } else {
                            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.j("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to ", str, "() must be a plain document ID, but '", str2, "' contains a slash."));
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                    }
                } else {
                    arrayList.add(firebaseFirestore.f9752h.O(obj, false));
                }
            }
            return new C1517c(arrayList, z7);
        }
        throw new IllegalArgumentException(AbstractC0059i.M("Too many arguments provided to ", str, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."));
    }

    public final Task c(n0 n0Var) {
        Task a7;
        n4.D d7 = this.f9808a;
        if (d7.f14278i.equals(EnumC1514C.LIMIT_TO_LAST) && d7.f14271a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        if (n0Var == n0.CACHE) {
            R1.j jVar = this.f9809b.f9754k;
            synchronized (jVar) {
                jVar.n0();
                C1533t c1533t = (C1533t) jVar.f4683c;
                c1533t.e();
                a7 = c1533t.f14363d.f15988a.a(new n4.r(1, c1533t, this.f9808a));
            }
            return a7.continueWith(u4.k.f16005b, new X5.E(this, 7));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C1523i c1523i = new C1523i();
        c1523i.f14342a = true;
        c1523i.f14343b = true;
        c1523i.f14344c = true;
        taskCompletionSource2.setResult(a(u4.k.f16005b, c1523i, new C0812n(taskCompletionSource, taskCompletionSource2, n0Var, 1)));
        return taskCompletionSource.getTask();
    }

    public final g0 d(long j) {
        if (j > 0) {
            return new g0(this.f9808a.f(j), this.f9809b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j + ") is invalid. Limit must be positive.");
    }

    public final g0 e(long j) {
        if (j > 0) {
            EnumC1514C enumC1514C = EnumC1514C.LIMIT_TO_LAST;
            n4.D d7 = this.f9808a;
            C1517c c1517c = d7.j;
            return new g0(new n4.D(d7.f, d7.f14276g, d7.f14275e, d7.f14271a, j, enumC1514C, c1517c, d7.f14279k), this.f9809b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j + ") is invalid. Limit must be positive.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f9808a.equals(g0Var.f9808a) && this.f9809b.equals(g0Var.f9809b)) {
            return true;
        }
        return false;
    }

    public final g0 f(C0818u c0818u, f0 f0Var) {
        EnumC1512A enumC1512A;
        AbstractC0055e.b(c0818u, "Provided field path must not be null.");
        AbstractC0055e.b(f0Var, "Provided direction must not be null.");
        n4.D d7 = this.f9808a;
        if (d7.j == null) {
            if (d7.f14279k == null) {
                if (f0Var == f0.ASCENDING) {
                    enumC1512A = EnumC1512A.ASCENDING;
                } else {
                    enumC1512A = EnumC1512A.DESCENDING;
                }
                C1513B c1513b = new C1513B(enumC1512A, c0818u.f9851a);
                m5.d.i("No ordering is allowed for document query", !d7.e(), new Object[0]);
                ArrayList arrayList = new ArrayList(d7.f14271a);
                arrayList.add(c1513b);
                return new g0(new n4.D(d7.f, d7.f14276g, d7.f14275e, arrayList, d7.f14277h, d7.f14278i, d7.j, d7.f14279k), this.f9809b);
            }
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
    }

    public final p1 g(Object obj) {
        String name;
        boolean z7 = obj instanceof String;
        FirebaseFirestore firebaseFirestore = this.f9809b;
        if (z7) {
            String str = (String) obj;
            if (!str.isEmpty()) {
                n4.D d7 = this.f9808a;
                if (d7.f14276g != null || !str.contains("/")) {
                    q4.p pVar = (q4.p) d7.f.b(q4.p.l(str));
                    if (q4.h.e(pVar)) {
                        return q4.s.k(firebaseFirestore.f9748c, new q4.h(pVar));
                    }
                    throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + pVar + "' is not because it has an odd number of segments (" + pVar.f15351a.size() + ").");
                }
                throw new IllegalArgumentException(AbstractC0059i.M("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", str, "' contains a '/' character."));
            }
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        } else if (obj instanceof C0814p) {
            return q4.s.k(firebaseFirestore.f9748c, ((C0814p) obj).f9838a);
        } else {
            C1418b c1418b = u4.u.f16019a;
            if (obj == null) {
                name = "null";
            } else {
                name = obj.getClass().getName();
            }
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: ".concat(name));
        }
    }

    public final AbstractC1530p h(D d7) {
        boolean z7;
        p1 O7;
        boolean z8 = d7 instanceof C;
        boolean z9 = true;
        if (!z8 && !(d7 instanceof B)) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", z7, new Object[0]);
        if (z8) {
            C c8 = (C) d7;
            C0818u c0818u = c8.f9741a;
            AbstractC0055e.b(c0818u, "Provided field path must not be null.");
            EnumC1528n enumC1528n = c8.f9742b;
            AbstractC0055e.b(enumC1528n, "Provided op must not be null.");
            q4.k kVar = q4.k.f15360b;
            q4.k kVar2 = c0818u.f9851a;
            boolean equals = kVar2.equals(kVar);
            Object obj = c8.f9743c;
            if (equals) {
                if (enumC1528n != EnumC1528n.ARRAY_CONTAINS && enumC1528n != EnumC1528n.ARRAY_CONTAINS_ANY) {
                    if (enumC1528n != EnumC1528n.IN && enumC1528n != EnumC1528n.NOT_IN) {
                        O7 = g(obj);
                    } else {
                        i(obj, enumC1528n);
                        C0158f B7 = C0160g.B();
                        for (Object obj2 : (List) obj) {
                            p1 g3 = g(obj2);
                            B7.d();
                            C0160g.v((C0160g) B7.f10006b, g3);
                        }
                        n1 T7 = p1.T();
                        T7.f(B7);
                        O7 = (p1) T7.b();
                    }
                } else {
                    throw new IllegalArgumentException("Invalid query. You can't perform '" + enumC1528n.toString() + "' queries on FieldPath.documentId().");
                }
            } else {
                EnumC1528n enumC1528n2 = EnumC1528n.IN;
                if (enumC1528n == enumC1528n2 || enumC1528n == EnumC1528n.NOT_IN || enumC1528n == EnumC1528n.ARRAY_CONTAINS_ANY) {
                    i(obj, enumC1528n);
                }
                C0585f c0585f = this.f9809b.f9752h;
                if (enumC1528n != enumC1528n2 && enumC1528n != EnumC1528n.NOT_IN) {
                    z9 = false;
                }
                O7 = c0585f.O(obj, z9);
            }
            return C1529o.e(kVar2, enumC1528n, O7);
        }
        B b5 = (B) d7;
        ArrayList arrayList = new ArrayList();
        for (D d8 : b5.f9739a) {
            AbstractC1530p h8 = h(d8);
            if (!h8.b().isEmpty()) {
                arrayList.add(h8);
            }
        }
        if (arrayList.size() == 1) {
            return (AbstractC1530p) arrayList.get(0);
        }
        return new C1519e(arrayList, b5.f9740b);
    }

    public final int hashCode() {
        return this.f9809b.hashCode() + (this.f9808a.hashCode() * 31);
    }

    public final g0 j(D d7) {
        List asList;
        EnumC1528n enumC1528n;
        int i7 = 4;
        AbstractC1530p h8 = h(d7);
        if (h8.b().isEmpty()) {
            return this;
        }
        n4.D d8 = this.f9808a;
        n4.D d9 = d8;
        for (C1529o c1529o : h8.c()) {
            EnumC1528n enumC1528n2 = c1529o.f14349a;
            int i8 = e0.f9805a[enumC1528n2.ordinal()];
            if (i8 != 1) {
                if (i8 != 2 && i8 != 3) {
                    if (i8 != i7) {
                        asList = new ArrayList();
                    } else {
                        EnumC1528n[] enumC1528nArr = new EnumC1528n[i7];
                        enumC1528nArr[0] = EnumC1528n.ARRAY_CONTAINS_ANY;
                        enumC1528nArr[1] = EnumC1528n.IN;
                        enumC1528nArr[2] = EnumC1528n.NOT_IN;
                        enumC1528nArr[3] = EnumC1528n.NOT_EQUAL;
                        asList = Arrays.asList(enumC1528nArr);
                    }
                } else {
                    asList = Arrays.asList(EnumC1528n.NOT_IN);
                }
            } else {
                asList = Arrays.asList(EnumC1528n.NOT_EQUAL, EnumC1528n.NOT_IN);
            }
            Iterator it = d9.f14275e.iterator();
            while (true) {
                if (it.hasNext()) {
                    for (C1529o c1529o2 : ((AbstractC1530p) it.next()).c()) {
                        if (asList.contains(c1529o2.f14349a)) {
                            enumC1528n = c1529o2.f14349a;
                            break;
                        }
                    }
                } else {
                    enumC1528n = null;
                    break;
                }
            }
            if (enumC1528n != null) {
                if (enumC1528n == enumC1528n2) {
                    throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + enumC1528n2.toString() + "' filter.");
                }
                throw new IllegalArgumentException("Invalid Query. You cannot use '" + enumC1528n2.toString() + "' filters with '" + enumC1528n.toString() + "' filters.");
            }
            d9 = d9.b(c1529o);
            i7 = 4;
        }
        return new g0(d8.b(h8), this.f9809b);
    }
}
