package T5;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class y extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5497a;

    /* renamed from: b  reason: collision with root package name */
    public int f5498b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0355n f5499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0355n c0355n, n6.d dVar) {
        super(dVar);
        this.f5499c = c0355n;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f5497a = obj;
        this.f5498b |= Integer.MIN_VALUE;
        return this.f5499c.a(null, this);
    }
}
