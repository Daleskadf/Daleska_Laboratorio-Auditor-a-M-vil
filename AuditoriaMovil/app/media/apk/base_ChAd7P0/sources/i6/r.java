package I6;

import F6.InterfaceC0091h0;
import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class r extends AbstractC1700c {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ s f2275X;

    /* renamed from: Y  reason: collision with root package name */
    public int f2276Y;

    /* renamed from: a  reason: collision with root package name */
    public s f2277a;

    /* renamed from: b  reason: collision with root package name */
    public e f2278b;

    /* renamed from: c  reason: collision with root package name */
    public u f2279c;

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC0091h0 f2280d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2281e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, n6.d dVar) {
        super(dVar);
        this.f2275X = sVar;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.f2276Y |= Integer.MIN_VALUE;
        return this.f2275X.c0(null, this);
    }
}
