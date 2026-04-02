package p0;

import o6.EnumC1565a;
/* renamed from: p0.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1623B extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f14903a;

    /* renamed from: b  reason: collision with root package name */
    public int f14904b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ boolean f14905c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f14906d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f14907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623B(N n7, int i7, n6.d dVar) {
        super(2, dVar);
        this.f14906d = n7;
        this.f14907e = i7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1623B c1623b = new C1623B(this.f14906d, this.f14907e, dVar);
        c1623b.f14905c = ((Boolean) obj).booleanValue();
        return c1623b;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C1623B) create(bool, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i7;
        boolean z7;
        Y y2;
        boolean z8;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        boolean z9 = this.f14904b;
        N n7 = this.f14906d;
        try {
        } catch (Throwable th2) {
            if (z9 != 0) {
                X f = n7.f();
                this.f14903a = th2;
                this.f14905c = z9;
                this.f14904b = 2;
                Integer a7 = f.a();
                if (a7 == enumC1565a) {
                    return enumC1565a;
                }
                z7 = z9;
                th = th2;
                obj = a7;
            } else {
                boolean z10 = z9;
                th = th2;
                i7 = this.f14907e;
                z7 = z10;
            }
        }
        if (z9 != 0) {
            if (z9 != 1) {
                if (z9 == 2) {
                    z7 = this.f14905c;
                    th = this.f14903a;
                    org.slf4j.helpers.i.M(obj);
                    i7 = ((Number) obj).intValue();
                    Q q2 = new Q(i7, th);
                    z8 = z7;
                    y2 = q2;
                    return new l6.d(y2, Boolean.valueOf(z8));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z11 = this.f14905c;
            org.slf4j.helpers.i.M(obj);
            z9 = z11;
        } else {
            org.slf4j.helpers.i.M(obj);
            boolean z12 = this.f14905c;
            this.f14905c = z12;
            this.f14904b = 1;
            obj = N.e(n7, z12, this);
            z9 = z12;
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        y2 = (Y) obj;
        z8 = z9;
        return new l6.d(y2, Boolean.valueOf(z8));
    }
}
