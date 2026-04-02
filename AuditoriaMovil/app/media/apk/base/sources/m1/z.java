package m1;

import D.AbstractC0059i;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final B f14019a;

    /* renamed from: b  reason: collision with root package name */
    public final B f14020b;

    public z(B b5, B b7) {
        this.f14019a = b5;
        this.f14020b = b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f14019a.equals(zVar.f14019a) && this.f14020b.equals(zVar.f14020b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14020b.hashCode() + (this.f14019a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        B b5 = this.f14019a;
        sb.append(b5);
        B b7 = this.f14020b;
        if (b5.equals(b7)) {
            str = StringUtils.EMPTY;
        } else {
            str = ", " + b7;
        }
        return AbstractC0059i.D(sb, str, "]");
    }
}
