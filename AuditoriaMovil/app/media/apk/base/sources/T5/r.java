package T5;

import android.content.Context;
import o6.EnumC1565a;
import p0.InterfaceC1640h;
import t0.C1805d;
/* loaded from: classes.dex */
public final class r extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public kotlin.jvm.internal.r f5466a;

    /* renamed from: b  reason: collision with root package name */
    public int f5467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5468c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ K f5469d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f5470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, K k2, kotlin.jvm.internal.r rVar, n6.d dVar) {
        super(2, dVar);
        this.f5468c = str;
        this.f5469d = k2;
        this.f5470e = rVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new r(this.f5468c, this.f5469d, this.f5470e, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.r rVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f5467b;
        if (i7 != 0) {
            if (i7 == 1) {
                rVar = this.f5466a;
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            C1805d c1805d = new C1805d(this.f5468c);
            K k2 = this.f5469d;
            Context context = k2.f5417a;
            if (context != null) {
                R1.j jVar = new R1.j(((InterfaceC1640h) L.a(context).f11091a).getData(), c1805d, k2, 4);
                kotlin.jvm.internal.r rVar2 = this.f5470e;
                this.f5466a = rVar2;
                this.f5467b = 1;
                Object c8 = I6.t.c(jVar, this);
                if (c8 == enumC1565a) {
                    return enumC1565a;
                }
                rVar = rVar2;
                obj = c8;
            } else {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
        }
        rVar.f13796a = obj;
        return l6.j.f13876a;
    }
}
