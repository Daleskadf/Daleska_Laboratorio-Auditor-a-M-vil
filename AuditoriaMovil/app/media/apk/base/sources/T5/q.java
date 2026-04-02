package T5;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class q extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5463a;

    /* renamed from: b  reason: collision with root package name */
    public int f5464b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I6.l f5465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(I6.l lVar, n6.d dVar) {
        super(dVar);
        this.f5465c = lVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f5463a = obj;
        this.f5464b |= Integer.MIN_VALUE;
        return this.f5465c.a(null, this);
    }
}
