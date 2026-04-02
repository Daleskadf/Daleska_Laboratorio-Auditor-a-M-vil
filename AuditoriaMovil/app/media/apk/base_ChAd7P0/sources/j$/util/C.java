package j$.util;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class C {

    /* renamed from: c  reason: collision with root package name */
    private static final C f12835c = new C();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12836a;

    /* renamed from: b  reason: collision with root package name */
    private final double f12837b;

    private C() {
        this.f12836a = false;
        this.f12837b = Double.NaN;
    }

    public static C a() {
        return f12835c;
    }

    private C(double d7) {
        this.f12836a = true;
        this.f12837b = d7;
    }

    public static C d(double d7) {
        return new C(d7);
    }

    public final double b() {
        if (!this.f12836a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f12837b;
    }

    public final boolean c() {
        return this.f12836a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            C c8 = (C) obj;
            boolean z7 = this.f12836a;
            if (z7 && c8.f12836a) {
                if (Double.compare(this.f12837b, c8.f12837b) == 0) {
                    return true;
                }
            } else if (z7 == c8.f12836a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12836a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f12837b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.f12836a) {
            return "OptionalDouble[" + this.f12837b + "]";
        }
        return "OptionalDouble.empty";
    }
}
