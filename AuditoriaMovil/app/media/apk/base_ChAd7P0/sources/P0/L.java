package p0;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class L extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public kotlin.jvm.internal.p f14944a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f14945b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ N f14946c;

    /* renamed from: d  reason: collision with root package name */
    public int f14947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f14946c = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f14945b = obj;
        this.f14947d |= Integer.MIN_VALUE;
        return this.f14946c.j(null, false, this);
    }
}
