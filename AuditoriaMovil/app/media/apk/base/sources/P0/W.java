package p0;

import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class W extends p6.i implements w6.p {
    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new p6.i(2, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((W) create((I6.e) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        return l6.j.f13876a;
    }
}
