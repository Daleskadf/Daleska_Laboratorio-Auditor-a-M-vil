package j$.time;

import j$.time.chrono.AbstractC1202i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1195b;
import j$.time.chrono.InterfaceC1198e;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, InterfaceC1198e, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f12578c = f0(h.f12728d, l.f12736e);

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f12579d = f0(h.f12729e, l.f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a  reason: collision with root package name */
    private final h f12580a;

    /* renamed from: b  reason: collision with root package name */
    private final l f12581b;

    @Override // j$.time.chrono.InterfaceC1198e
    public final InterfaceC1195b c() {
        return this.f12580a;
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final j$.time.chrono.m a() {
        return ((h) c()).a();
    }

    public static LocalDateTime d0(int i7) {
        return new LocalDateTime(h.g0(i7, 12, 31), l.Z(0));
    }

    public static LocalDateTime e0(int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        return new LocalDateTime(h.g0(i7, i8, i9), l.a0(i10, i11, i12, i13));
    }

    public static LocalDateTime f0(h hVar, l lVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(hVar, lVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(((h) c()).x(), j$.time.temporal.a.EPOCH_DAY).d(b().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime g0(long j, int i7, ZoneOffset zoneOffset) {
        long Z6;
        long j8;
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        long j9 = i7;
        j$.time.temporal.a.NANO_OF_SECOND.S(j9);
        return new LocalDateTime(h.i0(j$.com.android.tools.r8.a.k(j + zoneOffset.Z(), 86400)), l.b0((((int) j$.com.android.tools.r8.a.j(Z6, j8)) * 1000000000) + j9));
    }

    public static LocalDateTime S(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).X();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.T(temporalAccessor), l.T(temporalAccessor));
        } catch (c e7) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + name, e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.i, java.lang.Object] */
    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.d(charSequence, new Object());
    }

    private LocalDateTime(h hVar, l lVar) {
        this.f12580a = hVar;
        this.f12581b = lVar;
    }

    private LocalDateTime n0(h hVar, l lVar) {
        return (this.f12580a == hVar && this.f12581b == lVar) ? this : new LocalDateTime(hVar, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.D() || aVar.T();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).T()) {
                l lVar = this.f12581b;
                lVar.getClass();
                return j$.time.temporal.l.d(lVar, qVar);
            }
            return this.f12580a.t(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f12581b.q(qVar) : this.f12580a.q(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f12581b.w(qVar) : this.f12580a.w(qVar);
        }
        return qVar.s(this);
    }

    private int R(LocalDateTime localDateTime) {
        int R7 = this.f12580a.R(localDateTime.f12580a);
        return R7 == 0 ? this.f12581b.compareTo(localDateTime.f12581b) : R7;
    }

    public final h k0() {
        return this.f12580a;
    }

    public final int a0() {
        return this.f12580a.a0();
    }

    public final int X() {
        return this.f12580a.Y();
    }

    public final int T() {
        return this.f12580a.V();
    }

    public final DayOfWeek U() {
        return this.f12580a.W();
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final l b() {
        return this.f12581b;
    }

    public final int V() {
        return this.f12581b.V();
    }

    public final int W() {
        return this.f12581b.W();
    }

    public final int Z() {
        return this.f12581b.Y();
    }

    public final int Y() {
        return this.f12581b.X();
    }

    public final LocalDateTime m0(h hVar) {
        return n0(hVar, this.f12581b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return n0(hVar, this.f12581b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0 */
    public final LocalDateTime d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            boolean T7 = ((j$.time.temporal.a) qVar).T();
            l lVar = this.f12581b;
            h hVar = this.f12580a;
            if (T7) {
                return n0(hVar, lVar.d(j, qVar));
            }
            return n0(hVar.d(j, qVar), lVar);
        }
        return (LocalDateTime) qVar.w(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h0 */
    public final LocalDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (j.f12733a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return j0(this.f12580a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime plusDays = plusDays(j / 86400000000L);
                    return plusDays.j0(plusDays.f12580a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime plusDays2 = plusDays(j / 86400000);
                    return plusDays2.j0(plusDays2.f12580a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return i0(j);
                case 5:
                    return j0(this.f12580a, 0L, j, 0L, 0L);
                case 6:
                    return j0(this.f12580a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime plusDays3 = plusDays(j / 256);
                    return plusDays3.j0(plusDays3.f12580a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return n0(this.f12580a.e(j, temporalUnit), this.f12581b);
            }
        }
        return (LocalDateTime) temporalUnit.o(this, j);
    }

    public LocalDateTime plusWeeks(long j) {
        return n0(this.f12580a.n0(j), this.f12581b);
    }

    public LocalDateTime plusDays(long j) {
        return n0(this.f12580a.l0(j), this.f12581b);
    }

    public final LocalDateTime i0(long j) {
        return j0(this.f12580a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    private LocalDateTime j0(h hVar, long j, long j8, long j9, long j10) {
        int i7 = ((j | j8 | j9 | j10) > 0L ? 1 : ((j | j8 | j9 | j10) == 0L ? 0 : -1));
        l lVar = this.f12581b;
        if (i7 == 0) {
            return n0(hVar, lVar);
        }
        long j11 = j / 24;
        long j12 = j11 + (j8 / 1440) + (j9 / 86400) + (j10 / 86400000000000L);
        long j13 = 1;
        long j14 = ((j % 24) * 3600000000000L) + ((j8 % 1440) * 60000000000L) + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L);
        long j02 = lVar.j0();
        long j15 = (j14 * j13) + j02;
        long k2 = j$.com.android.tools.r8.a.k(j15, 86400000000000L) + (j12 * j13);
        long j16 = j$.com.android.tools.r8.a.j(j15, 86400000000000L);
        if (j16 != j02) {
            lVar = l.b0(j16);
        }
        return n0(hVar.l0(k2), lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.f()) {
            return this.f12580a;
        }
        return AbstractC1202i.l(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        h hVar;
        long j;
        long j8;
        LocalDateTime S7 = S(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            boolean z7 = ((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0;
            l lVar = this.f12581b;
            h hVar2 = this.f12580a;
            if (!z7) {
                h hVar3 = S7.f12580a;
                hVar3.getClass();
                boolean z8 = hVar2 instanceof h;
                l lVar2 = S7.f12581b;
                if (!z8 ? hVar3.x() > hVar2.x() : hVar3.R(hVar2) > 0) {
                    if (lVar2.compareTo(lVar) < 0) {
                        hVar = hVar3.l0(-1L);
                        return hVar2.f(hVar, temporalUnit);
                    }
                }
                boolean b0 = hVar3.b0(hVar2);
                hVar = hVar3;
                if (b0) {
                    hVar = hVar3;
                    if (lVar2.compareTo(lVar) > 0) {
                        hVar = hVar3.l0(1L);
                    }
                }
                return hVar2.f(hVar, temporalUnit);
            }
            h hVar4 = S7.f12580a;
            hVar2.getClass();
            long x7 = hVar4.x() - hVar2.x();
            int i7 = (x7 > 0L ? 1 : (x7 == 0L ? 0 : -1));
            l lVar3 = S7.f12581b;
            if (i7 == 0) {
                return lVar.f(lVar3, temporalUnit);
            }
            long j02 = lVar3.j0() - lVar.j0();
            if (i7 > 0) {
                j = x7 - 1;
                j8 = j02 + 86400000000000L;
            } else {
                j = x7 + 1;
                j8 = j02 - 86400000000000L;
            }
            switch (j.f12733a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    j = j$.com.android.tools.r8.a.l(j, 86400000000000L);
                    break;
                case 2:
                    j = j$.com.android.tools.r8.a.l(j, 86400000000L);
                    j8 /= 1000;
                    break;
                case 3:
                    j = j$.com.android.tools.r8.a.l(j, 86400000L);
                    j8 /= 1000000;
                    break;
                case 4:
                    j = j$.com.android.tools.r8.a.l(j, 86400);
                    j8 /= 1000000000;
                    break;
                case 5:
                    j = j$.com.android.tools.r8.a.l(j, 1440);
                    j8 /= 60000000000L;
                    break;
                case 6:
                    j = j$.com.android.tools.r8.a.l(j, 24);
                    j8 /= 3600000000000L;
                    break;
                case 7:
                    j = j$.com.android.tools.r8.a.l(j, 2);
                    j8 /= 43200000000000L;
                    break;
            }
            return j$.com.android.tools.r8.a.f(j, j8);
        }
        return temporalUnit.between(this, S7);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final ChronoZonedDateTime p(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // java.lang.Comparable
    /* renamed from: F */
    public final int compareTo(InterfaceC1198e interfaceC1198e) {
        if (interfaceC1198e instanceof LocalDateTime) {
            return R((LocalDateTime) interfaceC1198e);
        }
        return AbstractC1202i.c(this, interfaceC1198e);
    }

    public final boolean b0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return R(localDateTime) > 0;
        }
        int i7 = (this.f12580a.x() > localDateTime.f12580a.x() ? 1 : (this.f12580a.x() == localDateTime.f12580a.x() ? 0 : -1));
        return i7 > 0 || (i7 == 0 && this.f12581b.j0() > localDateTime.f12581b.j0());
    }

    public final boolean c0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return R(localDateTime) < 0;
        }
        int i7 = (this.f12580a.x() > localDateTime.f12580a.x() ? 1 : (this.f12580a.x() == localDateTime.f12580a.x() ? 0 : -1));
        return i7 < 0 || (i7 == 0 && this.f12581b.j0() < localDateTime.f12581b.j0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f12580a.equals(localDateTime.f12580a) && this.f12581b.equals(localDateTime.f12581b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12580a.hashCode() ^ this.f12581b.hashCode();
    }

    public final String toString() {
        String hVar = this.f12580a.toString();
        String lVar = this.f12581b.toString();
        return hVar + "T" + lVar;
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o0(DataOutput dataOutput) {
        this.f12580a.u0(dataOutput);
        this.f12581b.n0(dataOutput);
    }
}
