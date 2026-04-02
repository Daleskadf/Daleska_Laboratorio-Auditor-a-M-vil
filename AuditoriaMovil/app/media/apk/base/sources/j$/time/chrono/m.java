package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public interface m extends Comparable {
    ChronoZonedDateTime A(Temporal temporal);

    InterfaceC1198e C(Temporal temporal);

    InterfaceC1195b H(int i7, int i8, int i9);

    InterfaceC1195b J(Map map, j$.time.format.y yVar);

    j$.time.temporal.t K(j$.time.temporal.a aVar);

    ChronoZonedDateTime L(Instant instant, ZoneId zoneId);

    List N();

    n P(int i7);

    boolean equals(Object obj);

    int h(n nVar, int i7);

    int hashCode();

    InterfaceC1195b m(long j);

    String n();

    InterfaceC1195b r(TemporalAccessor temporalAccessor);

    String toString();

    String v();

    InterfaceC1195b y(int i7, int i8);
}
