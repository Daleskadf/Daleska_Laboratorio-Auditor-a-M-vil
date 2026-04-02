package io.flutter.plugins.googlemaps;

import a.AbstractC0412a;
import android.content.res.AssetManager;
import android.os.RemoteException;
import j6.C1372c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s3.C1786n;
/* renamed from: io.flutter.plugins.googlemaps.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189w {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12293a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f12294b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f12295c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final a6.t0 f12296d;

    /* renamed from: e  reason: collision with root package name */
    public U4.a f12297e;
    public final C1173f f;

    /* renamed from: g  reason: collision with root package name */
    public final AssetManager f12298g;

    /* renamed from: h  reason: collision with root package name */
    public final float f12299h;

    /* renamed from: i  reason: collision with root package name */
    public final C1372c f12300i;

    public C1189w(a6.t0 t0Var, C1173f c1173f, AssetManager assetManager, float f, C1372c c1372c) {
        this.f12296d = t0Var;
        this.f = c1173f;
        this.f12298g = assetManager;
        this.f12299h = f;
        this.f12300i = c1372c;
    }

    public final void a(l0 l0Var) {
        String str = l0Var.f12236l;
        String str2 = l0Var.f12237m;
        C1186t c1186t = new C1186t(str, str2);
        AbstractC0412a.A(l0Var, c1186t, this.f12298g, this.f12299h, this.f12300i);
        this.f12293a.put(str, c1186t);
        if (str2 == null) {
            C1786n a7 = this.f12297e.a(c1186t.f12275a);
            this.f12294b.put(str, new C1187u(a7, c1186t.f12278d));
            this.f12295c.put(a7.a(), str);
            return;
        }
        R4.c cVar = (R4.c) this.f.f12130b.get(str2);
        if (cVar != null) {
            S4.e eVar = cVar.f4774d;
            ((ReentrantReadWriteLock) eVar.f229a).writeLock().lock();
            try {
                eVar.f5273b.x(c1186t);
                eVar.s();
                cVar.a();
            } catch (Throwable th) {
                eVar.s();
                throw th;
            }
        }
    }

    public final boolean b(String str) {
        t2.i iVar = new t2.i(18);
        StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerTap");
        a6.t0 t0Var = this.f12296d;
        sb.append((String) t0Var.f7210c);
        String sb2 = sb.toString();
        new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(str)), new K4.e(iVar, sb2, 16));
        C1187u c1187u = (C1187u) this.f12294b.get(str);
        if (c1187u != null) {
            return c1187u.f12285c;
        }
        return false;
    }

    public final void c(String str) {
        U4.a aVar;
        C1786n c1786n;
        C1186t c1186t = (C1186t) this.f12293a.remove(str);
        if (c1186t == null) {
            return;
        }
        C1187u c1187u = (C1187u) this.f12294b.remove(str);
        String str2 = c1186t.f12276b;
        if (str2 != null) {
            R4.c cVar = (R4.c) this.f.f12130b.get(str2);
            if (cVar != null) {
                S4.e eVar = cVar.f4774d;
                ((ReentrantReadWriteLock) eVar.f229a).writeLock().lock();
                try {
                    eVar.f5273b.C(c1186t);
                    eVar.s();
                    cVar.a();
                } catch (Throwable th) {
                    eVar.s();
                    throw th;
                }
            }
        } else if (c1187u != null && (aVar = this.f12297e) != null && (c1786n = (C1786n) c1187u.f12283a.get()) != null && aVar.f5767a.remove(c1786n)) {
            aVar.f5768b.f5773a.remove(c1786n);
            try {
                c1786n.f15625a.zzo();
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        }
        if (c1187u != null) {
            this.f12295c.remove(c1187u.f12284b);
        }
    }
}
