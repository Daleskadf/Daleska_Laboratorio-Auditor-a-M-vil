package F6;

import D.AbstractC0059i;
import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class H0 extends K6.t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f1228e;

    public H0(long j, AbstractC1700c abstractC1700c) {
        super(abstractC1700c, abstractC1700c.getContext());
        this.f1228e = j;
    }

    @Override // F6.u0
    public final String E() {
        return super.E() + "(timeMillis=" + this.f1228e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        H.i(this.f1251c);
        k(new G0(AbstractC0059i.C(new StringBuilder("Timed out waiting for "), this.f1228e, " ms"), this));
    }
}
