package j$.time.temporal;
/* loaded from: classes2.dex */
enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", j$.time.e.w(31556952)),
    QUARTER_YEARS("QuarterYears", j$.time.e.w(7889238));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f12767a;

    /* renamed from: b  reason: collision with root package name */
    private final j$.time.e f12768b;

    h(String str, j$.time.e eVar) {
        this.f12767a = str;
        this.f12768b = eVar;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.e q() {
        return this.f12768b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal o(Temporal temporal, long j) {
        int i7 = b.f12763a[ordinal()];
        if (i7 == 1) {
            q qVar = i.f12771c;
            return temporal.d(j$.com.android.tools.r8.a.f(temporal.q(qVar), j), qVar);
        } else if (i7 == 2) {
            return temporal.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.f(temporal2, this);
        }
        int i7 = b.f12763a[ordinal()];
        if (i7 == 1) {
            q qVar = i.f12771c;
            return j$.com.android.tools.r8.a.m(temporal2.w(qVar), temporal.w(qVar));
        } else if (i7 == 2) {
            return temporal.f(temporal2, ChronoUnit.MONTHS) / 3;
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12767a;
    }
}
