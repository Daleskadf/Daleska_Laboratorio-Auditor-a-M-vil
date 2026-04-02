package p0;

import F6.C0106t;
import g1.C1006c;
import java.util.concurrent.atomic.AtomicInteger;
import o6.EnumC1565a;
/* renamed from: p0.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630I extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f14936a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f14937b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ N f14938c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p6.i f14939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630I(N n7, w6.p pVar, n6.d dVar) {
        super(2, dVar);
        this.f14938c = n7;
        this.f14939d = (p6.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1630I c1630i = new C1630I(this.f14938c, this.f14939d, dVar);
        c1630i.f14937b = obj;
        return c1630i;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1630I) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        H6.h hVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f14936a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            C0106t a7 = F6.H.a();
            N n7 = this.f14938c;
            P p7 = new P(this.f14939d, a7, n7.f14955Y.j(), ((F6.D) this.f14937b).a());
            E.e eVar = n7.f14964g0;
            Object e7 = ((H6.c) eVar.f922d).e(p7);
            Throwable th = null;
            if (e7 instanceof H6.h) {
                if (e7 instanceof H6.h) {
                    hVar = (H6.h) e7;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    th = hVar.f2068a;
                }
                if (th == null) {
                    throw new IllegalStateException("Channel was closed normally");
                }
                throw th;
            } else if (!(e7 instanceof H6.i)) {
                if (((AtomicInteger) ((C1006c) eVar.f923e).f11091a).getAndIncrement() == 0) {
                    F6.H.q((F6.D) eVar.f920b, null, new T(eVar, null), 3);
                }
                this.f14936a = 1;
                obj = a7.j(this);
                if (obj == enumC1565a) {
                    return enumC1565a;
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return obj;
    }
}
