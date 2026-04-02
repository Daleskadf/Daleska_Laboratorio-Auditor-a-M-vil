package p0;

import o6.EnumC1565a;
/* renamed from: p0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1647o extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f15039a;

    /* JADX WARN: Type inference failed for: r0v0, types: [p6.i, p0.o, n6.d] */
    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        ?? iVar = new p6.i(2, dVar);
        iVar.f15039a = obj;
        return iVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1647o) create((Y) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        return Boolean.valueOf(!(((Y) this.f15039a) instanceof O));
    }
}
