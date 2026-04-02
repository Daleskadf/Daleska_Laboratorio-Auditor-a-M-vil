package j$.time;

import j$.time.chrono.AbstractC1202i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes2.dex */
public final class y implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f12798c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a  reason: collision with root package name */
    private final int f12799a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12800b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        int i7 = this.f12799a - yVar.f12799a;
        return i7 == 0 ? this.f12800b - yVar.f12800b : i7;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.t();
    }

    public static y S(int i7, int i8) {
        j$.time.temporal.a.YEAR.S(i7);
        j$.time.temporal.a.MONTH_OF_YEAR.S(i8);
        return new y(i7, i8);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        y S7;
        if (temporal instanceof y) {
            S7 = (y) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.f12641d.equals(AbstractC1202i.q(temporal))) {
                    temporal = h.T(temporal);
                }
                S7 = S(temporal.q(j$.time.temporal.a.YEAR), temporal.q(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e7) {
                String name = temporal.getClass().getName();
                throw new RuntimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + name, e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long R7 = S7.R() - R();
            switch (x.f12797b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return R7;
                case 2:
                    return R7 / 12;
                case 3:
                    return R7 / 120;
                case 4:
                    return R7 / 1200;
                case 5:
                    return R7 / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return S7.w(aVar) - w(aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, S7);
    }

    private y(int i7, int i8) {
        this.f12799a = i7;
        this.f12800b = i8;
    }

    private y W(int i7, int i8) {
        return (this.f12799a == i7 && this.f12800b == i8) ? this : new y(i7, i8);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.j(1L, this.f12799a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        return t(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i7 = x.f12796a[((j$.time.temporal.a) qVar).ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.f12799a;
                    if (i7 == 3) {
                        if (i8 < 1) {
                            i8 = 1 - i8;
                        }
                        return i8;
                    } else if (i7 != 4) {
                        if (i7 == 5) {
                            return i8 < 1 ? 0 : 1;
                        }
                        throw new RuntimeException(d.a("Unsupported field: ", qVar));
                    } else {
                        return i8;
                    }
                }
                return R();
            }
            return this.f12800b;
        }
        return qVar.s(this);
    }

    private long R() {
        return ((this.f12799a * 12) + this.f12800b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X */
    public final y d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            aVar.S(j);
            int i7 = x.f12796a[aVar.ordinal()];
            int i8 = this.f12799a;
            if (i7 == 1) {
                int i9 = (int) j;
                j$.time.temporal.a.MONTH_OF_YEAR.S(i9);
                return W(i8, i9);
            } else if (i7 != 2) {
                int i10 = this.f12800b;
                if (i7 == 3) {
                    if (i8 < 1) {
                        j = 1 - j;
                    }
                    int i11 = (int) j;
                    j$.time.temporal.a.YEAR.S(i11);
                    return W(i11, i10);
                } else if (i7 == 4) {
                    int i12 = (int) j;
                    j$.time.temporal.a.YEAR.S(i12);
                    return W(i12, i10);
                } else if (i7 == 5) {
                    if (w(j$.time.temporal.a.ERA) == j) {
                        return this;
                    }
                    int i13 = 1 - i8;
                    j$.time.temporal.a.YEAR.S(i13);
                    return W(i13, i10);
                } else {
                    throw new RuntimeException(d.a("Unsupported field: ", qVar));
                }
            } else {
                return U(j - R());
            }
        }
        return (y) qVar.w(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T */
    public final y e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (x.f12797b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return U(j);
                case 2:
                    return V(j);
                case 3:
                    return V(j$.com.android.tools.r8.a.l(j, 10));
                case 4:
                    return V(j$.com.android.tools.r8.a.l(j, 100));
                case 5:
                    return V(j$.com.android.tools.r8.a.l(j, (long) PipesIterator.DEFAULT_QUEUE_SIZE));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.f(w(aVar), j), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (y) temporalUnit.o(this, j);
    }

    public final y V(long j) {
        return j == 0 ? this : W(j$.time.temporal.a.YEAR.R(this.f12799a + j), this.f12800b);
    }

    public final y U(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f12799a * 12) + (this.f12800b - 1) + j;
        long j9 = 12;
        return W(j$.time.temporal.a.YEAR.R(j$.com.android.tools.r8.a.k(j8, j9)), ((int) j$.com.android.tools.r8.a.j(j8, j9)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f12641d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC1202i.q(temporal).equals(j$.time.chrono.t.f12641d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.d(R(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f12799a == yVar.f12799a && this.f12800b == yVar.f12800b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12800b << 27) ^ this.f12799a;
    }

    public final String toString() {
        int i7 = this.f12799a;
        int abs = Math.abs(i7);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i7);
        } else if (i7 < 0) {
            sb.append(i7 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i7 + 10000);
            sb.deleteCharAt(0);
        }
        int i8 = this.f12800b;
        sb.append(i8 < 10 ? "-0" : "-");
        sb.append(i8);
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        dataOutput.writeInt(this.f12799a);
        dataOutput.writeByte(this.f12800b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return (y) AbstractC1202i.a(hVar, this);
    }
}
