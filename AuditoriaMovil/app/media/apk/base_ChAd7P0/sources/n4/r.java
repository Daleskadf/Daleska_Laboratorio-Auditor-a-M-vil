package n4;

import java.util.Date;
import java.util.concurrent.Callable;
import org.apache.tika.pipes.PipesClient;
import p.C1608t;
import p4.C1683m;
import p4.InterfaceC1672b;
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14354a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14355b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14356c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.f14354a = i7;
        this.f14355b = obj;
        this.f14356c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        q4.n j;
        Integer lambda$restart$1;
        switch (this.f14354a) {
            case 0:
                E.e eVar = ((C1533t) this.f14355b).f14365g.f;
                q4.h hVar = (q4.h) this.f14356c;
                r4.d L6 = ((InterfaceC1672b) eVar.f922d).L(hVar);
                if (L6 != null && !(L6.f15491b instanceof r4.l)) {
                    j = q4.n.g(hVar);
                } else {
                    j = ((p4.C) eVar.f920b).j(hVar);
                }
                if (L6 != null) {
                    L6.f15491b.a(j, r4.f.f15492b, new U3.p(new Date()));
                }
                return j;
            case 1:
                C1683m c1683m = ((C1533t) this.f14355b).f14365g;
                D d7 = (D) this.f14356c;
                C1608t b5 = c1683m.b(d7, true);
                C5.e eVar2 = new C5.e(d7, (e4.e) b5.f14881c);
                return (T) eVar2.b(eVar2.e((e4.c) b5.f14880b, null), null, false).f7209b;
            default:
                lambda$restart$1 = ((PipesClient) this.f14355b).lambda$restart$1((X6.c) this.f14356c);
                return lambda$restart$1;
        }
    }
}
