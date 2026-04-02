package p0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o6.EnumC1565a;
/* renamed from: p0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1639g extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f15007a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15008b;

    /* renamed from: c  reason: collision with root package name */
    public int f15009c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f15010d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List f15011e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639g(List list, ArrayList arrayList, n6.d dVar) {
        super(2, dVar);
        this.f15011e = list;
        this.f = arrayList;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1639g c1639g = new C1639g(this.f15011e, this.f, dVar);
        c1639g.f15010d = obj;
        return c1639g;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1639g) create(obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.f15009c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    it = this.f15007a;
                    list = (List) this.f15010d;
                    org.slf4j.helpers.i.M(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f15008b;
                Iterator it2 = this.f15007a;
                List list2 = (List) this.f15010d;
                org.slf4j.helpers.i.M(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new p6.i(1, null));
                    this.f15010d = list2;
                    this.f15007a = it2;
                    this.f15008b = null;
                    this.f15009c = 2;
                    throw null;
                }
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            obj = this.f15010d;
            it = this.f15011e.iterator();
            list = this.f;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.f15010d = list;
            this.f15007a = it;
            this.f15008b = obj;
            this.f15009c = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
