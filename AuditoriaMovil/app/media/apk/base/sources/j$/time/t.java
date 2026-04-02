package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class t implements j$.time.temporal.p, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final t f12753d = new t(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a  reason: collision with root package name */
    private final int f12754a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12755b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12756c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.h(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static t b(int i7) {
        if (i7 == 0) {
            return f12753d;
        }
        return new t(0, 0, i7);
    }

    private t(int i7, int i8, int i9) {
        this.f12754a = i7;
        this.f12755b = i8;
        this.f12756c = i9;
    }

    public final int a() {
        return this.f12756c;
    }

    public final long d() {
        return (this.f12754a * 12) + this.f12755b;
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        j$.time.chrono.m mVar = (j$.time.chrono.m) temporal.B(j$.time.temporal.l.e());
        if (mVar == null || j$.time.chrono.t.f12641d.equals(mVar)) {
            if (this.f12755b == 0) {
                int i7 = this.f12754a;
                if (i7 != 0) {
                    temporal = temporal.e(i7, ChronoUnit.YEARS);
                }
            } else {
                long d7 = d();
                if (d7 != 0) {
                    temporal = temporal.e(d7, ChronoUnit.MONTHS);
                }
            }
            int i8 = this.f12756c;
            return i8 != 0 ? temporal.e(i8, ChronoUnit.DAYS) : temporal;
        }
        String n7 = mVar.n();
        throw new RuntimeException("Chronology mismatch, expected: ISO, actual: " + n7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f12754a == tVar.f12754a && this.f12755b == tVar.f12755b && this.f12756c == tVar.f12756c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f12756c, 16) + Integer.rotateLeft(this.f12755b, 8) + this.f12754a;
    }

    public final String toString() {
        if (this == f12753d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i7 = this.f12754a;
        if (i7 != 0) {
            sb.append(i7);
            sb.append('Y');
        }
        int i8 = this.f12755b;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('M');
        }
        int i9 = this.f12756c;
        if (i9 != 0) {
            sb.append(i9);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f12754a);
        objectOutput.writeInt(this.f12755b);
        objectOutput.writeInt(this.f12756c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t c(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return f12753d;
        }
        return new t(readInt, readInt2, readInt3);
    }
}
