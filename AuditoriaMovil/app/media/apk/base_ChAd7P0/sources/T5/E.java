package T5;

import o6.EnumC1565a;
import t0.C1803b;
import t0.C1805d;
/* loaded from: classes.dex */
public final class E extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5395a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1805d f5396b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f5397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C1805d c1805d, double d7, n6.d dVar) {
        super(2, dVar);
        this.f5396b = c1805d;
        this.f5397c = d7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        E e7 = new E(this.f5396b, this.f5397c, dVar);
        e7.f5395a = obj;
        return e7;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((E) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        ((C1803b) this.f5395a).d(this.f5396b, new Double(this.f5397c));
        return l6.j.f13876a;
    }
}
