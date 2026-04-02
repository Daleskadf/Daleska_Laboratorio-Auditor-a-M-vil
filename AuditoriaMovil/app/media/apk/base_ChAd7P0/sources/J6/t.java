package J6;

import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class t extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f2458a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2459b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I6.e f2460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(I6.e eVar, n6.d dVar) {
        super(2, dVar);
        this.f2460c = eVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        t tVar = new t(this.f2460c, dVar);
        tVar.f2459b = obj;
        return tVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create(obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f2458a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            Object obj2 = this.f2459b;
            this.f2458a = 1;
            if (this.f2460c.a(obj2, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
