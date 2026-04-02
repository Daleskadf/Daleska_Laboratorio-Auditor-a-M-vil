package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes2.dex */
final class l implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C1200g f12621a;

    /* renamed from: b  reason: collision with root package name */
    private final transient ZoneOffset f12622b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneId f12623c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC1202i.m(this, rVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long Q() {
        return AbstractC1202i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC1202i.h(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return AbstractC1202i.e(this, qVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC1202i.d(this, chronoZonedDateTime);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoZonedDateTime R(ZoneId zoneId, ZoneOffset zoneOffset, C1200g c1200g) {
        Objects.requireNonNull(c1200g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, c1200g);
        }
        j$.time.zone.f S7 = zoneId.S();
        LocalDateTime S8 = LocalDateTime.S(c1200g);
        List g3 = S7.g(S8);
        if (g3.size() == 1) {
            zoneOffset = (ZoneOffset) g3.get(0);
        } else if (g3.size() == 0) {
            j$.time.zone.b f = S7.f(S8);
            c1200g = c1200g.U(f.s().s());
            zoneOffset = f.t();
        } else if (zoneOffset == null || !g3.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g3.get(0);
        }
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new l(zoneId, zoneOffset, c1200g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l S(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d7 = zoneId.S().d(instant);
        Objects.requireNonNull(d7, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new l(zoneId, d7, (C1200g) mVar.C(LocalDateTime.g0(instant.T(), instant.U(), d7)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).o();
            }
            return ((C1200g) G()).t(qVar);
        }
        return qVar.B(this);
    }

    static l D(m mVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        String n7 = mVar.n();
        String n8 = lVar.a().n();
        throw new ClassCastException("Chronology mismatch, required: " + n7 + ", actual: " + n8);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = AbstractC1203j.f12619a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return i().Z();
                }
                return ((C1200g) G()).w(qVar);
            }
            return Q();
        }
        return qVar.s(this);
    }

    private l(ZoneId zoneId, ZoneOffset zoneOffset, C1200g c1200g) {
        this.f12621a = (C1200g) Objects.requireNonNull(c1200g, "dateTime");
        this.f12622b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        this.f12623c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset i() {
        return this.f12622b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1195b c() {
        return ((C1200g) G()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.l b() {
        return ((C1200g) G()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1198e G() {
        return this.f12621a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId u() {
        return this.f12623c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final m a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime k(ZoneId zoneId) {
        return R(zoneId, this.f12622b, this.f12621a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f12623c.equals(zoneId)) {
            return this;
        }
        return S(a(), this.f12621a.W(this.f12622b), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return (qVar instanceof j$.time.temporal.a) || (qVar != null && qVar.t(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i7 = AbstractC1204k.f12620a[aVar.ordinal()];
            if (i7 != 1) {
                ZoneId zoneId = this.f12623c;
                C1200g c1200g = this.f12621a;
                if (i7 == 2) {
                    return S(a(), c1200g.W(ZoneOffset.c0(aVar.R(j))), zoneId);
                }
                return R(zoneId, this.f12622b, c1200g.d(j, qVar));
            }
            return e(j - AbstractC1202i.p(this), ChronoUnit.SECONDS);
        }
        return D(a(), qVar.w(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T */
    public final ChronoZonedDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return D(a(), this.f12621a.e(j, temporalUnit).D(this));
        }
        return D(a(), temporalUnit.o(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime A7 = a().A(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f12621a.f(A7.j(this.f12622b).G(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, A7);
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f12621a);
        objectOutput.writeObject(this.f12622b);
        objectOutput.writeObject(this.f12623c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC1202i.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f12621a.hashCode() ^ this.f12622b.hashCode()) ^ Integer.rotateLeft(this.f12623c.hashCode(), 3);
    }

    public final String toString() {
        String c1200g = this.f12621a.toString();
        ZoneOffset zoneOffset = this.f12622b;
        String str = c1200g + zoneOffset.toString();
        ZoneId zoneId = this.f12623c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(j$.time.h hVar) {
        return D(a(), hVar.D(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return D(a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.X(Q(), b().X());
    }
}
