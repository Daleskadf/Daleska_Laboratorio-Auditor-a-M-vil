package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: l  reason: collision with root package name */
    public static final C1513B f14269l;

    /* renamed from: m  reason: collision with root package name */
    public static final C1513B f14270m;

    /* renamed from: a  reason: collision with root package name */
    public final List f14271a;

    /* renamed from: b  reason: collision with root package name */
    public List f14272b;

    /* renamed from: c  reason: collision with root package name */
    public L f14273c;

    /* renamed from: d  reason: collision with root package name */
    public L f14274d;

    /* renamed from: e  reason: collision with root package name */
    public final List f14275e;
    public final q4.p f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14276g;

    /* renamed from: h  reason: collision with root package name */
    public final long f14277h;

    /* renamed from: i  reason: collision with root package name */
    public final EnumC1514C f14278i;
    public final C1517c j;

    /* renamed from: k  reason: collision with root package name */
    public final C1517c f14279k;

    static {
        EnumC1512A enumC1512A = EnumC1512A.ASCENDING;
        q4.k kVar = q4.k.f15360b;
        f14269l = new C1513B(enumC1512A, kVar);
        f14270m = new C1513B(EnumC1512A.DESCENDING, kVar);
    }

    public D(q4.p pVar, String str, List list, List list2, long j, EnumC1514C enumC1514C, C1517c c1517c, C1517c c1517c2) {
        this.f = pVar;
        this.f14276g = str;
        this.f14271a = list2;
        this.f14275e = list;
        this.f14277h = j;
        this.f14278i = enumC1514C;
        this.j = c1517c;
        this.f14279k = c1517c2;
    }

    public final Q.a a() {
        return new Q.a(d());
    }

    public final D b(AbstractC1530p abstractC1530p) {
        m5.d.i("No filter is allowed for document query", !e(), new Object[0]);
        ArrayList arrayList = new ArrayList(this.f14275e);
        arrayList.add(abstractC1530p);
        return new D(this.f, this.f14276g, arrayList, this.f14271a, this.f14277h, this.f14278i, this.j, this.f14279k);
    }

    public final TreeSet c() {
        TreeSet treeSet = new TreeSet();
        for (AbstractC1530p abstractC1530p : this.f14275e) {
            for (C1529o c1529o : abstractC1530p.c()) {
                if (c1529o.f()) {
                    treeSet.add(c1529o.f14351c);
                }
            }
        }
        return treeSet;
    }

    public final synchronized List d() {
        EnumC1512A enumC1512A;
        C1513B c1513b;
        try {
            if (this.f14272b == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (C1513B c1513b2 : this.f14271a) {
                    arrayList.add(c1513b2);
                    hashSet.add(c1513b2.f14268b.c());
                }
                if (this.f14271a.size() > 0) {
                    List list = this.f14271a;
                    enumC1512A = ((C1513B) list.get(list.size() - 1)).f14267a;
                } else {
                    enumC1512A = EnumC1512A.ASCENDING;
                }
                Iterator it = c().iterator();
                while (it.hasNext()) {
                    q4.k kVar = (q4.k) it.next();
                    if (!hashSet.contains(kVar.c()) && !kVar.equals(q4.k.f15360b)) {
                        arrayList.add(new C1513B(enumC1512A, kVar));
                    }
                }
                if (!hashSet.contains(q4.k.f15360b.c())) {
                    if (enumC1512A.equals(EnumC1512A.ASCENDING)) {
                        c1513b = f14269l;
                    } else {
                        c1513b = f14270m;
                    }
                    arrayList.add(c1513b);
                }
                this.f14272b = DesugarCollections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14272b;
    }

    public final boolean e() {
        if (q4.h.e(this.f) && this.f14276g == null && this.f14275e.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d7 = (D) obj;
        if (this.f14278i != d7.f14278i) {
            return false;
        }
        return i().equals(d7.i());
    }

    public final D f(long j) {
        return new D(this.f, this.f14276g, this.f14275e, this.f14271a, j, EnumC1514C.LIMIT_TO_FIRST, this.j, this.f14279k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r3.i(r0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r3.f15351a.size() == (r0.f15351a.size() - 1)) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(q4.n r9) {
        /*
            r8 = this;
            boolean r0 = r9.d()
            r1 = 0
            if (r0 == 0) goto Ld6
            q4.h r0 = r9.f15362a
            q4.p r0 = r0.f15357a
            r2 = 1
            q4.p r3 = r8.f
            java.lang.String r4 = r8.f14276g
            if (r4 == 0) goto L38
            java.util.List r5 = r0.f15351a
            int r5 = r5.size()
            r6 = 2
            if (r5 < r6) goto L36
            java.util.List r5 = r0.f15351a
            int r7 = r5.size()
            int r7 = r7 - r6
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L36
            boolean r0 = r3.i(r0)
            if (r0 == 0) goto L36
        L34:
            r0 = r2
            goto L59
        L36:
            r0 = r1
            goto L59
        L38:
            boolean r4 = q4.h.e(r3)
            if (r4 == 0) goto L43
            boolean r0 = r3.equals(r0)
            goto L59
        L43:
            boolean r4 = r3.i(r0)
            if (r4 == 0) goto L36
            java.util.List r3 = r3.f15351a
            int r3 = r3.size()
            java.util.List r0 = r0.f15351a
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r3 != r0) goto L36
            goto L34
        L59:
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.d()
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r0.next()
            n4.B r3 = (n4.C1513B) r3
            q4.k r4 = r3.f14268b
            q4.k r5 = q4.k.f15360b
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L63
            q4.o r4 = r9.f15366e
            q4.k r3 = r3.f14268b
            H4.p1 r3 = r4.f(r3)
            if (r3 != 0) goto L63
            r0 = r1
            goto L86
        L85:
            r0 = r2
        L86:
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.f14275e
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r0.next()
            n4.p r3 = (n4.AbstractC1530p) r3
            boolean r3 = r3.d(r9)
            if (r3 != 0) goto L8e
            r0 = r1
            goto La3
        La2:
            r0 = r2
        La3:
            if (r0 == 0) goto Ld6
            n4.c r0 = r8.j
            if (r0 == 0) goto Lbd
            java.util.List r3 = r8.d()
            int r3 = r0.a(r3, r9)
            boolean r0 = r0.f14333a
            if (r0 == 0) goto Lb8
            if (r3 > 0) goto Lbb
            goto Lbd
        Lb8:
            if (r3 >= 0) goto Lbb
            goto Lbd
        Lbb:
            r9 = r1
            goto Ld3
        Lbd:
            n4.c r0 = r8.f14279k
            if (r0 == 0) goto Ld2
            java.util.List r3 = r8.d()
            int r9 = r0.a(r3, r9)
            boolean r0 = r0.f14333a
            if (r0 == 0) goto Ld0
            if (r9 < 0) goto Lbb
            goto Ld2
        Ld0:
            if (r9 <= 0) goto Lbb
        Ld2:
            r9 = r2
        Ld3:
            if (r9 == 0) goto Ld6
            r1 = r2
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.D.g(q4.n):boolean");
    }

    public final boolean h() {
        if (!this.f14275e.isEmpty() || this.f14277h != -1 || this.j != null || this.f14279k != null) {
            return false;
        }
        List list = this.f14271a;
        if (!list.isEmpty() && (list.size() != 1 || !((C1513B) list.get(0)).f14268b.equals(q4.k.f15360b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14278i.hashCode() + (i().hashCode() * 31);
    }

    public final synchronized L i() {
        try {
            if (this.f14273c == null) {
                this.f14273c = j(d());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14273c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    public final synchronized L j(List list) {
        C1517c c1517c;
        if (this.f14278i == EnumC1514C.LIMIT_TO_FIRST) {
            return new L(this.f, this.f14276g, this.f14275e, list, this.f14277h, this.j, this.f14279k);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1513B c1513b = (C1513B) it.next();
            EnumC1512A enumC1512A = c1513b.f14267a;
            EnumC1512A enumC1512A2 = EnumC1512A.DESCENDING;
            if (enumC1512A == enumC1512A2) {
                enumC1512A2 = EnumC1512A.ASCENDING;
            }
            arrayList.add(new C1513B(enumC1512A2, c1513b.f14268b));
        }
        C1517c c1517c2 = this.f14279k;
        C1517c c1517c3 = null;
        if (c1517c2 != null) {
            c1517c = new C1517c(c1517c2.f14334b, c1517c2.f14333a);
        } else {
            c1517c = null;
        }
        C1517c c1517c4 = this.j;
        if (c1517c4 != null) {
            c1517c3 = new C1517c(c1517c4.f14334b, c1517c4.f14333a);
        }
        return new L(this.f, this.f14276g, this.f14275e, arrayList, this.f14277h, c1517c, c1517c3);
    }

    public final String toString() {
        return "Query(target=" + i().toString() + ";limitType=" + this.f14278i.toString() + ")";
    }

    public D(q4.p pVar, String str) {
        this(pVar, str, Collections.emptyList(), Collections.emptyList(), -1L, EnumC1514C.LIMIT_TO_FIRST, null, null);
    }
}
