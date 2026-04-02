package T5;

import android.content.Context;
import o6.EnumC1565a;
import p0.InterfaceC1640h;
import t0.C1805d;
/* loaded from: classes.dex */
public final class x extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public kotlin.jvm.internal.r f5492a;

    /* renamed from: b  reason: collision with root package name */
    public int f5493b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5494c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ K f5495d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f5496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, K k2, kotlin.jvm.internal.r rVar, n6.d dVar) {
        super(2, dVar);
        this.f5494c = str;
        this.f5495d = k2;
        this.f5496e = rVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new x(this.f5494c, this.f5495d, this.f5496e, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.r rVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f5493b;
        if (i7 != 0) {
            if (i7 == 1) {
                rVar = this.f5492a;
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            C1805d c1805d = new C1805d(this.f5494c);
            Context context = this.f5495d.f5417a;
            if (context != null) {
                C0356o c0356o = new C0356o(((InterfaceC1640h) L.a(context).f11091a).getData(), c1805d, 2);
                kotlin.jvm.internal.r rVar2 = this.f5496e;
                this.f5492a = rVar2;
                this.f5493b = 1;
                Object c8 = I6.t.c(c0356o, this);
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
