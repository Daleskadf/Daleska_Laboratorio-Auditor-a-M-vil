package T5;

import java.util.List;
import o6.EnumC1565a;
/* renamed from: T5.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353l extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public int f5446a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f5447b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f5448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353l(K k2, List list, n6.d dVar) {
        super(2, dVar);
        this.f5447b = k2;
        this.f5448c = list;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new C0353l(this.f5447b, this.f5448c, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0353l) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f5446a;
        if (i7 != 0) {
            if (i7 == 1) {
                org.slf4j.helpers.i.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            this.f5446a = 1;
            obj = K.b(this.f5447b, this.f5448c, this);
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        return obj;
    }
}
