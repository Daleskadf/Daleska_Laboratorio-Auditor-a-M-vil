package K6;

import F6.AbstractC0076a;
import F6.H;
import p6.InterfaceC1701d;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class t extends AbstractC0076a implements InterfaceC1701d {

    /* renamed from: d  reason: collision with root package name */
    public final n6.d f2802d;

    public t(n6.d dVar, n6.i iVar) {
        super(iVar, true);
        this.f2802d = dVar;
    }

    @Override // F6.u0
    public final boolean B() {
        return true;
    }

    @Override // p6.InterfaceC1701d
    public final InterfaceC1701d getCallerFrame() {
        n6.d dVar = this.f2802d;
        if (dVar instanceof InterfaceC1701d) {
            return (InterfaceC1701d) dVar;
        }
        return null;
    }

    @Override // F6.u0
    public void h(Object obj) {
        AbstractC0208a.h(AbstractC1740d.q(this.f2802d), H.s(obj), null);
    }

    @Override // F6.u0
    public void i(Object obj) {
        this.f2802d.resumeWith(H.s(obj));
    }
}
