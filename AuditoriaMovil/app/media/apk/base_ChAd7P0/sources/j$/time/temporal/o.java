package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements r, m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12785a;

    public /* synthetic */ o(int i7) {
        this.f12785a = i7;
    }

    @Override // j$.time.temporal.m
    public Temporal D(Temporal temporal) {
        a aVar = a.DAY_OF_MONTH;
        return temporal.d(temporal.t(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.r
    public Object h(TemporalAccessor temporalAccessor) {
        switch (this.f12785a) {
            case 1:
                return (ZoneId) temporalAccessor.B(l.f12777a);
            case 2:
                return (j$.time.chrono.m) temporalAccessor.B(l.f12778b);
            case 3:
                return (TemporalUnit) temporalAccessor.B(l.f12779c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.g(aVar)) {
                    return ZoneOffset.c0(temporalAccessor.q(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.B(l.f12777a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.B(l.f12780d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.g(aVar2)) {
                    return j$.time.h.i0(temporalAccessor.w(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.g(aVar3)) {
                    return j$.time.l.b0(temporalAccessor.w(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f12785a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
