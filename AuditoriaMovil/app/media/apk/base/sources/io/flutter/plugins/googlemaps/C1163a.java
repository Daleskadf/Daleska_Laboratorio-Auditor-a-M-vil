package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s3.C1776d;
import s3.C1778f;
/* renamed from: io.flutter.plugins.googlemaps.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163a implements InterfaceC1167c, y0, A0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12097a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12098b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12099c;

    /* renamed from: d  reason: collision with root package name */
    public final X2.a f12100d;

    /* JADX WARN: Type inference failed for: r5v3, types: [X2.a, java.lang.Object, s3.f] */
    public C1163a(float f, int i7) {
        this.f12097a = i7;
        switch (i7) {
            case 1:
                this.f12100d = new s3.t();
                this.f12098b = f;
                return;
            case 2:
                this.f12100d = new s3.v();
                this.f12098b = f;
                return;
            default:
                ?? obj = new Object();
                obj.f15599a = null;
                obj.f15600b = 0.0d;
                obj.f15601c = 10.0f;
                obj.f15602d = -16777216;
                obj.f15603e = 0;
                obj.f = 0.0f;
                obj.f15596X = true;
                obj.f15597Y = false;
                obj.f15598Z = null;
                this.f12100d = obj;
                this.f12098b = f;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void a(float f) {
        switch (this.f12097a) {
            case 0:
                ((C1778f) this.f12100d).f = f;
                return;
            case 1:
                ((s3.t) this.f12100d).f = f;
                return;
            default:
                ((s3.v) this.f12100d).f15671d = f;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void b(boolean z7) {
        switch (this.f12097a) {
            case 0:
                this.f12099c = z7;
                ((C1778f) this.f12100d).f15597Y = z7;
                return;
            case 1:
                this.f12099c = z7;
                ((s3.t) this.f12100d).f15656Z = z7;
                return;
            default:
                this.f12099c = z7;
                ((s3.v) this.f12100d).f15665X = z7;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0
    public void c(int i7) {
        switch (this.f12097a) {
            case 0:
                ((C1778f) this.f12100d).f15602d = i7;
                return;
            default:
                ((s3.t) this.f12100d).f15660d = i7;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public void d(boolean z7) {
        switch (this.f12097a) {
            case 1:
                ((s3.t) this.f12100d).f15655Y = z7;
                return;
            default:
                ((s3.v) this.f12100d).f = z7;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public void e(ArrayList arrayList) {
        switch (this.f12097a) {
            case 1:
                s3.t tVar = (s3.t) this.f12100d;
                tVar.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tVar.f15657a.add((LatLng) it.next());
                }
                return;
            default:
                s3.v vVar = (s3.v) this.f12100d;
                vVar.getClass();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    vVar.f15668a.add((LatLng) it2.next());
                }
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0
    public void f(int i7) {
        switch (this.f12097a) {
            case 0:
                ((C1778f) this.f12100d).f15603e = i7;
                return;
            default:
                ((s3.t) this.f12100d).f15661e = i7;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0
    public void g(float f) {
        switch (this.f12097a) {
            case 0:
                ((C1778f) this.f12100d).f15601c = f * this.f12098b;
                return;
            default:
                ((s3.t) this.f12100d).f15659c = f * this.f12098b;
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public void h(int i7) {
        ((s3.v) this.f12100d).f15673e0 = i7;
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public void i(float f) {
        ((s3.v) this.f12100d).f15669b = f * this.f12098b;
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public void j(C1776d c1776d) {
        s3.v vVar = (s3.v) this.f12100d;
        vVar.getClass();
        vVar.f15667Z = c1776d;
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public void k(ArrayList arrayList) {
        ((s3.v) this.f12100d).f15674f0 = arrayList;
    }

    @Override // io.flutter.plugins.googlemaps.y0
    public void l(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<LatLng> list = (List) it.next();
            s3.t tVar = (s3.t) this.f12100d;
            tVar.getClass();
            com.google.android.gms.common.internal.I.j(list, "points must not be null.");
            ArrayList arrayList2 = new ArrayList();
            for (LatLng latLng : list) {
                arrayList2.add(latLng);
            }
            tVar.f15658b.add(arrayList2);
        }
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c
    public void m(double d7) {
        ((C1778f) this.f12100d).f15600b = d7;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c
    public void n(LatLng latLng) {
        ((C1778f) this.f12100d).f15599a = latLng;
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public void o(int i7) {
        ((s3.v) this.f12100d).f15670c = i7;
    }

    @Override // io.flutter.plugins.googlemaps.A0
    public void p(C1776d c1776d) {
        s3.v vVar = (s3.v) this.f12100d;
        vVar.getClass();
        vVar.f15666Y = c1776d;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1167c, io.flutter.plugins.googlemaps.y0, io.flutter.plugins.googlemaps.A0
    public final void setVisible(boolean z7) {
        switch (this.f12097a) {
            case 0:
                ((C1778f) this.f12100d).f15596X = z7;
                return;
            case 1:
                ((s3.t) this.f12100d).f15654X = z7;
                return;
            default:
                ((s3.v) this.f12100d).f15672e = z7;
                return;
        }
    }
}
