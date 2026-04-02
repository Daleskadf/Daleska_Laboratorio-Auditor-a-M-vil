package K6;

import F6.C0110x;
import F6.H;
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w6.l f2798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2799b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n6.i f2800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w6.l lVar, Object obj, n6.i iVar) {
        super(1);
        this.f2798a = lVar;
        this.f2799b = obj;
        this.f2800c = iVar;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C0110x a7 = AbstractC0208a.a(this.f2798a, this.f2799b, null);
        if (a7 != null) {
            H.l(this.f2800c, a7);
        }
        return l6.j.f13876a;
    }
}
