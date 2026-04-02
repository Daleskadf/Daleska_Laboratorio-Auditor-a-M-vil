package O6;

import F6.C0100m;
import F6.InterfaceC0098l;
import F6.L0;
import K6.u;
import K6.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w6.l;
/* loaded from: classes.dex */
public final class c implements InterfaceC0098l, L0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0100m f3870a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3871b;

    public c(d dVar, C0100m c0100m) {
        this.f3871b = dVar;
        this.f3870a = c0100m;
    }

    @Override // F6.L0
    public final void a(u uVar, int i7) {
        this.f3870a.a(uVar, i7);
    }

    @Override // F6.InterfaceC0098l
    public final void b(Object obj, l lVar) {
        l6.j jVar = l6.j.f13876a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f3872g;
        d dVar = this.f3871b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f3870a.b(jVar, new b(dVar, this, 0));
    }

    @Override // F6.InterfaceC0098l
    public final w d(Object obj, l lVar) {
        d dVar = this.f3871b;
        b bVar = new b(dVar, this, 1);
        w D4 = this.f3870a.D((l6.j) obj, bVar);
        if (D4 != null) {
            d.f3872g.set(dVar, null);
        }
        return D4;
    }

    @Override // F6.InterfaceC0098l
    public final void f(Object obj) {
        this.f3870a.f(obj);
    }

    @Override // n6.d
    public final n6.i getContext() {
        return this.f3870a.f1285e;
    }

    @Override // n6.d
    public final void resumeWith(Object obj) {
        this.f3870a.resumeWith(obj);
    }
}
