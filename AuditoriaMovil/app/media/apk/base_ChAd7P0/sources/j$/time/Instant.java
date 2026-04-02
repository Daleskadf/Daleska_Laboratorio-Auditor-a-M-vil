package j$.time;

import j$.time.chrono.AbstractC1202i;
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
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Instant f12575c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a  reason: collision with root package name */
    private final long f12576a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12577b;

    public static Instant now() {
        C1193a.f12593b.getClass();
        return V(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f12576a, instant2.f12576a);
        return compare != 0 ? compare : this.f12577b - instant2.f12577b;
    }

    static {
        X(-31557014167219200L, 0L);
        X(31556889864403199L, 999999999L);
    }

    public static Instant W(long j) {
        return R(j, 0);
    }

    public static Instant X(long j, long j8) {
        return R(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.k(j8, 1000000000L)), (int) j$.com.android.tools.r8.a.j(j8, 1000000000L));
    }

    public static Instant V(long j) {
        long j8 = (long) PipesIterator.DEFAULT_QUEUE_SIZE;
        return R(j$.com.android.tools.r8.a.k(j, j8), ((int) j$.com.android.tools.r8.a.j(j, j8)) * 1000000);
    }

    public static Instant S(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return X(temporalAccessor.w(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.q(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e7) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + name, e7);
        }
    }

    private static Instant R(long j, int i7) {
        if ((i7 | j) == 0) {
            return f12575c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new RuntimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i7);
    }

    private Instant(long j, int i7) {
        this.f12576a = j;
        this.f12577b = i7;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = f.f12658a[((j$.time.temporal.a) qVar).ordinal()];
            int i8 = this.f12577b;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        return i8 / 1000000;
                    }
                    if (i7 == 4) {
                        j$.time.temporal.a.INSTANT_SECONDS.R(this.f12576a);
                    }
                    throw new RuntimeException(d.a("Unsupported field: ", qVar));
                }
                return i8 / PipesIterator.DEFAULT_QUEUE_SIZE;
            }
            return i8;
        }
        return j$.time.temporal.l.d(this, qVar).a(qVar.s(this), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        int i7;
        if (qVar instanceof j$.time.temporal.a) {
            int i8 = f.f12658a[((j$.time.temporal.a) qVar).ordinal()];
            int i9 = this.f12577b;
            if (i8 != 1) {
                if (i8 == 2) {
                    i7 = i9 / PipesIterator.DEFAULT_QUEUE_SIZE;
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        return this.f12576a;
                    }
                    throw new RuntimeException(d.a("Unsupported field: ", qVar));
                } else {
                    i7 = i9 / 1000000;
                }
                return i7;
            }
            return i9;
        }
        return qVar.s(this);
    }

    public final long T() {
        return this.f12576a;
    }

    public final int U() {
        return this.f12577b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            aVar.S(j);
            int i7 = f.f12658a[aVar.ordinal()];
            int i8 = this.f12577b;
            long j8 = this.f12576a;
            if (i7 != 1) {
                if (i7 == 2) {
                    int i9 = ((int) j) * PipesIterator.DEFAULT_QUEUE_SIZE;
                    if (i9 != i8) {
                        return R(j8, i9);
                    }
                } else if (i7 == 3) {
                    int i10 = ((int) j) * 1000000;
                    if (i10 != i8) {
                        return R(j8, i10);
                    }
                } else if (i7 != 4) {
                    throw new RuntimeException(d.a("Unsupported field: ", qVar));
                } else {
                    if (j != j8) {
                        return R(j, i8);
                    }
                }
            } else if (j != i8) {
                return R(j8, (int) j);
            }
            return this;
        }
        return (Instant) qVar.w(this, j);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        e q2 = temporalUnit.q();
        if (q2.s() > 86400) {
            throw new RuntimeException("Unit is too large to be used for truncation");
        }
        long D4 = q2.D();
        if (86400000000000L % D4 != 0) {
            throw new RuntimeException("Unit must divide into a standard day without remainder");
        }
        long j = ((this.f12576a % 86400) * 1000000000) + this.f12577b;
        return Y(0L, (j$.com.android.tools.r8.a.k(j, D4) * D4) - j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Z */
    public final Instant e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.f12659b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return Y(0L, j);
                case 2:
                    return Y(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return Y(j / 1000, (j % 1000) * 1000000);
                case 4:
                    return Y(j, 0L);
                case 5:
                    return Y(j$.com.android.tools.r8.a.l(j, 60), 0L);
                case 6:
                    return Y(j$.com.android.tools.r8.a.l(j, 3600), 0L);
                case 7:
                    return Y(j$.com.android.tools.r8.a.l(j, 43200), 0L);
                case 8:
                    return Y(j$.com.android.tools.r8.a.l(j, 86400), 0L);
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (Instant) temporalUnit.o(this, j);
    }

    private Instant Y(long j, long j8) {
        if ((j | j8) == 0) {
            return this;
        }
        return X(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(this.f12576a, j), j8 / 1000000000), this.f12577b + (j8 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.f() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(this.f12576a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f12577b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Instant S7 = S(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i7 = f.f12659b[((ChronoUnit) temporalUnit).ordinal()];
            int i8 = this.f12577b;
            long j = this.f12576a;
            switch (i7) {
                case 1:
                    return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(S7.f12576a, j), 1000000000L), S7.f12577b - i8);
                case 2:
                    return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(S7.f12576a, j), 1000000000L), S7.f12577b - i8) / 1000;
                case 3:
                    return j$.com.android.tools.r8.a.m(S7.toEpochMilli(), toEpochMilli());
                case 4:
                    return a0(S7);
                case 5:
                    return a0(S7) / 60;
                case 6:
                    return a0(S7) / 3600;
                case 7:
                    return a0(S7) / 43200;
                case 8:
                    return a0(S7) / 86400;
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, S7);
    }

    private long a0(Instant instant) {
        long m7 = j$.com.android.tools.r8.a.m(instant.f12576a, this.f12576a);
        long j = instant.f12577b - this.f12577b;
        int i7 = (m7 > 0L ? 1 : (m7 == 0L ? 0 : -1));
        return (i7 <= 0 || j >= 0) ? (i7 >= 0 || j <= 0) ? m7 : m7 + 1 : m7 - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.S(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j = this.f12576a;
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i8 = this.f12577b;
        if (i7 < 0 && i8 > 0) {
            return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j + 1, (long) PipesIterator.DEFAULT_QUEUE_SIZE), (i8 / 1000000) - PipesIterator.DEFAULT_QUEUE_SIZE);
        }
        return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j, (long) PipesIterator.DEFAULT_QUEUE_SIZE), i8 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f12576a == instant.f12576a && this.f12577b == instant.f12577b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12576a;
        return (this.f12577b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f.format(this);
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(DataOutput dataOutput) {
        dataOutput.writeLong(this.f12576a);
        dataOutput.writeInt(this.f12577b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return (Instant) AbstractC1202i.a(hVar, this);
    }
}
