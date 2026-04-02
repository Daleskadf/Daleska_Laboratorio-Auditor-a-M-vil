package g0;

import j$.util.Objects;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11085a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11086b;

    public b(Object obj, Object obj2) {
        this.f11085a = obj;
        this.f11086b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f11085a, this.f11085a) || !Objects.equals(bVar.f11086b, this.f11086b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f11085a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f11086b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f11085a + StringUtils.SPACE + this.f11086b + "}";
    }
}
