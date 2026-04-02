package com.google.android.gms.maps.model;

import X2.a;
import a6.t0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import m5.d;
import s3.C1770E;
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C1770E(10);

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f9465a;

    /* renamed from: b  reason: collision with root package name */
    public final LatLng f9466b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        I.j(latLng, "southwest must not be null.");
        I.j(latLng2, "northeast must not be null.");
        double d7 = latLng.f9463a;
        Double valueOf = Double.valueOf(d7);
        double d8 = latLng2.f9463a;
        I.b("southern latitude exceeds northern latitude (%s > %s)", d8 >= d7, valueOf, Double.valueOf(d8));
        this.f9465a = latLng;
        this.f9466b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.f9465a.equals(latLngBounds.f9465a) && this.f9466b.equals(latLngBounds.f9466b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9465a, this.f9466b});
    }

    public final boolean k(LatLng latLng) {
        I.j(latLng, "point must not be null.");
        LatLng latLng2 = this.f9465a;
        double d7 = latLng2.f9463a;
        double d8 = latLng.f9463a;
        if (d7 <= d8) {
            LatLng latLng3 = this.f9466b;
            if (d8 <= latLng3.f9463a) {
                double d9 = latLng2.f9464b;
                double d10 = latLng3.f9464b;
                int i7 = (d9 > d10 ? 1 : (d9 == d10 ? 0 : -1));
                double d11 = latLng.f9464b;
                int i8 = (d9 > d11 ? 1 : (d9 == d11 ? 0 : -1));
                if (i7 <= 0) {
                    if (i8 <= 0 && d11 <= d10) {
                        return true;
                    }
                    return false;
                } else if (i8 <= 0 || d11 <= d10) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f9465a, "southwest");
        t0Var.m(this.f9466b, "northeast");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 2, this.f9465a, i7, false);
        d.A(parcel, 3, this.f9466b, i7, false);
        d.J(G2, parcel);
    }
}
