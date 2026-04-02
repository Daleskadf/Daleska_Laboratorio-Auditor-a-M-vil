package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1200g implements InterfaceC1198e, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a  reason: collision with root package name */
    private final transient InterfaceC1195b f12612a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.l f12613b;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC1202i.l(this, rVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: F */
    public final /* synthetic */ int compareTo(InterfaceC1198e interfaceC1198e) {
        return AbstractC1202i.c(this, interfaceC1198e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1200g S(InterfaceC1195b interfaceC1195b, j$.time.l lVar) {
        return new C1200g(interfaceC1195b, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1200g R(m mVar, Temporal temporal) {
        C1200g c1200g = (C1200g) temporal;
        if (mVar.equals(c1200g.f12612a.a())) {
            return c1200g;
        }
        String n7 = mVar.n();
        String n8 = c1200g.f12612a.a().n();
        throw new ClassCastException("Chronology mismatch, required: " + n7 + ", actual: " + n8);
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final m a() {
        return this.f12612a.a();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return R(this.f12612a.a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    private C1200g(InterfaceC1195b interfaceC1195b, j$.time.l lVar) {
        Objects.requireNonNull(interfaceC1195b, "date");
        Objects.requireNonNull(lVar, "time");
        this.f12612a = interfaceC1195b;
        this.f12613b = lVar;
    }

    private C1200g Y(Temporal temporal, j$.time.l lVar) {
        InterfaceC1195b interfaceC1195b = this.f12612a;
        return (interfaceC1195b == temporal && this.f12613b == lVar) ? this : new C1200g(AbstractC1197d.R(interfaceC1195b.a(), temporal), lVar);
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final InterfaceC1195b c() {
        return this.f12612a;
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final j$.time.l b() {
        return this.f12613b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.D() || aVar.T();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) qVar).T()) {
                return this.f12612a.t(qVar);
            }
            j$.time.l lVar = this.f12613b;
            lVar.getClass();
            return j$.time.temporal.l.d(lVar, qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f12613b.q(qVar) : this.f12612a.q(qVar);
        }
        return t(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f12613b.w(qVar) : this.f12612a.w(qVar);
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(j$.time.h hVar) {
        return Y(hVar, this.f12613b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X */
    public final C1200g d(long j, j$.time.temporal.q qVar) {
        boolean z7 = qVar instanceof j$.time.temporal.a;
        InterfaceC1195b interfaceC1195b = this.f12612a;
        if (z7) {
            boolean T7 = ((j$.time.temporal.a) qVar).T();
            j$.time.l lVar = this.f12613b;
            if (T7) {
                return Y(interfaceC1195b, lVar.d(j, qVar));
            }
            return Y(interfaceC1195b.d(j, qVar), lVar);
        }
        return R(interfaceC1195b.a(), qVar.w(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T */
    public final C1200g e(long j, TemporalUnit temporalUnit) {
        boolean z7 = temporalUnit instanceof ChronoUnit;
        InterfaceC1195b interfaceC1195b = this.f12612a;
        if (z7) {
            int i7 = AbstractC1199f.f12611a[((ChronoUnit) temporalUnit).ordinal()];
            j$.time.l lVar = this.f12613b;
            switch (i7) {
                case 1:
                    return V(this.f12612a, 0L, 0L, 0L, j);
                case 2:
                    C1200g Y3 = Y(interfaceC1195b.e(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), lVar);
                    return Y3.V(Y3.f12612a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C1200g Y7 = Y(interfaceC1195b.e(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), lVar);
                    return Y7.V(Y7.f12612a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return U(j);
                case 5:
                    return V(this.f12612a, 0L, j, 0L, 0L);
                case 6:
                    return V(this.f12612a, j, 0L, 0L, 0L);
                case 7:
                    C1200g Y8 = Y(interfaceC1195b.e(j / 256, (TemporalUnit) ChronoUnit.DAYS), lVar);
                    return Y8.V(Y8.f12612a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return Y(interfaceC1195b.e(j, temporalUnit), lVar);
            }
        }
        return R(interfaceC1195b.a(), temporalUnit.o(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1200g U(long j) {
        return V(this.f12612a, 0L, 0L, j, 0L);
    }

    private C1200g V(InterfaceC1195b interfaceC1195b, long j, long j8, long j9, long j10) {
        int i7 = ((j | j8 | j9 | j10) > 0L ? 1 : ((j | j8 | j9 | j10) == 0L ? 0 : -1));
        j$.time.l lVar = this.f12613b;
        if (i7 == 0) {
            return Y(interfaceC1195b, lVar);
        }
        long j11 = j8 / 1440;
        long j12 = j / 24;
        long j13 = (j8 % 1440) * 60000000000L;
        long j14 = ((j % 24) * 3600000000000L) + j13 + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L);
        long j02 = lVar.j0();
        long j15 = j14 + j02;
        long k2 = j$.com.android.tools.r8.a.k(j15, 86400000000000L) + j12 + j11 + (j9 / 86400) + (j10 / 86400000000000L);
        long j16 = j$.com.android.tools.r8.a.j(j15, 86400000000000L);
        if (j16 != j02) {
            lVar = j$.time.l.b0(j16);
        }
        return Y(interfaceC1195b.e(k2, (TemporalUnit) ChronoUnit.DAYS), lVar);
    }

    @Override // j$.time.chrono.InterfaceC1198e
    public final ChronoZonedDateTime p(ZoneId zoneId) {
        return l.R(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC1195b interfaceC1195b = this.f12612a;
        InterfaceC1198e C7 = interfaceC1195b.a().C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, C7);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z7 = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        j$.time.l lVar = this.f12613b;
        if (!z7) {
            InterfaceC1195b c8 = C7.c();
            if (C7.b().compareTo(lVar) < 0) {
                c8 = c8.M(1L, chronoUnit);
            }
            return interfaceC1195b.f(c8, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long w2 = C7.w(aVar) - interfaceC1195b.w(aVar);
        switch (AbstractC1199f.f12611a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                w2 = j$.com.android.tools.r8.a.l(w2, 86400000000000L);
                break;
            case 2:
                w2 = j$.com.android.tools.r8.a.l(w2, 86400000000L);
                break;
            case 3:
                w2 = j$.com.android.tools.r8.a.l(w2, 86400000L);
                break;
            case 4:
                w2 = j$.com.android.tools.r8.a.l(w2, 86400);
                break;
            case 5:
                w2 = j$.com.android.tools.r8.a.l(w2, 1440);
                break;
            case 6:
                w2 = j$.com.android.tools.r8.a.l(w2, 24);
                break;
            case 7:
                w2 = j$.com.android.tools.r8.a.l(w2, 2);
                break;
        }
        return j$.com.android.tools.r8.a.f(w2, lVar.f(C7.b(), temporalUnit));
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(c().x(), j$.time.temporal.a.EPOCH_DAY).d(b().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f12612a);
        objectOutput.writeObject(this.f12613b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1198e) && AbstractC1202i.c(this, (InterfaceC1198e) obj) == 0;
    }

    public final int hashCode() {
        return this.f12612a.hashCode() ^ this.f12613b.hashCode();
    }

    public final Instant W(ZoneOffset zoneOffset) {
        return Instant.X(AbstractC1202i.o(this, zoneOffset), this.f12613b.X());
    }

    public final String toString() {
        String interfaceC1195b = this.f12612a.toString();
        String lVar = this.f12613b.toString();
        return interfaceC1195b + "T" + lVar;
    }
}
