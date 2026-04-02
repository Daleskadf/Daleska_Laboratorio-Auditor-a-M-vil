package T5;

import o6.EnumC1565a;
import t0.C1803b;
import t0.C1805d;
/* loaded from: classes.dex */
public final class H extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1805d f5407b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f5408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C1805d c1805d, long j, n6.d dVar) {
        super(2, dVar);
        this.f5407b = c1805d;
        this.f5408c = j;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        H h8 = new H(this.f5407b, this.f5408c, dVar);
        h8.f5406a = obj;
        return h8;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((H) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        ((C1803b) this.f5406a).d(this.f5407b, new Long(this.f5408c));
        return l6.j.f13876a;
    }
}
