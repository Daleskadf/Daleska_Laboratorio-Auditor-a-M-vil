package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
/* renamed from: j$.time.chrono.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1201h implements j$.time.temporal.p, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f12614e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a  reason: collision with root package name */
    private final m f12615a;

    /* renamed from: b  reason: collision with root package name */
    final int f12616b;

    /* renamed from: c  reason: collision with root package name */
    final int f12617c;

    /* renamed from: d  reason: collision with root package name */
    final int f12618d;

    static {
        j$.com.android.tools.r8.a.h(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1201h(m mVar, int i7, int i8, int i9) {
        Objects.requireNonNull(mVar, "chrono");
        this.f12615a = mVar;
        this.f12616b = i7;
        this.f12617c = i8;
        this.f12618d = i9;
    }

    public final String toString() {
        m mVar = this.f12615a;
        int i7 = this.f12618d;
        int i8 = this.f12617c;
        int i9 = this.f12616b;
        if (i9 == 0 && i8 == 0 && i7 == 0) {
            String mVar2 = mVar.toString();
            return mVar2 + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i9 != 0) {
            sb.append(i9);
            sb.append('Y');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('M');
        }
        if (i7 != 0) {
            sb.append(i7);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        m mVar = (m) temporal.B(j$.time.temporal.l.e());
        m mVar2 = this.f12615a;
        if (mVar == null || mVar2.equals(mVar)) {
            int i7 = this.f12616b;
            int i8 = this.f12617c;
            if (i8 != 0) {
                j$.time.temporal.t K7 = mVar2.K(j$.time.temporal.a.MONTH_OF_YEAR);
                long d7 = (K7.g() && K7.h()) ? (K7.d() - K7.e()) + 1 : -1L;
                if (d7 > 0) {
                    temporal = temporal.e((i7 * d7) + i8, ChronoUnit.MONTHS);
                } else {
                    if (i7 != 0) {
                        temporal = temporal.e(i7, ChronoUnit.YEARS);
                    }
                    temporal = temporal.e(i8, ChronoUnit.MONTHS);
                }
            } else if (i7 != 0) {
                temporal = temporal.e(i7, ChronoUnit.YEARS);
            }
            int i9 = this.f12618d;
            return i9 != 0 ? temporal.e(i9, ChronoUnit.DAYS) : temporal;
        }
        String n7 = mVar2.n();
        String n8 = mVar.n();
        throw new RuntimeException("Chronology mismatch, expected: " + n7 + ", actual: " + n8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1201h) {
            C1201h c1201h = (C1201h) obj;
            return this.f12616b == c1201h.f12616b && this.f12617c == c1201h.f12617c && this.f12618d == c1201h.f12618d && this.f12615a.equals(c1201h.f12615a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12615a.hashCode() ^ (Integer.rotateLeft(this.f12618d, 16) + (Integer.rotateLeft(this.f12617c, 8) + this.f12616b));
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f12615a.n());
        objectOutput.writeInt(this.f12616b);
        objectOutput.writeInt(this.f12617c);
        objectOutput.writeInt(this.f12618d);
    }
}
