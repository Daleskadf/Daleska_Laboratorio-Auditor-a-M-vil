package I6;

import T5.C0355n;
import p6.AbstractC1700c;
/* loaded from: classes.dex */
public final class n extends AbstractC1700c {

    /* renamed from: a  reason: collision with root package name */
    public C0355n f2264a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2265b;

    /* renamed from: c  reason: collision with root package name */
    public int f2266c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0355n f2267d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0355n c0355n, n6.d dVar) {
        super(dVar);
        this.f2267d = c0355n;
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        this.f2265b = obj;
        this.f2266c |= Integer.MIN_VALUE;
        return this.f2267d.a(null, this);
    }
}
