package p0;

import o6.EnumC1565a;
/* renamed from: p0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1648p extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f15040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Y f15041b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648p(Y y2, n6.d dVar) {
        super(2, dVar);
        this.f15041b = y2;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1648p c1648p = new C1648p(this.f15041b, dVar);
        c1648p.f15040a = obj;
        return c1648p;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1648p) create((Y) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        boolean z7;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        Y y2 = (Y) this.f15040a;
        if ((y2 instanceof C1635c) && y2.f14992a <= this.f15041b.f14992a) {
            z7 = true;
        } else {
            z7 = false;
        }
        return Boolean.valueOf(z7);
    }
}
