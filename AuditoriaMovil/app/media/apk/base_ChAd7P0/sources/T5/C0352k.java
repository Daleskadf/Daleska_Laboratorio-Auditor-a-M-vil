package T5;

import o6.EnumC1565a;
import t0.C1803b;
import t0.C1805d;
/* renamed from: T5.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352k extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1805d f5444b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0352k(C1805d c1805d, String str, n6.d dVar) {
        super(2, dVar);
        this.f5444b = c1805d;
        this.f5445c = str;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C0352k c0352k = new C0352k(this.f5444b, this.f5445c, dVar);
        c0352k.f5443a = obj;
        return c0352k;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((C0352k) create((C1803b) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        ((C1803b) this.f5443a).d(this.f5444b, this.f5445c);
        return l6.j.f13876a;
    }
}
