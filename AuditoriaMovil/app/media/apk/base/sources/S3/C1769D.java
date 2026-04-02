package s3;

import a6.t0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
/* renamed from: s3.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769D extends X2.a {
    public static final Parcelable.Creator<C1769D> CREATOR = new C1770E(5);

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f15582a;

    /* renamed from: b  reason: collision with root package name */
    public final LatLng f15583b;

    /* renamed from: c  reason: collision with root package name */
    public final LatLng f15584c;

    /* renamed from: d  reason: collision with root package name */
    public final LatLng f15585d;

    /* renamed from: e  reason: collision with root package name */
    public final LatLngBounds f15586e;

    public C1769D(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f15582a = latLng;
        this.f15583b = latLng2;
        this.f15584c = latLng3;
        this.f15585d = latLng4;
        this.f15586e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769D)) {
            return false;
        }
        C1769D c1769d = (C1769D) obj;
        if (this.f15582a.equals(c1769d.f15582a) && this.f15583b.equals(c1769d.f15583b) && this.f15584c.equals(c1769d.f15584c) && this.f15585d.equals(c1769d.f15585d) && this.f15586e.equals(c1769d.f15586e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15582a, this.f15583b, this.f15584c, this.f15585d, this.f15586e});
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f15582a, "nearLeft");
        t0Var.m(this.f15583b, "nearRight");
        t0Var.m(this.f15584c, "farLeft");
        t0Var.m(this.f15585d, "farRight");
        t0Var.m(this.f15586e, "latLngBounds");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.A(parcel, 2, this.f15582a, i7, false);
        m5.d.A(parcel, 3, this.f15583b, i7, false);
        m5.d.A(parcel, 4, this.f15584c, i7, false);
        m5.d.A(parcel, 5, this.f15585d, i7, false);
        m5.d.A(parcel, 6, this.f15586e, i7, false);
        m5.d.J(G2, parcel);
    }
}
