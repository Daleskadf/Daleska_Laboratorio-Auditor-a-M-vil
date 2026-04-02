package p0;

import o6.EnumC1565a;
/* renamed from: p0.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628G extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f14928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p6.i f14929b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1635c f14930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628G(w6.p pVar, C1635c c1635c, n6.d dVar) {
        super(2, dVar);
        this.f14929b = (p6.i) pVar;
        this.f14930c = c1635c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C1628G(this.f14929b, this.f14930c, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1628G) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14928a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            Object obj2 = this.f14930c.f14997b;
            this.f14928a = 1;
            obj = this.f14929b.invoke(obj2, this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        return obj;
    }
}
