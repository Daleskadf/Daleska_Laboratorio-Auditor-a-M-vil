package p0;

import o6.EnumC1565a;
/* renamed from: p0.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1652u extends p6.i implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public int f15057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1626E f15058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1652u(C1626E c1626e, n6.d dVar) {
        super(1, dVar);
        this.f15058b = c1626e;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(n6.d dVar) {
        return new C1652u(this.f15058b, dVar);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        return ((C1652u) create((n6.d) obj)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15057a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f15057a = 1;
            obj = this.f15058b.invoke(this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        return obj;
    }
}
