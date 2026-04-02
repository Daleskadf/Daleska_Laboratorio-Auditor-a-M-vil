package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1195b;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x implements TemporalAccessor {

    /* renamed from: b  reason: collision with root package name */
    ZoneId f12718b;

    /* renamed from: c  reason: collision with root package name */
    j$.time.chrono.m f12719c;

    /* renamed from: d  reason: collision with root package name */
    boolean f12720d;

    /* renamed from: e  reason: collision with root package name */
    private y f12721e;
    private InterfaceC1195b f;

    /* renamed from: g  reason: collision with root package name */
    private j$.time.l f12722g;

    /* renamed from: a  reason: collision with root package name */
    final HashMap f12717a = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    j$.time.t f12723h = j$.time.t.f12753d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (this.f12717a.containsKey(qVar)) {
            return true;
        }
        InterfaceC1195b interfaceC1195b = this.f;
        if (interfaceC1195b == null || !interfaceC1195b.g(qVar)) {
            j$.time.l lVar = this.f12722g;
            if (lVar == null || !lVar.g(qVar)) {
                return (qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.t(this)) ? false : true;
            }
            return true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        Long l8 = (Long) this.f12717a.get(qVar);
        if (l8 != null) {
            return l8.longValue();
        }
        InterfaceC1195b interfaceC1195b = this.f;
        if (interfaceC1195b != null && interfaceC1195b.g(qVar)) {
            return this.f.w(qVar);
        }
        j$.time.l lVar = this.f12722g;
        if (lVar != null && lVar.g(qVar)) {
            return this.f12722g.w(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k()) {
            return this.f12718b;
        }
        if (rVar == j$.time.temporal.l.e()) {
            return this.f12719c;
        }
        if (rVar == j$.time.temporal.l.f()) {
            InterfaceC1195b interfaceC1195b = this.f;
            if (interfaceC1195b != null) {
                return j$.time.h.T(interfaceC1195b);
            }
            return null;
        } else if (rVar == j$.time.temporal.l.g()) {
            return this.f12722g;
        } else {
            if (rVar == j$.time.temporal.l.h()) {
                Long l8 = (Long) this.f12717a.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l8 != null) {
                    return ZoneOffset.c0(l8.intValue());
                }
                ZoneId zoneId = this.f12718b;
                return zoneId instanceof ZoneOffset ? zoneId : rVar.h(this);
            } else if (rVar == j$.time.temporal.l.j()) {
                return rVar.h(this);
            } else {
                if (rVar == j$.time.temporal.l.i()) {
                    return null;
                }
                return rVar.h(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(j$.time.format.y r24) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.x.m(j$.time.format.y):void");
    }

    private void D(j$.time.temporal.q qVar, j$.time.temporal.a aVar, Long l8) {
        Long l9 = (Long) this.f12717a.put(aVar, l8);
        if (l9 == null || l9.longValue() == l8.longValue()) {
            return;
        }
        throw new RuntimeException("Conflict found: " + aVar + StringUtils.SPACE + l9 + " differs from " + aVar + StringUtils.SPACE + l8 + " while resolving  " + qVar);
    }

    private void n() {
        HashMap hashMap = this.f12717a;
        if (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f12718b;
            if (zoneId != null) {
                r(zoneId);
                return;
            }
            Long l8 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l8 != null) {
                r(ZoneOffset.c0(l8.intValue()));
            }
        }
    }

    private void r(ZoneId zoneId) {
        HashMap hashMap = this.f12717a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        ChronoZonedDateTime L6 = this.f12719c.L(Instant.W(((Long) hashMap.remove(aVar)).longValue()), zoneId);
        C(L6.c());
        D(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(L6.b().k0()));
    }

    private void C(InterfaceC1195b interfaceC1195b) {
        InterfaceC1195b interfaceC1195b2 = this.f;
        if (interfaceC1195b2 != null) {
            if (interfaceC1195b == null || interfaceC1195b2.equals(interfaceC1195b)) {
                return;
            }
            InterfaceC1195b interfaceC1195b3 = this.f;
            throw new RuntimeException("Conflict found: Fields resolved to two different dates: " + interfaceC1195b3 + StringUtils.SPACE + interfaceC1195b);
        } else if (interfaceC1195b != null) {
            if (!this.f12719c.equals(interfaceC1195b.a())) {
                j$.time.chrono.m mVar = this.f12719c;
                throw new RuntimeException("ChronoLocalDate must use the effective parsed chronology: " + mVar);
            }
            this.f = interfaceC1195b;
        }
    }

    private void y() {
        HashMap hashMap = this.f12717a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (hashMap.containsKey(aVar)) {
            long longValue = ((Long) hashMap.remove(aVar)).longValue();
            y yVar = this.f12721e;
            if (yVar == y.STRICT || (yVar == y.SMART && longValue != 0)) {
                aVar.S(longValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            D(aVar, aVar2, Long.valueOf(longValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar3)) {
            long longValue2 = ((Long) hashMap.remove(aVar3)).longValue();
            y yVar2 = this.f12721e;
            if (yVar2 == y.STRICT || (yVar2 == y.SMART && longValue2 != 0)) {
                aVar3.S(longValue2);
            }
            D(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar5)) {
                long longValue3 = ((Long) hashMap.remove(aVar4)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar5)).longValue();
                if (this.f12721e == y.LENIENT) {
                    D(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(longValue3, 12), longValue4)));
                } else {
                    aVar4.S(longValue3);
                    aVar5.S(longValue3);
                    D(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar6)) {
            long longValue5 = ((Long) hashMap.remove(aVar6)).longValue();
            if (this.f12721e != y.LENIENT) {
                aVar6.S(longValue5);
            }
            D(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            D(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            D(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            D(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar7)) {
            long longValue6 = ((Long) hashMap.remove(aVar7)).longValue();
            if (this.f12721e != y.LENIENT) {
                aVar7.S(longValue6);
            }
            D(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            D(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue7 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f12721e != y.LENIENT) {
                aVar8.S(longValue7);
            }
            D(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            D(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue8 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f12721e != y.LENIENT) {
                aVar9.S(longValue8);
            }
            D(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            D(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            D(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue9 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f12721e != y.LENIENT) {
                aVar10.S(longValue9);
            }
            D(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            D(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar11)) {
            long longValue10 = ((Long) hashMap.get(aVar11)).longValue();
            y yVar3 = this.f12721e;
            y yVar4 = y.LENIENT;
            if (yVar3 != yVar4) {
                aVar11.S(longValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar12)) {
                long longValue11 = ((Long) hashMap.remove(aVar12)).longValue();
                if (this.f12721e != yVar4) {
                    aVar12.S(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                D(aVar12, aVar11, Long.valueOf(longValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar13)) {
                long longValue12 = ((Long) hashMap.remove(aVar13)).longValue();
                if (this.f12721e != yVar4) {
                    aVar13.S(longValue12);
                }
                D(aVar13, aVar11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (hashMap.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (hashMap.containsKey(aVar16) && hashMap.containsKey(aVar11)) {
                    v(((Long) hashMap.remove(aVar14)).longValue(), ((Long) hashMap.remove(aVar15)).longValue(), ((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void v(long j, long j8, long j9, long j10) {
        if (this.f12721e == y.LENIENT) {
            long f = j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j, 3600000000000L), j$.com.android.tools.r8.a.l(j8, 60000000000L)), j$.com.android.tools.r8.a.l(j9, 1000000000L)), j10);
            A(j$.time.l.b0(j$.com.android.tools.r8.a.j(f, 86400000000000L)), j$.time.t.b((int) j$.com.android.tools.r8.a.k(f, 86400000000000L)));
            return;
        }
        int R7 = j$.time.temporal.a.MINUTE_OF_HOUR.R(j8);
        int R8 = j$.time.temporal.a.NANO_OF_SECOND.R(j10);
        if (this.f12721e == y.SMART && j == 24 && R7 == 0 && j9 == 0 && R8 == 0) {
            A(j$.time.l.f12737g, j$.time.t.b(1));
        } else {
            A(j$.time.l.a0(j$.time.temporal.a.HOUR_OF_DAY.R(j), R7, j$.time.temporal.a.SECOND_OF_MINUTE.R(j9), R8), j$.time.t.f12753d);
        }
    }

    private void A(j$.time.l lVar, j$.time.t tVar) {
        j$.time.l lVar2 = this.f12722g;
        if (lVar2 != null) {
            if (!lVar2.equals(lVar)) {
                j$.time.l lVar3 = this.f12722g;
                throw new RuntimeException("Conflict found: Fields resolved to different times: " + lVar3 + StringUtils.SPACE + lVar);
            }
            j$.time.t tVar2 = this.f12723h;
            tVar2.getClass();
            j$.time.t tVar3 = j$.time.t.f12753d;
            if (tVar2 != tVar3 && tVar != tVar3 && !this.f12723h.equals(tVar)) {
                j$.time.t tVar4 = this.f12723h;
                throw new RuntimeException("Conflict found: Fields resolved to different excess periods: " + tVar4 + StringUtils.SPACE + tVar);
            }
            this.f12723h = tVar;
            return;
        }
        this.f12722g = lVar;
        this.f12723h = tVar;
    }

    private void h(TemporalAccessor temporalAccessor) {
        Iterator it = this.f12717a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (temporalAccessor.g(qVar)) {
                try {
                    long w2 = temporalAccessor.w(qVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (w2 != longValue) {
                        throw new RuntimeException("Conflict found: Field " + qVar + StringUtils.SPACE + w2 + " differs from " + qVar + StringUtils.SPACE + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f12717a);
        sb.append(',');
        sb.append(this.f12719c);
        if (this.f12718b != null) {
            sb.append(',');
            sb.append(this.f12718b);
        }
        if (this.f != null || this.f12722g != null) {
            sb.append(" resolved to ");
            InterfaceC1195b interfaceC1195b = this.f;
            if (interfaceC1195b != null) {
                sb.append(interfaceC1195b);
                if (this.f12722g != null) {
                    sb.append('T');
                    sb.append(this.f12722g);
                }
            } else {
                sb.append(this.f12722g);
            }
        }
        return sb.toString();
    }
}
