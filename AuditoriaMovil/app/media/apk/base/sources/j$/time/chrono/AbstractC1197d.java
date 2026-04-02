package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1197d implements InterfaceC1195b, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC1202i.k(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal D(Temporal temporal) {
        return AbstractC1202i.a(this, temporal);
    }

    @Override // java.lang.Comparable
    /* renamed from: O */
    public final /* synthetic */ int compareTo(InterfaceC1195b interfaceC1195b) {
        return AbstractC1202i.b(this, interfaceC1195b);
    }

    abstract InterfaceC1195b T(long j);

    abstract InterfaceC1195b U(long j);

    abstract InterfaceC1195b V(long j);

    @Override // j$.time.chrono.InterfaceC1195b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean g(j$.time.temporal.q qVar) {
        return AbstractC1202i.i(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC1195b R(m mVar, Temporal temporal) {
        InterfaceC1195b interfaceC1195b = (InterfaceC1195b) temporal;
        if (mVar.equals(interfaceC1195b.a())) {
            return interfaceC1195b;
        }
        String n7 = mVar.n();
        String n8 = interfaceC1195b.a().n();
        throw new ClassCastException("Chronology mismatch, expected: " + n7 + ", actual: " + n8);
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC1195b e(long j, TemporalUnit temporalUnit) {
        boolean z7 = temporalUnit instanceof ChronoUnit;
        if (!z7) {
            if (z7) {
                throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
            return R(a(), temporalUnit.o(this, j));
        }
        switch (AbstractC1196c.f12610a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T(j);
            case 2:
                return T(j$.com.android.tools.r8.a.l(j, 7));
            case 3:
                return U(j);
            case 4:
                return V(j);
            case 5:
                return V(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return V(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return V(j$.com.android.tools.r8.a.l(j, (long) PipesIterator.DEFAULT_QUEUE_SIZE));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(w(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public n E() {
        return a().P(j$.time.temporal.l.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.InterfaceC1195b, j$.time.temporal.Temporal
    public long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC1195b r7 = a().r(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, r7);
        }
        switch (AbstractC1196c.f12610a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return r7.x() - x();
            case 2:
                return (r7.x() - x()) / 7;
            case 3:
                return S(r7);
            case 4:
                return S(r7) / 12;
            case 5:
                return S(r7) / 120;
            case 6:
                return S(r7) / 1200;
            case 7:
                return S(r7) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return r7.w(aVar) - w(aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + temporalUnit);
        }
    }

    private long S(InterfaceC1195b interfaceC1195b) {
        if (a().K(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC1195b.w(aVar) * 32) + interfaceC1195b.q(aVar2)) - ((w(aVar) * 32) + j$.time.temporal.l.a(this, aVar2))) / 32;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1195b) && AbstractC1202i.b(this, (InterfaceC1195b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public int hashCode() {
        long x7 = x();
        return ((int) (x7 ^ (x7 >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l */
    public InterfaceC1195b s(j$.time.temporal.m mVar) {
        return R(a(), mVar.D(this));
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public String toString() {
        long w2 = w(j$.time.temporal.a.YEAR_OF_ERA);
        long w7 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long w8 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(StringUtils.SPACE);
        sb.append(E());
        sb.append(StringUtils.SPACE);
        sb.append(w2);
        sb.append(w7 < 10 ? "-0" : "-");
        sb.append(w7);
        sb.append(w8 < 10 ? "-0" : "-");
        sb.append(w8);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC1195b d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        return R(a(), qVar.w(this, j));
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public InterfaceC1195b I(j$.time.temporal.p pVar) {
        return R(a(), pVar.o(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M */
    public InterfaceC1195b o(long j, TemporalUnit temporalUnit) {
        return R(a(), j$.time.temporal.l.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public InterfaceC1198e z(j$.time.l lVar) {
        return C1200g.S(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC1195b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }
}
