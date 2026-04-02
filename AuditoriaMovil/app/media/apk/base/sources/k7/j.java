package k7;

import F6.D;
import o6.EnumC1565a;
import w6.p;
/* loaded from: classes.dex */
public final class j extends p6.i implements p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f13748a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f13749b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13750c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f13751d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l7.d f13752e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, l lVar2, l7.d dVar, long j, n6.d dVar2) {
        super(2, dVar2);
        this.f13749b = lVar;
        this.f13750c = str;
        this.f13751d = lVar2;
        this.f13752e = dVar;
        this.f = j;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        j jVar = new j(this.f13749b, this.f13750c, this.f13751d, this.f13752e, this.f, dVar);
        jVar.f13748a = obj;
        return jVar;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        l6.j jVar = l6.j.f13876a;
        ((j) create((D) obj, (n6.d) obj2)).invokeSuspend(jVar);
        return jVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        l lVar = this.f13749b;
        o oVar = lVar.f13759a;
        StringBuilder sb = new StringBuilder("Now loading ");
        String str = this.f13750c;
        sb.append(str);
        oVar.c(sb.toString());
        int load = lVar.f13757X.f13764a.load(str, 1);
        lVar.f13757X.f13765b.put(new Integer(load), this.f13751d);
        lVar.f13762d = new Integer(load);
        o oVar2 = lVar.f13759a;
        oVar2.c("time to call load() for " + this.f13752e + ": " + (System.currentTimeMillis() - this.f) + " player=" + ((D) this.f13748a));
        return l6.j.f13876a;
    }
}
