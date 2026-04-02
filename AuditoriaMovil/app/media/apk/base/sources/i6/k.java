package I6;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class k extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public l f2251a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2252b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f2253c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f2254d;

    /* renamed from: e  reason: collision with root package name */
    public int f2255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, n6.d dVar) {
        super(dVar);
        this.f2254d = lVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2253c = obj;
        this.f2255e |= Integer.MIN_VALUE;
        return this.f2254d.a(null, this);
    }
}
