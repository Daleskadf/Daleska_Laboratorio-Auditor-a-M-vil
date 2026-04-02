package J6;

import F6.D;
import F6.F;
import F6.H;
import o6.EnumC1565a;
/* loaded from: classes.dex */
public final class d extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f2428a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2429b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I6.e f2430c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f2431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(I6.e eVar, f fVar, n6.d dVar) {
        super(2, dVar);
        this.f2430c = eVar;
        this.f2431d = fVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        d dVar2 = new d(this.f2430c, this.f2431d, dVar);
        dVar2.f2429b = obj;
        return dVar2;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f2428a;
        l6.j jVar = l6.j.f13876a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            D d7 = (D) this.f2429b;
            f fVar = this.f2431d;
            int i8 = fVar.f2436b;
            if (i8 == -3) {
                i8 = -2;
            }
            F f = F.ATOMIC;
            w6.p eVar = new e(fVar, null);
            H6.o oVar = new H6.o(H.r(d7, fVar.f2435a), H6.j.a(i8, fVar.f2437c, 4));
            oVar.Q(f, oVar, eVar);
            this.f2428a = 1;
            Object b5 = I6.t.b(this.f2430c, oVar, true, this);
            if (b5 != enumC1565a) {
                b5 = jVar;
            }
            if (b5 == enumC1565a) {
                return enumC1565a;
            }
        }
        return jVar;
    }
}
