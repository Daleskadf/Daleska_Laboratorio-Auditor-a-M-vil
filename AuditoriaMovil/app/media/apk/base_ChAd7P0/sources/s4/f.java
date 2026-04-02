package S4;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class f implements R4.a {

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f5274a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f5275b = new LinkedHashSet();

    public f(LatLng latLng) {
        this.f5274a = latLng;
    }

    @Override // R4.a
    public final LatLng a() {
        return this.f5274a;
    }

    @Override // R4.a
    public final Collection c() {
        return this.f5275b;
    }

    @Override // R4.a
    public final int d() {
        return this.f5275b.size();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!fVar.f5274a.equals(this.f5274a) || !fVar.f5275b.equals(this.f5275b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5275b.hashCode() + this.f5274a.hashCode();
    }

    public final String toString() {
        return "StaticCluster{mCenter=" + this.f5274a + ", mItems.size=" + this.f5275b.size() + '}';
    }
}
