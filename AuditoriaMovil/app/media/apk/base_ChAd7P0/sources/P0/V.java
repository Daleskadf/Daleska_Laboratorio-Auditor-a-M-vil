package p0;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class V extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public O6.d f14984a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14985b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f14986c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ X f14987d;

    /* renamed from: e  reason: collision with root package name */
    public int f14988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f14987d = x7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f14986c = obj;
        this.f14988e |= Integer.MIN_VALUE;
        return this.f14987d.c(null, this);
    }
}
