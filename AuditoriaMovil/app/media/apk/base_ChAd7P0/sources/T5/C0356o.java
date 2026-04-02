package T5;

import o6.EnumC1565a;
import t0.C1805d;
/* renamed from: T5.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356o implements I6.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I6.d f5456b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1805d f5457c;

    public /* synthetic */ C0356o(I6.d dVar, C1805d c1805d, int i7) {
        this.f5455a = i7;
        this.f5456b = dVar;
        this.f5457c = c1805d;
    }

    @Override // I6.d
    public final Object c0(I6.e eVar, n6.d dVar) {
        switch (this.f5455a) {
            case 0:
                Object c02 = this.f5456b.c0(new C0355n(eVar, this.f5457c, 0), dVar);
                if (c02 != EnumC1565a.COROUTINE_SUSPENDED) {
                    return l6.j.f13876a;
                }
                return c02;
            case 1:
                Object c03 = this.f5456b.c0(new C0355n(eVar, this.f5457c, 1), dVar);
                if (c03 != EnumC1565a.COROUTINE_SUSPENDED) {
                    return l6.j.f13876a;
                }
                return c03;
            case 2:
                Object c04 = this.f5456b.c0(new C0355n(eVar, this.f5457c, 2), dVar);
                if (c04 != EnumC1565a.COROUTINE_SUSPENDED) {
                    return l6.j.f13876a;
                }
                return c04;
            default:
                Object c05 = this.f5456b.c0(new C0355n(eVar, this.f5457c, 3), dVar);
                if (c05 != EnumC1565a.COROUTINE_SUSPENDED) {
                    return l6.j.f13876a;
                }
                return c05;
        }
    }
}
