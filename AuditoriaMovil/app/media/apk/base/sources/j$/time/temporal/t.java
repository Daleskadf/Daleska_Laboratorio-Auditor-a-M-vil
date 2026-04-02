package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a  reason: collision with root package name */
    private final long f12786a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12787b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12788c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12789d;

    public static t j(long j, long j8) {
        if (j > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(j, j, j8, j8);
    }

    public static t k(long j, long j8) {
        if (j <= j8) {
            if (1 > j8) {
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            return new t(1L, 1L, j, j8);
        }
        throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
    }

    private t(long j, long j8, long j9, long j10) {
        this.f12786a = j;
        this.f12787b = j8;
        this.f12788c = j9;
        this.f12789d = j10;
    }

    public final boolean g() {
        return this.f12786a == this.f12787b && this.f12788c == this.f12789d;
    }

    public final long e() {
        return this.f12786a;
    }

    public final long f() {
        return this.f12788c;
    }

    public final long d() {
        return this.f12789d;
    }

    public final boolean h() {
        return this.f12786a >= -2147483648L && this.f12789d <= 2147483647L;
    }

    public final boolean i(long j) {
        return j >= this.f12786a && j <= this.f12789d;
    }

    public final int a(long j, q qVar) {
        if (h() && i(j)) {
            return (int) j;
        }
        throw new RuntimeException(c(j, qVar));
    }

    public final void b(long j, q qVar) {
        if (!i(j)) {
            throw new RuntimeException(c(j, qVar));
        }
    }

    private String c(long j, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j = this.f12786a;
        long j8 = this.f12787b;
        if (j > j8) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j9 = this.f12788c;
        long j10 = this.f12789d;
        if (j9 > j10) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j8 > j10) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f12786a == tVar.f12786a && this.f12787b == tVar.f12787b && this.f12788c == tVar.f12788c && this.f12789d == tVar.f12789d;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12787b;
        long j8 = this.f12786a + (j << 16) + (j >> 48);
        long j9 = this.f12788c;
        long j10 = j8 + (j9 << 32) + (j9 >> 32);
        long j11 = this.f12789d;
        long j12 = j10 + (j11 << 48) + (j11 >> 16);
        return (int) ((j12 >>> 32) ^ j12);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f12786a;
        sb.append(j);
        long j8 = this.f12787b;
        if (j != j8) {
            sb.append('/');
            sb.append(j8);
        }
        sb.append(" - ");
        long j9 = this.f12788c;
        sb.append(j9);
        long j10 = this.f12789d;
        if (j9 != j10) {
            sb.append('/');
            sb.append(j10);
        }
        return sb.toString();
    }
}
