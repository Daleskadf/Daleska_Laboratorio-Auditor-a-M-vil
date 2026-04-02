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
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C1770E(0);

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f9459a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9460b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9461c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9462d;

    public CameraPosition(LatLng latLng, float f, float f4, float f8) {
        boolean z7;
        I.j(latLng, "camera target must not be null.");
        if (f4 >= 0.0f && f4 <= 90.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.b("Tilt needs to be between 0 and 90 inclusive: %s", z7, Float.valueOf(f4));
        this.f9459a = latLng;
        this.f9460b = f;
        this.f9461c = f4 + 0.0f;
        this.f9462d = (((double) f8) <= 0.0d ? (f8 % 360.0f) + 360.0f : f8) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.f9459a.equals(cameraPosition.f9459a) && Float.floatToIntBits(this.f9460b) == Float.floatToIntBits(cameraPosition.f9460b) && Float.floatToIntBits(this.f9461c) == Float.floatToIntBits(cameraPosition.f9461c) && Float.floatToIntBits(this.f9462d) == Float.floatToIntBits(cameraPosition.f9462d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9459a, Float.valueOf(this.f9460b), Float.valueOf(this.f9461c), Float.valueOf(this.f9462d)});
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(this.f9459a, "target");
        t0Var.m(Float.valueOf(this.f9460b), "zoom");
        t0Var.m(Float.valueOf(this.f9461c), "tilt");
        t0Var.m(Float.valueOf(this.f9462d), "bearing");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 2, this.f9459a, i7, false);
        d.K(parcel, 3, 4);
        parcel.writeFloat(this.f9460b);
        d.K(parcel, 4, 4);
        parcel.writeFloat(this.f9461c);
        d.K(parcel, 5, 4);
        parcel.writeFloat(this.f9462d);
        d.J(G2, parcel);
    }
}
