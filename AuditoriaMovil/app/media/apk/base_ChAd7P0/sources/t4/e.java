package T4;

import com.google.android.gms.maps.model.LatLng;
import s3.C1786n;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final C1786n f5355a;

    /* renamed from: b  reason: collision with root package name */
    public LatLng f5356b;

    public e(C1786n c1786n) {
        this.f5355a = c1786n;
        this.f5356b = c1786n.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f5355a.equals(((e) obj).f5355a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5355a.hashCode();
    }
}
