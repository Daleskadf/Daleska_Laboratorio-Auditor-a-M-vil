package J6;

import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class g extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f2438a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2439b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f2440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, n6.d dVar) {
        super(2, dVar);
        this.f2440c = hVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        g gVar = new g(this.f2440c, dVar);
        gVar.f2439b = obj;
        return gVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((I6.e) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f2438a;
        l6.j jVar = l6.j.f13876a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f2438a = 1;
            Object c02 = this.f2440c.f2441d.c0((I6.e) this.f2439b, this);
            if (c02 != enumC1565a) {
                c02 = jVar;
            }
            if (c02 == enumC1565a) {
                return enumC1565a;
            }
        }
        return jVar;
    }
}
