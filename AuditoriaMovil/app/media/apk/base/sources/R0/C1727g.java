package r0;

import Q6.o;
import p6.AbstractC1700c;
/* renamed from: r0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727g extends AbstractC1700c {

    /* renamed from: X  reason: collision with root package name */
    public int f15431X;

    /* renamed from: a  reason: collision with root package name */
    public C1728h f15432a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15433b;

    /* renamed from: c  reason: collision with root package name */
    public o f15434c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15435d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f15436e;
    public final /* synthetic */ C1728h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727g(C1728h c1728h, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f = c1728h;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15436e = obj;
        this.f15431X |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
