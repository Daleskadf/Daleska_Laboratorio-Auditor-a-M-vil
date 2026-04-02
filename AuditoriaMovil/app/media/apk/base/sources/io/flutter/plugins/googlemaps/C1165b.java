package io.flutter.plugins.googlemaps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import s3.C1777e;
/* renamed from: io.flutter.plugins.googlemaps.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165b implements InterfaceC1167c {

    /* renamed from: a  reason: collision with root package name */
    public final C1777e f12105a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12106b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12107c;

    public C1165b(C1777e c1777e, boolean z7, float f) {
        this.f12105a = c1777e;
        this.f12107c = f;
        try {
            this.f12106b = c1777e.f15595a.zzl();
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void a(float f) {
        C1777e c1777e = this.f12105a;
        c1777e.getClass();
        try {
            c1777e.f15595a.zzx(f);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void b(boolean z7) {
        try {
            this.f12105a.f15595a.zzp(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0
    public final void c(int i7) {
        C1777e c1777e = this.f12105a;
        c1777e.getClass();
        try {
            c1777e.f15595a.zzs(i7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0
    public final void f(int i7) {
        C1777e c1777e = this.f12105a;
        c1777e.getClass();
        try {
            c1777e.f15595a.zzq(i7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0
    public final void g(float f) {
        float f4 = f * this.f12107c;
        C1777e c1777e = this.f12105a;
        c1777e.getClass();
        try {
            c1777e.f15595a.zzu(f4);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c
    public final void m(double d7) {
        C1777e c1777e = this.f12105a;
        c1777e.getClass();
        try {
            c1777e.f15595a.zzr(d7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c
    public final void n(LatLng latLng) {
        try {
            this.f12105a.f15595a.zzo(latLng);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void setVisible(boolean z7) {
        C1777e c1777e = this.f12105a;
        c1777e.getClass();
        try {
            c1777e.f15595a.zzw(z7);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
