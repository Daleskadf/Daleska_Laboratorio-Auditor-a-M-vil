package k9;

import k9.f;
import kotlin.coroutines.Continuation;
import t9.i;
/* loaded from: classes3.dex */
public interface d extends f.b {

    /* renamed from: e0  reason: collision with root package name */
    public static final b f15705e0 = b.f15706a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static f.b a(d dVar, f.c cVar) {
            i.g(cVar, "key");
            if (cVar instanceof k9.b) {
                k9.b bVar = (k9.b) cVar;
                if (!bVar.a(dVar.getKey())) {
                    return null;
                }
                f.b b10 = bVar.b(dVar);
                if (!(b10 instanceof f.b)) {
                    return null;
                }
                return b10;
            } else if (d.f15705e0 != cVar) {
                return null;
            } else {
                i.e(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        public static f b(d dVar, f.c cVar) {
            i.g(cVar, "key");
            if (cVar instanceof k9.b) {
                k9.b bVar = (k9.b) cVar;
                if (bVar.a(dVar.getKey()) && bVar.b(dVar) != null) {
                    return g.f15708a;
                }
                return dVar;
            } else if (d.f15705e0 == cVar) {
                return g.f15708a;
            } else {
                return dVar;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements f.c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f15706a = new b();
    }

    void b(Continuation continuation);

    Continuation c(Continuation continuation);
}
