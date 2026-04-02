package j$.time.temporal;
/* loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", j$.time.e.t(1)),
    MICROS("Micros", j$.time.e.t(1000)),
    MILLIS("Millis", j$.time.e.t(1000000)),
    SECONDS("Seconds", j$.time.e.w(1)),
    MINUTES("Minutes", j$.time.e.w(60)),
    HOURS("Hours", j$.time.e.w(3600)),
    HALF_DAYS("HalfDays", j$.time.e.w(43200)),
    DAYS("Days", j$.time.e.w(86400)),
    WEEKS("Weeks", j$.time.e.w(604800)),
    MONTHS("Months", j$.time.e.w(2629746)),
    YEARS("Years", j$.time.e.w(31556952)),
    DECADES("Decades", j$.time.e.w(315569520)),
    CENTURIES("Centuries", j$.time.e.w(3155695200L)),
    MILLENNIA("Millennia", j$.time.e.w(31556952000L)),
    ERAS("Eras", j$.time.e.w(31556952000000000L)),
    FOREVER("Forever", j$.time.e.B(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f12758a;

    /* renamed from: b  reason: collision with root package name */
    private final j$.time.e f12759b;

    ChronoUnit(String str, j$.time.e eVar) {
        this.f12758a = str;
        this.f12759b = eVar;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final j$.time.e q() {
        return this.f12759b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal o(Temporal temporal, long j) {
        return temporal.e(j, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.f(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12758a;
    }
}
