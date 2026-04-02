package p4;

import D.AbstractC0059i;
import H4.p1;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import b3.C0585f;
import g1.C1006c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import l4.C1418b;
import l4.C1422f;
import n4.AbstractC1530p;
import n4.C1513B;
import n4.C1517c;
import n4.C1519e;
import n4.C1529o;
import n4.EnumC1512A;
import n4.EnumC1518d;
import n4.EnumC1528n;
import o4.C1558a;
import o4.C1561d;
import o4.C1563f;
import org.apache.tika.utils.StringUtils;
import q4.C1708a;
import q4.C1709b;
import q4.C1710c;
import q4.C1711d;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class I implements InterfaceC1677g {

    /* renamed from: f0  reason: collision with root package name */
    public static final byte[] f15182f0 = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final Q f15186a;

    /* renamed from: b  reason: collision with root package name */
    public final C0585f f15187b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15188c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f15189d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final C1006c f15190e = new C1006c(9);
    public final HashMap f = new HashMap();

    /* renamed from: X  reason: collision with root package name */
    public final PriorityQueue f15183X = new PriorityQueue(10, new K1.d(23));

    /* renamed from: Y  reason: collision with root package name */
    public boolean f15184Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public int f15185Z = -1;

    /* renamed from: e0  reason: collision with root package name */
    public long f15191e0 = -1;

    public I(Q q2, C0585f c0585f, C1422f c1422f) {
        this.f15186a = q2;
        this.f15187b = c0585f;
        String str = c1422f.f13857a;
        this.f15188c = str == null ? StringUtils.EMPTY : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (q4.s.f(r5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        r7 = new java.util.ArrayList(r0);
        r0 = new java.util.ArrayList();
        r8 = r5.G().a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r8.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        r10 = (H4.p1) r8.next();
        r11 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (r11.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r14 = new o4.C1561d();
        r13 = ((o4.C1561d) r11.next()).f14594a;
        r13 = java.util.Arrays.copyOf(r13.f14599a, r13.f14600b);
        r15 = r14.f14594a;
        r15.a(r13.length);
        r4 = r13.length;
        r22 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
        if (r1 >= r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
        r16 = r13[r1];
        r17 = r2;
        r2 = r15.f14599a;
        r18 = r3;
        r3 = r15.f14600b;
        r15.f14600b = r3 + 1;
        r2[r3] = r16;
        r1 = r1 + 1;
        r2 = r17;
        r3 = r18;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
        r1 = r14.a(r12);
        m5.d.w(r10, r1);
        r1.X();
        r0.add(r14);
        r1 = r22;
        r2 = r2;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
        r22 = r1;
        r17 = r2;
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] a(q4.C1708a r20, n4.L r21, java.util.Collection r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.I.a(q4.a, n4.L, java.util.Collection):java.lang.Object[]");
    }

    public static C1709b f(Collection collection) {
        m5.d.i("Found empty index group when looking for least recent index offset.", !collection.isEmpty(), new Object[0]);
        Iterator it = collection.iterator();
        C1709b c1709b = ((C1708a) it.next()).f15341d.f15348b;
        int i7 = c1709b.f15346c;
        while (it.hasNext()) {
            C1709b c1709b2 = ((C1708a) it.next()).f15341d.f15348b;
            if (c1709b2.compareTo(c1709b) < 0) {
                c1709b = c1709b2;
            }
            i7 = Math.max(c1709b2.f15346c, i7);
        }
        return new C1709b(c1709b.f15344a, c1709b.f15345b, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
        r9.add(((q4.C1711d) r8.get(r10)).f15349a.c());
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q4.C1708a b(n4.L r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.I.b(n4.L):q4.a");
    }

    @Override // p4.InterfaceC1677g
    public final List c(String str) {
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        ArrayList arrayList = new ArrayList();
        P R7 = this.f15186a.R("SELECT parent FROM collection_parents WHERE collection_id = ?");
        R7.a(str);
        Cursor s7 = R7.s();
        while (s7.moveToNext()) {
            try {
                arrayList.add(G.i.v(s7.getString(0)));
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        return arrayList;
    }

    @Override // p4.InterfaceC1677g
    public final EnumC1676f d(n4.L l8) {
        EnumC1676f enumC1676f = EnumC1676f.FULL;
        List h8 = h(l8);
        Iterator it = h8.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            n4.L l9 = (n4.L) it.next();
            C1708a b5 = b(l9);
            if (b5 == null) {
                enumC1676f = EnumC1676f.NONE;
                break;
            }
            int size = b5.f15340c.size();
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (AbstractC1530p abstractC1530p : l9.f14305c) {
                for (C1529o c1529o : abstractC1530p.c()) {
                    if (!c1529o.f14351c.equals(q4.k.f15360b)) {
                        EnumC1528n enumC1528n = EnumC1528n.ARRAY_CONTAINS;
                        EnumC1528n enumC1528n2 = c1529o.f14349a;
                        if (!enumC1528n2.equals(enumC1528n) && !enumC1528n2.equals(EnumC1528n.ARRAY_CONTAINS_ANY)) {
                            hashSet.add(c1529o.f14351c);
                        } else {
                            i7 = 1;
                        }
                    }
                }
            }
            for (C1513B c1513b : l9.f14304b) {
                if (!c1513b.f14268b.equals(q4.k.f15360b)) {
                    hashSet.add(c1513b.f14268b);
                }
            }
            if (size < hashSet.size() + i7) {
                enumC1676f = EnumC1676f.PARTIAL;
            }
        }
        if (l8.e() && h8.size() > 1 && enumC1676f == EnumC1676f.FULL) {
            return EnumC1676f.PARTIAL;
        }
        return enumC1676f;
    }

    public final Collection e(String str) {
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        Map map = (Map) this.f.get(str);
        if (map == null) {
            return Collections.emptyList();
        }
        return map.values();
    }

    @Override // p4.InterfaceC1677g
    public final void g() {
        Q q2 = this.f15186a;
        q2.Q("DELETE FROM index_configuration", new Object[0]);
        q2.Q("DELETE FROM index_entries", new Object[0]);
        q2.Q("DELETE FROM index_state", new Object[0]);
        this.f15183X.clear();
        this.f.clear();
    }

    public final List h(n4.L l8) {
        List<AbstractC1530p> singletonList;
        HashMap hashMap = this.f15189d;
        if (hashMap.containsKey(l8)) {
            return (List) hashMap.get(l8);
        }
        ArrayList arrayList = new ArrayList();
        if (l8.f14305c.isEmpty()) {
            arrayList.add(l8);
        } else {
            C1519e c1519e = new C1519e(l8.f14305c, EnumC1518d.AND);
            if (DesugarCollections.unmodifiableList(c1519e.f14335a).isEmpty()) {
                singletonList = Collections.emptyList();
            } else {
                AbstractC1530p h8 = AbstractC1740d.h(AbstractC1740d.i(c1519e));
                m5.d.i("computeDistributedNormalForm did not result in disjunctive normal form", AbstractC1740d.r(h8), new Object[0]);
                if (!(h8 instanceof C1529o) && !AbstractC1740d.s(h8)) {
                    singletonList = h8.b();
                } else {
                    singletonList = Collections.singletonList(h8);
                }
            }
            for (AbstractC1530p abstractC1530p : singletonList) {
                arrayList.add(new n4.L(l8.f14306d, l8.f14307e, abstractC1530p.b(), l8.f14304b, l8.f, l8.f14308g, l8.f14309h));
            }
        }
        hashMap.put(l8, arrayList);
        return arrayList;
    }

    public final void i(C1708a c1708a) {
        HashMap hashMap = this.f;
        String str = c1708a.f15339b;
        Map map = (Map) hashMap.get(str);
        if (map == null) {
            map = new HashMap();
            hashMap.put(str, map);
        }
        int i7 = c1708a.f15338a;
        C1708a c1708a2 = (C1708a) map.get(Integer.valueOf(i7));
        PriorityQueue priorityQueue = this.f15183X;
        if (c1708a2 != null) {
            priorityQueue.remove(c1708a2);
        }
        map.put(Integer.valueOf(i7), c1708a);
        priorityQueue.add(c1708a);
        this.f15185Z = Math.max(this.f15185Z, i7);
        this.f15191e0 = Math.max(this.f15191e0, c1708a.f15341d.f15347a);
    }

    @Override // p4.InterfaceC1677g
    public final void k(C1708a c1708a) {
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        int i7 = this.f15185Z + 1;
        String str = c1708a.f15339b;
        ArrayList arrayList = c1708a.f15340c;
        C1708a c1708a2 = new C1708a(i7, str, arrayList, c1708a.f15341d);
        Integer valueOf = Integer.valueOf(i7);
        this.f15187b.getClass();
        F4.b y2 = F4.i.y();
        F4.h hVar = F4.h.COLLECTION_GROUP;
        y2.d();
        F4.i.v((F4.i) y2.f10006b, hVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1711d c1711d = (C1711d) it.next();
            F4.d B7 = F4.g.B();
            String c8 = c1711d.f15349a.c();
            B7.d();
            F4.g.v((F4.g) B7.f10006b, c8);
            q4.j jVar = q4.j.CONTAINS;
            q4.j jVar2 = c1711d.f15350b;
            if (jVar2 == jVar) {
                F4.c cVar = F4.c.CONTAINS;
                B7.d();
                F4.g.x((F4.g) B7.f10006b, cVar);
            } else if (jVar2 == q4.j.ASCENDING) {
                F4.e eVar = F4.e.ASCENDING;
                B7.d();
                F4.g.w((F4.g) B7.f10006b, eVar);
            } else {
                F4.e eVar2 = F4.e.DESCENDING;
                B7.d();
                F4.g.w((F4.g) B7.f10006b, eVar2);
            }
            y2.d();
            F4.i.w((F4.i) y2.f10006b, (F4.g) B7.b());
        }
        this.f15186a.Q("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", valueOf, str, ((F4.i) y2.b()).d());
        i(c1708a2);
    }

    @Override // p4.InterfaceC1677g
    public final void n(n4.L l8) {
        C1708a c1708a;
        q4.j jVar;
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        for (n4.L l9 : h(l8)) {
            EnumC1676f d7 = d(l9);
            if (d7 == EnumC1676f.NONE || d7 == EnumC1676f.PARTIAL) {
                String str = l9.f14307e;
                if (str == null) {
                    str = l9.f14306d.f();
                }
                TreeSet treeSet = new TreeSet(new K1.d(28));
                ArrayList arrayList = new ArrayList();
                for (AbstractC1530p abstractC1530p : l9.f14305c) {
                    C1529o c1529o = (C1529o) abstractC1530p;
                    if (c1529o.f()) {
                        treeSet.add(c1529o);
                    } else {
                        arrayList.add(c1529o);
                    }
                }
                if (treeSet.size() > 1) {
                    c1708a = null;
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1529o c1529o2 = (C1529o) it.next();
                        if (!c1529o2.f14351c.equals(q4.k.f15360b)) {
                            EnumC1528n enumC1528n = EnumC1528n.ARRAY_CONTAINS;
                            EnumC1528n enumC1528n2 = c1529o2.f14349a;
                            boolean equals = enumC1528n2.equals(enumC1528n);
                            q4.k kVar = c1529o2.f14351c;
                            if (!equals && !enumC1528n2.equals(EnumC1528n.ARRAY_CONTAINS_ANY)) {
                                if (!hashSet.contains(kVar)) {
                                    hashSet.add(kVar);
                                    arrayList2.add(new C1711d(kVar, q4.j.ASCENDING));
                                }
                            } else {
                                arrayList2.add(new C1711d(kVar, q4.j.CONTAINS));
                            }
                        }
                    }
                    for (C1513B c1513b : l9.f14304b) {
                        if (!c1513b.f14268b.equals(q4.k.f15360b)) {
                            q4.k kVar2 = c1513b.f14268b;
                            if (!hashSet.contains(kVar2)) {
                                hashSet.add(kVar2);
                                if (c1513b.f14267a == EnumC1512A.ASCENDING) {
                                    jVar = q4.j.ASCENDING;
                                } else {
                                    jVar = q4.j.DESCENDING;
                                }
                                arrayList2.add(new C1711d(kVar2, jVar));
                            }
                        }
                    }
                    c1708a = new C1708a(-1, str, arrayList2, C1708a.f15337e);
                }
                if (c1708a != null) {
                    k(c1708a);
                }
            }
        }
    }

    @Override // p4.InterfaceC1677g
    public final void o(q4.p pVar) {
        boolean z7;
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        if (pVar.f15351a.size() % 2 == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Expected a collection path.", z7, new Object[0]);
        if (this.f15190e.x(pVar)) {
            this.f15186a.Q("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", pVar.f(), G.i.x((q4.p) pVar.k()));
        }
    }

    @Override // p4.InterfaceC1677g
    public final C1709b p(String str) {
        Collection e7 = e(str);
        m5.d.i("minOffset was called for collection without indexes", !e7.isEmpty(), new Object[0]);
        return f(e7);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Collection, java.lang.Object] */
    @Override // p4.InterfaceC1677g
    public final List q(n4.L l8) {
        String str;
        boolean z7;
        List a7;
        Collection collection;
        ArrayList arrayList;
        String str2;
        String str3;
        int i7;
        int i8;
        int i9;
        List list;
        int i10;
        byte[] bArr;
        Pair a8;
        Pair c8;
        int i11 = 2;
        int i12 = 1;
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (n4.L l9 : h(l8)) {
            C1708a b5 = b(l9);
            if (b5 == null) {
                return null;
            }
            arrayList4.add(Pair.create(l9, b5));
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            n4.L l10 = (n4.L) pair.first;
            C1708a c1708a = (C1708a) pair.second;
            l10.getClass();
            C1711d a9 = c1708a.a();
            if (a9 != null) {
                Iterator it2 = l10.d(a9.f15349a).iterator();
                while (it2.hasNext()) {
                    C1529o c1529o = (C1529o) it2.next();
                    int i13 = n4.K.f14302a[c1529o.f14349a.ordinal()];
                    p1 p1Var = c1529o.f14350b;
                    if (i13 != i12) {
                        if (i13 == i11) {
                            a7 = Collections.singletonList(p1Var);
                            break;
                        }
                    } else {
                        a7 = p1Var.G().a();
                        break;
                    }
                }
            }
            a7 = null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it3 = c1708a.b().iterator();
            while (it3.hasNext()) {
                C1711d c1711d = (C1711d) it3.next();
                Iterator it4 = l10.d(c1711d.f15349a).iterator();
                while (it4.hasNext()) {
                    C1529o c1529o2 = (C1529o) it4.next();
                    Iterator it5 = it4;
                    int i14 = n4.K.f14302a[c1529o2.f14349a.ordinal()];
                    Iterator it6 = it3;
                    q4.k kVar = c1711d.f15349a;
                    p1 p1Var2 = c1529o2.f14350b;
                    C1711d c1711d2 = c1711d;
                    if (i14 != 3 && i14 != 4) {
                        if (i14 == 5 || i14 == 6) {
                            linkedHashMap.put(kVar, p1Var2);
                            collection = linkedHashMap.values();
                            break;
                        }
                    } else {
                        linkedHashMap.put(kVar, p1Var2);
                    }
                    it3 = it6;
                    it4 = it5;
                    c1711d = c1711d2;
                }
            }
            collection = null;
            ArrayList arrayList5 = new ArrayList();
            Iterator it7 = c1708a.b().iterator();
            boolean z8 = true;
            while (it7.hasNext()) {
                C1711d c1711d3 = (C1711d) it7.next();
                Iterator it8 = it7;
                Iterator it9 = it;
                boolean equals = c1711d3.f15350b.equals(q4.j.ASCENDING);
                C1517c c1517c = l10.f14308g;
                if (equals) {
                    c8 = l10.a(c1711d3, c1517c);
                } else {
                    c8 = l10.c(c1711d3, c1517c);
                }
                arrayList5.add((p1) c8.first);
                z8 &= ((Boolean) c8.second).booleanValue();
                it7 = it8;
                it = it9;
            }
            Iterator it10 = it;
            C1517c c1517c2 = new C1517c(arrayList5, z8);
            ArrayList arrayList6 = new ArrayList();
            Iterator it11 = c1708a.b().iterator();
            boolean z9 = true;
            while (it11.hasNext()) {
                C1711d c1711d4 = (C1711d) it11.next();
                Iterator it12 = it11;
                boolean equals2 = c1711d4.f15350b.equals(q4.j.ASCENDING);
                C1517c c1517c3 = l10.f14309h;
                if (equals2) {
                    a8 = l10.c(c1711d4, c1517c3);
                } else {
                    a8 = l10.a(c1711d4, c1517c3);
                }
                arrayList6.add((p1) a8.first);
                z9 &= ((Boolean) a8.second).booleanValue();
                it11 = it12;
            }
            C1517c c1517c4 = new C1517c(arrayList6, z9);
            if (u4.q.c()) {
                arrayList = arrayList3;
                u4.q.a("I", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", c1708a, l10, a7, c1517c2, c1517c4);
            } else {
                arrayList = arrayList3;
            }
            Object[] a10 = a(c1708a, l10, c1517c2.f14334b);
            if (c1517c2.f14333a) {
                str2 = ">=";
            } else {
                str2 = ">";
            }
            Object[] a11 = a(c1708a, l10, arrayList6);
            if (z9) {
                str3 = "<=";
            } else {
                str3 = "<";
            }
            Object[] a12 = a(c1708a, l10, collection);
            if (a7 != null) {
                i7 = a7.size();
            } else {
                i7 = 1;
            }
            int max = Math.max(a10.length, a11.length) * i7;
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT document_key, directional_value FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value ");
            sb.append(str2);
            sb.append(" ? AND directional_value ");
            sb.append(str3);
            sb.append(" ? ");
            StringBuilder i15 = u4.u.i(max, sb, " UNION ");
            if (a12 != null) {
                StringBuilder sb2 = new StringBuilder("SELECT document_key, directional_value FROM (");
                sb2.append((CharSequence) i15);
                sb2.append(") WHERE directional_value NOT IN (");
                sb2.append((CharSequence) u4.u.i(a12.length, "?", ", "));
                sb2.append(")");
                i15 = sb2;
            }
            if (a7 != null) {
                i8 = a7.size();
            } else {
                i8 = 1;
            }
            int i16 = max / i8;
            int i17 = max * 5;
            if (a12 != null) {
                i9 = a12.length;
            } else {
                i9 = 0;
            }
            Object[] objArr = new Object[i17 + i9];
            int i18 = 0;
            int i19 = 0;
            while (i18 < max) {
                objArr[i19] = Integer.valueOf(c1708a.f15338a);
                int i20 = i19 + 2;
                objArr[i19 + 1] = this.f15188c;
                int i21 = i19 + 3;
                if (a7 != null) {
                    list = a7;
                    C1561d c1561d = new C1561d();
                    i10 = max;
                    j3.f a13 = c1561d.a(q4.j.ASCENDING);
                    m5.d.w((p1) a7.get(i18 / i16), a13);
                    a13.X();
                    C1563f c1563f = c1561d.f14594a;
                    bArr = Arrays.copyOf(c1563f.f14599a, c1563f.f14600b);
                } else {
                    list = a7;
                    i10 = max;
                    bArr = f15182f0;
                }
                objArr[i20] = bArr;
                int i22 = i19 + 4;
                int i23 = i18 % i16;
                objArr[i21] = a10[i23];
                i19 += 5;
                objArr[i22] = a11[i23];
                i18++;
                a7 = list;
                max = i10;
            }
            if (a12 != null) {
                int length = a12.length;
                int i24 = 0;
                while (i24 < length) {
                    objArr[i19] = a12[i24];
                    i24++;
                    i19++;
                }
            }
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(i15.toString());
            arrayList7.addAll(Arrays.asList(objArr));
            Object[] array = arrayList7.toArray();
            arrayList2.add(String.valueOf(array[0]));
            ArrayList arrayList8 = arrayList;
            arrayList8.addAll(Arrays.asList(array).subList(1, array.length));
            arrayList3 = arrayList8;
            it = it10;
            i11 = 2;
            i12 = 1;
        }
        ArrayList arrayList9 = arrayList3;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(TextUtils.join(" UNION ", arrayList2));
        sb3.append("ORDER BY directional_value, document_key ");
        List list2 = l8.f14304b;
        if (((C1513B) list2.get(list2.size() - 1)).f14267a.equals(EnumC1512A.ASCENDING)) {
            str = "asc ";
        } else {
            str = "desc ";
        }
        sb3.append(str);
        String M7 = AbstractC0059i.M("SELECT DISTINCT document_key FROM (", sb3.toString(), ")");
        if (l8.e()) {
            M7 = M7 + " LIMIT " + l8.f;
        }
        if (arrayList9.size() < 1000) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Cannot perform query with more than 999 bind elements", z7, new Object[0]);
        P R7 = this.f15186a.R(M7);
        R7.a(arrayList9.toArray());
        ArrayList arrayList10 = new ArrayList();
        Cursor s7 = R7.s();
        while (s7.moveToNext()) {
            try {
                arrayList10.add(new q4.h(q4.p.l(s7.getString(0))));
            } catch (Throwable th) {
                if (s7 != null) {
                    try {
                        s7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        s7.close();
        u4.q.a("I", "Index scan returned %s documents", Integer.valueOf(arrayList10.size()));
        return arrayList10;
    }

    @Override // p4.InterfaceC1677g
    public final void start() {
        HashMap hashMap = new HashMap();
        Q q2 = this.f15186a;
        P R7 = q2.R("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        R7.a(this.f15188c);
        R7.e(new G(hashMap, 0));
        q2.R("SELECT index_id, collection_group, index_proto FROM index_configuration").e(new H(0, this, hashMap));
        this.f15184Y = true;
    }

    @Override // p4.InterfaceC1677g
    public final C1709b t(n4.L l8) {
        ArrayList arrayList = new ArrayList();
        for (n4.L l9 : h(l8)) {
            C1708a b5 = b(l9);
            if (b5 != null) {
                arrayList.add(b5);
            }
        }
        return f(arrayList);
    }

    @Override // p4.InterfaceC1677g
    public final void u(e4.c cVar) {
        int i7;
        byte[] copyOf;
        Comparator tVar;
        int i8 = 2;
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            q4.p pVar = ((q4.h) entry.getKey()).f15357a;
            for (C1708a c1708a : e(pVar.g(pVar.f15351a.size() - i8))) {
                q4.h hVar = (q4.h) entry.getKey();
                TreeSet treeSet = new TreeSet();
                P R7 = this.f15186a.R("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                Integer valueOf = Integer.valueOf(c1708a.f15338a);
                String c8 = hVar.f15357a.c();
                String str = this.f15188c;
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[1] = c8;
                objArr[i8] = str;
                R7.a(objArr);
                Cursor s7 = R7.s();
                while (true) {
                    try {
                        boolean moveToNext = s7.moveToNext();
                        i7 = c1708a.f15338a;
                        if (!moveToNext) {
                            break;
                        }
                        treeSet.add(new C1558a(i7, hVar, s7.getBlob(0), s7.getBlob(1)));
                    } catch (Throwable th) {
                        if (s7 != null) {
                            try {
                                s7.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                s7.close();
                q4.n nVar = (q4.n) entry.getValue();
                TreeSet treeSet2 = new TreeSet();
                C1561d c1561d = new C1561d();
                Iterator it2 = c1708a.b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1711d c1711d = (C1711d) it2.next();
                        p1 f = nVar.f15366e.f(c1711d.f15349a);
                        if (f == null) {
                            copyOf = null;
                            break;
                        }
                        j3.f a7 = c1561d.a(c1711d.f15350b);
                        m5.d.w(f, a7);
                        a7.X();
                    } else {
                        C1563f c1563f = c1561d.f14594a;
                        copyOf = Arrays.copyOf(c1563f.f14599a, c1563f.f14600b);
                        break;
                    }
                }
                if (copyOf != null) {
                    C1711d a8 = c1708a.a();
                    if (a8 != null) {
                        p1 f4 = nVar.f15366e.f(a8.f15349a);
                        if (q4.s.f(f4)) {
                            for (p1 p1Var : f4.G().a()) {
                                C1561d c1561d2 = new C1561d();
                                j3.f a9 = c1561d2.a(q4.j.ASCENDING);
                                m5.d.w(p1Var, a9);
                                a9.X();
                                C1563f c1563f2 = c1561d2.f14594a;
                                treeSet2.add(new C1558a(i7, nVar.f15362a, Arrays.copyOf(c1563f2.f14599a, c1563f2.f14600b), copyOf));
                            }
                        }
                    } else {
                        treeSet2.add(new C1558a(i7, nVar.f15362a, new byte[0], copyOf));
                    }
                }
                if (!treeSet.equals(treeSet2)) {
                    final q4.n nVar2 = (q4.n) entry.getValue();
                    u4.q.a("I", "Updating index entries for document '%s'", nVar2.f15362a);
                    u4.g gVar = new u4.g(this) { // from class: p4.F

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ I f15175b;

                        {
                            this.f15175b = this;
                        }

                        @Override // u4.g
                        public final void accept(Object obj) {
                            q4.n nVar3 = nVar2;
                            I i9 = this.f15175b;
                            int i10 = r3;
                            C1558a c1558a = (C1558a) obj;
                            i9.getClass();
                            switch (i10) {
                                case 0:
                                    Integer valueOf2 = Integer.valueOf(c1558a.f14587a);
                                    String c9 = nVar3.f15362a.f15357a.c();
                                    i9.f15186a.Q("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", valueOf2, i9.f15188c, c1558a.f14589c, c1558a.f14590d, c9);
                                    return;
                                default:
                                    Integer valueOf3 = Integer.valueOf(c1558a.f14587a);
                                    String c10 = nVar3.f15362a.f15357a.c();
                                    i9.f15186a.Q("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", valueOf3, i9.f15188c, c1558a.f14589c, c1558a.f14590d, c10);
                                    return;
                            }
                        }
                    };
                    u4.g gVar2 = new u4.g(this) { // from class: p4.F

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ I f15175b;

                        {
                            this.f15175b = this;
                        }

                        @Override // u4.g
                        public final void accept(Object obj) {
                            q4.n nVar3 = nVar2;
                            I i9 = this.f15175b;
                            int i10 = r3;
                            C1558a c1558a = (C1558a) obj;
                            i9.getClass();
                            switch (i10) {
                                case 0:
                                    Integer valueOf2 = Integer.valueOf(c1558a.f14587a);
                                    String c9 = nVar3.f15362a.f15357a.c();
                                    i9.f15186a.Q("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", valueOf2, i9.f15188c, c1558a.f14589c, c1558a.f14590d, c9);
                                    return;
                                default:
                                    Integer valueOf3 = Integer.valueOf(c1558a.f14587a);
                                    String c10 = nVar3.f15362a.f15357a.c();
                                    i9.f15186a.Q("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", valueOf3, i9.f15188c, c1558a.f14589c, c1558a.f14590d, c10);
                                    return;
                            }
                        }
                    };
                    C1418b c1418b = u4.u.f16019a;
                    Iterator it3 = treeSet.iterator();
                    Iterator it4 = treeSet2.iterator();
                    if (treeSet.comparator() != null) {
                        tVar = treeSet.comparator();
                    } else {
                        tVar = new u4.t(0);
                    }
                    u4.u.g(it3, it4, tVar, gVar, gVar2);
                }
                i8 = 2;
            }
        }
    }

    @Override // p4.InterfaceC1677g
    public final void v(String str, C1709b c1709b) {
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        this.f15191e0++;
        for (C1708a c1708a : e(str)) {
            C1708a c1708a2 = new C1708a(c1708a.f15338a, c1708a.f15339b, c1708a.f15340c, new C1710c(this.f15191e0, c1709b));
            Integer valueOf = Integer.valueOf(c1708a.f15338a);
            Long valueOf2 = Long.valueOf(this.f15191e0);
            q4.q qVar = c1709b.f15344a;
            this.f15186a.Q("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", valueOf, this.f15188c, valueOf2, Long.valueOf(qVar.f15371a.f5765a), Integer.valueOf(qVar.f15371a.f5766b), G.i.x(c1709b.f15345b.f15357a), Integer.valueOf(c1709b.f15346c));
            i(c1708a2);
        }
    }

    @Override // p4.InterfaceC1677g
    public final void w(C1708a c1708a) {
        Object[] objArr = {Integer.valueOf(c1708a.f15338a)};
        Q q2 = this.f15186a;
        q2.Q("DELETE FROM index_configuration WHERE index_id = ?", objArr);
        int i7 = c1708a.f15338a;
        q2.Q("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(i7));
        q2.Q("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(i7));
        this.f15183X.remove(c1708a);
        Map map = (Map) this.f.get(c1708a.f15339b);
        if (map != null) {
            map.remove(Integer.valueOf(i7));
        }
    }

    @Override // p4.InterfaceC1677g
    public final Collection x() {
        ArrayList arrayList = new ArrayList();
        for (Map map : this.f.values()) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    @Override // p4.InterfaceC1677g
    public final String z() {
        m5.d.i("IndexManager not started", this.f15184Y, new Object[0]);
        C1708a c1708a = (C1708a) this.f15183X.peek();
        if (c1708a != null) {
            return c1708a.f15339b;
        }
        return null;
    }
}
