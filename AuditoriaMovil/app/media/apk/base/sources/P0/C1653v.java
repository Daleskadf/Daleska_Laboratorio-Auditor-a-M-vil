package p0;

import F6.C0106t;
import p6.AbstractC1700c;
/* renamed from: p0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1653v extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public Object f15059a;

    /* renamed from: b  reason: collision with root package name */
    public N f15060b;

    /* renamed from: c  reason: collision with root package name */
    public C0106t f15061c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f15062d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ N f15063e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1653v(N n7, AbstractC1700c abstractC1700c) {
        super(abstractC1700c);
        this.f15063e = n7;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f15062d = obj;
        this.f |= Integer.MIN_VALUE;
        return N.b(this.f15063e, null, this);
    }
}
