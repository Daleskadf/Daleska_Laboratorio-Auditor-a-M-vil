package H6;

import F6.C0100m;
import F6.H;
import F6.L0;
import K6.u;
import K6.v;
import K6.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o6.EnumC1565a;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class b implements L0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f2034a = e.f2061p;

    /* renamed from: b  reason: collision with root package name */
    public C0100m f2035b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f2036c;

    public b(c cVar) {
        this.f2036c = cVar;
    }

    @Override // F6.L0
    public final void a(u uVar, int i7) {
        C0100m c0100m = this.f2035b;
        if (c0100m != null) {
            c0100m.a(uVar, i7);
        }
    }

    public final Object b(I6.f fVar) {
        C0100m c0100m;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f2038Y;
        c cVar = this.f2036c;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.q(c.f2040c.get(cVar), true)) {
                this.f2034a = e.f2057l;
                Throwable l8 = cVar.l();
                if (l8 == null) {
                    return Boolean.FALSE;
                }
                int i7 = v.f2805a;
                throw l8;
            }
            long andIncrement = c.f2041d.getAndIncrement(cVar);
            long j = e.f2049b;
            long j8 = andIncrement / j;
            int i8 = (int) (andIncrement % j);
            if (kVar.f2804c != j8) {
                k k2 = cVar.k(j8, kVar);
                if (k2 == null) {
                    continue;
                } else {
                    kVar = k2;
                }
            }
            Object z7 = cVar.z(kVar, i8, andIncrement, null);
            w wVar = e.f2058m;
            if (z7 != wVar) {
                w wVar2 = e.f2060o;
                if (z7 == wVar2) {
                    if (andIncrement < cVar.o()) {
                        kVar.a();
                    }
                } else if (z7 == e.f2059n) {
                    c cVar2 = this.f2036c;
                    C0100m k8 = H.k(AbstractC1740d.q(fVar));
                    try {
                        this.f2035b = k8;
                        c0100m = k8;
                        try {
                            Object z8 = cVar2.z(kVar, i8, andIncrement, this);
                            if (z8 == wVar) {
                                a(kVar, i8);
                            } else {
                                K6.p pVar = null;
                                n6.i iVar = c0100m.f1285e;
                                w6.l lVar = cVar2.f2046b;
                                if (z8 == wVar2) {
                                    if (andIncrement < cVar2.o()) {
                                        kVar.a();
                                    }
                                    k kVar2 = (k) c.f2038Y.get(cVar2);
                                    while (true) {
                                        if (cVar2.q(c.f2040c.get(cVar2), true)) {
                                            C0100m c0100m2 = this.f2035b;
                                            kotlin.jvm.internal.j.b(c0100m2);
                                            this.f2035b = null;
                                            this.f2034a = e.f2057l;
                                            Throwable l9 = cVar.l();
                                            if (l9 == null) {
                                                c0100m2.resumeWith(Boolean.FALSE);
                                            } else {
                                                c0100m2.resumeWith(org.slf4j.helpers.i.j(l9));
                                            }
                                        } else {
                                            long andIncrement2 = c.f2041d.getAndIncrement(cVar2);
                                            long j9 = e.f2049b;
                                            long j10 = andIncrement2 / j9;
                                            int i9 = (int) (andIncrement2 % j9);
                                            if (kVar2.f2804c != j10) {
                                                k k9 = cVar2.k(j10, kVar2);
                                                if (k9 != null) {
                                                    kVar2 = k9;
                                                }
                                            }
                                            w6.l lVar2 = lVar;
                                            Object z9 = cVar2.z(kVar2, i9, andIncrement2, this);
                                            if (z9 == e.f2058m) {
                                                a(kVar2, i9);
                                                break;
                                            } else if (z9 == e.f2060o) {
                                                if (andIncrement2 < cVar2.o()) {
                                                    kVar2.a();
                                                }
                                                lVar = lVar2;
                                            } else if (z9 != e.f2059n) {
                                                kVar2.a();
                                                this.f2034a = z9;
                                                this.f2035b = null;
                                                bool = Boolean.TRUE;
                                                if (lVar2 != null) {
                                                    pVar = new K6.p(lVar2, z9, iVar);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.f2034a = z8;
                                    this.f2035b = null;
                                    bool = Boolean.TRUE;
                                    if (lVar != null) {
                                        pVar = new K6.p(lVar, z8, iVar);
                                    }
                                }
                                c0100m.b(bool, pVar);
                            }
                            Object r7 = c0100m.r();
                            EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
                            return r7;
                        } catch (Throwable th) {
                            th = th;
                            c0100m.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c0100m = k8;
                    }
                } else {
                    kVar.a();
                    this.f2034a = z7;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
    }
}
