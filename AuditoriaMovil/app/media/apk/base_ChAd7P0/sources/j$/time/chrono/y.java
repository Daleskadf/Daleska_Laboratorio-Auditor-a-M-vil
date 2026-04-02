package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* loaded from: classes2.dex */
public final class y extends AbstractC1197d {

    /* renamed from: d  reason: collision with root package name */
    static final j$.time.h f12646d = j$.time.h.g0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a  reason: collision with root package name */
    private final transient j$.time.h f12647a;

    /* renamed from: b  reason: collision with root package name */
    private transient z f12648b;

    /* renamed from: c  reason: collision with root package name */
    private transient int f12649c;

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final n E() {
        return this.f12648b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(j$.time.h hVar) {
        if (hVar.b0(f12646d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
        }
        z h8 = z.h(hVar);
        this.f12648b = h8;
        this.f12649c = (hVar.a0() - h8.n().a0()) + 1;
        this.f12647a = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, int i7, j$.time.h hVar) {
        if (hVar.b0(f12646d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f12648b = zVar;
        this.f12649c = i7;
        this.f12647a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final m a() {
        return w.f12644d;
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final int hashCode() {
        w.f12644d.getClass();
        return this.f12647a.hashCode() ^ (-688086063);
    }

    public final z W() {
        return this.f12648b;
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b, j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).D();
        }
        return qVar != null && qVar.t(this);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        int i7;
        if (qVar instanceof j$.time.temporal.a) {
            if (g(qVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
                int i8 = x.f12645a[aVar.ordinal()];
                j$.time.h hVar = this.f12647a;
                if (i8 != 1) {
                    z zVar = this.f12648b;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            int a02 = zVar.n().a0();
                            z r7 = zVar.r();
                            if (r7 != null) {
                                return j$.time.temporal.t.j(1L, (r7.n().a0() - a02) + 1);
                            }
                            return j$.time.temporal.t.j(1L, 999999999 - a02);
                        }
                        return w.f12644d.K(aVar);
                    }
                    z r8 = zVar.r();
                    if (r8 != null && r8.n().a0() == hVar.a0()) {
                        i7 = r8.n().X() - 1;
                    } else {
                        i7 = hVar.c0() ? 366 : 365;
                    }
                    if (this.f12649c == 1) {
                        i7 -= zVar.n().X() - 1;
                    }
                    return j$.time.temporal.t.j(1L, i7);
                }
                return j$.time.temporal.t.j(1L, hVar.d0());
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = x.f12645a[((j$.time.temporal.a) qVar).ordinal()];
            int i8 = this.f12649c;
            z zVar = this.f12648b;
            j$.time.h hVar = this.f12647a;
            switch (i7) {
                case 2:
                    if (i8 == 1) {
                        return (hVar.X() - zVar.n().X()) + 1;
                    }
                    return hVar.X();
                case 3:
                    return i8;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
                case 8:
                    return zVar.getValue();
                default:
                    return hVar.w(qVar);
            }
        }
        return qVar.s(this);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    /* renamed from: Y */
    public final y d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (w(aVar) == j) {
                return this;
            }
            int[] iArr = x.f12645a;
            int i7 = iArr[aVar.ordinal()];
            j$.time.h hVar = this.f12647a;
            if (i7 == 3 || i7 == 8 || i7 == 9) {
                w wVar = w.f12644d;
                int a7 = wVar.K(aVar).a(j, aVar);
                int i8 = iArr[aVar.ordinal()];
                if (i8 == 3) {
                    return Z(hVar.t0(wVar.h(this.f12648b, a7)));
                }
                if (i8 == 8) {
                    return Z(hVar.t0(wVar.h(z.v(a7), this.f12649c)));
                }
                if (i8 == 9) {
                    return Z(hVar.t0(a7));
                }
            }
            return Z(hVar.d(j, qVar));
        }
        return (y) super.d(j, qVar);
    }

    public final y a0(j$.time.temporal.o oVar) {
        return (y) super.s(oVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b l(j$.time.temporal.m mVar) {
        return (y) super.s(mVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal s(j$.time.h hVar) {
        return (y) super.s(hVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b I(j$.time.temporal.p pVar) {
        return (y) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1198e z(j$.time.l lVar) {
        return C1200g.S(this, lVar);
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b V(long j) {
        return Z(this.f12647a.o0(j));
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b U(long j) {
        return Z(this.f12647a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b T(long j) {
        return Z(this.f12647a.l0(j));
    }

    public final y X(long j, ChronoUnit chronoUnit) {
        return (y) super.e(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b, j$.time.temporal.Temporal
    public final InterfaceC1195b e(long j, TemporalUnit temporalUnit) {
        return (y) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (y) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b M(long j, TemporalUnit temporalUnit) {
        return (y) super.o(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return (y) super.o(j, chronoUnit);
    }

    private y Z(j$.time.h hVar) {
        return hVar.equals(this.f12647a) ? this : new y(hVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final long x() {
        return this.f12647a.x();
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f12647a.equals(((y) obj).f12647a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
