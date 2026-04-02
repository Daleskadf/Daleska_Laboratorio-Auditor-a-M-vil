package J6;

import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class r implements I6.e {

    /* renamed from: a  reason: collision with root package name */
    public final H6.p f2455a;

    public r(H6.p pVar) {
        this.f2455a = pVar;
    }

    @Override // I6.e
    public final Object a(Object obj, n6.d dVar) {
        Object c8 = ((H6.o) this.f2455a).f2075d.c(obj, dVar);
        if (c8 == EnumC1565a.COROUTINE_SUSPENDED) {
            return c8;
        }
        return l6.j.f13876a;
    }
}
