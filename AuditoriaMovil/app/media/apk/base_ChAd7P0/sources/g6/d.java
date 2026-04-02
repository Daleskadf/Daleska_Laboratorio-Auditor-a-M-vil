package G6;

import F6.L0;
import H.h;
import H6.i;
import K6.w;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.k;
import l6.j;
import p0.C1631J;
import w6.l;
/* loaded from: classes.dex */
public final class d extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1606b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        super(1);
        this.f1605a = i7;
        this.f1606b = obj;
        this.f1607c = obj2;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        Object hVar;
        H6.k kVar;
        L0 l02;
        j jVar;
        j jVar2;
        switch (this.f1605a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((e) this.f1606b).f1608c.removeCallbacks((h) this.f1607c);
                return j.f13876a;
            default:
                Throwable th2 = (Throwable) obj;
                ((E6.l) this.f1606b).invoke(th2);
                E.e eVar = (E.e) this.f1607c;
                ((H6.c) eVar.f922d).g(false, th2);
                do {
                    H6.c cVar = (H6.c) eVar.f922d;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = H6.c.f2041d;
                    long j = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = H6.c.f2040c;
                    long j8 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.q(j8, true)) {
                        hVar = new H6.h(cVar.l());
                    } else {
                        int i7 = (j > (j8 & 1152921504606846975L) ? 1 : (j == (j8 & 1152921504606846975L) ? 0 : -1));
                        Object obj2 = H6.j.f2069a;
                        if (i7 < 0) {
                            w wVar = H6.e.f2056k;
                            H6.k kVar2 = (H6.k) H6.c.f2038Y.get(cVar);
                            for (boolean z7 = true; !cVar.q(atomicLongFieldUpdater2.get(cVar), z7); z7 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                long j9 = H6.e.f2049b;
                                Object obj3 = obj2;
                                long j10 = andIncrement / j9;
                                int i8 = (int) (andIncrement % j9);
                                if (kVar2.f2804c != j10) {
                                    H6.k k2 = cVar.k(j10, kVar2);
                                    if (k2 == null) {
                                        continue;
                                        obj2 = obj3;
                                    } else {
                                        kVar = k2;
                                    }
                                } else {
                                    kVar = kVar2;
                                }
                                Object z8 = cVar.z(kVar, i8, andIncrement, wVar);
                                if (z8 == H6.e.f2058m) {
                                    if (wVar instanceof L0) {
                                        l02 = (L0) wVar;
                                    } else {
                                        l02 = null;
                                    }
                                    if (l02 != null) {
                                        l02.a(kVar, i8);
                                    }
                                    cVar.B(andIncrement);
                                    kVar.h();
                                    obj2 = obj3;
                                } else if (z8 == H6.e.f2060o) {
                                    if (andIncrement < cVar.o()) {
                                        kVar.a();
                                    }
                                    kVar2 = kVar;
                                    obj2 = obj3;
                                } else if (z8 != H6.e.f2059n) {
                                    kVar.a();
                                    obj2 = z8;
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                            }
                            hVar = new H6.h(cVar.l());
                        }
                        hVar = obj2;
                    }
                    jVar = null;
                    if (hVar instanceof i) {
                        hVar = null;
                    }
                    jVar2 = j.f13876a;
                    if (hVar != null) {
                        C1631J.f14940a.invoke(hVar, th2);
                        jVar = jVar2;
                        continue;
                    }
                } while (jVar != null);
                return jVar2;
        }
    }
}
