package j$.time;

import H4.e1;
import j$.time.chrono.AbstractC1202i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
public final class l implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final l f12736e;
    public static final l f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f12737g;

    /* renamed from: h  reason: collision with root package name */
    private static final l[] f12738h = new l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a  reason: collision with root package name */
    private final byte f12739a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f12740b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f12741c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12742d;

    static {
        int i7 = 0;
        while (true) {
            l[] lVarArr = f12738h;
            if (i7 < lVarArr.length) {
                lVarArr[i7] = new l(i7, 0, 0, 0);
                i7++;
            } else {
                l lVar = lVarArr[0];
                f12737g = lVar;
                l lVar2 = lVarArr[12];
                f12736e = lVar;
                f = new l(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static l Z(int i7) {
        j$.time.temporal.a.HOUR_OF_DAY.S(i7);
        return f12738h[i7];
    }

    public static l a0(int i7, int i8, int i9, int i10) {
        j$.time.temporal.a.HOUR_OF_DAY.S(i7);
        j$.time.temporal.a.MINUTE_OF_HOUR.S(i8);
        j$.time.temporal.a.SECOND_OF_MINUTE.S(i9);
        j$.time.temporal.a.NANO_OF_SECOND.S(i10);
        return S(i7, i8, i9, i10);
    }

    public static l c0(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.S(j);
        int i7 = (int) (j / 3600);
        long j8 = j - (i7 * 3600);
        int i8 = (int) (j8 / 60);
        return S(i7, i8, (int) (j8 - (i8 * 60)), 0);
    }

    public static l b0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.S(j);
        int i7 = (int) (j / 3600000000000L);
        long j8 = j - (i7 * 3600000000000L);
        int i8 = (int) (j8 / 60000000000L);
        long j9 = j8 - (i8 * 60000000000L);
        int i9 = (int) (j9 / 1000000000);
        return S(i7, i8, i9, (int) (j9 - (i9 * 1000000000)));
    }

    public static l T(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.B(j$.time.temporal.l.g());
        if (lVar != null) {
            return lVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new RuntimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private static l S(int i7, int i8, int i9, int i10) {
        if ((i8 | i9 | i10) == 0) {
            return f12738h[i7];
        }
        return new l(i7, i8, i9, i10);
    }

    private l(int i7, int i8, int i9, int i10) {
        this.f12739a = (byte) i7;
        this.f12740b = (byte) i8;
        this.f12741c = (byte) i9;
        this.f12742d = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T();
        }
        return qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return U(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return j0();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return j0() / 1000;
            }
            return U(qVar);
        }
        return qVar.s(this);
    }

    private int U(j$.time.temporal.q qVar) {
        int i7 = k.f12734a[((j$.time.temporal.a) qVar).ordinal()];
        byte b5 = this.f12740b;
        int i8 = this.f12742d;
        byte b7 = this.f12739a;
        switch (i7) {
            case 1:
                return i8;
            case 2:
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i8 / PipesIterator.DEFAULT_QUEUE_SIZE;
            case 4:
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i8 / 1000000;
            case 6:
                return (int) (j0() / 1000000);
            case 7:
                return this.f12741c;
            case 8:
                return k0();
            case 9:
                return b5;
            case 10:
                return (b7 * 60) + b5;
            case 11:
                return b7 % 12;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int i9 = b7 % 12;
                if (i9 % 12 == 0) {
                    return 12;
                }
                return i9;
            case 13:
                return b7;
            case 14:
                if (b7 == 0) {
                    return 24;
                }
                return b7;
            case 15:
                return b7 / 12;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", qVar));
        }
    }

    public final int V() {
        return this.f12739a;
    }

    public final int W() {
        return this.f12740b;
    }

    public final int Y() {
        return this.f12741c;
    }

    public final int X() {
        return this.f12742d;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0 */
    public final l d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            aVar.S(j);
            int i7 = k.f12734a[aVar.ordinal()];
            byte b5 = this.f12740b;
            byte b7 = this.f12741c;
            int i8 = this.f12742d;
            byte b8 = this.f12739a;
            switch (i7) {
                case 1:
                    return m0((int) j);
                case 2:
                    return b0(j);
                case 3:
                    return m0(((int) j) * PipesIterator.DEFAULT_QUEUE_SIZE);
                case 4:
                    return b0(j * 1000);
                case 5:
                    return m0(((int) j) * 1000000);
                case 6:
                    return b0(j * 1000000);
                case 7:
                    int i9 = (int) j;
                    if (b7 == i9) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.S(i9);
                    return S(b8, b5, i9, i8);
                case 8:
                    return h0(j - k0());
                case 9:
                    int i10 = (int) j;
                    if (b5 == i10) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.S(i10);
                    return S(b8, i10, b7, i8);
                case 10:
                    return f0(j - ((b8 * 60) + b5));
                case 11:
                    return e0(j - (b8 % 12));
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (j == 12) {
                        j = 0;
                    }
                    return e0(j - (b8 % 12));
                case 13:
                    int i11 = (int) j;
                    if (b8 == i11) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.S(i11);
                    return S(i11, b5, b7, i8);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    int i12 = (int) j;
                    if (b8 == i12) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.S(i12);
                    return S(i12, b5, b7, i8);
                case 15:
                    return e0((j - (b8 / 12)) * 12);
                default:
                    throw new RuntimeException(d.a("Unsupported field: ", qVar));
            }
        }
        return (l) qVar.w(this, j);
    }

    public final l m0(int i7) {
        if (this.f12742d == i7) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.S(i7);
        return S(this.f12739a, this.f12740b, this.f12741c, i7);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0 */
    public final l e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (k.f12735b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return g0(j);
                case 2:
                    return g0((j % 86400000000L) * 1000);
                case 3:
                    return g0((j % 86400000) * 1000000);
                case 4:
                    return h0(j);
                case 5:
                    return f0(j);
                case 6:
                    return e0(j);
                case 7:
                    return e0((j % 2) * 12);
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (l) temporalUnit.o(this, j);
    }

    public final l e0(long j) {
        if (j == 0) {
            return this;
        }
        return S(((((int) (j % 24)) + this.f12739a) + 24) % 24, this.f12740b, this.f12741c, this.f12742d);
    }

    public final l f0(long j) {
        if (j == 0) {
            return this;
        }
        int i7 = (this.f12739a * 60) + this.f12740b;
        int i8 = ((((int) (j % 1440)) + i7) + 1440) % 1440;
        return i7 == i8 ? this : S(i8 / 60, i8 % 60, this.f12741c, this.f12742d);
    }

    public final l h0(long j) {
        if (j == 0) {
            return this;
        }
        int i7 = (this.f12740b * 60) + (this.f12739a * 3600) + this.f12741c;
        int i8 = ((((int) (j % 86400)) + i7) + 86400) % 86400;
        return i7 == i8 ? this : S(i8 / 3600, (i8 / 60) % 60, i8 % 60, this.f12742d);
    }

    public final l g0(long j) {
        if (j == 0) {
            return this;
        }
        long j02 = j0();
        long j8 = (((j % 86400000000000L) + j02) + 86400000000000L) % 86400000000000L;
        return j02 == j8 ? this : S((int) (j8 / 3600000000000L), (int) ((j8 / 60000000000L) % 60), (int) ((j8 / 1000000000) % 60), (int) (j8 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this;
        }
        if (rVar == j$.time.temporal.l.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.h(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        l T7 = T(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long j02 = T7.j0() - j0();
            switch (k.f12735b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return j02;
                case 2:
                    return j02 / 1000;
                case 3:
                    return j02 / 1000000;
                case 4:
                    return j02 / 1000000000;
                case 5:
                    return j02 / 60000000000L;
                case 6:
                    return j02 / 3600000000000L;
                case 7:
                    return j02 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, T7);
    }

    public final int k0() {
        return (this.f12740b * 60) + (this.f12739a * 3600) + this.f12741c;
    }

    public final long j0() {
        return (this.f12741c * 1000000000) + (this.f12740b * 60000000000L) + (this.f12739a * 3600000000000L) + this.f12742d;
    }

    @Override // java.lang.Comparable
    /* renamed from: R */
    public final int compareTo(l lVar) {
        int compare = Integer.compare(this.f12739a, lVar.f12739a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f12740b, lVar.f12740b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.f12741c, lVar.f12741c);
                return compare3 == 0 ? Integer.compare(this.f12742d, lVar.f12742d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f12739a == lVar.f12739a && this.f12740b == lVar.f12740b && this.f12741c == lVar.f12741c && this.f12742d == lVar.f12742d;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(h hVar) {
        return (l) AbstractC1202i.a(hVar, this);
    }

    public final int hashCode() {
        long j02 = j0();
        return (int) (j02 ^ (j02 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b5 = this.f12739a;
        sb.append(b5 < 10 ? "0" : StringUtils.EMPTY);
        sb.append((int) b5);
        String str = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        byte b7 = this.f12740b;
        sb.append(b7 < 10 ? ":0" : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb.append((int) b7);
        byte b8 = this.f12741c;
        int i7 = this.f12742d;
        if (b8 > 0 || i7 > 0) {
            if (b8 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append((int) b8);
            if (i7 > 0) {
                sb.append('.');
                if (i7 % 1000000 == 0) {
                    sb.append(Integer.toString((i7 / 1000000) + PipesIterator.DEFAULT_QUEUE_SIZE).substring(1));
                } else if (i7 % PipesIterator.DEFAULT_QUEUE_SIZE == 0) {
                    sb.append(Integer.toString((i7 / PipesIterator.DEFAULT_QUEUE_SIZE) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i7 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n0(DataOutput dataOutput) {
        byte b5 = this.f12741c;
        byte b7 = this.f12739a;
        byte b8 = this.f12740b;
        int i7 = this.f12742d;
        if (i7 != 0) {
            dataOutput.writeByte(b7);
            dataOutput.writeByte(b8);
            dataOutput.writeByte(b5);
            dataOutput.writeInt(i7);
        } else if (b5 != 0) {
            dataOutput.writeByte(b7);
            dataOutput.writeByte(b8);
            dataOutput.writeByte(~b5);
        } else if (b8 == 0) {
            dataOutput.writeByte(~b7);
        } else {
            dataOutput.writeByte(b7);
            dataOutput.writeByte(~b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l i0(ObjectInput objectInput) {
        int i7;
        int i8;
        int readByte = objectInput.readByte();
        int i9 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i7 = 0;
            i8 = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                int i10 = ~readByte2;
                i8 = 0;
                i9 = i10;
                i7 = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i7 = ~readByte3;
                } else {
                    i9 = objectInput.readInt();
                    i7 = readByte3;
                }
                i8 = i9;
                i9 = readByte2;
            }
        }
        return a0(readByte, i9, i7, i8);
    }
}
