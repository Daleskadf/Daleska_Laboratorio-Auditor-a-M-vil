package j$.util;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class D {

    /* renamed from: c  reason: collision with root package name */
    private static final D f12838c = new D();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12839a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12840b;

    private D() {
        this.f12839a = false;
        this.f12840b = 0;
    }

    public static D a() {
        return f12838c;
    }

    private D(int i7) {
        this.f12839a = true;
        this.f12840b = i7;
    }

    public static D d(int i7) {
        return new D(i7);
    }

    public final int b() {
        if (!this.f12839a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f12840b;
    }

    public final boolean c() {
        return this.f12839a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            D d7 = (D) obj;
            boolean z7 = this.f12839a;
            if (z7 && d7.f12839a) {
                if (this.f12840b == d7.f12840b) {
                    return true;
                }
            } else if (z7 == d7.f12839a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12839a) {
            return this.f12840b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f12839a) {
            return "OptionalInt[" + this.f12840b + "]";
        }
        return "OptionalInt.empty";
    }
}
