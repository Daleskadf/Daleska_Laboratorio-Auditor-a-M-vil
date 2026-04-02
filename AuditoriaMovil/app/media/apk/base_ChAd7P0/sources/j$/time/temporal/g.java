package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.chrono.AbstractC1202i;
import j$.time.format.y;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class g implements q {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f12764a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ g[] f12765b;

    @Override // j$.time.temporal.q
    public final boolean D() {
        return true;
    }

    public /* synthetic */ TemporalAccessor q(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        return null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f12765b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.q
            public final t o() {
                return t.k(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.g(a.DAY_OF_YEAR) && temporalAccessor.g(a.MONTH_OF_YEAR) && temporalAccessor.g(a.YEAR)) {
                    q qVar = i.f12769a;
                    if (AbstractC1202i.q(temporalAccessor).equals(j$.time.chrono.t.f12641d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                long w2 = temporalAccessor.w(g.QUARTER_OF_YEAR);
                if (w2 == 1) {
                    long w7 = temporalAccessor.w(a.YEAR);
                    j$.time.chrono.t.f12641d.getClass();
                    return j$.time.chrono.t.S(w7) ? t.j(1L, 91L) : t.j(1L, 90L);
                } else if (w2 == 2) {
                    return t.j(1L, 91L);
                } else {
                    if (w2 == 3 || w2 == 4) {
                        return t.j(1L, 92L);
                    }
                    return o();
                }
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                int[] iArr;
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                int q2 = temporalAccessor.q(a.DAY_OF_YEAR);
                int q7 = temporalAccessor.q(a.MONTH_OF_YEAR);
                long w2 = temporalAccessor.w(a.YEAR);
                iArr = g.f12764a;
                int i7 = (q7 - 1) / 3;
                j$.time.chrono.t.f12641d.getClass();
                return q2 - iArr[i7 + (j$.time.chrono.t.S(w2) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j) {
                long s7 = s(temporal);
                o().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - s7) + temporal.w(aVar), aVar);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.q
            public final TemporalAccessor q(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
                long j;
                j$.time.h hVar;
                a aVar = a.YEAR;
                Long l8 = (Long) hashMap.get(aVar);
                q qVar = g.QUARTER_OF_YEAR;
                Long l9 = (Long) hashMap.get(qVar);
                if (l8 == null || l9 == null) {
                    return null;
                }
                int R7 = aVar.R(l8.longValue());
                long longValue = ((Long) hashMap.get(g.DAY_OF_QUARTER)).longValue();
                q qVar2 = i.f12769a;
                if (AbstractC1202i.q(temporalAccessor).equals(j$.time.chrono.t.f12641d)) {
                    if (yVar == y.LENIENT) {
                        hVar = j$.time.h.g0(R7, 1, 1).m0(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(l9.longValue(), 1L), 3));
                        j = j$.com.android.tools.r8.a.m(longValue, 1L);
                    } else {
                        j$.time.h g02 = j$.time.h.g0(R7, ((qVar.o().a(l9.longValue(), qVar) - 1) * 3) + 1, 1);
                        if (longValue < 1 || longValue > 90) {
                            if (yVar == y.STRICT) {
                                B(g02).b(longValue, this);
                            } else {
                                o().b(longValue, this);
                            }
                        }
                        j = longValue - 1;
                        hVar = g02;
                    }
                    hashMap.remove(this);
                    hashMap.remove(aVar);
                    hashMap.remove(qVar);
                    return hVar.l0(j);
                }
                throw new RuntimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final t o() {
                return t.j(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.g(a.MONTH_OF_YEAR)) {
                    q qVar = i.f12769a;
                    if (AbstractC1202i.q(temporalAccessor).equals(j$.time.chrono.t.f12641d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.w(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: QuarterOfYear");
                }
                return o();
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j) {
                long s7 = s(temporal);
                o().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j - s7) * 3) + temporal.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final t o() {
                return t.k(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.g(a.EPOCH_DAY)) {
                    q qVar = i.f12769a;
                    if (AbstractC1202i.q(temporalAccessor).equals(j$.time.chrono.t.f12641d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.V(j$.time.h.T(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.S(j$.time.h.T(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j) {
                o().b(j, this);
                return temporal.e(j$.com.android.tools.r8.a.m(j, s(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.q
            public final TemporalAccessor q(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
                j$.time.h d7;
                long j;
                long j8;
                q qVar = g.WEEK_BASED_YEAR;
                Long l8 = (Long) hashMap.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l9 = (Long) hashMap.get(aVar);
                if (l8 == null || l9 == null) {
                    return null;
                }
                int a7 = qVar.o().a(l8.longValue(), qVar);
                long longValue = ((Long) hashMap.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                q qVar2 = i.f12769a;
                if (AbstractC1202i.q(temporalAccessor).equals(j$.time.chrono.t.f12641d)) {
                    j$.time.h g02 = j$.time.h.g0(a7, 1, 4);
                    if (yVar == y.LENIENT) {
                        long longValue2 = l9.longValue();
                        if (longValue2 > 7) {
                            long j9 = longValue2 - 1;
                            g02 = g02.n0(j9 / 7);
                            j8 = j9 % 7;
                        } else {
                            j = 1;
                            if (longValue2 < 1) {
                                g02 = g02.n0(j$.com.android.tools.r8.a.m(longValue2, 7L) / 7);
                                j8 = (longValue2 + 6) % 7;
                            }
                            d7 = g02.n0(j$.com.android.tools.r8.a.m(longValue, j)).d(longValue2, aVar);
                        }
                        j = 1;
                        longValue2 = j8 + 1;
                        d7 = g02.n0(j$.com.android.tools.r8.a.m(longValue, j)).d(longValue2, aVar);
                    } else {
                        int R7 = aVar.R(l9.longValue());
                        if (longValue < 1 || longValue > 52) {
                            if (yVar == y.STRICT) {
                                g.V(g02).b(longValue, this);
                            } else {
                                o().b(longValue, this);
                            }
                        }
                        d7 = g02.n0(longValue - 1).d(R7, aVar);
                    }
                    hashMap.remove(this);
                    hashMap.remove(qVar);
                    hashMap.remove(aVar);
                    return d7;
                }
                throw new RuntimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final t o() {
                return a.YEAR.o();
            }

            @Override // j$.time.temporal.q
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.g(a.EPOCH_DAY)) {
                    q qVar = i.f12769a;
                    if (AbstractC1202i.q(temporalAccessor).equals(j$.time.chrono.t.f12641d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.q
            public final long s(TemporalAccessor temporalAccessor) {
                int W7;
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                W7 = g.W(j$.time.h.T(temporalAccessor));
                return W7;
            }

            @Override // j$.time.temporal.q
            public final t B(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                return o();
            }

            @Override // j$.time.temporal.q
            public final Temporal w(Temporal temporal, long j) {
                a aVar;
                j$.time.h g02;
                int X7;
                if (!t(temporal)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                int a7 = a.YEAR.o().a(j, g.WEEK_BASED_YEAR);
                j$.time.h T7 = j$.time.h.T(temporal);
                int q2 = T7.q(a.DAY_OF_WEEK);
                int S7 = g.S(T7);
                if (S7 == 53) {
                    X7 = g.X(a7);
                    if (X7 == 52) {
                        S7 = 52;
                    }
                }
                return temporal.s(j$.time.h.g0(a7, 1, 4).l0(((S7 - 1) * 7) + (q2 - g02.q(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f12765b = new g[]{gVar, gVar2, gVar3, gVar4};
        f12764a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t V(j$.time.h hVar) {
        return t.j(1L, X(W(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int X(int i7) {
        j$.time.h g02 = j$.time.h.g0(i7, 1, 1);
        if (g02.W() != DayOfWeek.THURSDAY) {
            return (g02.W() == DayOfWeek.WEDNESDAY && g02.c0()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(j$.time.h hVar) {
        int ordinal = hVar.W().ordinal();
        int i7 = 1;
        int X7 = hVar.X() - 1;
        int i8 = (3 - ordinal) + X7;
        int i9 = i8 - ((i8 / 7) * 7);
        int i10 = i9 - 3;
        if (i10 < -3) {
            i10 = i9 + 4;
        }
        if (X7 < i10) {
            return (int) t.j(1L, X(W(hVar.s0(180).o0(-1L)))).d();
        }
        int i11 = ((X7 - i10) / 7) + 1;
        if (i11 != 53 || i10 == -3 || (i10 == -2 && hVar.c0())) {
            i7 = i11;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int W(j$.time.h hVar) {
        int a02 = hVar.a0();
        int X7 = hVar.X();
        if (X7 <= 3) {
            return X7 - hVar.W().ordinal() < -2 ? a02 - 1 : a02;
        } else if (X7 >= 363) {
            return ((X7 - 363) - (hVar.c0() ? 1 : 0)) - hVar.W().ordinal() >= 0 ? a02 + 1 : a02;
        } else {
            return a02;
        }
    }
}
