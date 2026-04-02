package p0;

import o6.EnumC1565a;
/* renamed from: p0.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627F extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f14926a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f14927b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627F(N n7, n6.d dVar) {
        super(2, dVar);
        this.f14927b = n7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C1627F(this.f14927b, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1627F) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14926a;
        N n7 = this.f14927b;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        org.slf4j.helpers.i.M(obj);
                        return (Y) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                org.slf4j.helpers.i.M(obj);
            } else {
                org.slf4j.helpers.i.M(obj);
                if (n7.f14955Y.j() instanceof O) {
                    return n7.f14955Y.j();
                }
                this.f14926a = 1;
                if (n7.h(this) == enumC1565a) {
                    return enumC1565a;
                }
            }
            this.f14926a = 2;
            obj = N.d(n7, false, this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
            return (Y) obj;
        } catch (Throwable th) {
            return new Q(-1, th);
        }
    }
}
