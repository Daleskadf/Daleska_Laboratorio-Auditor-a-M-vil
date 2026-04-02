package S4;

import com.google.android.gms.maps.model.LatLng;
import io.flutter.plugins.googlemaps.C1186t;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class a implements Y4.a, R4.a {

    /* renamed from: a  reason: collision with root package name */
    public final C1186t f5259a;

    /* renamed from: b  reason: collision with root package name */
    public final X4.a f5260b;

    /* renamed from: c  reason: collision with root package name */
    public final LatLng f5261c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f5262d;

    public a(C1186t c1186t) {
        this.f5259a = c1186t;
        LatLng latLng = c1186t.f12275a.f15629a;
        this.f5261c = latLng;
        double sin = Math.sin(Math.toRadians(latLng.f9463a));
        this.f5260b = new X4.a(((latLng.f9464b / 360.0d) + 0.5d) * 1.0d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
        this.f5262d = Collections.singleton(c1186t);
    }

    @Override // R4.a
    public final LatLng a() {
        return this.f5261c;
    }

    @Override // Y4.a
    public final X4.a b() {
        return this.f5260b;
    }

    @Override // R4.a
    public final Collection c() {
        return this.f5262d;
    }

    @Override // R4.a
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return ((a) obj).f5259a.equals(this.f5259a);
    }

    public final int hashCode() {
        return this.f5259a.hashCode();
    }
}
