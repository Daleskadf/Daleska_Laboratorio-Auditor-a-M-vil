package s3;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* renamed from: s3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784l {

    /* renamed from: a  reason: collision with root package name */
    public double f15620a;

    /* renamed from: b  reason: collision with root package name */
    public double f15621b;

    /* renamed from: c  reason: collision with root package name */
    public double f15622c;

    /* renamed from: d  reason: collision with root package name */
    public double f15623d;

    public final LatLngBounds a() {
        I.k("no included points", !Double.isNaN(this.f15622c));
        return new LatLngBounds(new LatLng(this.f15620a, this.f15622c), new LatLng(this.f15621b, this.f15623d));
    }

    public final void b(LatLng latLng) {
        I.j(latLng, "point must not be null");
        double d7 = this.f15620a;
        double d8 = latLng.f9463a;
        this.f15620a = Math.min(d7, d8);
        this.f15621b = Math.max(this.f15621b, d8);
        boolean isNaN = Double.isNaN(this.f15622c);
        double d9 = latLng.f9464b;
        if (isNaN) {
            this.f15622c = d9;
            this.f15623d = d9;
            return;
        }
        double d10 = this.f15622c;
        double d11 = this.f15623d;
        if (d10 <= d11) {
            if (d10 <= d9 && d9 <= d11) {
                return;
            }
        } else if (d10 <= d9 || d9 <= d11) {
            return;
        }
        if (((d10 - d9) + 360.0d) % 360.0d < ((d9 - d11) + 360.0d) % 360.0d) {
            this.f15622c = d9;
        } else {
            this.f15623d = d9;
        }
    }
}
