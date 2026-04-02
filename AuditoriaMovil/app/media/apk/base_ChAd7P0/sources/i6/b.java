package I6;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class b extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public H6.p f2225a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2226b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f2227c;

    /* renamed from: d  reason: collision with root package name */
    public int f2228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f2227c = cVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2226b = obj;
        this.f2228d |= Integer.MIN_VALUE;
        return this.f2227c.a(null, this);
    }
}
