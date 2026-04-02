package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* renamed from: j$.time.chrono.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1202i {
    public static boolean j(n nVar, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.t(nVar);
    }

    public static m q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object obj = (m) temporalAccessor.B(j$.time.temporal.l.e());
        t tVar = t.f12641d;
        if (obj == null) {
            obj = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) obj;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = AbstractC1203j.f12619a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return chronoZonedDateTime.i().Z();
                }
                return chronoZonedDateTime.G().q(qVar);
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.l.a(chronoZonedDateTime, qVar);
    }

    public static int f(n nVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return j$.time.temporal.l.a(nVar, aVar);
    }

    public static long g(n nVar, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.s(nVar);
    }

    public static Object n(n nVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.ERAS;
        }
        return j$.time.temporal.l.c(nVar, rVar);
    }

    public static Object l(InterfaceC1198e interfaceC1198e, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return interfaceC1198e.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return interfaceC1198e.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(interfaceC1198e);
    }

    public static boolean i(InterfaceC1195b interfaceC1195b, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).D();
        }
        return qVar != null && qVar.t(interfaceC1195b);
    }

    public static long o(InterfaceC1198e interfaceC1198e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return ((interfaceC1198e.c().x() * 86400) + interfaceC1198e.b().k0()) - zoneOffset.Z();
    }

    public static Object m(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.k()) {
            return chronoZonedDateTime.u();
        }
        if (rVar == j$.time.temporal.l.h()) {
            return chronoZonedDateTime.i();
        }
        if (rVar == j$.time.temporal.l.g()) {
            return chronoZonedDateTime.b();
        }
        if (rVar == j$.time.temporal.l.e()) {
            return chronoZonedDateTime.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(chronoZonedDateTime);
    }

    public static int c(InterfaceC1198e interfaceC1198e, InterfaceC1198e interfaceC1198e2) {
        int O7 = interfaceC1198e.c().O(interfaceC1198e2.c());
        if (O7 == 0) {
            int compareTo = interfaceC1198e.b().compareTo(interfaceC1198e2.b());
            if (compareTo == 0) {
                return ((AbstractC1194a) interfaceC1198e.a()).n().compareTo(interfaceC1198e2.a().n());
            }
            return compareTo;
        }
        return O7;
    }

    public static Object k(InterfaceC1195b interfaceC1195b, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.g()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.e()) {
            return interfaceC1195b.a();
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.DAYS;
        }
        return rVar.h(interfaceC1195b);
    }

    public static Temporal a(InterfaceC1195b interfaceC1195b, Temporal temporal) {
        return temporal.d(interfaceC1195b.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long p(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().x() * 86400) + chronoZonedDateTime.b().k0()) - chronoZonedDateTime.i().Z();
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.Q(), chronoZonedDateTime2.Q());
        if (compare == 0) {
            int X7 = chronoZonedDateTime.b().X() - chronoZonedDateTime2.b().X();
            if (X7 == 0) {
                int F7 = chronoZonedDateTime.G().F(chronoZonedDateTime2.G());
                if (F7 == 0) {
                    int compareTo = chronoZonedDateTime.u().n().compareTo(chronoZonedDateTime2.u().n());
                    if (compareTo == 0) {
                        return ((AbstractC1194a) chronoZonedDateTime.a()).n().compareTo(chronoZonedDateTime2.a().n());
                    }
                    return compareTo;
                }
                return F7;
            }
            return X7;
        }
        return compare;
    }

    public static boolean h(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int i7 = (chronoZonedDateTime.Q() > chronoZonedDateTime2.Q() ? 1 : (chronoZonedDateTime.Q() == chronoZonedDateTime2.Q() ? 0 : -1));
        return i7 < 0 || (i7 == 0 && chronoZonedDateTime.b().X() < chronoZonedDateTime2.b().X());
    }

    public static int b(InterfaceC1195b interfaceC1195b, InterfaceC1195b interfaceC1195b2) {
        int compare = Long.compare(interfaceC1195b.x(), interfaceC1195b2.x());
        if (compare == 0) {
            return ((AbstractC1194a) interfaceC1195b.a()).n().compareTo(interfaceC1195b2.a().n());
        }
        return compare;
    }
}
