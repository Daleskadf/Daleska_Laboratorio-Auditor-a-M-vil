package O0;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final long f3610a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3611b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3612c;

    public Q(P p7) {
        this.f3610a = p7.f3607a;
        this.f3611b = p7.f3608b;
        this.f3612c = p7.f3609c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        if (this.f3610a == q2.f3610a && this.f3611b == q2.f3611b && this.f3612c == q2.f3612c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3610a), Float.valueOf(this.f3611b), Long.valueOf(this.f3612c)});
    }
}
