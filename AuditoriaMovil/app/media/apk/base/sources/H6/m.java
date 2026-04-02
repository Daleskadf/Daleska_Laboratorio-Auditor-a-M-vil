package H6;

import F6.C0110x;
import F6.L0;
import K6.AbstractC0208a;
import K6.w;
/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: g0  reason: collision with root package name */
    public final a f2071g0;

    public m(int i7, a aVar, w6.l lVar) {
        super(i7, lVar);
        this.f2071g0 = aVar;
        if (aVar != a.SUSPEND) {
            if (i7 >= 1) {
                return;
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Buffered channel capacity must be at least 1, but ", i7, " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).c() + " instead").toString());
    }

    public final Object C(Object obj, boolean z7) {
        k kVar;
        L0 l02;
        w6.l lVar;
        C0110x a7;
        a aVar = a.DROP_LATEST;
        l6.j jVar = l6.j.f13876a;
        if (this.f2071g0 == aVar) {
            Object e7 = super.e(obj);
            if ((e7 instanceof i) && !(e7 instanceof h)) {
                if (z7 && (lVar = this.f2046b) != null && (a7 = AbstractC0208a.a(lVar, obj, null)) != null) {
                    throw a7;
                }
                return jVar;
            }
            return e7;
        }
        w wVar = e.f2051d;
        k kVar2 = (k) c.f2037X.get(this);
        while (true) {
            long andIncrement = c.f2040c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean q2 = q(andIncrement, false);
            int i7 = e.f2049b;
            long j8 = i7;
            long j9 = j / j8;
            int i8 = (int) (j % j8);
            if (kVar2.f2804c != j9) {
                k a8 = c.a(this, j9, kVar2);
                if (a8 == null) {
                    if (q2) {
                        return new h(n());
                    }
                } else {
                    kVar = a8;
                }
            } else {
                kVar = kVar2;
            }
            int d7 = c.d(this, kVar, i8, obj, j, wVar, q2);
            if (d7 != 0) {
                if (d7 != 1) {
                    if (d7 != 2) {
                        if (d7 != 3) {
                            if (d7 != 4) {
                                if (d7 == 5) {
                                    kVar.a();
                                }
                                kVar2 = kVar;
                            } else {
                                if (j < c.f2041d.get(this)) {
                                    kVar.a();
                                }
                                return new h(n());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (q2) {
                        kVar.h();
                        return new h(n());
                    } else {
                        if (wVar instanceof L0) {
                            l02 = (L0) wVar;
                        } else {
                            l02 = null;
                        }
                        if (l02 != null) {
                            l02.a(kVar, i8 + i7);
                        }
                        i((kVar.f2804c * j8) + i8);
                        return jVar;
                    }
                } else {
                    return jVar;
                }
            } else {
                kVar.a();
                return jVar;
            }
        }
    }

    @Override // H6.c, H6.r
    public final Object c(Object obj, n6.d dVar) {
        C0110x a7;
        if (C(obj, true) instanceof h) {
            w6.l lVar = this.f2046b;
            if (lVar != null && (a7 = AbstractC0208a.a(lVar, obj, null)) != null) {
                j3.f.a(a7, n());
                throw a7;
            }
            throw n();
        }
        return l6.j.f13876a;
    }

    @Override // H6.c, H6.r
    public final Object e(Object obj) {
        return C(obj, false);
    }

    @Override // H6.c
    public final boolean s() {
        if (this.f2071g0 == a.DROP_OLDEST) {
            return true;
        }
        return false;
    }
}
