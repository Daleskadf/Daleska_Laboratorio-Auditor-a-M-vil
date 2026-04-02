package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1202i;
import j$.time.temporal.TemporalAccessor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        Long e7 = tVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor d7 = tVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d7.g(aVar) ? Long.valueOf(tVar.d().w(aVar)) : null;
        int i7 = 0;
        if (e7 == null) {
            return false;
        }
        long longValue = e7.longValue();
        int R7 = aVar.R(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long k2 = j$.com.android.tools.r8.a.k(j, 315569520000L) + 1;
            LocalDateTime g02 = LocalDateTime.g0(j$.com.android.tools.r8.a.j(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (k2 > 0) {
                sb.append('+');
                sb.append(k2);
            }
            sb.append(g02);
            if (g02.Z() == 0) {
                sb.append(":00");
            }
        } else {
            long j8 = longValue + 62167219200L;
            long j9 = j8 / 315569520000L;
            long j10 = j8 % 315569520000L;
            LocalDateTime g03 = LocalDateTime.g0(j10 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(g03);
            if (g03.Z() == 0) {
                sb.append(":00");
            }
            if (j9 < 0) {
                if (g03.a0() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j9 - 1));
                } else if (j10 == 0) {
                    sb.insert(length, j9);
                } else {
                    sb.insert(length + 1, Math.abs(j9));
                }
            }
        }
        if (R7 > 0) {
            sb.append('.');
            int i8 = 100000000;
            while (true) {
                if (R7 <= 0 && i7 % 3 == 0 && i7 >= -2) {
                    break;
                }
                int i9 = R7 / i8;
                sb.append((char) (i9 + 48));
                R7 -= i9 * i8;
                i8 /= 10;
                i7++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        int i8;
        int i9;
        p pVar = new p();
        pVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        pVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        pVar.k(aVar, 2);
        pVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar.k(aVar2, 2);
        pVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar.k(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        pVar.b(aVar4);
        pVar.e('Z');
        e f = pVar.t().f();
        q c8 = qVar.c();
        int q2 = f.q(c8, charSequence, i7);
        if (q2 < 0) {
            return q2;
        }
        long longValue = c8.i(j$.time.temporal.a.YEAR).longValue();
        int intValue = c8.i(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = c8.i(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = c8.i(aVar).intValue();
        int intValue4 = c8.i(aVar2).intValue();
        Long i10 = c8.i(aVar3);
        Long i11 = c8.i(aVar4);
        int i12 = 0;
        int intValue5 = i10 != null ? i10.intValue() : 0;
        int intValue6 = i11 != null ? i11.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i9 = intValue5;
            i8 = 0;
            i12 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            qVar.o();
            i8 = intValue3;
            i9 = 59;
        } else {
            i8 = intValue3;
            i9 = intValue5;
        }
        try {
            LocalDateTime plusDays = LocalDateTime.e0(((int) longValue) % 10000, intValue, intValue2, i8, intValue4, i9, 0).plusDays(i12);
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            plusDays.getClass();
            return qVar.n(aVar4, intValue6, i7, qVar.n(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.l(longValue / 10000, 315569520000L) + AbstractC1202i.o(plusDays, zoneOffset), i7, q2));
        } catch (RuntimeException unused) {
            return ~i7;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
