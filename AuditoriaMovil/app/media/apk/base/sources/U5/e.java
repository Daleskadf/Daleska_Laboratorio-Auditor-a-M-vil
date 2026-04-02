package U5;

import j$.util.Objects;
import java.util.Map;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f5780a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f5781b;

    /* renamed from: c  reason: collision with root package name */
    public Map f5782c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5780a.equals(eVar.f5780a) && this.f5781b.equals(eVar.f5781b) && this.f5782c.equals(eVar.f5782c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5780a, this.f5781b, this.f5782c);
    }
}
