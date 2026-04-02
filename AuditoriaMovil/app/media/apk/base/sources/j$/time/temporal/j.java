package j$.time.temporal;

import j$.time.chrono.AbstractC1202i;
import j$.time.format.y;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum JULIAN_DAY uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class j implements q {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ j[] f12772d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a  reason: collision with root package name */
    private final transient String f12773a;

    /* renamed from: b  reason: collision with root package name */
    private final transient t f12774b;

    /* renamed from: c  reason: collision with root package name */
    private final transient long f12775c;

    @Override // j$.time.temporal.q
    public final boolean D() {
        return true;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f12772d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        f12772d = new j[]{jVar, jVar2, jVar3};
    }

    private j(String str, int i7, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.f12773a = str2;
        this.f12774b = t.j((-365243219162L) + j, 365241780471L + j);
        this.f12775c = j;
    }

    @Override // j$.time.temporal.q
    public final t o() {
        return this.f12774b;
    }

    @Override // j$.time.temporal.q
    public final t B(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.g(a.EPOCH_DAY)) {
            throw new RuntimeException("Unsupported field: " + this);
        }
        return this.f12774b;
    }

    @Override // j$.time.temporal.q
    public final boolean t(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final long s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.w(a.EPOCH_DAY) + this.f12775c;
    }

    @Override // j$.time.temporal.q
    public final Temporal w(Temporal temporal, long j) {
        if (!this.f12774b.i(j)) {
            throw new RuntimeException("Invalid value: " + this.f12773a + StringUtils.SPACE + j);
        }
        return temporal.d(j$.com.android.tools.r8.a.m(j, this.f12775c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor q(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        j$.time.chrono.m q2 = AbstractC1202i.q(temporalAccessor);
        y yVar2 = y.LENIENT;
        long j = this.f12775c;
        if (yVar == yVar2) {
            return q2.m(j$.com.android.tools.r8.a.m(longValue, j));
        }
        this.f12774b.b(longValue, this);
        return q2.m(longValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12773a;
    }
}
