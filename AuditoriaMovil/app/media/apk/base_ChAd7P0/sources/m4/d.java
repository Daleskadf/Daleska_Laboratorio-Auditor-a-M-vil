package m4;

import D.AbstractC0055e;
import X5.c0;
import com.google.firebase.firestore.S;
import com.google.firebase.firestore.V;
import com.google.firebase.firestore.W;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n4.D;
import p4.C1683m;
import p4.Y;
import q4.n;
import q4.p;
import q4.q;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1438a f14024a;

    /* renamed from: b  reason: collision with root package name */
    public final e f14025b;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public g f14029g;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f14026c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public e4.c f14028e = q4.g.f15354a;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f14027d = new HashMap();

    public d(InterfaceC1438a interfaceC1438a, e eVar) {
        this.f14024a = interfaceC1438a;
        this.f14025b = eVar;
    }

    public final W a(c cVar, long j) {
        AbstractC0055e.a("Unexpected bundle metadata element.", !(cVar instanceof e), new Object[0]);
        int size = this.f14028e.size();
        if (cVar instanceof i) {
            this.f14026c.add((i) cVar);
        } else if (cVar instanceof g) {
            g gVar = (g) cVar;
            HashMap hashMap = this.f14027d;
            q4.h hVar = gVar.f14040a;
            hashMap.put(hVar, gVar);
            this.f14029g = gVar;
            if (!gVar.f14042c) {
                e4.c cVar2 = this.f14028e;
                q qVar = gVar.f14041b;
                n h8 = n.h(hVar, qVar);
                h8.f15365d = qVar;
                this.f14028e = cVar2.m(hVar, h8);
                this.f14029g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            g gVar2 = this.f14029g;
            if (gVar2 != null) {
                if (bVar.f14023a.f15362a.equals(gVar2.f14040a)) {
                    e4.c cVar3 = this.f14028e;
                    n nVar = bVar.f14023a;
                    nVar.f15365d = this.f14029g.f14041b;
                    this.f14028e = cVar3.m(nVar.f15362a, nVar);
                    this.f14029g = null;
                }
            }
            throw new IllegalArgumentException("The document being added does not match the stored metadata.");
        }
        this.f += j;
        if (size == this.f14028e.size()) {
            return null;
        }
        int size2 = this.f14028e.size();
        e eVar = this.f14025b;
        return new W(size2, eVar.f14033d, this.f, eVar.f14034e, null, V.RUNNING);
    }

    public final e4.c b() {
        boolean z7;
        boolean z8;
        boolean z9;
        if (this.f14029g == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0055e.a("Bundled documents end with a document metadata element instead of a document.", z7, new Object[0]);
        e eVar = this.f14025b;
        String str = eVar.f14030a;
        if (str != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0055e.a("Bundle ID must be set", z8, new Object[0]);
        int size = this.f14028e.size();
        int i7 = eVar.f14033d;
        if (size == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC0055e.a("Expected %s documents, but loaded %s.", z9, Integer.valueOf(i7), Integer.valueOf(this.f14028e.size()));
        e4.c cVar = this.f14028e;
        C1683m c1683m = (C1683m) this.f14024a;
        M.b bVar = new M.b(c1683m, cVar, c1683m.a(new D(p.l("__bundle__/docs/" + str), null).i()), 5);
        H4.W w2 = c1683m.f15266a;
        e4.c cVar2 = (e4.c) w2.F("Apply bundle documents", bVar);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.f14026c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.put(((i) it.next()).f14046a, q4.h.f15356c);
        }
        for (g gVar : this.f14027d.values()) {
            Iterator it2 = gVar.f14043d.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                hashMap.put(str2, ((e4.e) hashMap.get(str2)).e(gVar.f14040a));
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            i iVar = (i) it3.next();
            e4.e eVar2 = (e4.e) hashMap.get(iVar.f14046a);
            Y a7 = c1683m.a(iVar.f14047b.f14044a);
            w2.G("Saved named query", new c0(c1683m, iVar, a7, a7.f15236b, eVar2));
        }
        w2.G("Save bundle", new S(26, c1683m, eVar));
        return cVar2;
    }
}
