package T5;

import java.util.List;
import o6.EnumC1565a;
import t0.C1803b;
import t0.C1805d;
/* renamed from: T5.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350i extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f5439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0350i(List list, n6.d dVar) {
        super(2, dVar);
        this.f5439b = list;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C0350i c0350i = new C0350i(this.f5439b, dVar);
        c0350i.f5438a = obj;
        return c0350i;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((C0350i) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        l6.j jVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        C1803b c1803b = (C1803b) this.f5438a;
        l6.j jVar2 = l6.j.f13876a;
        List<String> list = this.f5439b;
        if (list != null) {
            for (String name : list) {
                kotlin.jvm.internal.j.e(name, "name");
                C1805d c1805d = new C1805d(name);
                c1803b.b();
                c1803b.f15703a.remove(c1805d);
            }
            jVar = jVar2;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            c1803b.b();
            c1803b.f15703a.clear();
        }
        return jVar2;
    }
}
