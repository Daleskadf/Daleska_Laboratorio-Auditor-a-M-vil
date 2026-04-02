package e1;
/* renamed from: e1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954t extends AbstractC0951p {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f10840e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f10841c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f10842d;

    public C0954t(H0.V v6, Object obj, Object obj2) {
        super(v6);
        this.f10841c = obj;
        this.f10842d = obj2;
    }

    @Override // e1.AbstractC0951p, H0.V
    public final int b(Object obj) {
        Object obj2;
        if (f10840e.equals(obj) && (obj2 = this.f10842d) != null) {
            obj = obj2;
        }
        return this.f10826b.b(obj);
    }

    @Override // e1.AbstractC0951p, H0.V
    public final H0.T f(int i7, H0.T t7, boolean z7) {
        this.f10826b.f(i7, t7, z7);
        if (K0.x.a(t7.f1717b, this.f10842d) && z7) {
            t7.f1717b = f10840e;
        }
        return t7;
    }

    @Override // e1.AbstractC0951p, H0.V
    public final Object l(int i7) {
        Object l8 = this.f10826b.l(i7);
        if (K0.x.a(l8, this.f10842d)) {
            return f10840e;
        }
        return l8;
    }

    @Override // e1.AbstractC0951p, H0.V
    public final H0.U m(int i7, H0.U u7, long j) {
        this.f10826b.m(i7, u7, j);
        if (K0.x.a(u7.f1724a, this.f10841c)) {
            u7.f1724a = H0.U.f1722q;
        }
        return u7;
    }
}
