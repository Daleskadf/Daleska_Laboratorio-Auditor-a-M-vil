package b4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n4.EnumC1514C;
import p4.EnumC1676f;
import p4.InterfaceC1677g;
import q4.C1709b;
/* renamed from: b4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8246a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8247b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8248c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8249d;

    public static e4.e b(n4.D d7, e4.c cVar) {
        e4.e eVar = new e4.e(Collections.emptyList(), d7.a());
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            q4.n nVar = (q4.n) ((Map.Entry) it.next()).getValue();
            if (d7.g(nVar)) {
                eVar = eVar.e(nVar);
            }
        }
        return eVar;
    }

    public static boolean c(n4.D d7, int i7, e4.e eVar, q4.q qVar) {
        boolean z7;
        q4.n nVar;
        if (d7.f14277h != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        e4.c cVar = eVar.f10876a;
        if (i7 != cVar.size()) {
            return true;
        }
        if (d7.f14278i == EnumC1514C.LIMIT_TO_FIRST) {
            nVar = (q4.n) cVar.i();
        } else {
            nVar = (q4.n) cVar.k();
        }
        if (nVar == null) {
            return false;
        }
        if (!nVar.c() && !nVar.f.equals(q4.l.HAS_COMMITTED_MUTATIONS) && nVar.f15364c.compareTo(qVar) <= 0) {
            return false;
        }
        return true;
    }

    public e4.c a(e4.e eVar, n4.D d7, C1709b c1709b) {
        e4.c J5 = ((E.e) this.f8248c).J(d7, c1709b, null);
        Iterator it = eVar.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                q4.n nVar = (q4.n) dVar.next();
                J5 = J5.m(nVar.f15362a, nVar);
            } else {
                return J5;
            }
        }
    }

    public e4.c d(n4.D d7) {
        boolean z7;
        if (d7.h()) {
            return null;
        }
        n4.L i7 = d7.i();
        EnumC1676f d8 = ((InterfaceC1677g) this.f8249d).d(i7);
        if (d8.equals(EnumC1676f.NONE)) {
            return null;
        }
        boolean z8 = true;
        if (d7.f14277h != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && d8.equals(EnumC1676f.PARTIAL)) {
            return d(d7.f(-1L));
        }
        List q2 = ((InterfaceC1677g) this.f8249d).q(i7);
        if (q2 == null) {
            z8 = false;
        }
        m5.d.i("index manager must return results for partial and full indexes.", z8, new Object[0]);
        e4.c H7 = ((E.e) this.f8248c).H(q2);
        C1709b t7 = ((InterfaceC1677g) this.f8249d).t(i7);
        e4.e b5 = b(d7, H7);
        if (c(d7, ((ArrayList) q2).size(), b5, t7.f15344a)) {
            return d(d7.f(-1L));
        }
        return a(b5, d7, t7);
    }
}
