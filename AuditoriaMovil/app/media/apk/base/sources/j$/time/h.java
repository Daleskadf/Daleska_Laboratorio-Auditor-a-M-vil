package j$.time;

import H4.e1;
import j$.time.chrono.AbstractC1202i;
import j$.time.chrono.InterfaceC1195b;
import j$.time.chrono.InterfaceC1198e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
public final class h implements Temporal, j$.time.temporal.m, InterfaceC1195b, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final h f12728d = g0(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final h f12729e = g0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a  reason: collision with root package name */
    private final int f12730a;

    /* renamed from: b  reason: collision with root package name */
    private final short f12731b;

    /* renamed from: c  reason: collision with root package name */
    private final short f12732c;

    @Override // j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b M(long j, TemporalUnit temporalUnit) {
        return e(-1L, (ChronoUnit) temporalUnit);
    }

    static {
        g0(1970, 1, 1);
    }

    public static h f0(b bVar) {
        Objects.requireNonNull(bVar, "clock");
        Instant V7 = Instant.V(System.currentTimeMillis());
        ZoneId a7 = bVar.a();
        Objects.requireNonNull(V7, "instant");
        Objects.requireNonNull(a7, "zone");
        return i0(j$.com.android.tools.r8.a.k(V7.T() + a7.S().d(V7).Z(), 86400));
    }

    public static h h0(int i7, n nVar, int i8) {
        j$.time.temporal.a.YEAR.S(i7);
        Objects.requireNonNull(nVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.S(i8);
        return S(i7, nVar.getValue(), i8);
    }

    public static h g0(int i7, int i8, int i9) {
        j$.time.temporal.a.YEAR.S(i7);
        j$.time.temporal.a.MONTH_OF_YEAR.S(i8);
        j$.time.temporal.a.DAY_OF_MONTH.S(i9);
        return S(i7, i8, i9);
    }

    public static h j0(int i7, int i8) {
        long j = i7;
        j$.time.temporal.a.YEAR.S(j);
        j$.time.temporal.a.DAY_OF_YEAR.S(i8);
        j$.time.chrono.t.f12641d.getClass();
        boolean S7 = j$.time.chrono.t.S(j);
        if (i8 == 366 && !S7) {
            throw new RuntimeException("Invalid date 'DayOfYear 366' as '" + i7 + "' is not a leap year");
        }
        n U7 = n.U(((i8 - 1) / 31) + 1);
        if (i8 > (U7.S(S7) + U7.R(S7)) - 1) {
            U7 = U7.V();
        }
        return new h(i7, U7.getValue(), (i8 - U7.R(S7)) + 1);
    }

    public static h i0(long j) {
        long j8;
        j$.time.temporal.a.EPOCH_DAY.S(j);
        long j9 = 719468 + j;
        if (j9 < 0) {
            long j10 = ((j + 719469) / 146097) - 1;
            j8 = j10 * 400;
            j9 += (-j10) * 146097;
        } else {
            j8 = 0;
        }
        long j11 = ((j9 * 400) + 591) / 146097;
        long j12 = j9 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j9 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i7 = (int) j12;
        int i8 = ((i7 * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.R(j11 + j8 + (i8 / 10)), ((i8 + 2) % 12) + 1, (i7 - (((i8 * 306) + 5) / 10)) + 1);
    }

    public static h T(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        h hVar = (h) temporalAccessor.B(j$.time.temporal.l.f());
        if (hVar != null) {
            return hVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new RuntimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private static h S(int i7, int i8, int i9) {
        int i10 = 28;
        if (i9 > 28) {
            if (i8 != 2) {
                i10 = (i8 == 4 || i8 == 6 || i8 == 9 || i8 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f12641d.getClass();
                if (j$.time.chrono.t.S(i7)) {
                    i10 = 29;
                }
            }
            if (i9 > i10) {
                if (i9 == 29) {
                    throw new RuntimeException("Invalid date 'February 29' as '" + i7 + "' is not a leap year");
                }
                throw new RuntimeException("Invalid date '" + n.U(i8).name() + StringUtils.SPACE + i9 + "'");
            }
        }
        return new h(i7, i8, i9);
    }

    private static h p0(int i7, int i8, int i9) {
        if (i8 == 2) {
            j$.time.chrono.t.f12641d.getClass();
            i9 = Math.min(i9, j$.time.chrono.t.S((long) i7) ? 29 : 28);
        } else if (i8 == 4 || i8 == 6 || i8 == 9 || i8 == 11) {
            i9 = Math.min(i9, 30);
        }
        return new h(i7, i8, i9);
    }

    private h(int i7, int i8, int i9) {
        this.f12730a = i7;
        this.f12731b = (short) i8;
        this.f12732c = (short) i9;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return AbstractC1202i.i(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (aVar.D()) {
                int i7 = g.f12726a[aVar.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        return j$.time.temporal.t.j(1L, c0() ? 366 : 365);
                    } else if (i7 == 3) {
                        return j$.time.temporal.t.j(1L, (n.U(this.f12731b) != n.FEBRUARY || c0()) ? 5L : 4L);
                    } else if (i7 != 4) {
                        return ((j$.time.temporal.a) qVar).o();
                    } else {
                        return j$.time.temporal.t.j(1L, this.f12730a <= 0 ? 1000000000L : 999999999L);
                    }
                }
                return j$.time.temporal.t.j(1L, d0());
            }
            throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return U(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (qVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return Z();
            }
            return U(qVar);
        }
        return qVar.s(this);
    }

    private int U(j$.time.temporal.q qVar) {
        int i7;
        int i8 = g.f12726a[((j$.time.temporal.a) qVar).ordinal()];
        short s7 = this.f12732c;
        int i9 = this.f12730a;
        switch (i8) {
            case 1:
                return s7;
            case 2:
                return X();
            case 3:
                i7 = (s7 - 1) / 7;
                break;
            case 4:
                return i9 >= 1 ? i9 : 1 - i9;
            case 5:
                return W().getValue();
            case 6:
                i7 = (s7 - 1) % 7;
                break;
            case 7:
                return ((X() - 1) % 7) + 1;
            case 8:
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((X() - 1) / 7) + 1;
            case 10:
                return this.f12731b;
            case 11:
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i9;
            case 13:
                return i9 >= 1 ? 1 : 0;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
        return i7 + 1;
    }

    private long Z() {
        return ((this.f12730a * 12) + this.f12731b) - 1;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f12641d;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final j$.time.chrono.n E() {
        return this.f12730a >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    public final int a0() {
        return this.f12730a;
    }

    public final int Y() {
        return this.f12731b;
    }

    public final int X() {
        return (n.U(this.f12731b).R(c0()) + this.f12732c) - 1;
    }

    public final int V() {
        return this.f12732c;
    }

    public final DayOfWeek W() {
        return DayOfWeek.R(((int) j$.com.android.tools.r8.a.j(x() + 3, 7)) + 1);
    }

    public final boolean c0() {
        j$.time.chrono.t.f12641d.getClass();
        return j$.time.chrono.t.S(this.f12730a);
    }

    public final int d0() {
        short s7 = this.f12731b;
        return s7 != 2 ? (s7 == 4 || s7 == 6 || s7 == 9 || s7 == 11) ? 30 : 31 : c0() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r0 */
    public final h s(j$.time.temporal.m mVar) {
        if (mVar instanceof h) {
            return (h) mVar;
        }
        return (h) mVar.D(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q0 */
    public final h d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            aVar.S(j);
            int i7 = g.f12726a[aVar.ordinal()];
            short s7 = this.f12732c;
            short s8 = this.f12731b;
            int i8 = this.f12730a;
            switch (i7) {
                case 1:
                    int i9 = (int) j;
                    return s7 == i9 ? this : g0(i8, s8, i9);
                case 2:
                    return s0((int) j);
                case 3:
                    return n0(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (i8 < 1) {
                        j = 1 - j;
                    }
                    return t0((int) j);
                case 5:
                    return l0(j - W().getValue());
                case 6:
                    return l0(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return l0(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return i0(j);
                case 9:
                    return n0(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i10 = (int) j;
                    if (s8 == i10) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.S(i10);
                    return p0(i8, i10, s7);
                case 11:
                    return m0(j - Z());
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    return t0((int) j);
                case 13:
                    return w(j$.time.temporal.a.ERA) == j ? this : t0(1 - i8);
                default:
                    throw new RuntimeException(d.a("Unsupported field: ", qVar));
            }
        }
        return (h) qVar.w(this, j);
    }

    public final h t0(int i7) {
        if (this.f12730a == i7) {
            return this;
        }
        j$.time.temporal.a.YEAR.S(i7);
        return p0(i7, this.f12731b, this.f12732c);
    }

    public final h s0(int i7) {
        return X() == i7 ? this : j0(this.f12730a, i7);
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final InterfaceC1195b I(j$.time.temporal.p pVar) {
        if (pVar instanceof t) {
            t tVar = (t) pVar;
            return m0(tVar.d()).l0(tVar.a());
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (h) pVar.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k0 */
    public final h e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (g.f12727b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return l0(j);
                case 2:
                    return n0(j);
                case 3:
                    return m0(j);
                case 4:
                    return o0(j);
                case 5:
                    return o0(j$.com.android.tools.r8.a.l(j, 10));
                case 6:
                    return o0(j$.com.android.tools.r8.a.l(j, 100));
                case 7:
                    return o0(j$.com.android.tools.r8.a.l(j, (long) PipesIterator.DEFAULT_QUEUE_SIZE));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.f(w(aVar), j), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (h) temporalUnit.o(this, j);
    }

    public final h o0(long j) {
        return j == 0 ? this : p0(j$.time.temporal.a.YEAR.R(this.f12730a + j), this.f12731b, this.f12732c);
    }

    public final h m0(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f12730a * 12) + (this.f12731b - 1) + j;
        long j9 = 12;
        return p0(j$.time.temporal.a.YEAR.R(j$.com.android.tools.r8.a.k(j8, j9)), ((int) j$.com.android.tools.r8.a.j(j8, j9)) + 1, this.f12732c);
    }

    public final h n0(long j) {
        return l0(j$.com.android.tools.r8.a.l(j, 7));
    }

    public final h l0(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = this.f12732c + j;
        if (j8 > 0) {
            int i7 = (j8 > 28L ? 1 : (j8 == 28L ? 0 : -1));
            short s7 = this.f12731b;
            int i8 = this.f12730a;
            if (i7 <= 0) {
                return new h(i8, s7, (int) j8);
            }
            if (j8 <= 59) {
                long d02 = d0();
                if (j8 <= d02) {
                    return new h(i8, s7, (int) j8);
                }
                if (s7 < 12) {
                    return new h(i8, s7 + 1, (int) (j8 - d02));
                }
                int i9 = i8 + 1;
                j$.time.temporal.a.YEAR.S(i9);
                return new h(i9, 1, (int) (j8 - d02));
            }
        }
        return i0(j$.com.android.tools.r8.a.f(x(), j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.f() ? this : AbstractC1202i.k(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return AbstractC1202i.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        h T7 = T(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, T7);
        }
        switch (g.f12727b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T7.x() - x();
            case 2:
                return (T7.x() - x()) / 7;
            case 3:
                return e0(T7);
            case 4:
                return e0(T7) / 12;
            case 5:
                return e0(T7) / 120;
            case 6:
                return e0(T7) / 1200;
            case 7:
                return e0(T7) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return T7.w(aVar) - w(aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + temporalUnit);
        }
    }

    private long e0(h hVar) {
        return (((hVar.Z() * 32) + hVar.f12732c) - ((Z() * 32) + this.f12732c)) / 32;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final InterfaceC1198e z(l lVar) {
        return LocalDateTime.f0(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final long x() {
        long j;
        long j8 = this.f12730a;
        long j9 = this.f12731b;
        long j10 = 365 * j8;
        if (j8 >= 0) {
            j = ((j8 + 399) / 400) + (((3 + j8) / 4) - ((99 + j8) / 100)) + j10;
        } else {
            j = j10 - ((j8 / (-400)) + ((j8 / (-4)) - (j8 / (-100))));
        }
        long j11 = (((367 * j9) - 362) / 12) + j + (this.f12732c - 1);
        if (j9 > 2) {
            j11 = !c0() ? j11 - 2 : j11 - 1;
        }
        return j11 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: O */
    public final int compareTo(InterfaceC1195b interfaceC1195b) {
        if (interfaceC1195b instanceof h) {
            return R((h) interfaceC1195b);
        }
        return AbstractC1202i.b(this, interfaceC1195b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int R(h hVar) {
        int i7 = this.f12730a - hVar.f12730a;
        if (i7 == 0) {
            int i8 = this.f12731b - hVar.f12731b;
            return i8 == 0 ? this.f12732c - hVar.f12732c : i8;
        }
        return i7;
    }

    public final boolean b0(InterfaceC1195b interfaceC1195b) {
        return interfaceC1195b instanceof h ? R((h) interfaceC1195b) < 0 : x() < interfaceC1195b.x();
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && R((h) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final int hashCode() {
        int i7 = this.f12730a;
        return (((i7 << 11) + (this.f12731b << 6)) + this.f12732c) ^ (i7 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public final String toString() {
        int i7 = this.f12730a;
        int abs = Math.abs(i7);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i7 > 9999) {
                sb.append('+');
            }
            sb.append(i7);
        } else if (i7 < 0) {
            sb.append(i7 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i7 + 10000);
            sb.deleteCharAt(0);
        }
        short s7 = this.f12731b;
        sb.append(s7 < 10 ? "-0" : "-");
        sb.append((int) s7);
        short s8 = this.f12732c;
        sb.append(s8 < 10 ? "-0" : "-");
        sb.append((int) s8);
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f12730a);
        dataOutput.writeByte(this.f12731b);
        dataOutput.writeByte(this.f12732c);
    }
}
