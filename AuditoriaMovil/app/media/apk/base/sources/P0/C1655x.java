package p0;

import F6.C0106t;
import o6.EnumC1565a;
/* renamed from: p0.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655x extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f15069a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f15070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655x(N n7, n6.d dVar) {
        super(2, dVar);
        this.f15070b = n7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C1655x(this.f15070b, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1655x) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        I6.d hVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15069a;
        l6.j jVar = l6.j.f13876a;
        N n7 = this.f15070b;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    org.slf4j.helpers.i.M(obj);
                    return jVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            org.slf4j.helpers.i.M(obj);
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f15069a = 1;
            Object j = ((C0106t) n7.f14956Z.f921c).j(this);
            if (j != enumC1565a) {
                j = jVar;
            }
            if (j == enumC1565a) {
                return enumC1565a;
            }
        }
        A.c cVar = n7.f().f14991c;
        H6.a aVar = H6.a.DROP_OLDEST;
        if (cVar instanceof J6.j) {
            hVar = J6.l.a((J6.j) cVar, null, 0, aVar, 1);
        } else {
            hVar = new J6.h(cVar, n6.j.f14394a, 0, aVar);
        }
        I6.o oVar = new I6.o(n7, 2);
        this.f15069a = 2;
        if (hVar.c0(oVar, this) == enumC1565a) {
            return enumC1565a;
        }
        return jVar;
    }
}
