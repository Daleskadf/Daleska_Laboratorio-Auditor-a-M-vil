package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class H extends AbstractC1194a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final H f12603d = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n P(int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return K.BE;
            }
            throw new RuntimeException("Invalid era: " + i7);
        }
        return K.BEFORE_BE;
    }

    private H() {
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String v() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b H(int i7, int i8, int i9) {
        return new J(j$.time.h.g0(i7 - 543, i8, i9));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b y(int i7, int i8) {
        return new J(j$.time.h.j0(i7 - 543, i8));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b m(long j) {
        return new J(j$.time.h.i0(j));
    }

    @Override // j$.time.chrono.AbstractC1194a
    public final InterfaceC1195b q() {
        return new J(j$.time.h.T(j$.time.h.f0(j$.time.b.b())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1195b r(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof J) {
            return (J) temporalAccessor;
        }
        return new J(j$.time.h.T(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int h(n nVar, int i7) {
        if (nVar instanceof K) {
            return nVar == K.BE ? i7 : 1 - i7;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.m
    public final List N() {
        return j$.com.android.tools.r8.a.h(K.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t K(j$.time.temporal.a aVar) {
        int i7 = G.f12602a[aVar.ordinal()];
        if (i7 == 1) {
            j$.time.temporal.t o7 = j$.time.temporal.a.PROLEPTIC_MONTH.o();
            return j$.time.temporal.t.j(o7.e() + 6516, o7.d() + 6516);
        } else if (i7 == 2) {
            j$.time.temporal.t o8 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.k((-(o8.e() + 543)) + 1, o8.d() + 543);
        } else if (i7 == 3) {
            j$.time.temporal.t o9 = j$.time.temporal.a.YEAR.o();
            return j$.time.temporal.t.j(o9.e() + 543, o9.d() + 543);
        } else {
            return aVar.o();
        }
    }

    @Override // j$.time.chrono.AbstractC1194a, j$.time.chrono.m
    public final InterfaceC1195b J(Map map, j$.time.format.y yVar) {
        return (J) super.J(map, yVar);
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
