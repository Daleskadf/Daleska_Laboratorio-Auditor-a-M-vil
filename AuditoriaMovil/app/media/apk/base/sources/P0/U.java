package p0;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class U extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public Object f14979a;

    /* renamed from: b  reason: collision with root package name */
    public O6.d f14980b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f14981c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ X f14982d;

    /* renamed from: e  reason: collision with root package name */
    public int f14983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f14982d = x7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f14981c = obj;
        this.f14983e |= Integer.MIN_VALUE;
        return this.f14982d.b(null, this);
    }
}
