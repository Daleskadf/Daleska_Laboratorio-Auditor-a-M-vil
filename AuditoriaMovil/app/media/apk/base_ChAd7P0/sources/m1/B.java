package m1;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: c  reason: collision with root package name */
    public static final B f13883c = new B(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f13884a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13885b;

    public B(long j, long j8) {
        this.f13884a = j;
        this.f13885b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b5 = (B) obj;
        if (this.f13884a == b5.f13884a && this.f13885b == b5.f13885b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13884a) * 31) + ((int) this.f13885b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f13884a);
        sb.append(", position=");
        return AbstractC0059i.C(sb, this.f13885b, "]");
    }
}
