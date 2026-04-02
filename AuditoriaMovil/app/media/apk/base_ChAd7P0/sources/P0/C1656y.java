package p0;

import p6.AbstractC1700c;
/* renamed from: p0.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656y extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public N f15071a;

    /* renamed from: b  reason: collision with root package name */
    public int f15072b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15073c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f15074d;

    /* renamed from: e  reason: collision with root package name */
    public int f15075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656y(N n7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15074d = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15073c = obj;
        this.f15075e |= Integer.MIN_VALUE;
        return this.f15074d.h(this);
    }
}
