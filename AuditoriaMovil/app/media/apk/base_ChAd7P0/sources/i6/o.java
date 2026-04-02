package I6;

import B5.C0050x;
import o6.EnumC1565a;
import p0.N;
import p0.O;
/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2270b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f2269a = i7;
        this.f2270b = obj;
    }

    @Override // I6.e
    public final Object a(Object obj, n6.d dVar) {
        Object d7;
        switch (this.f2269a) {
            case 0:
                ((kotlin.jvm.internal.r) this.f2270b).f13796a = obj;
                throw new J6.a(this);
            case 1:
                ((C0050x) this.f2270b).accept(obj);
                return l6.j.f13876a;
            default:
                l6.j jVar = (l6.j) obj;
                N n7 = (N) this.f2270b;
                boolean z7 = n7.f14955Y.j() instanceof O;
                l6.j jVar2 = l6.j.f13876a;
                if (!z7 && (d7 = N.d(n7, true, dVar)) == EnumC1565a.COROUTINE_SUSPENDED) {
                    return d7;
                }
                return jVar2;
        }
    }
}
