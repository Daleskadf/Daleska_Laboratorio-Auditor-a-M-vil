package p4;

import android.util.SparseArray;
import b4.C0597e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l4.C1422f;
import m4.InterfaceC1438a;
import p.C1608t;
/* renamed from: p4.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683m implements InterfaceC1438a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f15265n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a  reason: collision with root package name */
    public final H4.W f15266a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC1677g f15267b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC1693x f15268c;

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC1672b f15269d;

    /* renamed from: e  reason: collision with root package name */
    public final C f15270e;
    public E.e f;

    /* renamed from: g  reason: collision with root package name */
    public final C0597e f15271g;

    /* renamed from: h  reason: collision with root package name */
    public final C1608t f15272h;

    /* renamed from: i  reason: collision with root package name */
    public final X f15273i;
    public final InterfaceC1671a j;

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray f15274k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f15275l;

    /* renamed from: m  reason: collision with root package name */
    public final B5.L f15276m;

    public C1683m(H4.W w2, C0597e c0597e, C1422f c1422f) {
        m5.d.i("LocalStore was passed an unstarted persistence implementation", w2.y(), new Object[0]);
        this.f15266a = w2;
        this.f15271g = c0597e;
        X w7 = w2.w();
        this.f15273i = w7;
        this.j = w2.l();
        B5.L l8 = new B5.L(0, w7.i());
        l8.f327a += 2;
        this.f15276m = l8;
        this.f15270e = w2.u();
        C1608t c1608t = new C1608t(4);
        this.f15272h = c1608t;
        this.f15274k = new SparseArray();
        this.f15275l = new HashMap();
        w2.t().s(c1608t);
        c(c1422f);
    }

    public static boolean e(Y y2, Y y3, t4.w wVar) {
        if (y2.f15240g.isEmpty()) {
            return true;
        }
        long j = y3.f15239e.f15371a.f5765a - y2.f15239e.f15371a.f5765a;
        long j8 = f15265n;
        if (j >= j8) {
            return true;
        }
        if (y3.f.f15371a.f5765a - y2.f.f15371a.f5765a >= j8) {
            return true;
        }
        if (wVar == null) {
            return false;
        }
        if (wVar.f15853e.f10876a.size() + wVar.f15852d.f10876a.size() + wVar.f15851c.f10876a.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p4.r] */
    public final Y a(n4.L l8) {
        int i7;
        Y c8 = this.f15273i.c(l8);
        if (c8 != null) {
            i7 = c8.f15236b;
        } else {
            ?? obj = new Object();
            this.f15266a.G("Allocate target", new A.h(this, obj, l8, 26));
            i7 = obj.f15285a;
            c8 = (Y) obj.f15286b;
        }
        SparseArray sparseArray = this.f15274k;
        if (sparseArray.get(i7) == null) {
            sparseArray.put(i7, c8);
            this.f15275l.put(l8, Integer.valueOf(i7));
        }
        return c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, B5.L] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p.C1608t b(n4.D r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C1683m.b(n4.D, boolean):p.t");
    }

    public final void c(C1422f c1422f) {
        H4.W w2 = this.f15266a;
        InterfaceC1677g q2 = w2.q(c1422f);
        this.f15267b = q2;
        this.f15268c = w2.r(c1422f, q2);
        InterfaceC1672b p7 = w2.p(c1422f);
        this.f15269d = p7;
        InterfaceC1693x interfaceC1693x = this.f15268c;
        InterfaceC1677g interfaceC1677g = this.f15267b;
        C c8 = this.f15270e;
        this.f = new E.e(c8, interfaceC1693x, p7, interfaceC1677g, 23);
        c8.l(interfaceC1677g);
        E.e eVar = this.f;
        InterfaceC1677g interfaceC1677g2 = this.f15267b;
        C0597e c0597e = this.f15271g;
        c0597e.f8248c = eVar;
        c0597e.f8249d = interfaceC1677g2;
        c0597e.f8246a = true;
    }

    public final C1608t d(Map map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set keySet = map.keySet();
        C c8 = this.f15270e;
        HashMap p7 = c8.p(keySet);
        for (Map.Entry entry : map.entrySet()) {
            q4.h hVar = (q4.h) entry.getKey();
            q4.n nVar = (q4.n) entry.getValue();
            q4.n nVar2 = (q4.n) p7.get(hVar);
            if (nVar.d() != nVar2.d()) {
                hashSet.add(hVar);
            }
            if (nVar.e() && nVar.f15364c.equals(q4.q.f15370b)) {
                arrayList.add(nVar.f15362a);
                hashMap.put(hVar, nVar);
            } else if (!nVar2.f15363b.equals(q4.m.INVALID) && nVar.f15364c.compareTo(nVar2.f15364c) <= 0 && (nVar.f15364c.compareTo(nVar2.f15364c) != 0 || (!nVar2.c() && !nVar2.f.equals(q4.l.HAS_COMMITTED_MUTATIONS)))) {
                u4.q.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", hVar, nVar2.f15364c, nVar.f15364c);
            } else {
                m5.d.i("Cannot add a document when the remote version is zero", !q4.q.f15370b.equals(nVar.f15365d), new Object[0]);
                c8.h(nVar, nVar.f15365d);
                hashMap.put(hVar, nVar);
            }
        }
        c8.c(arrayList);
        return new C1608t(1, hashMap, hashSet);
    }
}
