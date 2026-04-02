package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class B extends AbstractC1194a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final B f12596d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n P(int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return E.ROC;
            }
            throw new RuntimeException("Invalid era: " + i7);
        }
        return E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b H(int i7, int i8, int i9) {
        return new D(j$.time.h.g0(i7 + 1911, i8, i9));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b y(int i7, int i8) {
        return new D(j$.time.h.j0(i7 + 1911, i8));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b m(long j) {
        return new D(j$.time.h.i0(j));
    }

    @Override // j$.time.chrono.AbstractC1194a
    public final InterfaceC1195b q() {
        return new D(j$.time.h.T(j$.time.h.f0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof D) {
            return (D) temporalAccessor;
        }
        return new D(j$.time.h.T(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i7) {
        if (nVar instanceof E) {
            return nVar == E.ROC ? i7 : 1 - i7;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.com.android.tools.r8.a.h(E.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        int i7 = A.f12595a[aVar.ordinal()];
        if (i7 == 1) {
            j$.time.temporal.t o7 = j$.time.temporal.a.PROLEPTIC_MONTH.o();
            return j$.time.temporal.t.j(o7.e() - 22932, o7.d() - 22932);
        } else if (i7 == 2) {
            j$.time.temporal.t o8 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.k(o8.d() - 1911, (-o8.e()) + 1912);
        } else if (i7 == 3) {
            j$.time.temporal.t o9 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.j(o9.e() - 1911, o9.d() - 1911);
        } else {
            return aVar.o();
        }
    }

    @Override // j$.time.chrono.AbstractC1194a, j$.time.chrono.m
    public final InterfaceC1195b J(Map map, j$.time.format.y yVar) {
        return (D) super.J(map, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return l.S(this, instant, zoneId);
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
