package p0;

import o6.EnumC1565a;
/* renamed from: p0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622A extends p6.i implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f14900a;

    /* renamed from: b  reason: collision with root package name */
    public int f14901b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ N f14902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1622A(N n7, n6.d dVar) {
        super(1, dVar);
        this.f14902c = n7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(n6.d dVar) {
        return new C1622A(this.f14902c, dVar);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        return ((C1622A) create((n6.d) obj)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Y y2;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14901b;
        N n7 = this.f14902c;
        try {
        } catch (Throwable th2) {
            X f = n7.f();
            this.f14900a = th2;
            this.f14901b = 2;
            Integer a7 = f.a();
            if (a7 == enumC1565a) {
                return enumC1565a;
            }
            th = th2;
            obj = a7;
        }
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    th = this.f14900a;
                    org.slf4j.helpers.i.M(obj);
                    y2 = new Q(((Number) obj).intValue(), th);
                    return new l6.d(y2, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.slf4j.helpers.i.M(obj);
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f14901b = 1;
            obj = N.e(n7, true, this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        y2 = (Y) obj;
        return new l6.d(y2, Boolean.TRUE);
    }
}
