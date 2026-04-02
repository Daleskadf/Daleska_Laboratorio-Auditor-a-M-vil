package io.flutter.plugins.googlemaps;

import java.util.ArrayList;
import s3.C1766A;
/* loaded from: classes.dex */
public final class r implements InterfaceC1185s {

    /* renamed from: a  reason: collision with root package name */
    public final W4.c f12270a;

    /* renamed from: b  reason: collision with root package name */
    public final C1766A f12271b;

    public r(W4.c cVar, C1766A c1766a) {
        this.f12270a = cVar;
        this.f12271b = c1766a;
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public final void b(int i7) {
        W4.c cVar = this.f12270a;
        cVar.f6216d = i7;
        cVar.f6210X = W4.c.a(i7, i7 / 3.0d);
        cVar.f6212Z = cVar.b(cVar.f6216d);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public final void c(ArrayList arrayList) {
        this.f12270a.d(arrayList);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public final void j(double d7) {
        W4.c cVar = this.f12270a;
        cVar.f6218e0 = d7;
        cVar.d(cVar.f6214b);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public final void q(double d7) {
        W4.c cVar = this.f12270a;
        cVar.f6211Y = d7;
        cVar.c(cVar.f6217e);
    }

    @Override // io.flutter.plugins.googlemaps.InterfaceC1185s
    public final void v(A3.N n7) {
        this.f12270a.c(n7);
    }
}
