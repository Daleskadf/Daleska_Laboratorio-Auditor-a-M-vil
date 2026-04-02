package n4;

import H4.W;
import O0.d0;
import com.google.firebase.firestore.X;
import com.google.firebase.firestore.Y;
import p4.C1675e;
import p4.C1683m;
import p4.C1691v;
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.firebase.firestore.L f14374a;

    /* renamed from: b  reason: collision with root package name */
    public final F3.o f14375b = new F3.o(13);

    /* renamed from: c  reason: collision with root package name */
    public W f14376c;

    /* renamed from: d  reason: collision with root package name */
    public C1683m f14377d;

    /* renamed from: e  reason: collision with root package name */
    public J f14378e;
    public d0 f;

    /* renamed from: g  reason: collision with root package name */
    public E.e f14379g;

    /* renamed from: h  reason: collision with root package name */
    public C1675e f14380h;

    /* renamed from: i  reason: collision with root package name */
    public p4.W f14381i;

    public y(com.google.firebase.firestore.L l8) {
        this.f14374a = l8;
    }

    public p4.W a(R1.j jVar) {
        return null;
    }

    public C1675e b(R1.j jVar) {
        return null;
    }

    public W c(R1.j jVar) {
        X x7 = this.f14374a.f9773e;
        if (x7 != null && (x7 instanceof Y)) {
            Y y2 = (Y) x7;
        }
        C1691v c1691v = new C1691v();
        c1691v.f15303m = new R1.j(c1691v);
        return c1691v;
    }

    public final C1683m d() {
        C1683m c1683m = this.f14377d;
        m5.d.j(c1683m, "localStore not initialized yet", new Object[0]);
        return c1683m;
    }

    public final J e() {
        J j = this.f14378e;
        m5.d.j(j, "syncEngine not initialized yet", new Object[0]);
        return j;
    }
}
