package io.flutter.plugins.googlemaps;

import android.graphics.Rect;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
/* renamed from: io.flutter.plugins.googlemaps.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175h implements InterfaceC1180m {

    /* renamed from: Y  reason: collision with root package name */
    public List f12144Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f12145Z;

    /* renamed from: e0  reason: collision with root package name */
    public List f12151e0;

    /* renamed from: f0  reason: collision with root package name */
    public List f12152f0;

    /* renamed from: g0  reason: collision with root package name */
    public List f12153g0;

    /* renamed from: h0  reason: collision with root package name */
    public List f12154h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f12155i0;

    /* renamed from: j0  reason: collision with root package name */
    public List f12156j0;

    /* renamed from: l0  reason: collision with root package name */
    public String f12158l0;

    /* renamed from: a  reason: collision with root package name */
    public final GoogleMapOptions f12146a = new GoogleMapOptions();

    /* renamed from: b  reason: collision with root package name */
    public boolean f12147b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12148c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12149d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12150e = true;
    public boolean f = false;

    /* renamed from: X  reason: collision with root package name */
    public boolean f12143X = true;

    /* renamed from: k0  reason: collision with root package name */
    public Rect f12157k0 = new Rect(0, 0, 0, 0);

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void b(int i7) {
        this.f12146a.f9446c = i7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void c(float f, float f4, float f8, float f9) {
        this.f12157k0 = new Rect((int) f4, (int) f, (int) f9, (int) f8);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void d(boolean z7) {
        this.f12143X = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void h(boolean z7) {
        this.f12150e = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void i(boolean z7) {
        this.f12149d = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void k(boolean z7) {
        this.f12146a.f = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void l(boolean z7) {
        this.f12146a.f9451g0 = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void m(boolean z7) {
        this.f12147b = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void n(boolean z7) {
        this.f12146a.f9441X = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void o(boolean z7) {
        this.f12146a.f9450f0 = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void q(LatLngBounds latLngBounds) {
        this.f12146a.f9455k0 = latLngBounds;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void r(boolean z7) {
        this.f12146a.f9443Z = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void s(boolean z7) {
        this.f12148c = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void t(boolean z7) {
        this.f12146a.f9442Y = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void u(String str) {
        this.f12158l0 = str;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void v(boolean z7) {
        this.f12146a.f9448e = Boolean.valueOf(z7);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void w(Float f, Float f4) {
        GoogleMapOptions googleMapOptions = this.f12146a;
        if (f != null) {
            googleMapOptions.f9453i0 = f;
        }
        if (f4 != null) {
            googleMapOptions.f9454j0 = f4;
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void x(boolean z7) {
        this.f = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1180m
    public final void z(boolean z7) {
        this.f12146a.f9449e0 = Boolean.valueOf(z7);
    }
}
