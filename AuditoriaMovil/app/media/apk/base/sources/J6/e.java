package J6;

import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class e extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f2432a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2433b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f2434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, n6.d dVar) {
        super(2, dVar);
        this.f2434c = fVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        e eVar = new e(this.f2434c, dVar);
        eVar.f2433b = obj;
        return eVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((H6.p) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f2432a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f2432a = 1;
            if (this.f2434c.a((H6.p) this.f2433b, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
