package p0;

import o6.EnumC1565a;
/* renamed from: p0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1638f extends p6.i implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public int f15006a;

    @Override // p6.AbstractC1698a
    public final n6.d create(n6.d dVar) {
        return new p6.i(1, dVar);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        l6.j jVar = l6.j.f13876a;
        ((C1638f) create((n6.d) obj)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15006a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
                return l6.j.f13876a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        org.slf4j.helpers.i.M(obj);
        this.f15006a = 1;
        throw null;
    }
}
