package p4;

import com.google.protobuf.AbstractC0852m;
import e0.C0927b;
import g1.C1006c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l4.C1418b;
import t4.C1820H;
/* renamed from: p4.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1690u implements InterfaceC1693x {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15293a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public e4.e f15294b = new e4.e(Collections.emptyList(), C1673c.f15242c);

    /* renamed from: c  reason: collision with root package name */
    public int f15295c = 1;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC0852m f15296d = C1820H.f15774v;

    /* renamed from: e  reason: collision with root package name */
    public final C1691v f15297e;
    public final C0927b f;

    public C1690u(C1691v c1691v) {
        this.f15297e = c1691v;
        this.f = c1691v.f15300i;
    }

    @Override // p4.InterfaceC1693x
    public final r4.i a(U3.p pVar, ArrayList arrayList, List list) {
        boolean z7 = true;
        m5.d.i("Mutation batches should not be empty", !list.isEmpty(), new Object[0]);
        int i7 = this.f15295c;
        this.f15295c = i7 + 1;
        ArrayList arrayList2 = this.f15293a;
        int size = arrayList2.size();
        if (size > 0) {
            if (((r4.i) arrayList2.get(size - 1)).f15499a >= i7) {
                z7 = false;
            }
            m5.d.i("Mutation batchIds must be monotonically increasing order", z7, new Object[0]);
        }
        r4.i iVar = new r4.i(i7, pVar, arrayList, list);
        arrayList2.add(iVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r4.h hVar = (r4.h) it.next();
            this.f15294b = this.f15294b.e(new C1673c(hVar.f15496a, i7));
            ((C1006c) this.f.f10587a).x(hVar.f15496a.d());
        }
        return iVar;
    }

    @Override // p4.InterfaceC1693x
    public final void b() {
        if (this.f15293a.isEmpty()) {
            m5.d.i("Document leak -- detected dangling mutation references when queue is empty.", this.f15294b.f10876a.isEmpty(), new Object[0]);
        }
    }

    @Override // p4.InterfaceC1693x
    public final void c(r4.i iVar, AbstractC0852m abstractC0852m) {
        boolean z7;
        boolean z8;
        boolean z9;
        int i7 = iVar.f15499a;
        int l8 = l(i7);
        ArrayList arrayList = this.f15293a;
        if (l8 >= 0 && l8 < arrayList.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Batches must exist to be %s", z7, "acknowledged");
        if (l8 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        m5.d.i("Can only acknowledge the first batch in the mutation queue", z8, new Object[0]);
        r4.i iVar2 = (r4.i) arrayList.get(l8);
        if (i7 == iVar2.f15499a) {
            z9 = true;
        } else {
            z9 = false;
        }
        m5.d.i("Queue ordering failure: expected batch %d, got batch %d", z9, Integer.valueOf(i7), Integer.valueOf(iVar2.f15499a));
        abstractC0852m.getClass();
        this.f15296d = abstractC0852m;
    }

    @Override // p4.InterfaceC1693x
    public final r4.i d(int i7) {
        int l8 = l(i7 + 1);
        if (l8 < 0) {
            l8 = 0;
        }
        ArrayList arrayList = this.f15293a;
        if (arrayList.size() > l8) {
            return (r4.i) arrayList.get(l8);
        }
        return null;
    }

    @Override // p4.InterfaceC1693x
    public final int e() {
        if (this.f15293a.isEmpty()) {
            return -1;
        }
        return this.f15295c - 1;
    }

    @Override // p4.InterfaceC1693x
    public final r4.i f(int i7) {
        boolean z7;
        int l8 = l(i7);
        if (l8 >= 0) {
            ArrayList arrayList = this.f15293a;
            if (l8 < arrayList.size()) {
                r4.i iVar = (r4.i) arrayList.get(l8);
                if (iVar.f15499a == i7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("If found batch must match", z7, new Object[0]);
                return iVar;
            }
            return null;
        }
        return null;
    }

    @Override // p4.InterfaceC1693x
    public final AbstractC0852m g() {
        return this.f15296d;
    }

    @Override // p4.InterfaceC1693x
    public final void h(AbstractC0852m abstractC0852m) {
        abstractC0852m.getClass();
        this.f15296d = abstractC0852m;
    }

    @Override // p4.InterfaceC1693x
    public final void i(r4.i iVar) {
        boolean z7;
        boolean z8 = true;
        int l8 = l(iVar.f15499a);
        ArrayList arrayList = this.f15293a;
        if (l8 >= 0 && l8 < arrayList.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Batches must exist to be %s", z7, "removed");
        if (l8 != 0) {
            z8 = false;
        }
        m5.d.i("Can only remove the first entry of the mutation queue", z8, new Object[0]);
        arrayList.remove(0);
        e4.e eVar = this.f15294b;
        for (r4.h hVar : iVar.f15502d) {
            q4.h hVar2 = hVar.f15496a;
            this.f15297e.f15303m.N(hVar2);
            eVar = eVar.h(new C1673c(hVar2, iVar.f15499a));
        }
        this.f15294b = eVar;
    }

    @Override // p4.InterfaceC1693x
    public final List j() {
        return DesugarCollections.unmodifiableList(this.f15293a);
    }

    @Override // p4.InterfaceC1693x
    public final ArrayList k(Set set) {
        List emptyList = Collections.emptyList();
        C1418b c1418b = u4.u.f16019a;
        e4.e eVar = new e4.e(emptyList, new K1.d(29));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            q4.h hVar = (q4.h) it.next();
            e4.d f = this.f15294b.f(new C1673c(hVar, 0));
            while (((Iterator) f.f10875b).hasNext()) {
                C1673c c1673c = (C1673c) f.next();
                if (!hVar.equals(c1673c.f15244a)) {
                    break;
                }
                eVar = eVar.e(Integer.valueOf(c1673c.f15245b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = eVar.iterator();
        while (true) {
            e4.d dVar = (e4.d) it2;
            if (((Iterator) dVar.f10875b).hasNext()) {
                r4.i f4 = f(((Integer) dVar.next()).intValue());
                if (f4 != null) {
                    arrayList.add(f4);
                }
            } else {
                return arrayList;
            }
        }
    }

    public final int l(int i7) {
        ArrayList arrayList = this.f15293a;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return i7 - ((r4.i) arrayList.get(0)).f15499a;
    }

    @Override // p4.InterfaceC1693x
    public final void start() {
        if (this.f15293a.isEmpty()) {
            this.f15295c = 1;
        }
    }
}
