package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class t extends AbstractC1194a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final t f12641d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n P(int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return u.CE;
            }
            throw new RuntimeException("Invalid era: " + i7);
        }
        return u.BCE;
    }

    private t() {
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b H(int i7, int i8, int i9) {
        return j$.time.h.g0(i7, i8, i9);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b y(int i7, int i8) {
        return j$.time.h.j0(i7, i8);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b m(long j) {
        return j$.time.h.i0(j);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b r(TemporalAccessor temporalAccessor) {
        return j$.time.h.T(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC1194a, j$.time.chrono.m
    public final InterfaceC1198e C(Temporal temporal) {
        return LocalDateTime.S(temporal);
    }

    @Override // j$.time.chrono.AbstractC1194a, j$.time.chrono.m
    public final ChronoZonedDateTime A(Temporal temporal) {
        return ZonedDateTime.R(temporal);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.S(instant, zoneId);
    }

    @Override // j$.time.chrono.AbstractC1194a
    public final InterfaceC1195b q() {
        j$.time.b b5 = j$.time.b.b();
        Objects.requireNonNull(b5, "clock");
        return j$.time.h.T(j$.time.h.f0(b5));
    }

    public static boolean S(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i7) {
        if (nVar instanceof u) {
            return nVar == u.CE ? i7 : 1 - i7;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.com.android.tools.r8.a.h(u.values());
    }

    @Override // j$.time.chrono.AbstractC1194a, j$.time.chrono.m
    public final InterfaceC1195b J(Map map, j$.time.format.y yVar) {
        return (j$.time.h) super.J(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC1194a
    final void B(Map map, j$.time.format.y yVar) {
        long j;
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l8 = (Long) map.remove(aVar);
        if (l8 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.S(l8.longValue());
            }
            AbstractC1194a.o(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.j(l8.longValue(), j)) + 1);
            AbstractC1194a.o(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.k(l8.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC1194a
    final InterfaceC1195b R(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l8 = (Long) map.remove(aVar);
        if (l8 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.S(l8.longValue());
            }
            Long l9 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l9 == null) {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
                Long l10 = (Long) map.get(aVar2);
                if (yVar != j$.time.format.y.STRICT) {
                    AbstractC1194a.o(map, aVar2, (l10 == null || l10.longValue() > 0) ? l8.longValue() : j$.com.android.tools.r8.a.m(1L, l8.longValue()));
                    return null;
                } else if (l10 != null) {
                    int i7 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
                    long longValue = l8.longValue();
                    if (i7 <= 0) {
                        longValue = j$.com.android.tools.r8.a.m(1L, longValue);
                    }
                    AbstractC1194a.o(map, aVar2, longValue);
                    return null;
                } else {
                    map.put(aVar, l8);
                    return null;
                }
            } else if (l9.longValue() == 1) {
                AbstractC1194a.o(map, j$.time.temporal.a.YEAR, l8.longValue());
                return null;
            } else if (l9.longValue() == 0) {
                AbstractC1194a.o(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.m(1L, l8.longValue()));
                return null;
            } else {
                throw new RuntimeException("Invalid value for era: " + l9);
            }
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (map.containsKey(aVar3)) {
            aVar3.S(((Long) map.get(aVar3)).longValue());
            return null;
        }
        return null;
    }

    @Override // j$.time.chrono.AbstractC1194a
    final InterfaceC1195b D(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int R7 = aVar.R(((Long) map.remove(aVar)).longValue());
        boolean z7 = true;
        if (yVar == j$.time.format.y.LENIENT) {
            return j$.time.h.g0(R7, 1, 1).m0(j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).l0(j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int R8 = aVar2.R(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int R9 = aVar3.R(((Long) map.remove(aVar3)).longValue());
        if (yVar == j$.time.format.y.SMART) {
            if (R8 == 4 || R8 == 6 || R8 == 9 || R8 == 11) {
                R9 = Math.min(R9, 30);
            } else if (R8 == 2) {
                j$.time.n nVar = j$.time.n.FEBRUARY;
                long j = R7;
                int i7 = j$.time.w.f12794b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z7 = false;
                }
                R9 = Math.min(R9, nVar.S(z7));
            }
        }
        return j$.time.h.g0(R7, R8, R9);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        return aVar.o();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
