package p0;

import p6.AbstractC1700c;
/* renamed from: p0.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1654w extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public N f15064a;

    /* renamed from: b  reason: collision with root package name */
    public O6.d f15065b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15066c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f15067d;

    /* renamed from: e  reason: collision with root package name */
    public int f15068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1654w(N n7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15067d = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15066c = obj;
        this.f15068e |= Integer.MIN_VALUE;
        return N.c(this.f15067d, this);
    }
}
