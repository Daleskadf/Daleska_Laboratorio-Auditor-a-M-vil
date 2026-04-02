package p0;

import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class S extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public E.e f14971a;

    /* renamed from: b  reason: collision with root package name */
    public O6.a f14972b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f14973c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ E.e f14974d;

    /* renamed from: e  reason: collision with root package name */
    public int f14975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(E.e eVar, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f14974d = eVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f14973c = obj;
        this.f14975e |= Integer.MIN_VALUE;
        return this.f14974d.d0(this);
    }
}
