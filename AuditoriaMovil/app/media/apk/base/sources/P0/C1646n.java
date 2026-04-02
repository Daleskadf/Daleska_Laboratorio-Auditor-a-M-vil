package p0;

import o6.EnumC1565a;
/* renamed from: p0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1646n extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f15037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f15038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646n(N n7, n6.d dVar) {
        super(2, dVar);
        this.f15038b = n7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C1646n(this.f15038b, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1646n) create((I6.e) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15037a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f15037a = 1;
            if (N.c(this.f15038b, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
