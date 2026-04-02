package j$.time;

import j$.time.chrono.AbstractC1202i;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
public final class p implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a  reason: collision with root package name */
    private final int f12747a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12748b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i7 = this.f12747a - pVar.f12747a;
        return i7 == 0 ? this.f12748b - pVar.f12748b : i7;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.f("--");
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.t();
    }

    private p(int i7, int i8) {
        this.f12747a = i7;
        this.f12748b = i8;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.o();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.l.d(this, qVar);
        }
        int i7 = this.f12747a;
        n U7 = n.U(i7);
        U7.getClass();
        int i8 = m.f12743a[U7.ordinal()];
        return j$.time.temporal.t.k(i8 != 1 ? (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31 : 28, n.U(i7).T());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        return t(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        int i7;
        if (qVar instanceof j$.time.temporal.a) {
            int i8 = o.f12746a[((j$.time.temporal.a) qVar).ordinal()];
            if (i8 == 1) {
                i7 = this.f12748b;
            } else if (i8 == 2) {
                i7 = this.f12747a;
            } else {
                throw new RuntimeException(d.a("Unsupported field: ", qVar));
            }
            return i7;
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f12641d;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC1202i.q(temporal).equals(j$.time.chrono.t.f12641d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        Temporal d7 = temporal.d(this.f12747a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d7.d(Math.min(d7.t(aVar).d(), this.f12748b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f12747a == pVar.f12747a && this.f12748b == pVar.f12748b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12747a << 6) + this.f12748b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i7 = this.f12747a;
        sb.append(i7 < 10 ? "0" : StringUtils.EMPTY);
        sb.append(i7);
        int i8 = this.f12748b;
        sb.append(i8 < 10 ? "-0" : "-");
        sb.append(i8);
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(DataOutput dataOutput) {
        dataOutput.writeByte(this.f12747a);
        dataOutput.writeByte(this.f12748b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p R(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        n U7 = n.U(readByte);
        Objects.requireNonNull(U7, "month");
        j$.time.temporal.a.DAY_OF_MONTH.S(readByte2);
        if (readByte2 > U7.T()) {
            String name = U7.name();
            throw new RuntimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + name);
        }
        return new p(U7.getValue(), readByte2);
    }
}
