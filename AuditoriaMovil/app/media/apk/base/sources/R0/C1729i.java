package r0;

import Q6.k;
import Q6.q;
import p6.AbstractC1700c;
/* renamed from: r0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729i extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public k f15442a;

    /* renamed from: b  reason: collision with root package name */
    public k f15443b;

    /* renamed from: c  reason: collision with root package name */
    public q f15444c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f15445d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1730j f15446e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729i(C1730j c1730j, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15446e = c1730j;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15445d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.f15446e.b(null, this);
    }
}
