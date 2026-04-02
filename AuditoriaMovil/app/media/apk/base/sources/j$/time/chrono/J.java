package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* loaded from: classes2.dex */
public final class J extends AbstractC1197d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a  reason: collision with root package name */
    private final transient j$.time.h f12605a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f12605a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final m a() {
        return H.f12603d;
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final int hashCode() {
        H.f12603d.getClass();
        return this.f12605a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final n E() {
        return W() >= 1 ? K.BE : K.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (AbstractC1202i.i(this, qVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
                int i7 = I.f12604a[aVar.ordinal()];
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    return this.f12605a.t(qVar);
                }
                if (i7 == 4) {
                    j$.time.temporal.t o7 = j$.time.temporal.a.YEAR.o();
                    return j$.time.temporal.t.j(1L, W() <= 0 ? (-(o7.e() + 543)) + 1 : 543 + o7.d());
                }
                return H.f12603d.K(aVar);
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = I.f12604a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 == 4) {
                int W7 = W();
                if (W7 < 1) {
                    W7 = 1 - W7;
                }
                return W7;
            }
            j$.time.h hVar = this.f12605a;
            if (i7 != 5) {
                if (i7 != 6) {
                    if (i7 != 7) {
                        return hVar.w(qVar);
                    }
                    return W() < 1 ? 0 : 1;
                }
                return W();
            }
            return ((W() * 12) + hVar.Y()) - 1;
        }
        return qVar.s(this);
    }

    private int W() {
        return this.f12605a.a0() + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.J d(long r9, j$.time.temporal.q r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.w(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.I.f12604a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f12605a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            goto L61
        L27:
            j$.time.chrono.H r11 = j$.time.chrono.H.f12603d
            j$.time.temporal.t r11 = r11.K(r0)
            r11.b(r9, r0)
            int r11 = r8.W()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.Y()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = r3.m0(r9)
            j$.time.chrono.J r9 = r8.Y(r9)
            return r9
        L4b:
            j$.time.chrono.H r2 = j$.time.chrono.H.f12603d
            j$.time.temporal.t r2 = r2.K(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L84
            if (r0 == r5) goto L79
            if (r0 == r4) goto L6a
        L61:
            j$.time.h r9 = r3.d(r9, r11)
            j$.time.chrono.J r9 = r8.Y(r9)
            return r9
        L6a:
            int r9 = r8.W()
            int r9 = (-542) - r9
            j$.time.h r9 = r3.t0(r9)
            j$.time.chrono.J r9 = r8.Y(r9)
            return r9
        L79:
            int r2 = r2 + (-543)
            j$.time.h r9 = r3.t0(r2)
            j$.time.chrono.J r9 = r8.Y(r9)
            return r9
        L84:
            int r9 = r8.W()
            r10 = 1
            if (r9 < r10) goto L8c
            goto L8e
        L8c:
            int r2 = 1 - r2
        L8e:
            int r2 = r2 + (-543)
            j$.time.h r9 = r3.t0(r2)
            j$.time.chrono.J r9 = r8.Y(r9)
            return r9
        L99:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.J r9 = (j$.time.chrono.J) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.J.d(long, j$.time.temporal.q):j$.time.chrono.J");
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b l(j$.time.temporal.m mVar) {
        return (J) super.s(mVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal s(j$.time.h hVar) {
        return (J) super.s(hVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b I(j$.time.temporal.p pVar) {
        return (J) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b V(long j) {
        return Y(this.f12605a.o0(j));
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b U(long j) {
        return Y(this.f12605a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b T(long j) {
        return Y(this.f12605a.l0(j));
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b, j$.time.temporal.Temporal
    public final InterfaceC1195b e(long j, TemporalUnit temporalUnit) {
        return (J) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (J) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b M(long j, TemporalUnit temporalUnit) {
        return (J) super.o(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return (J) super.o(j, chronoUnit);
    }

    private J Y(j$.time.h hVar) {
        return hVar.equals(this.f12605a) ? this : new J(hVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final long x() {
        return this.f12605a.x();
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return this.f12605a.equals(((J) obj).f12605a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1198e z(j$.time.l lVar) {
        return C1200g.S(this, lVar);
    }
}
