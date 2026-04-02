package com.google.android.gms.maps;

import X2.a;
import a6.t0;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import m5.d;
import n3.c0;
import org.slf4j.helpers.i;
/* loaded from: classes.dex */
public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new c0(29);

    /* renamed from: X  reason: collision with root package name */
    public Boolean f9441X;

    /* renamed from: Y  reason: collision with root package name */
    public Boolean f9442Y;

    /* renamed from: Z  reason: collision with root package name */
    public Boolean f9443Z;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f9444a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f9445b;

    /* renamed from: d  reason: collision with root package name */
    public CameraPosition f9447d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f9448e;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f9449e0;
    public Boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public Boolean f9450f0;

    /* renamed from: g0  reason: collision with root package name */
    public Boolean f9451g0;

    /* renamed from: h0  reason: collision with root package name */
    public Boolean f9452h0;

    /* renamed from: l0  reason: collision with root package name */
    public Boolean f9456l0;

    /* renamed from: c  reason: collision with root package name */
    public int f9446c = -1;

    /* renamed from: i0  reason: collision with root package name */
    public Float f9453i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public Float f9454j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public LatLngBounds f9455k0 = null;

    /* renamed from: m0  reason: collision with root package name */
    public Integer f9457m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public String f9458n0 = null;

    static {
        Color.argb(255, 236, 233, 225);
    }

    public final String toString() {
        t0 t0Var = new t0(this);
        t0Var.m(Integer.valueOf(this.f9446c), "MapType");
        t0Var.m(this.f9450f0, "LiteMode");
        t0Var.m(this.f9447d, "Camera");
        t0Var.m(this.f, "CompassEnabled");
        t0Var.m(this.f9448e, "ZoomControlsEnabled");
        t0Var.m(this.f9441X, "ScrollGesturesEnabled");
        t0Var.m(this.f9442Y, "ZoomGesturesEnabled");
        t0Var.m(this.f9443Z, "TiltGesturesEnabled");
        t0Var.m(this.f9449e0, "RotateGesturesEnabled");
        t0Var.m(this.f9456l0, "ScrollGesturesEnabledDuringRotateOrZoom");
        t0Var.m(this.f9451g0, "MapToolbarEnabled");
        t0Var.m(this.f9452h0, "AmbientEnabled");
        t0Var.m(this.f9453i0, "MinZoomPreference");
        t0Var.m(this.f9454j0, "MaxZoomPreference");
        t0Var.m(this.f9457m0, "BackgroundColor");
        t0Var.m(this.f9455k0, "LatLngBoundsForCameraTarget");
        t0Var.m(this.f9444a, "ZOrderOnTop");
        t0Var.m(this.f9445b, "UseViewLifecycleInFragment");
        return t0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        byte R7 = i.R(this.f9444a);
        d.K(parcel, 2, 4);
        parcel.writeInt(R7);
        byte R8 = i.R(this.f9445b);
        d.K(parcel, 3, 4);
        parcel.writeInt(R8);
        int i8 = this.f9446c;
        d.K(parcel, 4, 4);
        parcel.writeInt(i8);
        d.A(parcel, 5, this.f9447d, i7, false);
        byte R9 = i.R(this.f9448e);
        d.K(parcel, 6, 4);
        parcel.writeInt(R9);
        byte R10 = i.R(this.f);
        d.K(parcel, 7, 4);
        parcel.writeInt(R10);
        byte R11 = i.R(this.f9441X);
        d.K(parcel, 8, 4);
        parcel.writeInt(R11);
        byte R12 = i.R(this.f9442Y);
        d.K(parcel, 9, 4);
        parcel.writeInt(R12);
        byte R13 = i.R(this.f9443Z);
        d.K(parcel, 10, 4);
        parcel.writeInt(R13);
        byte R14 = i.R(this.f9449e0);
        d.K(parcel, 11, 4);
        parcel.writeInt(R14);
        byte R15 = i.R(this.f9450f0);
        d.K(parcel, 12, 4);
        parcel.writeInt(R15);
        byte R16 = i.R(this.f9451g0);
        d.K(parcel, 14, 4);
        parcel.writeInt(R16);
        byte R17 = i.R(this.f9452h0);
        d.K(parcel, 15, 4);
        parcel.writeInt(R17);
        d.u(parcel, 16, this.f9453i0);
        d.u(parcel, 17, this.f9454j0);
        d.A(parcel, 18, this.f9455k0, i7, false);
        byte R18 = i.R(this.f9456l0);
        d.K(parcel, 19, 4);
        parcel.writeInt(R18);
        d.y(parcel, 20, this.f9457m0);
        d.B(parcel, 21, this.f9458n0, false);
        d.J(G2, parcel);
    }
}
