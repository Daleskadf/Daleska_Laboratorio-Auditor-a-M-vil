package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
/* renamed from: j$.time.format.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1205a implements j$.time.temporal.r {
    @Override // j$.time.temporal.r
    public final Object h(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.B(j$.time.temporal.l.k());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
