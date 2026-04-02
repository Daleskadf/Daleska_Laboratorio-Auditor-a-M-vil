package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;
/* loaded from: classes2.dex */
public final class e implements j$.time.temporal.p, Comparable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final e f12655c = new e(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a  reason: collision with root package name */
    private final long f12656a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12657b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        int compare = Long.compare(this.f12656a, eVar.f12656a);
        return compare != 0 ? compare : this.f12657b - eVar.f12657b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static e w(long j) {
        return q(j, 0);
    }

    public static e B(long j, long j8) {
        return q(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.k(j8, 1000000000L)), (int) j$.com.android.tools.r8.a.j(j8, 1000000000L));
    }

    public static e t(long j) {
        long j8 = j / 1000000000;
        int i7 = (int) (j % 1000000000);
        if (i7 < 0) {
            i7 = (int) (i7 + 1000000000);
            j8--;
        }
        return q(j8, i7);
    }

    private static e q(long j, int i7) {
        if ((i7 | j) == 0) {
            return f12655c;
        }
        return new e(j, i7);
    }

    private e(long j, int i7) {
        this.f12656a = j;
        this.f12657b = i7;
    }

    public final long s() {
        return this.f12656a;
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal) {
        long j = this.f12656a;
        if (j != 0) {
            temporal = temporal.e(j, ChronoUnit.SECONDS);
        }
        int i7 = this.f12657b;
        return i7 != 0 ? temporal.e(i7, ChronoUnit.NANOS) : temporal;
    }

    public final long D() {
        long j = this.f12657b;
        long j8 = this.f12656a;
        if (j8 < 0) {
            j8++;
            j -= 1000000000;
        }
        return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j8, 1000000000L), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f12656a == eVar.f12656a && this.f12657b == eVar.f12657b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12656a;
        return (this.f12657b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f12655c) {
            return "PT0S";
        }
        long j = this.f12656a;
        int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i8 = this.f12657b;
        long j8 = (i7 >= 0 || i8 <= 0) ? j : 1 + j;
        long j9 = j8 / 3600;
        int i9 = (int) ((j8 % 3600) / 60);
        int i10 = (int) (j8 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j9 != 0) {
            sb.append(j9);
            sb.append('H');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i10 == 0 && i8 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i8 <= 0) {
            sb.append(i10);
        } else if (i10 == 0) {
            sb.append("-0");
        } else {
            sb.append(i10);
        }
        if (i8 > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i8);
            } else {
                sb.append(i8 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f12656a);
        objectOutput.writeInt(this.f12657b);
    }
}
