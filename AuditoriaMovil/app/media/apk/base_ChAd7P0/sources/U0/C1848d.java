package u0;

import f5.C0993a;
import java.util.ArrayList;
import p.C1608t;
/* renamed from: u0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1848d extends f7.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1849e f15915d;

    public C1848d(C1849e c1849e) {
        this.f15915d = c1849e;
    }

    @Override // f7.a
    public final void f0(Throwable th) {
        this.f15915d.f15916a.d(th);
    }

    @Override // f7.a
    public final void g0(E.e eVar) {
        C1849e c1849e = this.f15915d;
        c1849e.f15918c = eVar;
        c1849e.f15917b = new C1608t(c1849e.f15918c, new C0993a(22), c1849e.f15916a.f15926h);
        C1852h c1852h = c1849e.f15916a;
        c1852h.getClass();
        ArrayList arrayList = new ArrayList();
        c1852h.f15920a.writeLock().lock();
        try {
            c1852h.f15922c = 1;
            arrayList.addAll(c1852h.f15921b);
            c1852h.f15921b.clear();
            c1852h.f15920a.writeLock().unlock();
            c1852h.f15923d.post(new S4.c(arrayList, c1852h.f15922c, (Throwable) null));
        } catch (Throwable th) {
            c1852h.f15920a.writeLock().unlock();
            throw th;
        }
    }
}
