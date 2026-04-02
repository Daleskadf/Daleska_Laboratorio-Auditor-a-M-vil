package n4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final D f14280a;

    /* renamed from: b  reason: collision with root package name */
    public final C1523i f14281b;

    /* renamed from: c  reason: collision with root package name */
    public final C1516b f14282c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14283d = false;

    /* renamed from: e  reason: collision with root package name */
    public z f14284e = z.UNKNOWN;
    public T f;

    public E(D d7, C1523i c1523i, C1516b c1516b) {
        this.f14280a = d7;
        this.f14282c = c1516b;
        this.f14281b = c1523i;
    }

    public final boolean a() {
        C1523i c1523i = this.f14281b;
        if (c1523i == null) {
            return true;
        }
        return true ^ c1523i.f14345d.equals(com.google.firebase.firestore.P.CACHE);
    }

    public final boolean b(T t7) {
        boolean z7;
        T t8;
        boolean z8;
        boolean z9;
        boolean z10 = true;
        if (t7.f14324d.isEmpty() && !t7.f14326g) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("We got a new snapshot with no changes?", z7, new Object[0]);
        C1523i c1523i = this.f14281b;
        if (!c1523i.f14342a) {
            ArrayList arrayList = new ArrayList();
            Iterator it = t7.f14324d.iterator();
            while (it.hasNext()) {
                C1521g c1521g = (C1521g) it.next();
                if (c1521g.f14338a != EnumC1520f.METADATA) {
                    arrayList.add(c1521g);
                }
            }
            t7 = new T(t7.f14321a, t7.f14322b, t7.f14323c, arrayList, t7.f14325e, t7.f, t7.f14326g, true, t7.f14328i);
        }
        if (!this.f14283d) {
            if (d(t7, this.f14284e)) {
                c(t7);
            }
            z10 = false;
        } else {
            if (!t7.f14324d.isEmpty()) {
                z9 = true;
            } else {
                if (this.f != null && (!t8.f.f10876a.isEmpty()) != (!t7.f.f10876a.isEmpty())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!t7.f14326g && !z8) {
                    z9 = false;
                } else {
                    z9 = c1523i.f14343b;
                }
            }
            if (z9) {
                this.f14282c.a(t7, null);
            }
            z10 = false;
        }
        this.f = t7;
        return z10;
    }

    public final void c(T t7) {
        m5.d.i("Trying to raise initial event for second time", !this.f14283d, new Object[0]);
        D d7 = t7.f14321a;
        ArrayList arrayList = new ArrayList();
        q4.i iVar = t7.f14322b;
        Iterator it = iVar.f15359b.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (((Iterator) dVar.f10875b).hasNext()) {
                arrayList.add(new C1521g(EnumC1520f.ADDED, (q4.n) dVar.next()));
            } else {
                T t8 = new T(d7, iVar, new q4.i(q4.g.f15354a, new e4.e(Collections.emptyList(), new K.a(d7.a(), 3))), arrayList, t7.f14325e, t7.f, true, t7.f14327h, t7.f14328i);
                this.f14283d = true;
                this.f14282c.a(t8, null);
                return;
            }
        }
    }

    public final boolean d(T t7, z zVar) {
        m5.d.i("Determining whether to raise first event but already had first event.", !this.f14283d, new Object[0]);
        if (!t7.f14325e || !a()) {
            return true;
        }
        z zVar2 = z.OFFLINE;
        boolean equals = zVar.equals(zVar2);
        if (this.f14281b.f14344c && !equals) {
            m5.d.i("Waiting for sync, but snapshot is not from cache", t7.f14325e, new Object[0]);
            return false;
        } else if (!t7.f14322b.f15358a.isEmpty() || t7.f14328i || zVar.equals(zVar2)) {
            return true;
        } else {
            return false;
        }
    }
}
