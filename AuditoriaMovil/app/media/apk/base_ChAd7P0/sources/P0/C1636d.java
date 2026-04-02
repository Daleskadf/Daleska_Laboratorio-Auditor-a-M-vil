package p0;

import java.util.List;
import o6.EnumC1565a;
/* renamed from: p0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1636d extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f14999a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15000b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f15001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636d(List list, n6.d dVar) {
        super(2, dVar);
        this.f15001c = list;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1636d c1636d = new C1636d(this.f15001c, dVar);
        c1636d.f15000b = obj;
        return c1636d;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1636d) create((C1643k) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14999a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f14999a = 1;
            if (F.f.c(this.f15001c, (C1643k) this.f15000b, this) == enumC1565a) {
                return enumC1565a;
            }
        }
        return l6.j.f13876a;
    }
}
