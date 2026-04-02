package I6;

import T5.C0355n;
import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class m extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2260a;

    /* renamed from: b  reason: collision with root package name */
    public int f2261b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A.f f2262c;

    /* renamed from: d  reason: collision with root package name */
    public C0355n f2263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(A.f fVar, n6.d dVar) {
        super(dVar);
        this.f2262c = fVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2260a = obj;
        this.f2261b |= Integer.MIN_VALUE;
        return this.f2262c.c0(null, this);
    }
}
