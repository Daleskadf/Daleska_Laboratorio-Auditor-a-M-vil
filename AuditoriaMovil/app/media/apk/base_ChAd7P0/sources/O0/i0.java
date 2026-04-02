package O0;

import H0.C0122b;
import H0.C0145z;
import e1.AbstractC0951p;
/* loaded from: classes.dex */
public final class i0 extends AbstractC0951p {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3768c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3769d;

    public i0(H0.V v6, H0.C c8) {
        super(v6);
        this.f3769d = c8;
    }

    @Override // e1.AbstractC0951p, H0.V
    public H0.T f(int i7, H0.T t7, boolean z7) {
        switch (this.f3768c) {
            case 0:
                H0.V v6 = this.f10826b;
                H0.T f = v6.f(i7, t7, z7);
                if (v6.m(f.f1718c, (H0.U) this.f3769d, 0L).a()) {
                    f.h(t7.f1716a, t7.f1717b, t7.f1718c, t7.f1719d, t7.f1720e, C0122b.f1785c, true);
                } else {
                    f.f = true;
                }
                return f;
            default:
                return super.f(i7, t7, z7);
        }
    }

    @Override // e1.AbstractC0951p, H0.V
    public H0.U m(int i7, H0.U u7, long j) {
        switch (this.f3768c) {
            case 1:
                super.m(i7, u7, j);
                H0.C c8 = (H0.C) this.f3769d;
                u7.f1726c = c8;
                C0145z c0145z = c8.f1642b;
                u7.getClass();
                return u7;
            default:
                return super.m(i7, u7, j);
        }
    }

    public i0(H0.V v6) {
        super(v6);
        this.f3769d = new H0.U();
    }
}
