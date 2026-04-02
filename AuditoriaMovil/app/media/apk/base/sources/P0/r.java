package p0;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class r extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f15045a;

    /* renamed from: b  reason: collision with root package name */
    public int f15046b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ T5.A f15047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(T5.A a7, n6.d dVar) {
        super(dVar);
        this.f15047c = a7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15045a = obj;
        this.f15046b |= Integer.MIN_VALUE;
        return this.f15047c.a(null, this);
    }
}
