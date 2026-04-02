package T5;

import android.content.Context;
import g1.C1006c;
import o6.EnumC1565a;
import t0.C1805d;
import t0.C1807f;
/* loaded from: classes.dex */
public final class C extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f5387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5388b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f5389c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f5390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, K k2, boolean z7, n6.d dVar) {
        super(2, dVar);
        this.f5388b = str;
        this.f5389c = k2;
        this.f5390d = z7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C(this.f5388b, this.f5389c, this.f5390d, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f5387a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            C1805d c1805d = new C1805d(this.f5388b);
            Context context = this.f5389c.f5417a;
            if (context != null) {
                C1006c a7 = L.a(context);
                B b5 = new B(c1805d, this.f5390d, null);
                this.f5387a = 1;
                if (a7.g(new C1807f(b5, null), this) == enumC1565a) {
                    return enumC1565a;
                }
            } else {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
        }
        return l6.j.f13876a;
    }
}
