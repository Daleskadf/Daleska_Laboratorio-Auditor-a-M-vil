package p0;

import p6.AbstractC1700c;
/* renamed from: p0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1641i extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public E.e f15012a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15013b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E.e f15014c;

    /* renamed from: d  reason: collision with root package name */
    public int f15015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1641i(E.e eVar, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15014c = eVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15013b = obj;
        this.f15015d |= Integer.MIN_VALUE;
        return this.f15014c.z(this);
    }
}
