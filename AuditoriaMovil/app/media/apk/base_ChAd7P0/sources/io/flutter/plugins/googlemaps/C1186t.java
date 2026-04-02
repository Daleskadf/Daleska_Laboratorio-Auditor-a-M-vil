package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import s3.C1774b;
import s3.C1787o;
/* renamed from: io.flutter.plugins.googlemaps.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186t implements InterfaceC1188v {

    /* renamed from: a  reason: collision with root package name */
    public final C1787o f12275a = new C1787o();

    /* renamed from: b  reason: collision with root package name */
    public final String f12276b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12277c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12278d;

    public C1186t(String str, String str2) {
        this.f12277c = str;
        this.f12276b = str2;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void a(float f) {
        this.f12275a.f15638i0 = f;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void b(boolean z7) {
        this.f12278d = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void c(float f, float f4) {
        C1787o c1787o = this.f12275a;
        c1787o.f15633e = f;
        c1787o.f = f4;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void d(float f) {
        this.f12275a.f15637h0 = f;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void e(boolean z7) {
        this.f12275a.f15626X = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void f(boolean z7) {
        this.f12275a.f15628Z = z7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void g(float f, float f4) {
        C1787o c1787o = this.f12275a;
        c1787o.f15635f0 = f;
        c1787o.f15636g0 = f4;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void h(float f) {
        this.f12275a.f15634e0 = f;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void i(LatLng latLng) {
        this.f12275a.f15629a = latLng;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void j(String str, String str2) {
        C1787o c1787o = this.f12275a;
        c1787o.f15630b = str;
        c1787o.f15631c = str2;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void k(C1774b c1774b) {
        this.f12275a.f15632d = c1774b;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1188v
    public final void setVisible(boolean z7) {
        this.f12275a.f15627Y = z7;
    }
}
