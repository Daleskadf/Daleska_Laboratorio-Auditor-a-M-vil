package T0;

import H0.r;
import K0.x;
import O0.a0;
import e1.C0933C;
import e1.C0960z;
import e1.RunnableC0932B;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f5287a;

    /* renamed from: b  reason: collision with root package name */
    public final C0960z f5288b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f5289c;

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i7, C0960z c0960z) {
        this.f5289c = copyOnWriteArrayList;
        this.f5287a = i7;
        this.f5288b = c0960z;
    }

    public void a(int i7, r rVar, int i8, Object obj, long j) {
        b(new b1.g(1, i7, rVar, i8, obj, x.Z(j), -9223372036854775807L));
    }

    public void b(b1.g gVar) {
        Iterator it = this.f5289c.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            x.Q(c0933c.f10620a, new A.h(this, c0933c.f10621b, gVar, 12));
        }
    }

    public void c(e1.r rVar, int i7, int i8, r rVar2, int i9, Object obj, long j, long j8) {
        d(rVar, new b1.g(i7, i8, rVar2, i9, obj, x.Z(j), x.Z(j8)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, e1.D] */
    public void d(e1.r rVar, b1.g gVar) {
        Iterator it = this.f5289c.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            x.Q(c0933c.f10620a, new RunnableC0932B(this, c0933c.f10621b, rVar, gVar, 2));
        }
    }

    public void e(e1.r rVar, int i7) {
        f(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void f(e1.r rVar, int i7, int i8, r rVar2, int i9, Object obj, long j, long j8) {
        g(rVar, new b1.g(i7, i8, rVar2, i9, obj, x.Z(j), x.Z(j8)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, e1.D] */
    public void g(e1.r rVar, b1.g gVar) {
        Iterator it = this.f5289c.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            x.Q(c0933c.f10620a, new RunnableC0932B(this, c0933c.f10621b, rVar, gVar, 1));
        }
    }

    public void h(e1.r rVar, int i7, int i8, r rVar2, int i9, Object obj, long j, long j8, IOException iOException, boolean z7) {
        j(rVar, new b1.g(i7, i8, rVar2, i9, obj, x.Z(j), x.Z(j8)), iOException, z7);
    }

    public void i(e1.r rVar, int i7, IOException iOException, boolean z7) {
        h(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z7);
    }

    public void j(e1.r rVar, b1.g gVar, IOException iOException, boolean z7) {
        Iterator it = this.f5289c.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            x.Q(c0933c.f10620a, new a0(this, c0933c.f10621b, rVar, gVar, iOException, z7, 1));
        }
    }

    public void k(e1.r rVar, int i7, int i8, r rVar2, int i9, Object obj, long j, long j8) {
        l(rVar, new b1.g(i7, i8, rVar2, i9, obj, x.Z(j), x.Z(j8)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, e1.D] */
    public void l(e1.r rVar, b1.g gVar) {
        Iterator it = this.f5289c.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            x.Q(c0933c.f10620a, new RunnableC0932B(this, c0933c.f10621b, rVar, gVar, 0));
        }
    }

    public void m(b1.g gVar) {
        C0960z c0960z = this.f5288b;
        c0960z.getClass();
        Iterator it = this.f5289c.iterator();
        while (it.hasNext()) {
            C0933C c0933c = (C0933C) it.next();
            x.Q(c0933c.f10620a, new M.d(this, c0933c.f10621b, c0960z, gVar, 12));
        }
    }
}
