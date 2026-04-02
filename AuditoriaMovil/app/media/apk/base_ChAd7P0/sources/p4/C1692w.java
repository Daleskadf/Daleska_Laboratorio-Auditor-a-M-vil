package p4;

import java.util.HashMap;
import java.util.Iterator;
import p.C1608t;
/* renamed from: p4.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692w implements X {

    /* renamed from: c  reason: collision with root package name */
    public int f15307c;
    public final C1691v f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15305a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C1608t f15306b = new C1608t(4);

    /* renamed from: d  reason: collision with root package name */
    public q4.q f15308d = q4.q.f15370b;

    /* renamed from: e  reason: collision with root package name */
    public long f15309e = 0;

    public C1692w(C1691v c1691v) {
        this.f = c1691v;
    }

    @Override // p4.X
    public final void a(e4.e eVar, int i7) {
        C1608t c1608t = this.f15306b;
        c1608t.getClass();
        Iterator it = eVar.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (!((Iterator) dVar.f10875b).hasNext()) {
                break;
            }
            C1673c c1673c = new C1673c((q4.h) dVar.next(), i7);
            c1608t.f14880b = ((e4.e) c1608t.f14880b).e(c1673c);
            c1608t.f14881c = ((e4.e) c1608t.f14881c).e(c1673c);
        }
        B b5 = this.f.f15303m;
        Iterator it2 = eVar.iterator();
        while (true) {
            e4.d dVar2 = (e4.d) it2;
            if (((Iterator) dVar2.f10875b).hasNext()) {
                b5.H((q4.h) dVar2.next());
            } else {
                return;
            }
        }
    }

    @Override // p4.X
    public final e4.e b(int i7) {
        return this.f15306b.m0(i7);
    }

    @Override // p4.X
    public final Y c(n4.L l8) {
        return (Y) this.f15305a.get(l8);
    }

    @Override // p4.X
    public final q4.q d() {
        return this.f15308d;
    }

    @Override // p4.X
    public final void e(int i7) {
        this.f15306b.o0(i7);
    }

    @Override // p4.X
    public final void f(q4.q qVar) {
        this.f15308d = qVar;
    }

    @Override // p4.X
    public final void g(e4.e eVar, int i7) {
        C1608t c1608t = this.f15306b;
        c1608t.getClass();
        Iterator it = eVar.iterator();
        while (true) {
            e4.d dVar = (e4.d) it;
            if (!((Iterator) dVar.f10875b).hasNext()) {
                break;
            }
            C1673c c1673c = new C1673c((q4.h) dVar.next(), i7);
            c1608t.f14880b = ((e4.e) c1608t.f14880b).h(c1673c);
            c1608t.f14881c = ((e4.e) c1608t.f14881c).h(c1673c);
        }
        B b5 = this.f.f15303m;
        Iterator it2 = eVar.iterator();
        while (true) {
            e4.d dVar2 = (e4.d) it2;
            if (((Iterator) dVar2.f10875b).hasNext()) {
                b5.D((q4.h) dVar2.next());
            } else {
                return;
            }
        }
    }

    @Override // p4.X
    public final void h(Y y2) {
        this.f15305a.put(y2.f15235a, y2);
        int i7 = this.f15307c;
        int i8 = y2.f15236b;
        if (i8 > i7) {
            this.f15307c = i8;
        }
        long j = this.f15309e;
        long j8 = y2.f15237c;
        if (j8 > j) {
            this.f15309e = j8;
        }
    }

    @Override // p4.X
    public final int i() {
        return this.f15307c;
    }

    @Override // p4.X
    public final void j(Y y2) {
        h(y2);
    }
}
