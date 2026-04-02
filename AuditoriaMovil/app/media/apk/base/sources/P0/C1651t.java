package p0;

import p6.AbstractC1700c;
/* renamed from: p0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1651t extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public N f15052a;

    /* renamed from: b  reason: collision with root package name */
    public O6.d f15053b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15054c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f15055d;

    /* renamed from: e  reason: collision with root package name */
    public int f15056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1651t(N n7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15055d = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15054c = obj;
        this.f15056e |= Integer.MIN_VALUE;
        return N.a(this.f15055d, this);
    }
}
