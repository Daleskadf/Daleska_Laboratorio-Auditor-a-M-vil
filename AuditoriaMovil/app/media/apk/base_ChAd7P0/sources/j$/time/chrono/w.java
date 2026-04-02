package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
public final class w extends AbstractC1194a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final w f12644d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b H(int i7, int i8, int i9) {
        return new y(j$.time.h.g0(i7, i8, i9));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b y(int i7, int i8) {
        return new y(j$.time.h.j0(i7, i8));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b m(long j) {
        return new y(j$.time.h.i0(j));
    }

    @Override // j$.time.chrono.AbstractC1194a
    public final InterfaceC1195b q() {
        return new y(j$.time.h.T(j$.time.h.f0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(j$.time.h.T(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i7) {
        if (!(nVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        z zVar = (z) nVar;
        int a02 = (zVar.n().a0() + i7) - 1;
        if (i7 == 1) {
            return a02;
        }
        if (a02 < -999999999 || a02 > 999999999 || a02 < zVar.n().a0() || nVar != z.h(j$.time.h.g0(a02, 1, 1))) {
            throw new RuntimeException("Invalid yearOfEra value");
        }
        return a02;
    }

    @Override // j$.time.chrono.m
    public final n P(int i7) {
        return z.v(i7);
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.com.android.tools.r8.a.h(z.C());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        switch (v.f12643a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new RuntimeException("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.t.k(z.A(), 999999999 - z.m().n().a0());
            case 6:
                return j$.time.temporal.t.k(z.y(), j$.time.temporal.a.DAY_OF_YEAR.o().d());
            case 7:
                return j$.time.temporal.t.j(y.f12646d.a0(), 999999999L);
            case 8:
                return j$.time.temporal.t.j(z.f12650d.getValue(), z.m().getValue());
            default:
                return aVar.o();
        }
    }

    @Override // j$.time.chrono.AbstractC1194a, j$.time.chrono.m
    public final InterfaceC1195b J(Map map, j$.time.format.y yVar) {
        return (y) super.J(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC1194a
    final InterfaceC1195b R(Map map, j$.time.format.y yVar) {
        y a02;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l8 = (Long) map.get(aVar);
        z v6 = l8 != null ? z.v(K(aVar).a(l8.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l9 = (Long) map.get(aVar2);
        int a7 = l9 != null ? K(aVar2).a(l9.longValue(), aVar2) : 0;
        if (v6 == null && l9 != null && !map.containsKey(j$.time.temporal.a.YEAR) && yVar != j$.time.format.y.STRICT) {
            v6 = z.C()[z.C().length - 1];
        }
        if (l9 != null && v6 != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return new y(j$.time.h.g0((v6.n().a0() + a7) - 1, 1, 1)).X(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).X(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int a8 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a9 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (yVar != j$.time.format.y.SMART) {
                        j$.time.h hVar = y.f12646d;
                        Objects.requireNonNull(v6, "era");
                        j$.time.h g02 = j$.time.h.g0((v6.n().a0() + a7) - 1, a8, a9);
                        if (g02.b0(v6.n()) || v6 != z.h(g02)) {
                            throw new RuntimeException("year, month, and day not valid for Era");
                        }
                        return new y(v6, a7, g02);
                    } else if (a7 < 1) {
                        throw new RuntimeException("Invalid YearOfEra: " + a7);
                    } else {
                        int a03 = (v6.n().a0() + a7) - 1;
                        try {
                            a02 = new y(j$.time.h.g0(a03, a8, a9));
                        } catch (j$.time.c unused) {
                            a02 = new y(j$.time.h.g0(a03, a8, 1)).a0(new j$.time.temporal.o(0));
                        }
                        if (a02.W() == v6 || j$.time.temporal.l.a(a02, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a7 <= 1) {
                            return a02;
                        }
                        throw new RuntimeException("Invalid YearOfEra for Era: " + v6 + StringUtils.SPACE + a7);
                    }
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return new y(j$.time.h.j0((v6.n().a0() + a7) - 1, 1)).X(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int a10 = K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.h hVar2 = y.f12646d;
                Objects.requireNonNull(v6, "era");
                j$.time.h j02 = a7 == 1 ? j$.time.h.j0(v6.n().a0(), (v6.n().X() + a10) - 1) : j$.time.h.j0((v6.n().a0() + a7) - 1, a10);
                if (j02.b0(v6.n()) || v6 != z.h(j02)) {
                    throw new RuntimeException("Invalid parameters");
                }
                return new y(v6, a7, j02);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return l.S(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
