package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
/* renamed from: j$.time.chrono.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1195b extends Temporal, j$.time.temporal.m, Comparable {
    n E();

    InterfaceC1195b I(j$.time.temporal.p pVar);

    InterfaceC1195b M(long j, TemporalUnit temporalUnit);

    int O(InterfaceC1195b interfaceC1195b);

    m a();

    @Override // j$.time.temporal.Temporal
    InterfaceC1195b d(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC1195b e(long j, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.Temporal
    long f(Temporal temporal, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean g(j$.time.temporal.q qVar);

    int hashCode();

    InterfaceC1195b l(j$.time.temporal.m mVar);

    String toString();

    long x();

    InterfaceC1198e z(j$.time.l lVar);
}
