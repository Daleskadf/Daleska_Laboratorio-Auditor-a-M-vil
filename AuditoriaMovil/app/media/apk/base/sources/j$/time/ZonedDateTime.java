package j$.time;

import j$.time.chrono.AbstractC1202i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1195b;
import j$.time.chrono.InterfaceC1198e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<h>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f12590a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f12591b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f12592c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long Q() {
        return AbstractC1202i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC1202i.h(this, chronoZonedDateTime);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC1202i.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1198e G() {
        return this.f12590a;
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        C1193a c1193a;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            c1193a = C1193a.f12593b;
        } else {
            c1193a = new C1193a(zoneId);
        }
        Objects.requireNonNull(c1193a, "clock");
        c1193a.getClass();
        return S(Instant.V(System.currentTimeMillis()), c1193a.a());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.m a() {
        return ((h) c()).a();
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return T(localDateTime, zoneId, null);
    }

    public static ZonedDateTime of(int i7, int i8, int i9, int i10, int i11, int i12, int i13, ZoneId zoneId) {
        return T(LocalDateTime.e0(i7, i8, i9, i10, i11, i12, i13), zoneId, null);
    }

    public static ZonedDateTime T(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f S7 = zoneId.S();
        List g3 = S7.g(localDateTime);
        if (g3.size() == 1) {
            zoneOffset = (ZoneOffset) g3.get(0);
        } else if (g3.size() == 0) {
            j$.time.zone.b f = S7.f(localDateTime);
            localDateTime = localDateTime.i0(f.s().s());
            zoneOffset = f.t();
        } else if (zoneOffset == null || !g3.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) g3.get(0), MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime S(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return D(instant.T(), instant.U(), zoneId);
    }

    private static ZonedDateTime D(long j, int i7, ZoneId zoneId) {
        ZoneOffset d7 = zoneId.S().d(Instant.X(j, i7));
        return new ZonedDateTime(LocalDateTime.g0(j, i7, d7), zoneId, d7);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.X(Q(), b().X());
    }

    public static ZonedDateTime R(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId R7 = ZoneId.R(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporal.g(aVar)) {
                return of(LocalDateTime.f0(h.T(temporal), l.T(temporal)), R7);
            }
            return D(temporal.w(aVar), temporal.q(j$.time.temporal.a.NANO_OF_SECOND), R7);
        } catch (c e7) {
            String name = temporal.getClass().getName();
            throw new RuntimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + name, e7);
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f12590a = localDateTime;
        this.f12591b = zoneOffset;
        this.f12592c = zoneId;
    }

    private ZonedDateTime W(LocalDateTime localDateTime) {
        return T(localDateTime, this.f12592c, this.f12591b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.t(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).o();
            }
            return this.f12590a.t(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = A.f12572a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f12591b.Z();
                }
                return this.f12590a.q(qVar);
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC1202i.e(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = A.f12572a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f12591b.Z();
                }
                return this.f12590a.w(qVar);
            }
            return AbstractC1202i.p(this);
        }
        return qVar.s(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset i() {
        return this.f12591b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId u() {
        return this.f12592c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime k(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f12592c.equals(zoneId) ? this : T(this.f12590a, zoneId, this.f12591b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: Y */
    public final ZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f12592c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f12590a;
        localDateTime.getClass();
        return D(AbstractC1202i.o(localDateTime, this.f12591b), localDateTime.Y(), zoneId);
    }

    public final LocalDateTime X() {
        return this.f12590a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1195b c() {
        return this.f12590a.k0();
    }

    public int getYear() {
        return this.f12590a.a0();
    }

    public int getMonthValue() {
        return this.f12590a.X();
    }

    public int getDayOfMonth() {
        return this.f12590a.T();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f12590a.U();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l b() {
        return this.f12590a.b();
    }

    public int getHour() {
        return this.f12590a.V();
    }

    public int getMinute() {
        return this.f12590a.W();
    }

    public int getSecond() {
        return this.f12590a.Z();
    }

    public int getNano() {
        return this.f12590a.Y();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return W(LocalDateTime.f0(hVar, this.f12590a.b()));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i7 = A.f12572a[aVar.ordinal()];
            ZoneId zoneId = this.f12592c;
            if (i7 != 1) {
                LocalDateTime localDateTime = this.f12590a;
                if (i7 == 2) {
                    ZoneOffset c02 = ZoneOffset.c0(aVar.R(j));
                    return (c02.equals(this.f12591b) || !zoneId.S().g(localDateTime).contains(c02)) ? this : new ZonedDateTime(localDateTime, zoneId, c02);
                }
                return W(localDateTime.d(j, qVar));
            }
            return D(j, getNano(), zoneId);
        }
        return (ZonedDateTime) qVar.w(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U */
    public final ZonedDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            boolean z7 = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
            LocalDateTime localDateTime = this.f12590a;
            if (z7) {
                return W(localDateTime.e(j, temporalUnit));
            }
            LocalDateTime e7 = localDateTime.e(j, temporalUnit);
            Objects.requireNonNull(e7, "localDateTime");
            ZoneOffset zoneOffset = this.f12591b;
            Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
            ZoneId zoneId = this.f12592c;
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.S().g(e7).contains(zoneOffset)) {
                return new ZonedDateTime(e7, zoneId, zoneOffset);
            }
            e7.getClass();
            return D(AbstractC1202i.o(e7, zoneOffset), e7.Y(), zoneId);
        }
        return (ZonedDateTime) temporalUnit.o(this, j);
    }

    public ZonedDateTime plusDays(long j) {
        return W(this.f12590a.plusDays(j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.f()) {
            return this.f12590a.k0();
        }
        return AbstractC1202i.m(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime R7 = R(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime j = R7.j(this.f12592c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.f12590a;
            LocalDateTime localDateTime2 = j.f12590a;
            if (compareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.f(localDateTime2, temporalUnit);
            }
            return OffsetDateTime.R(localDateTime, this.f12591b).f(OffsetDateTime.R(localDateTime2, j.f12591b), temporalUnit);
        }
        return temporalUnit.between(this, R7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.f12590a.equals(zonedDateTime.f12590a) && this.f12591b.equals(zonedDateTime.f12591b) && this.f12592c.equals(zonedDateTime.f12592c);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12590a.hashCode() ^ this.f12591b.hashCode()) ^ Integer.rotateLeft(this.f12592c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.f12590a.toString();
        ZoneOffset zoneOffset = this.f12591b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f12592c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    private Object writeReplace() {
        return new u((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(DataOutput dataOutput) {
        this.f12590a.o0(dataOutput);
        this.f12591b.f0(dataOutput);
        this.f12592c.W((ObjectOutput) dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime V(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f12578c;
        h hVar = h.f12728d;
        LocalDateTime f02 = LocalDateTime.f0(h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.i0(objectInput));
        ZoneOffset e02 = ZoneOffset.e0(objectInput);
        ZoneId zoneId = (ZoneId) u.a(objectInput);
        Objects.requireNonNull(f02, "localDateTime");
        Objects.requireNonNull(e02, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !e02.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(f02, zoneId, e02);
    }
}
