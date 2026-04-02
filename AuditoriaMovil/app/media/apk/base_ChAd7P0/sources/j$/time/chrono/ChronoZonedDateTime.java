package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1195b;
import j$.time.temporal.Temporal;
/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC1195b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    InterfaceC1198e G();

    long Q();

    m a();

    j$.time.l b();

    InterfaceC1195b c();

    ZoneOffset i();

    boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime);

    ChronoZonedDateTime j(ZoneId zoneId);

    ChronoZonedDateTime k(ZoneId zoneId);

    Instant toInstant();

    ZoneId u();
}
