package j$.time;

import j$.time.chrono.AbstractC1202i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n implements TemporalAccessor, j$.time.temporal.m {
    public static final n APRIL;
    public static final n AUGUST;
    public static final n DECEMBER;
    public static final n FEBRUARY;
    public static final n JANUARY;
    public static final n JULY;
    public static final n JUNE;
    public static final n MARCH;
    public static final n MAY;
    public static final n NOVEMBER;
    public static final n OCTOBER;
    public static final n SEPTEMBER;

    /* renamed from: a  reason: collision with root package name */
    private static final n[] f12744a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ n[] f12745b;

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f12745b.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.n] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.n] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r9 = new Enum("MAY", 4);
        MAY = r9;
        ?? r8 = new Enum("JUNE", 5);
        JUNE = r8;
        ?? r7 = new Enum("JULY", 6);
        JULY = r7;
        ?? r62 = new Enum("AUGUST", 7);
        AUGUST = r62;
        ?? r52 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r52;
        ?? r42 = new Enum("OCTOBER", 9);
        OCTOBER = r42;
        ?? r32 = new Enum("NOVEMBER", 10);
        NOVEMBER = r32;
        ?? r22 = new Enum("DECEMBER", 11);
        DECEMBER = r22;
        f12745b = new n[]{r12, r13, r14, r15, r9, r8, r7, r62, r52, r42, r32, r22};
        f12744a = values();
    }

    public static n U(int i7) {
        if (i7 < 1 || i7 > 12) {
            throw new RuntimeException("Invalid value for MonthOfYear: " + i7);
        }
        return f12744a[i7 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.o();
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
        return qVar.s(this);
    }

    public final n V() {
        int i7 = ((int) 1) + 12;
        return f12744a[(i7 + ordinal()) % 12];
    }

    public final int S(boolean z7) {
        int i7 = m.f12743a[ordinal()];
        return i7 != 1 ? (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? 30 : 31 : z7 ? 29 : 28;
    }

    public final int T() {
        int i7 = m.f12743a[ordinal()];
        if (i7 != 1) {
            return (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int R(boolean z7) {
        switch (m.f12743a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z7 ? 1 : 0) + 91;
            case 3:
                return (z7 ? 1 : 0) + 152;
            case 4:
                return (z7 ? 1 : 0) + 244;
            case 5:
                return (z7 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z7 ? 1 : 0) + 60;
            case 8:
                return (z7 ? 1 : 0) + 121;
            case 9:
                return (z7 ? 1 : 0) + 182;
            case 10:
                return (z7 ? 1 : 0) + 213;
            case 11:
                return (z7 ? 1 : 0) + 274;
            default:
                return (z7 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f12641d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC1202i.q(temporal).equals(j$.time.chrono.t.f12641d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
