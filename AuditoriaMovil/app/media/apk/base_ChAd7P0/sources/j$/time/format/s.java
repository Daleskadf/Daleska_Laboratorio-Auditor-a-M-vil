package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1195b;
import j$.time.temporal.TemporalAccessor;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
final class s implements TemporalAccessor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InterfaceC1195b f12707a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f12708b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f12709c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f12710d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(InterfaceC1195b interfaceC1195b, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f12707a = interfaceC1195b;
        this.f12708b = temporalAccessor;
        this.f12709c = mVar;
        this.f12710d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        InterfaceC1195b interfaceC1195b = this.f12707a;
        if (interfaceC1195b != null && qVar.D()) {
            return interfaceC1195b.g(qVar);
        }
        return this.f12708b.g(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        InterfaceC1195b interfaceC1195b = this.f12707a;
        if (interfaceC1195b != null && qVar.D()) {
            return interfaceC1195b.t(qVar);
        }
        return this.f12708b.t(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        InterfaceC1195b interfaceC1195b = this.f12707a;
        if (interfaceC1195b != null && qVar.D()) {
            return interfaceC1195b.w(qVar);
        }
        return this.f12708b.w(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return this.f12709c;
        }
        if (rVar == j$.time.temporal.l.k()) {
            return this.f12710d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return this.f12708b.B(rVar);
        }
        return rVar.h(this);
    }

    public final String toString() {
        String str;
        String str2 = StringUtils.EMPTY;
        j$.time.chrono.m mVar = this.f12709c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = StringUtils.EMPTY;
        }
        ZoneId zoneId = this.f12710d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f12708b + str + str2;
    }
}
