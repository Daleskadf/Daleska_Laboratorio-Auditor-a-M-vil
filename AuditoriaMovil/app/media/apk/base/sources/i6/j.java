package I6;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class j extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2246a;

    /* renamed from: b  reason: collision with root package name */
    public int f2247b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A.f f2248c;

    /* renamed from: d  reason: collision with root package name */
    public A.f f2249d;

    /* renamed from: e  reason: collision with root package name */
    public e f2250e;
    public J6.n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(A.f fVar, n6.d dVar) {
        super(dVar);
        this.f2248c = fVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2246a = obj;
        this.f2247b |= Integer.MIN_VALUE;
        return this.f2248c.c0(null, this);
    }
}
