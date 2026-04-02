package j$.time.temporal;

import j$.time.format.y;
import java.util.HashMap;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum NANO_OF_SECOND uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class a implements q {
    public static final a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final a ALIGNED_WEEK_OF_MONTH;
    public static final a ALIGNED_WEEK_OF_YEAR;
    public static final a AMPM_OF_DAY;
    public static final a CLOCK_HOUR_OF_AMPM;
    public static final a CLOCK_HOUR_OF_DAY;
    public static final a DAY_OF_MONTH;
    public static final a DAY_OF_WEEK;
    public static final a DAY_OF_YEAR;
    public static final a EPOCH_DAY;
    public static final a ERA;
    public static final a HOUR_OF_AMPM;
    public static final a HOUR_OF_DAY;
    public static final a INSTANT_SECONDS;
    public static final a MICRO_OF_DAY;
    public static final a MICRO_OF_SECOND;
    public static final a MILLI_OF_DAY;
    public static final a MILLI_OF_SECOND;
    public static final a MINUTE_OF_DAY;
    public static final a MINUTE_OF_HOUR;
    public static final a MONTH_OF_YEAR;
    public static final a NANO_OF_DAY;
    public static final a NANO_OF_SECOND;
    public static final a OFFSET_SECONDS;
    public static final a PROLEPTIC_MONTH;
    public static final a SECOND_OF_DAY;
    public static final a SECOND_OF_MINUTE;
    public static final a YEAR;
    public static final a YEAR_OF_ERA;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ a[] f12760c;

    /* renamed from: a  reason: collision with root package name */
    private final String f12761a;

    /* renamed from: b  reason: collision with root package name */
    private final t f12762b;

    @Override // j$.time.temporal.q
    public final /* synthetic */ TemporalAccessor q(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        return null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12760c.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        a aVar = new a("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, t.j(0L, 999999999L));
        NANO_OF_SECOND = aVar;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        a aVar2 = new a("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, t.j(0L, 86399999999999L));
        NANO_OF_DAY = aVar2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        a aVar3 = new a("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, t.j(0L, 999999L));
        MICRO_OF_SECOND = aVar3;
        a aVar4 = new a("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, t.j(0L, 86399999999L));
        MICRO_OF_DAY = aVar4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        a aVar5 = new a("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, t.j(0L, 999L));
        MILLI_OF_SECOND = aVar5;
        a aVar6 = new a("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, t.j(0L, 86399999L));
        MILLI_OF_DAY = aVar6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        a aVar7 = new a("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, t.j(0L, 59L), 0);
        SECOND_OF_MINUTE = aVar7;
        a aVar8 = new a("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, t.j(0L, 86399L));
        SECOND_OF_DAY = aVar8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        a aVar9 = new a("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, t.j(0L, 59L), 0);
        MINUTE_OF_HOUR = aVar9;
        a aVar10 = new a("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, t.j(0L, 1439L));
        MINUTE_OF_DAY = aVar10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        a aVar11 = new a("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, t.j(0L, 11L));
        HOUR_OF_AMPM = aVar11;
        a aVar12 = new a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, t.j(1L, 12L));
        CLOCK_HOUR_OF_AMPM = aVar12;
        a aVar13 = new a("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, t.j(0L, 23L), 0);
        HOUR_OF_DAY = aVar13;
        a aVar14 = new a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, t.j(1L, 24L));
        CLOCK_HOUR_OF_DAY = aVar14;
        a aVar15 = new a("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, t.j(0L, 1L), 0);
        AMPM_OF_DAY = aVar15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        a aVar16 = new a("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, t.j(1L, 7L), 0);
        DAY_OF_WEEK = aVar16;
        a aVar17 = new a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, t.j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = aVar17;
        a aVar18 = new a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, t.j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = aVar18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        a aVar19 = new a("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, t.k(28L, 31L), 0);
        DAY_OF_MONTH = aVar19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        a aVar20 = new a("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, t.k(365L, 366L));
        DAY_OF_YEAR = aVar20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        a aVar21 = new a("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, t.j(-365243219162L, 365241780471L));
        EPOCH_DAY = aVar21;
        a aVar22 = new a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, t.k(4L, 5L));
        ALIGNED_WEEK_OF_MONTH = aVar22;
        a aVar23 = new a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, t.j(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = aVar23;
        a aVar24 = new a("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, t.j(1L, 12L), 0);
        MONTH_OF_YEAR = aVar24;
        a aVar25 = new a("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, t.j(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = aVar25;
        a aVar26 = new a("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, t.k(999999999L, 1000000000L));
        YEAR_OF_ERA = aVar26;
        a aVar27 = new a("YEAR", 26, "Year", chronoUnit11, chronoUnit12, t.j(-999999999L, 999999999L), 0);
        YEAR = aVar27;
        a aVar28 = new a("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, t.j(0L, 1L), 0);
        ERA = aVar28;
        a aVar29 = new a("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, t.j(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = aVar29;
        a aVar30 = new a("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, t.j(-64800L, 64800L));
        OFFSET_SECONDS = aVar30;
        f12760c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30};
    }

    private a(String str, int i7, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, t tVar) {
        this.f12761a = str2;
        this.f12762b = tVar;
    }

    private a(String str, int i7, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, t tVar, int i8) {
        this.f12761a = str2;
        this.f12762b = tVar;
    }

    @Override // j$.time.temporal.q
    public final t o() {
        return this.f12762b;
    }

    @Override // j$.time.temporal.q
    public final boolean D() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean T() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void S(long j) {
        this.f12762b.b(j, this);
    }

    public final int R(long j) {
        return this.f12762b.a(j, this);
    }

    @Override // j$.time.temporal.q
    public final boolean t(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(this);
    }

    @Override // j$.time.temporal.q
    public final t B(TemporalAccessor temporalAccessor) {
        return temporalAccessor.t(this);
    }

    @Override // j$.time.temporal.q
    public final long s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.w(this);
    }

    @Override // j$.time.temporal.q
    public final Temporal w(Temporal temporal, long j) {
        return temporal.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12761a;
    }
}
