package T5;

import android.content.Context;
import g1.C1006c;
import java.util.List;
import o6.EnumC1565a;
import t0.C1807f;
/* renamed from: T5.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351j extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f5440a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f5441b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f5442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0351j(K k2, List list, n6.d dVar) {
        super(2, dVar);
        this.f5441b = k2;
        this.f5442c = list;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C0351j(this.f5441b, this.f5442c, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0351j) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f5440a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            Context context = this.f5441b.f5417a;
            if (context != null) {
                C1006c a7 = L.a(context);
                C0350i c0350i = new C0350i(this.f5442c, null);
                this.f5440a = 1;
                obj = a7.g(new C1807f(c0350i, null), this);
                if (obj == enumC1565a) {
                    return enumC1565a;
                }
            } else {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
        }
        return obj;
    }
}
