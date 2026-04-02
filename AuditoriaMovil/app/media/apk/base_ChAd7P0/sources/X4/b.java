package X4;

import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final double f6400a;

    public b(double d7) {
        this.f6400a = d7;
    }

    public final LatLng a(a aVar) {
        double d7 = aVar.f6398a;
        double d8 = this.f6400a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (aVar.f6399b / d8))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d7 / d8) - 0.5d) * 360.0d);
    }

    public final a b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.f9463a));
        double d7 = this.f6400a;
        return new a(((latLng.f9464b / 360.0d) + 0.5d) * d7, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * d7);
    }
}
