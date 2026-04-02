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
public final class w implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f12794b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a  reason: collision with root package name */
    private final int f12795a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12795a - ((w) obj).f12795a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.t();
    }

    public static w R(int i7) {
        j$.time.temporal.a.YEAR.S(i7);
        return new w(i7);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        w R7;
        if (temporal instanceof w) {
            R7 = (w) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.t.f12641d.equals(AbstractC1202i.q(temporal))) {
                    temporal = h.T(temporal);
                }
                R7 = R(temporal.q(j$.time.temporal.a.YEAR));
            } catch (c e7) {
                String name = temporal.getClass().getName();
                throw new RuntimeException("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + name, e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j = R7.f12795a - this.f12795a;
            int i7 = v.f12793b[((ChronoUnit) temporalUnit).ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return R7.w(aVar) - w(aVar);
                            }
                            throw new RuntimeException("Unsupported unit: " + temporalUnit);
                        }
                        return j / 1000;
                    }
                    return j / 100;
                }
                return j / 10;
            }
            return j;
        }
        return temporalUnit.between(this, R7);
    }

    private w(int i7) {
        this.f12795a = i7;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.j(1L, this.f12795a <= 0 ? 1000000000L : 999999999L);
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
            int i7 = v.f12792a[((j$.time.temporal.a) qVar).ordinal()];
            int i8 = this.f12795a;
            if (i7 == 1) {
                if (i8 < 1) {
                    i8 = 1 - i8;
                }
                return i8;
            } else if (i7 != 2) {
                if (i7 == 3) {
                    return i8 < 1 ? 0 : 1;
                }
                throw new RuntimeException(d.a("Unsupported field: ", qVar));
            } else {
                return i8;
            }
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U */
    public final w d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            aVar.S(j);
            int i7 = v.f12792a[aVar.ordinal()];
            int i8 = this.f12795a;
            if (i7 == 1) {
                if (i8 < 1) {
                    j = 1 - j;
                }
                return R((int) j);
            } else if (i7 != 2) {
                if (i7 == 3) {
                    return w(j$.time.temporal.a.ERA) == j ? this : R(1 - i8);
                }
                throw new RuntimeException(d.a("Unsupported field: ", qVar));
            } else {
                return R((int) j);
            }
        }
        return (w) qVar.w(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S */
    public final w e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i7 = v.f12793b[((ChronoUnit) temporalUnit).ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return d(j$.com.android.tools.r8.a.f(w(aVar), j), aVar);
                            }
                            throw new RuntimeException("Unsupported unit: " + temporalUnit);
                        }
                        return T(j$.com.android.tools.r8.a.l(j, (long) PipesIterator.DEFAULT_QUEUE_SIZE));
                    }
                    return T(j$.com.android.tools.r8.a.l(j, 100));
                }
                return T(j$.com.android.tools.r8.a.l(j, 10));
            }
            return T(j);
        }
        return (w) temporalUnit.o(this, j);
    }

    public final w T(long j) {
        return j == 0 ? this : R(j$.time.temporal.a.YEAR.R(this.f12795a + j));
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
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC1202i.q(temporal).equals(j$.time.chrono.t.f12641d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.d(this.f12795a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f12795a == ((w) obj).f12795a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12795a;
    }

    public final String toString() {
        return Integer.toString(this.f12795a);
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(DataOutput dataOutput) {
        dataOutput.writeInt(this.f12795a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return (w) AbstractC1202i.a(hVar, this);
    }
}
