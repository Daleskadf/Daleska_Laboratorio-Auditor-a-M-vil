package r2;

import B5.AbstractActivityC0032e;
import L5.f;
import L5.j;
import L5.r;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import b4.C0612u;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.util.HashMap;
import p.Y0;
import t2.g;
import t2.i;
import u2.C1868b;
/* renamed from: r2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1734c implements H5.b, I5.a {

    /* renamed from: X  reason: collision with root package name */
    public final ServiceConnectionC1733b f15462X = new ServiceConnectionC1733b(this, 0);

    /* renamed from: Y  reason: collision with root package name */
    public Q5.e f15463Y;

    /* renamed from: Z  reason: collision with root package name */
    public I5.b f15464Z;

    /* renamed from: a  reason: collision with root package name */
    public final C1868b f15465a;

    /* renamed from: b  reason: collision with root package name */
    public final g f15466b;

    /* renamed from: c  reason: collision with root package name */
    public final i f15467c;

    /* renamed from: d  reason: collision with root package name */
    public GeolocatorLocationService f15468d;

    /* renamed from: e  reason: collision with root package name */
    public Y0 f15469e;
    public C1736e f;

    /* JADX WARN: Type inference failed for: r1v4, types: [u2.b, java.lang.Object] */
    public C1734c() {
        C1868b c1868b;
        synchronized (C1868b.class) {
            try {
                if (C1868b.f15974d == null) {
                    C1868b.f15974d = new Object();
                }
                c1868b = C1868b.f15974d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15465a = c1868b;
        this.f15466b = g.b();
        this.f15467c = i.C();
    }

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        this.f15464Z = bVar;
        if (bVar != null) {
            ((C5.d) bVar).a(this.f15466b);
            ((C5.d) this.f15464Z).b(this.f15465a);
        }
        Y0 y02 = this.f15469e;
        if (y02 != null) {
            y02.f = ((C5.d) bVar).f571a;
        }
        C1736e c1736e = this.f;
        if (c1736e != null) {
            AbstractActivityC0032e abstractActivityC0032e = ((C5.d) bVar).f571a;
            if (abstractActivityC0032e == null && c1736e.f15475X != null && c1736e.f15477b != null) {
                c1736e.d();
            }
            c1736e.f15479d = abstractActivityC0032e;
        }
        GeolocatorLocationService geolocatorLocationService = this.f15468d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f9070e = ((C5.d) this.f15464Z).f571a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.Y0, L5.p, java.lang.Object] */
    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        C0612u c0612u;
        C1868b c1868b = this.f15465a;
        g gVar = this.f15466b;
        i iVar = this.f15467c;
        ?? obj = new Object();
        obj.f14760b = c1868b;
        obj.f14761c = gVar;
        obj.f14762d = iVar;
        obj.f14763e = new HashMap();
        this.f15469e = obj;
        Context context = aVar.f2029a;
        if (((r) obj.f14758X) != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            r rVar = (r) obj.f14758X;
            if (rVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                rVar.b(null);
                obj.f14758X = null;
            }
        }
        f fVar = aVar.f2030b;
        r rVar2 = new r(fVar, "flutter.baseflow.com/geolocator_android");
        obj.f14758X = rVar2;
        rVar2.b(obj);
        obj.f14759a = context;
        C1736e c1736e = new C1736e(c1868b, gVar);
        this.f = c1736e;
        if (c1736e.f15477b != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            c1736e.d();
        }
        j jVar = new j(fVar, "flutter.baseflow.com/geolocator_updates_android");
        c1736e.f15477b = jVar;
        jVar.a(c1736e);
        Context context2 = aVar.f2029a;
        c1736e.f15478c = context2;
        Q5.e eVar = new Q5.e();
        this.f15463Y = eVar;
        eVar.f4430c = context2;
        if (((j) eVar.f4429b) != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            if (((j) eVar.f4429b) != null) {
                Context context3 = (Context) eVar.f4430c;
                if (context3 != null && (c0612u = (C0612u) eVar.f4431d) != null) {
                    context3.unregisterReceiver(c0612u);
                }
                ((j) eVar.f4429b).a(null);
                eVar.f4429b = null;
            }
        }
        j jVar2 = new j(fVar, "flutter.baseflow.com/geolocator_service_updates_android");
        eVar.f4429b = jVar2;
        jVar2.a(eVar);
        eVar.f4430c = context2;
        context2.bindService(new Intent(context2, GeolocatorLocationService.class), this.f15462X, 1);
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        I5.b bVar = this.f15464Z;
        if (bVar != null) {
            ((C5.d) bVar).d(this.f15466b);
            ((C5.d) this.f15464Z).f573c.remove(this.f15465a);
        }
        Y0 y02 = this.f15469e;
        if (y02 != null) {
            y02.f = null;
        }
        C1736e c1736e = this.f;
        if (c1736e != null) {
            if (c1736e.f15475X != null && c1736e.f15477b != null) {
                c1736e.d();
            }
            c1736e.f15479d = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f15468d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f9070e = null;
        }
        if (this.f15464Z != null) {
            this.f15464Z = null;
        }
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        GeolocatorLocationService geolocatorLocationService;
        Context context = aVar.f2029a;
        if (this.f15468d != null) {
            geolocatorLocationService.f9068c--;
            Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + geolocatorLocationService.f9068c);
        }
        context.unbindService(this.f15462X);
        Y0 y02 = this.f15469e;
        if (y02 != null) {
            r rVar = (r) y02.f14758X;
            if (rVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                rVar.b(null);
                y02.f14758X = null;
            }
            this.f15469e.f = null;
            this.f15469e = null;
        }
        C1736e c1736e = this.f;
        if (c1736e != null) {
            c1736e.d();
            this.f.f15480e = null;
            this.f = null;
        }
        Q5.e eVar = this.f15463Y;
        if (eVar != null) {
            eVar.f4430c = null;
            if (((j) eVar.f4429b) != null) {
                ((j) eVar.f4429b).a(null);
                eVar.f4429b = null;
            }
            this.f15463Y = null;
        }
        GeolocatorLocationService geolocatorLocationService2 = this.f15468d;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f9070e = null;
        }
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        onAttachedToActivity(bVar);
    }
}
