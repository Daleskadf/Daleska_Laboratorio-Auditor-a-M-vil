package T5;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class z extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f5500a;

    /* renamed from: b  reason: collision with root package name */
    public int f5501b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A f5502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a7, n6.d dVar) {
        super(dVar);
        this.f5502c = a7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f5500a = obj;
        this.f5501b |= Integer.MIN_VALUE;
        return this.f5502c.a(null, this);
    }
}
