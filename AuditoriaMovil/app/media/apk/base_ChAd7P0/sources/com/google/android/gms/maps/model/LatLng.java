package com.google.android.gms.maps.model;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import m5.d;
import s3.C1770E;
/* loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C1770E(11);

    /* renamed from: a  reason: collision with root package name */
    public final double f9463a;

    /* renamed from: b  reason: collision with root package name */
    public final double f9464b;

    public LatLng(double d7, double d8) {
        if (d8 >= -180.0d && d8 < 180.0d) {
            this.f9464b = d8;
        } else {
            this.f9464b = ((((d8 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f9463a = Math.max(-90.0d, Math.min(90.0d, d7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f9463a) == Double.doubleToLongBits(latLng.f9463a) && Double.doubleToLongBits(this.f9464b) == Double.doubleToLongBits(latLng.f9464b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9463a);
        long j = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9464b);
        return ((((int) j) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.f9463a + "," + this.f9464b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 2, 8);
        parcel.writeDouble(this.f9463a);
        d.K(parcel, 3, 8);
        parcel.writeDouble(this.f9464b);
        d.J(G2, parcel);
    }
}
