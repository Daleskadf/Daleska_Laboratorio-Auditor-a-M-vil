package p0;

import o6.EnumC1565a;
/* renamed from: p0.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1632K extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f14941a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f14942b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ N f14943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632K(N n7, n6.d dVar) {
        super(2, dVar);
        this.f14943c = n7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1632K c1632k = new C1632K(this.f14943c, dVar);
        c1632k.f14942b = obj;
        return c1632k;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1632K) create((P) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14941a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f14941a = 1;
            if (N.b(this.f14943c, (P) this.f14942b, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
