package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* renamed from: j$.time.chrono.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1194a implements m {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f12607a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f12608b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f12609c = 0;

    public abstract /* synthetic */ InterfaceC1195b q();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return n().compareTo(((m) obj).n());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m t(AbstractC1194a abstractC1194a, String str) {
        String v6;
        m mVar = (m) f12607a.putIfAbsent(str, abstractC1194a);
        if (mVar == null && (v6 = abstractC1194a.v()) != null) {
            f12608b.putIfAbsent(v6, abstractC1194a);
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.chrono.m s(java.lang.String r4) {
        /*
            java.lang.String r0 = "id"
            j$.util.Objects.requireNonNull(r4, r0)
        L5:
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.chrono.AbstractC1194a.f12607a
            java.lang.Object r1 = r0.get(r4)
            j$.time.chrono.m r1 = (j$.time.chrono.m) r1
            if (r1 != 0) goto L17
            j$.util.concurrent.ConcurrentHashMap r1 = j$.time.chrono.AbstractC1194a.f12608b
            java.lang.Object r1 = r1.get(r4)
            j$.time.chrono.m r1 = (j$.time.chrono.m) r1
        L17:
            if (r1 == 0) goto L1a
            return r1
        L1a:
            java.lang.String r1 = "ISO"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L84
            j$.time.chrono.p r0 = j$.time.chrono.p.f12625o
            java.lang.String r2 = r0.n()
            t(r0, r2)
            j$.time.chrono.w r0 = j$.time.chrono.w.f12644d
            java.lang.String r2 = r0.n()
            t(r0, r2)
            j$.time.chrono.B r0 = j$.time.chrono.B.f12596d
            java.lang.String r2 = r0.n()
            t(r0, r2)
            j$.time.chrono.H r0 = j$.time.chrono.H.f12603d
            java.lang.String r2 = r0.n()
            t(r0, r2)
            r0 = 0
            j$.time.chrono.a[] r0 = new j$.time.chrono.AbstractC1194a[r0]     // Catch: java.lang.Throwable -> L79
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
        L51:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            j$.time.chrono.a r2 = (j$.time.chrono.AbstractC1194a) r2
            java.lang.String r3 = r2.n()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L51
            java.lang.String r3 = r2.n()
            t(r2, r3)
            goto L51
        L6f:
            j$.time.chrono.t r0 = j$.time.chrono.t.f12641d
            java.lang.String r1 = r0.n()
            t(r0, r1)
            goto L5
        L79:
            r4 = move-exception
            java.util.ServiceConfigurationError r0 = new java.util.ServiceConfigurationError
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r4)
            throw r0
        L84:
            java.lang.Class<j$.time.chrono.m> r0 = j$.time.chrono.m.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            j$.time.chrono.m r1 = (j$.time.chrono.m) r1
            java.lang.String r2 = r1.n()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lae
            java.lang.String r2 = r1.v()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L8e
        Lae:
            return r1
        Laf:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown chronology: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.AbstractC1194a.s(java.lang.String):j$.time.chrono.m");
    }

    @Override // j$.time.chrono.m
    public InterfaceC1195b J(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return m(((Long) map.remove(aVar)).longValue());
        }
        B(map, yVar);
        InterfaceC1195b R7 = R(map, yVar);
        if (R7 != null) {
            return R7;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return D(map, yVar);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int a7 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (yVar == j$.time.format.y.LENIENT) {
                            long m7 = j$.com.android.tools.r8.a.m(((Long) map.remove(aVar3)).longValue(), 1L);
                            long m8 = j$.com.android.tools.r8.a.m(((Long) map.remove(aVar4)).longValue(), 1L);
                            return H(a7, 1, 1).e(m7, (TemporalUnit) ChronoUnit.MONTHS).e(m8, (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int a8 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        int a9 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                        InterfaceC1195b e7 = H(a7, a8, 1).e((K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((a9 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (yVar != j$.time.format.y.STRICT || e7.q(aVar3) == a8) {
                            return e7;
                        }
                        throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int a10 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (yVar == j$.time.format.y.LENIENT) {
                            return w(H(a10, 1, 1), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int a11 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        InterfaceC1195b l8 = H(a10, a11, 1).e((K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).l(new j$.time.temporal.n(DayOfWeek.R(K(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (yVar != j$.time.format.y.STRICT || l8.q(aVar3) == a11) {
                            return l8;
                        }
                        throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int a12 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return y(a12, 1).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                }
                return y(a12, K(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int a13 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        long m9 = j$.com.android.tools.r8.a.m(((Long) map.remove(aVar8)).longValue(), 1L);
                        return y(a13, 1).e(m9, (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int a14 = K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
                    InterfaceC1195b e8 = y(a13, 1).e((K(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((a14 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (yVar != j$.time.format.y.STRICT || e8.q(aVar2) == a13) {
                        return e8;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int a15 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return w(y(a15, 1), 0L, j$.com.android.tools.r8.a.m(((Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    InterfaceC1195b l9 = y(a15, 1).e((K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).l(new j$.time.temporal.n(DayOfWeek.R(K(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                    if (yVar != j$.time.format.y.STRICT || l9.q(aVar2) == a15) {
                        return l9;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public InterfaceC1198e C(Temporal temporal) {
        try {
            return r(temporal).z(j$.time.l.T(temporal));
        } catch (j$.time.c e7) {
            Class<?> cls = temporal.getClass();
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + cls, e7);
        }
    }

    void B(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l8 = (Long) map.remove(aVar);
        if (l8 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.S(l8.longValue());
            }
            InterfaceC1195b d7 = q().d(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).d(l8.longValue(), (j$.time.temporal.q) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            o(map, aVar2, d7.q(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            o(map, aVar3, d7.q(aVar3));
        }
    }

    InterfaceC1195b R(Map map, j$.time.format.y yVar) {
        int i7;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l8 = (Long) map.remove(aVar);
        if (l8 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l9 = (Long) map.remove(aVar2);
            if (yVar != j$.time.format.y.LENIENT) {
                i7 = K(aVar).a(l8.longValue(), aVar);
            } else {
                long longValue = l8.longValue();
                int i8 = (int) longValue;
                if (longValue != i8) {
                    throw new ArithmeticException();
                }
                i7 = i8;
            }
            if (l9 != null) {
                o(map, j$.time.temporal.a.YEAR, h(P(K(aVar2).a(l9.longValue(), aVar2)), i7));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                o(map, aVar3, h(y(K(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).E(), i7));
                return null;
            } else if (yVar == j$.time.format.y.STRICT) {
                map.put(aVar, l8);
                return null;
            } else {
                List N7 = N();
                if (N7.isEmpty()) {
                    o(map, aVar3, i7);
                    return null;
                }
                o(map, aVar3, h((n) N7.get(N7.size() - 1), i7));
                return null;
            }
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (map.containsKey(aVar4)) {
            K(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
            return null;
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public ChronoZonedDateTime A(Temporal temporal) {
        try {
            ZoneId R7 = ZoneId.R(temporal);
            try {
                return L(Instant.S(temporal), R7);
            } catch (j$.time.c unused) {
                return l.R(R7, null, C1200g.R(this, C(temporal)));
            }
        } catch (j$.time.c e7) {
            Class<?> cls = temporal.getClass();
            throw new RuntimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + cls, e7);
        }
    }

    InterfaceC1195b D(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a7 = K(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (yVar == j$.time.format.y.LENIENT) {
            long m7 = j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return H(a7, 1, 1).e(m7, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a8 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a9 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (yVar == j$.time.format.y.SMART) {
            try {
                return H(a7, a8, a9);
            } catch (j$.time.c unused) {
                return H(a7, a8, 1).l(new j$.time.temporal.o(0));
            }
        }
        return H(a7, a8, a9);
    }

    static InterfaceC1195b w(InterfaceC1195b interfaceC1195b, long j, long j8, long j9) {
        long j10;
        InterfaceC1195b e7 = interfaceC1195b.e(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC1195b e8 = e7.e(j8, (TemporalUnit) chronoUnit);
        if (j9 > 7) {
            long j11 = j9 - 1;
            e8 = e8.e(j11 / 7, (TemporalUnit) chronoUnit);
            j10 = j11 % 7;
        } else {
            if (j9 < 1) {
                e8 = e8.e(j$.com.android.tools.r8.a.m(j9, 7L) / 7, (TemporalUnit) chronoUnit);
                j10 = (j9 + 6) % 7;
            }
            return e8.l(new j$.time.temporal.n(DayOfWeek.R((int) j9).getValue(), 0));
        }
        j9 = j10 + 1;
        return e8.l(new j$.time.temporal.n(DayOfWeek.R((int) j9).getValue(), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(Map map, j$.time.temporal.a aVar, long j) {
        Long l8 = (Long) map.get(aVar);
        if (l8 != null && l8.longValue() != j) {
            throw new RuntimeException("Conflict found: " + aVar + StringUtils.SPACE + l8 + " differs from " + aVar + StringUtils.SPACE + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1194a) && n().compareTo(((AbstractC1194a) obj).n()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ n().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return n();
    }
}
