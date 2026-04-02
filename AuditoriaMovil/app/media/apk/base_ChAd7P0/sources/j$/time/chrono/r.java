package j$.time.chrono;

import H4.e1;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/* loaded from: classes2.dex */
public final class r extends AbstractC1197d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a  reason: collision with root package name */
    private final transient p f12636a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f12637b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f12638c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f12639d;

    @Override // j$.time.chrono.InterfaceC1195b
    public final m a() {
        return this.f12636a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r Y(p pVar, int i7, int i8, int i9) {
        return new r(pVar, i7, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r Z(p pVar, long j) {
        return new r(pVar, j);
    }

    private r(p pVar, int i7, int i8, int i9) {
        pVar.W(i7, i8, i9);
        this.f12636a = pVar;
        this.f12637b = i7;
        this.f12638c = i8;
        this.f12639d = i9;
    }

    private r(p pVar, long j) {
        int[] X7 = pVar.X((int) j);
        this.f12636a = pVar;
        this.f12637b = X7[0];
        this.f12638c = X7[1];
        this.f12639d = X7[2];
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final n E() {
        return s.AH;
    }

    public final int X() {
        return this.f12636a.Z(this.f12637b);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (AbstractC1202i.i(this, qVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
                int i7 = q.f12635a[aVar.ordinal()];
                p pVar = this.f12636a;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            return j$.time.temporal.t.j(1L, 5L);
                        }
                        return pVar.K(aVar);
                    }
                    return j$.time.temporal.t.j(1L, X());
                }
                return j$.time.temporal.t.j(1L, pVar.Y(this.f12637b, this.f12638c));
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = q.f12635a[((j$.time.temporal.a) qVar).ordinal()];
            int i8 = this.f12638c;
            int i9 = this.f12639d;
            int i10 = this.f12637b;
            switch (i7) {
                case 1:
                    return i9;
                case 2:
                    return W();
                case 3:
                    return ((i9 - 1) / 7) + 1;
                case 4:
                    return ((int) j$.com.android.tools.r8.a.j(x() + 3, 7)) + 1;
                case 5:
                    return ((i9 - 1) % 7) + 1;
                case 6:
                    return ((W() - 1) % 7) + 1;
                case 7:
                    return x();
                case 8:
                    return ((W() - 1) / 7) + 1;
                case 9:
                    return i8;
                case 10:
                    return ((i10 * 12) + i8) - 1;
                case 11:
                    return i10;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    return i10;
                case 13:
                    return i10 <= 1 ? 0 : 1;
                default:
                    throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
            }
        }
        return qVar.s(this);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    /* renamed from: d0 */
    public final r d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            p pVar = this.f12636a;
            pVar.K(aVar).b(j, aVar);
            int i7 = (int) j;
            int i8 = q.f12635a[aVar.ordinal()];
            int i9 = this.f12639d;
            int i10 = this.f12638c;
            int i11 = this.f12637b;
            switch (i8) {
                case 1:
                    return c0(i11, i10, i7);
                case 2:
                    return T(Math.min(i7, X()) - W());
                case 3:
                    return T((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return T(j - (((int) j$.com.android.tools.r8.a.j(x() + 3, 7)) + 1));
                case 5:
                    return T(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return T(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new r(pVar, j);
                case 8:
                    return T((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return c0(i11, i7, i9);
                case 10:
                    return U(j - (((i11 * 12) + i10) - 1));
                case 11:
                    if (i11 < 1) {
                        i7 = 1 - i7;
                    }
                    return c0(i7, i10, i9);
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    return c0(i7, i10, i9);
                case 13:
                    return c0(1 - i11, i10, i9);
                default:
                    throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
            }
        }
        return (r) super.d(j, qVar);
    }

    private r c0(int i7, int i8, int i9) {
        p pVar = this.f12636a;
        int Y3 = pVar.Y(i7, i8);
        if (i9 > Y3) {
            i9 = Y3;
        }
        return new r(pVar, i7, i8, i9);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b l(j$.time.temporal.m mVar) {
        return (r) super.s(mVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal s(j$.time.h hVar) {
        return (r) super.s(hVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b I(j$.time.temporal.p pVar) {
        return (r) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final long x() {
        return this.f12636a.W(this.f12637b, this.f12638c, this.f12639d);
    }

    private int W() {
        return this.f12636a.V(this.f12637b, this.f12638c) + this.f12639d;
    }

    @Override // j$.time.chrono.AbstractC1197d
    final InterfaceC1195b V(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = this.f12637b + ((int) j);
        int i7 = (int) j8;
        if (j8 == i7) {
            return c0(i7, this.f12638c, this.f12639d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1197d
    /* renamed from: b0 */
    public final r U(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f12637b * 12) + (this.f12638c - 1) + j;
        return c0(this.f12636a.T(j$.com.android.tools.r8.a.k(j8, 12L)), ((int) j$.com.android.tools.r8.a.j(j8, 12L)) + 1, this.f12639d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1197d
    /* renamed from: a0 */
    public final r T(long j) {
        return new r(this.f12636a, x() + j);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b, j$.time.temporal.Temporal
    public final InterfaceC1195b e(long j, TemporalUnit temporalUnit) {
        return (r) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (r) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b M(long j, TemporalUnit temporalUnit) {
        return (r) super.o(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return (r) super.o(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f12637b == rVar.f12637b && this.f12638c == rVar.f12638c && this.f12639d == rVar.f12639d && this.f12636a.equals(rVar.f12636a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final int hashCode() {
        int hashCode = this.f12636a.n().hashCode();
        int i7 = this.f12637b;
        return (hashCode ^ (i7 & (-2048))) ^ (((i7 << 11) + (this.f12638c << 6)) + this.f12639d);
    }

    @Override // j$.time.chrono.AbstractC1197d, j$.time.chrono.InterfaceC1195b
    public final InterfaceC1198e z(j$.time.l lVar) {
        return C1200g.S(this, lVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f12636a);
        objectOutput.writeInt(j$.time.temporal.l.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
