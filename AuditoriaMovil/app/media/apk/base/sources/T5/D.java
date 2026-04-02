package T5;

import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class D extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f5391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f5392b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5393c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f5394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(K k2, String str, String str2, n6.d dVar) {
        super(2, dVar);
        this.f5392b = k2;
        this.f5393c = str;
        this.f5394d = str2;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new D(this.f5392b, this.f5393c, this.f5394d, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f5391a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f5391a = 1;
            if (K.a(this.f5392b, this.f5393c, this.f5394d, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
