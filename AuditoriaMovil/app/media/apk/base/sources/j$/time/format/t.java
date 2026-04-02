package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1195b;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private TemporalAccessor f12711a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f12712b;

    /* renamed from: c  reason: collision with root package name */
    private int f12713c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.temporal.a[] values;
        j$.time.chrono.m a7 = dateTimeFormatter.a();
        if (a7 != null) {
            j$.time.chrono.m mVar = (j$.time.chrono.m) temporalAccessor.B(j$.time.temporal.l.e());
            ZoneId zoneId = (ZoneId) temporalAccessor.B(j$.time.temporal.l.k());
            InterfaceC1195b interfaceC1195b = null;
            a7 = Objects.equals(a7, mVar) ? null : a7;
            Objects.equals(null, zoneId);
            if (a7 != null) {
                j$.time.chrono.m mVar2 = a7 != null ? a7 : mVar;
                if (a7 != null) {
                    if (temporalAccessor.g(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC1195b = mVar2.r(temporalAccessor);
                    } else if (a7 != j$.time.chrono.t.f12641d || mVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.D() && temporalAccessor.g(aVar)) {
                                throw new RuntimeException("Unable to apply override chronology '" + a7 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new s(interfaceC1195b, temporalAccessor, mVar2, zoneId);
            }
        }
        this.f12711a = temporalAccessor;
        this.f12712b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor d() {
        return this.f12711a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.f12712b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w b() {
        return this.f12712b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f12713c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f12713c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(C1205a c1205a) {
        TemporalAccessor temporalAccessor = this.f12711a;
        Object B7 = temporalAccessor.B(c1205a);
        if (B7 == null && this.f12713c == 0) {
            throw new RuntimeException("Unable to extract " + c1205a + " from temporal " + temporalAccessor);
        }
        return B7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.q qVar) {
        int i7 = this.f12713c;
        TemporalAccessor temporalAccessor = this.f12711a;
        if (i7 <= 0 || temporalAccessor.g(qVar)) {
            return Long.valueOf(temporalAccessor.w(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f12711a.toString();
    }
}
