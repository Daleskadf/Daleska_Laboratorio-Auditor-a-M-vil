package p0;

import java.io.Serializable;
import o6.EnumC1565a;
/* renamed from: p0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626E extends p6.i implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f14921a;

    /* renamed from: b  reason: collision with root package name */
    public int f14922b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f14923c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f14924d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f14925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626E(kotlin.jvm.internal.r rVar, N n7, kotlin.jvm.internal.p pVar, n6.d dVar) {
        super(1, dVar);
        this.f14923c = rVar;
        this.f14924d = n7;
        this.f14925e = pVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(n6.d dVar) {
        return new C1626E(this.f14923c, this.f14924d, this.f14925e, dVar);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        return ((C1626E) create((n6.d) obj)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.p pVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14922b;
        kotlin.jvm.internal.p pVar2 = this.f14925e;
        kotlin.jvm.internal.r rVar2 = this.f14923c;
        N n7 = this.f14924d;
        try {
        } catch (C1634b unused) {
            Object obj2 = rVar2.f13796a;
            this.f14921a = pVar2;
            this.f14922b = 3;
            obj = n7.j(obj2, true, this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        pVar2 = (kotlin.jvm.internal.p) this.f14921a;
                        org.slf4j.helpers.i.M(obj);
                        pVar2.f13794a = ((Number) obj).intValue();
                        return l6.j.f13876a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.f14921a;
                org.slf4j.helpers.i.M(obj);
                pVar.f13794a = ((Number) obj).intValue();
                return l6.j.f13876a;
            }
            rVar = (kotlin.jvm.internal.r) this.f14921a;
            org.slf4j.helpers.i.M(obj);
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f14921a = rVar2;
            this.f14922b = 1;
            obj = n7.i(this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
            rVar = rVar2;
        }
        rVar.f13796a = obj;
        X f = n7.f();
        this.f14921a = pVar2;
        this.f14922b = 2;
        obj = f.a();
        if (obj == enumC1565a) {
            return enumC1565a;
        }
        pVar = pVar2;
        pVar.f13794a = ((Number) obj).intValue();
        return l6.j.f13876a;
    }
}
