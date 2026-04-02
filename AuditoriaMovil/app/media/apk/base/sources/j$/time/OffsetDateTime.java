package j$.time;

import j$.time.chrono.AbstractC1202i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f12582a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f12583b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int X7;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f12583b;
        ZoneOffset zoneOffset2 = this.f12583b;
        if (zoneOffset2.equals(zoneOffset)) {
            X7 = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f12582a;
            localDateTime.getClass();
            long o7 = AbstractC1202i.o(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f12582a;
            localDateTime2.getClass();
            int compare = Long.compare(o7, AbstractC1202i.o(localDateTime2, offsetDateTime2.f12583b));
            X7 = compare == 0 ? localDateTime.b().X() - localDateTime2.b().X() : compare;
        }
        return X7 == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : X7;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f12578c;
        ZoneOffset zoneOffset = ZoneOffset.f12587g;
        localDateTime.getClass();
        R(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f12579d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        R(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime S(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d7 = zoneId.S().d(instant);
        return new OffsetDateTime(LocalDateTime.g0(instant.T(), instant.U(), d7), d7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset Y3 = ZoneOffset.Y(temporal);
                h hVar = (h) temporal.B(j$.time.temporal.l.f());
                l lVar = (l) temporal.B(j$.time.temporal.l.g());
                if (hVar != null && lVar != null) {
                    temporal = new OffsetDateTime(LocalDateTime.f0(hVar, lVar), Y3);
                } else {
                    temporal = S(Instant.S(temporal), Y3);
                }
            } catch (c e7) {
                String name = temporal.getClass().getName();
                throw new RuntimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + name, e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.f12583b;
            ZoneOffset zoneOffset2 = this.f12583b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.f12582a.i0(zoneOffset2.Z() - zoneOffset.Z()), zoneOffset2);
            }
            return this.f12582a.f(offsetDateTime.f12582a, temporalUnit);
        }
        return temporalUnit.between(this, temporal);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f12582a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f12583b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
    }

    private OffsetDateTime V(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f12582a == localDateTime && this.f12583b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            return this.f12582a.t(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = q.f12749a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f12583b.Z();
                }
                return this.f12582a.q(qVar);
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = q.f12749a[((j$.time.temporal.a) qVar).ordinal()];
            ZoneOffset zoneOffset = this.f12583b;
            LocalDateTime localDateTime = this.f12582a;
            if (i7 == 1) {
                localDateTime.getClass();
                return AbstractC1202i.o(localDateTime, zoneOffset);
            } else if (i7 == 2) {
                return zoneOffset.Z();
            } else {
                return localDateTime.w(qVar);
            }
        }
        return qVar.s(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f12582a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return V(this.f12582a.m0(hVar), this.f12583b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i7 = q.f12749a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f12583b;
            LocalDateTime localDateTime = this.f12582a;
            if (i7 != 1) {
                if (i7 == 2) {
                    return V(localDateTime, ZoneOffset.c0(aVar.R(j)));
                }
                return V(localDateTime.d(j, qVar), zoneOffset);
            }
            return S(Instant.X(j, localDateTime.Y()), zoneOffset);
        }
        return (OffsetDateTime) qVar.w(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T */
    public final OffsetDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return V(this.f12582a.e(j, temporalUnit), this.f12583b);
        }
        return (OffsetDateTime) temporalUnit.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) {
            return this.f12583b;
        }
        if (rVar == j$.time.temporal.l.k()) {
            return null;
        }
        j$.time.temporal.r f = j$.time.temporal.l.f();
        LocalDateTime localDateTime = this.f12582a;
        if (rVar == f) {
            return localDateTime.k0();
        }
        if (rVar == j$.time.temporal.l.g()) {
            return localDateTime.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f12641d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f12582a;
        return temporal.d(localDateTime.k0().x(), aVar).d(localDateTime.b().j0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f12583b.Z(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f12582a.equals(offsetDateTime.f12582a) && this.f12583b.equals(offsetDateTime.f12583b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12582a.hashCode() ^ this.f12583b.hashCode();
    }

    public final String toString() {
        String localDateTime = this.f12582a.toString();
        String zoneOffset = this.f12583b.toString();
        return localDateTime + zoneOffset;
    }

    private Object writeReplace() {
        return new u((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f12582a.o0(objectOutput);
        this.f12583b.f0(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime U(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f12578c;
        h hVar = h.f12728d;
        return new OffsetDateTime(LocalDateTime.f0(h.g0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.i0(objectInput)), ZoneOffset.e0(objectInput));
    }
}
