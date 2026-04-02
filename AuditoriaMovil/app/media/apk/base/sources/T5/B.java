package T5;

import o6.EnumC1565a;
import t0.C1803b;
import t0.C1805d;
/* loaded from: classes.dex */
public final class B extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5384a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1805d f5385b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f5386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C1805d c1805d, boolean z7, n6.d dVar) {
        super(2, dVar);
        this.f5385b = c1805d;
        this.f5386c = z7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        B b5 = new B(this.f5385b, this.f5386c, dVar);
        b5.f5384a = obj;
        return b5;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((B) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        ((C1803b) this.f5384a).d(this.f5385b, Boolean.valueOf(this.f5386c));
        return l6.j.f13876a;
    }
}
