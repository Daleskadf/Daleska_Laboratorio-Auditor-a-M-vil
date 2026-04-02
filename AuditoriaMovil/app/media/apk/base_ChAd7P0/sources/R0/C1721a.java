package r0;

import Q6.s;
import p6.AbstractC1700c;
/* renamed from: r0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721a extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public Object f15410a;

    /* renamed from: b  reason: collision with root package name */
    public s f15411b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15412c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1722b f15413d;

    /* renamed from: e  reason: collision with root package name */
    public int f15414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721a(C1722b c1722b, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15413d = c1722b;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15412c = obj;
        this.f15414e |= Integer.MIN_VALUE;
        return C1722b.a(this.f15413d, this);
    }
}
