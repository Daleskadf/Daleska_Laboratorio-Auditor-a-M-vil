package j$.util;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class E {

    /* renamed from: c  reason: collision with root package name */
    private static final E f12841c = new E();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12842a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12843b;

    private E() {
        this.f12842a = false;
        this.f12843b = 0L;
    }

    public static E a() {
        return f12841c;
    }

    private E(long j) {
        this.f12842a = true;
        this.f12843b = j;
    }

    public static E d(long j) {
        return new E(j);
    }

    public final long b() {
        if (!this.f12842a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f12843b;
    }

    public final boolean c() {
        return this.f12842a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            E e7 = (E) obj;
            boolean z7 = this.f12842a;
            if (z7 && e7.f12842a) {
                if (this.f12843b == e7.f12843b) {
                    return true;
                }
            } else if (z7 == e7.f12842a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12842a) {
            long j = this.f12843b;
            return (int) (j ^ (j >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.f12842a) {
            return "OptionalLong[" + this.f12843b + "]";
        }
        return "OptionalLong.empty";
    }
}
