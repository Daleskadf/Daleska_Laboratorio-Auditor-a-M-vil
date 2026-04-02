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
public final class s implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a  reason: collision with root package name */
    private final l f12751a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f12752b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        boolean equals = this.f12752b.equals(sVar.f12752b);
        l lVar = this.f12751a;
        l lVar2 = sVar.f12751a;
        if (equals) {
            return lVar.compareTo(lVar2);
        }
        int compare = Long.compare(U(), sVar.U());
        return compare == 0 ? lVar.compareTo(lVar2) : compare;
    }

    static {
        l lVar = l.f12736e;
        ZoneOffset zoneOffset = ZoneOffset.f12587g;
        lVar.getClass();
        R(lVar, zoneOffset);
        l lVar2 = l.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        lVar2.getClass();
        R(lVar2, zoneOffset2);
    }

    public static s R(l lVar, ZoneOffset zoneOffset) {
        return new s(lVar, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        s sVar;
        if (temporal instanceof s) {
            sVar = (s) temporal;
        } else {
            try {
                sVar = new s(l.T(temporal), ZoneOffset.Y(temporal));
            } catch (c e7) {
                String name = temporal.getClass().getName();
                throw new RuntimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + name, e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long U7 = sVar.U() - U();
            switch (r.f12750a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return U7;
                case 2:
                    return U7 / 1000;
                case 3:
                    return U7 / 1000000;
                case 4:
                    return U7 / 1000000000;
                case 5:
                    return U7 / 60000000000L;
                case 6:
                    return U7 / 3600000000000L;
                case 7:
                    return U7 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, sVar);
    }

    private s(l lVar, ZoneOffset zoneOffset) {
        this.f12751a = (l) Objects.requireNonNull(lVar, "time");
        this.f12752b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
    }

    private s V(l lVar, ZoneOffset zoneOffset) {
        return (this.f12751a == lVar && this.f12752b.equals(zoneOffset)) ? this : new s(lVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).T() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).o();
            }
            l lVar = this.f12751a;
            lVar.getClass();
            return j$.time.temporal.l.d(lVar, qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f12752b.Z();
            }
            return this.f12751a.w(qVar);
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            l lVar = this.f12751a;
            if (qVar == aVar) {
                return V(lVar, ZoneOffset.c0(((j$.time.temporal.a) qVar).R(j)));
            }
            return V(lVar.d(j, qVar), this.f12752b);
        }
        return (s) qVar.w(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S */
    public final s e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return V(this.f12751a.e(j, temporalUnit), this.f12752b);
        }
        return (s) temporalUnit.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) {
            return this.f12752b;
        }
        if (((rVar == j$.time.temporal.l.k()) || (rVar == j$.time.temporal.l.e())) || rVar == j$.time.temporal.l.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this.f12751a;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(this.f12751a.j0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f12752b.Z(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    private long U() {
        return this.f12751a.j0() - (this.f12752b.Z() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f12751a.equals(sVar.f12751a) && this.f12752b.equals(sVar.f12752b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12751a.hashCode() ^ this.f12752b.hashCode();
    }

    public final String toString() {
        String lVar = this.f12751a.toString();
        String zoneOffset = this.f12752b.toString();
        return lVar + zoneOffset;
    }

    private Object writeReplace() {
        return new u((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f12751a.n0(objectOutput);
        this.f12752b.f0(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s T(ObjectInput objectInput) {
        return new s(l.i0(objectInput), ZoneOffset.e0(objectInput));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return (s) AbstractC1202i.a(hVar, this);
    }
}
