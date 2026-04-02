package I6;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class a extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public J6.n f2221a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A.c f2223c;

    /* renamed from: d  reason: collision with root package name */
    public int f2224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A.c cVar, n6.d dVar) {
        super(dVar);
        this.f2223c = cVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2222b = obj;
        this.f2224d |= Integer.MIN_VALUE;
        return this.f2223c.c0(null, this);
    }
}
