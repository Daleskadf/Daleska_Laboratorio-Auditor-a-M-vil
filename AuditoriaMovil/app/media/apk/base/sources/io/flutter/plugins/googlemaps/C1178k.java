package io.flutter.plugins.googlemaps;

import a.AbstractC0412a;
import a1.C0415A;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
/* renamed from: io.flutter.plugins.googlemaps.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178k extends io.flutter.plugin.platform.h {

    /* renamed from: b  reason: collision with root package name */
    public final L5.f f12216b;

    /* renamed from: c  reason: collision with root package name */
    public final C0415A f12217c;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, A.l] */
    public C1178k(L5.f fVar, Context context, C0415A c0415a) {
        super(A.f12030d);
        this.f12216b = fVar;
        this.f12217c = c0415a;
        ?? obj = new Object();
        obj.f25a = false;
        obj.f26b = context;
        new E.e(fVar, "dev.flutter.pigeon.google_maps_flutter_android.MapsInitializerApi.initializeWithPreferredRenderer", A.f12030d, null, 4).h0(new X5.E(obj, 14));
    }

    @Override // io.flutter.plugin.platform.h
    public final io.flutter.plugin.platform.g a(Context context, int i7, Object obj) {
        k0 k0Var = (k0) obj;
        Objects.requireNonNull(k0Var);
        C1175h c1175h = new C1175h();
        i0 i0Var = k0Var.f12219b;
        AbstractC0412a.z(i0Var, c1175h);
        I i8 = k0Var.f12218a;
        float floatValue = i8.f12061a.floatValue();
        CameraPosition cameraPosition = new CameraPosition(AbstractC0412a.G(i8.f12062b), i8.f12064d.floatValue(), i8.f12063c.floatValue(), floatValue);
        GoogleMapOptions googleMapOptions = c1175h.f12146a;
        googleMapOptions.f9447d = cameraPosition;
        c1175h.f12145Z = k0Var.f12225i;
        c1175h.f12144Y = k0Var.f12221d;
        c1175h.f12151e0 = k0Var.f12222e;
        c1175h.f12152f0 = k0Var.f;
        c1175h.f12153g0 = k0Var.f12220c;
        c1175h.f12154h0 = k0Var.f12223g;
        c1175h.f12155i0 = k0Var.f12224h;
        c1175h.f12156j0 = k0Var.j;
        String str = i0Var.f12177s;
        if (str != null) {
            googleMapOptions.f9458n0 = str;
        }
        C1177j c1177j = new C1177j(i7, context, this.f12216b, this.f12217c, googleMapOptions);
        ((C1181n) c1177j.f12203m0.f6744a).f12240a.a(c1177j);
        q3.f fVar = c1177j.f12194e;
        fVar.getClass();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            q3.k kVar = fVar.f15322a;
            p4.P p7 = (p4.P) kVar.f15330b;
            if (p7 != null) {
                p7.g(c1177j);
            } else {
                ((ArrayList) kVar.f15336i).add(c1177j);
            }
            c1177j.s(c1175h.f12148c);
            c1177j.i(c1175h.f12149d);
            c1177j.f12196f0 = c1175h.f12150e;
            c1177j.x(c1175h.f);
            c1177j.f12198h0 = c1175h.f12143X;
            c1177j.f12187X = c1175h.f12147b;
            List list = c1175h.f12145Z;
            c1177j.f12214y0 = list;
            if (c1177j.f != null && list != null) {
                c1177j.f12205o0.a(list);
            }
            List<l0> list2 = c1175h.f12144Y;
            c1177j.f12213x0 = list2;
            if (c1177j.f != null && list2 != null) {
                C1189w c1189w = c1177j.f12204n0;
                c1189w.getClass();
                for (l0 l0Var : list2) {
                    c1189w.a(l0Var);
                }
            }
            List list3 = c1175h.f12151e0;
            c1177j.f12215z0 = list3;
            if (c1177j.f != null && list3 != null) {
                c1177j.f12206p0.b(list3);
            }
            List list4 = c1175h.f12152f0;
            c1177j.f12179A0 = list4;
            if (c1177j.f != null && list4 != null) {
                c1177j.q0.a(list4);
            }
            List list5 = c1175h.f12153g0;
            c1177j.f12180B0 = list5;
            if (c1177j.f != null && list5 != null) {
                c1177j.f12207r0.a(list5);
            }
            List list6 = c1175h.f12154h0;
            c1177j.f12181C0 = list6;
            if (c1177j.f != null && list6 != null) {
                c1177j.f12208s0.b(list6);
            }
            Rect rect = c1175h.f12157k0;
            c1177j.c(rect.top, rect.left, rect.bottom, rect.right);
            List list7 = c1175h.f12155i0;
            c1177j.f12182D0 = list7;
            if (c1177j.f != null && list7 != null) {
                c1177j.f12209t0.f0(list7);
            }
            List list8 = c1175h.f12156j0;
            c1177j.f12183E0 = list8;
            if (c1177j.f != null && list8 != null) {
                c1177j.f12210u0.a(list8);
            }
            c1177j.u(c1175h.f12158l0);
            return c1177j;
        }
        throw new IllegalStateException("getMapAsync() must be called on the main thread");
    }
}
