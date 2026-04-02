package r0;

import p6.AbstractC1700c;
/* renamed from: r0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726f extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public C1728h f15426a;

    /* renamed from: b  reason: collision with root package name */
    public C1722b f15427b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15428c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f15429d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1728h f15430e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726f(C1728h c1728h, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15430e = c1728h;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15429d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.f15430e.a(null, this);
    }
}
