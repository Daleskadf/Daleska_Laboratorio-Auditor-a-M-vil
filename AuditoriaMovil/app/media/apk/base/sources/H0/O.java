package H0;

import D.AbstractC0059i;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1705a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1706b;

    /* renamed from: c  reason: collision with root package name */
    public final C f1707c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1708d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1709e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f1710g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1711h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1712i;

    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
        K0.x.H(5);
        K0.x.H(6);
    }

    public O(Object obj, int i7, C c8, Object obj2, int i8, long j, long j8, int i9, int i10) {
        this.f1705a = obj;
        this.f1706b = i7;
        this.f1707c = c8;
        this.f1708d = obj2;
        this.f1709e = i8;
        this.f = j;
        this.f1710g = j8;
        this.f1711h = i9;
        this.f1712i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o7 = (O) obj;
        if (this.f1706b == o7.f1706b && this.f1709e == o7.f1709e && this.f == o7.f && this.f1710g == o7.f1710g && this.f1711h == o7.f1711h && this.f1712i == o7.f1712i && F.f.l(this.f1707c, o7.f1707c) && F.f.l(this.f1705a, o7.f1705a) && F.f.l(this.f1708d, o7.f1708d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1705a, Integer.valueOf(this.f1706b), this.f1707c, this.f1708d, Integer.valueOf(this.f1709e), Long.valueOf(this.f), Long.valueOf(this.f1710g), Integer.valueOf(this.f1711h), Integer.valueOf(this.f1712i)});
    }
}
