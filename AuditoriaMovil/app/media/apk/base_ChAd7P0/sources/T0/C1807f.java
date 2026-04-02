package t0;

import java.util.LinkedHashMap;
import l6.j;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* renamed from: t0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1807f extends i implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f15709a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15710b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f15711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807f(p pVar, n6.d dVar) {
        super(2, dVar);
        this.f15711c = (i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1807f c1807f = new C1807f(this.f15711c, dVar);
        c1807f.f15710b = obj;
        return c1807f;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1807f) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(j.f13876a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15709a;
        if (i7 != 0) {
            if (i7 == 1) {
                C1803b c1803b = (C1803b) this.f15710b;
                org.slf4j.helpers.i.M(obj);
                return c1803b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        org.slf4j.helpers.i.M(obj);
        C1803b c1803b2 = new C1803b(new LinkedHashMap(((C1803b) this.f15710b).a()), false);
        this.f15710b = c1803b2;
        this.f15709a = 1;
        if (this.f15711c.invoke(c1803b2, this) == enumC1565a) {
            return enumC1565a;
        }
        return c1803b2;
    }
}
