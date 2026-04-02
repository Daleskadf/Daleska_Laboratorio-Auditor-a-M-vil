package r2;

import B5.AbstractActivityC0032e;
import L5.h;
import L5.i;
import L5.j;
import S0.t;
import W.C0365h;
import W.C0372o;
import W.E;
import W.L;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.util.Map;
import p.C1608t;
import t2.g;
import t2.k;
import t2.o;
import u2.C1868b;
/* renamed from: r2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1736e implements i {

    /* renamed from: X  reason: collision with root package name */
    public k f15475X;

    /* renamed from: a  reason: collision with root package name */
    public final C1868b f15476a;

    /* renamed from: b  reason: collision with root package name */
    public j f15477b;

    /* renamed from: c  reason: collision with root package name */
    public Context f15478c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractActivityC0032e f15479d;

    /* renamed from: e  reason: collision with root package name */
    public GeolocatorLocationService f15480e;
    public final g f;

    public C1736e(C1868b c1868b, g gVar) {
        this.f15476a = c1868b;
        this.f = gVar;
    }

    @Override // L5.i
    public final void a(Object obj, h hVar) {
        boolean z7;
        Map map;
        t tVar;
        C0365h c0365h = null;
        Integer num = null;
        c0365h = null;
        try {
            C1868b c1868b = this.f15476a;
            Context context = this.f15478c;
            c1868b.getClass();
            if (!C1868b.c(context)) {
                s2.b bVar = s2.b.permissionDenied;
                hVar.b(bVar.toString(), bVar.a(), null);
            } else if (this.f15480e == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
            } else {
                Map map2 = (Map) obj;
                if (map2 != null && map2.get("forceLocationManager") != null) {
                    z7 = ((Boolean) map2.get("forceLocationManager")).booleanValue();
                } else {
                    z7 = false;
                }
                o a7 = o.a(map2);
                if (map2 != null && (map = (Map) map2.get("foregroundNotificationConfig")) != null) {
                    Map map3 = (Map) map.get("notificationIcon");
                    if (map3 == null) {
                        tVar = null;
                    } else {
                        tVar = new t((String) map3.get("name"), (String) map3.get("defType"), 4);
                    }
                    String str = (String) map.get("notificationTitle");
                    String str2 = (String) map.get("notificationChannelName");
                    String str3 = (String) map.get("notificationText");
                    Boolean bool = (Boolean) map.get("enableWifiLock");
                    Boolean bool2 = (Boolean) map.get("enableWakeLock");
                    Boolean bool3 = (Boolean) map.get("setOngoing");
                    Object obj2 = map.get("color");
                    if (obj2 != null) {
                        num = Integer.valueOf(((Number) obj2).intValue());
                    }
                    c0365h = new C0365h(str, str3, str2, tVar, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), num);
                }
                if (c0365h != null) {
                    Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
                    GeolocatorLocationService geolocatorLocationService = this.f15480e;
                    geolocatorLocationService.f9069d++;
                    if (geolocatorLocationService.f != null) {
                        k a8 = g.a(geolocatorLocationService.getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(z7)), a7);
                        geolocatorLocationService.f9063X = a8;
                        g gVar = geolocatorLocationService.f;
                        AbstractActivityC0032e abstractActivityC0032e = geolocatorLocationService.f9070e;
                        Q5.c cVar = new Q5.c(hVar, 1);
                        Q5.c cVar2 = new Q5.c(hVar, 2);
                        gVar.f15733a.add(a8);
                        a8.b(abstractActivityC0032e, cVar, cVar2);
                    }
                    GeolocatorLocationService geolocatorLocationService2 = this.f15480e;
                    if (geolocatorLocationService2.f9071e0 != null) {
                        Log.d("FlutterGeolocator", "Service already in foreground mode.");
                        C1608t c1608t = geolocatorLocationService2.f9071e0;
                        if (c1608t != null) {
                            c1608t.x0(c0365h, geolocatorLocationService2.f9067b);
                            geolocatorLocationService2.b(c0365h);
                        }
                    } else {
                        Log.d("FlutterGeolocator", "Start service in foreground mode.");
                        Context applicationContext = geolocatorLocationService2.getApplicationContext();
                        geolocatorLocationService2.f9071e0 = new C1608t(applicationContext, c0365h);
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 26) {
                            L l8 = new L(applicationContext);
                            org.apache.tika.io.b.i();
                            NotificationChannel a9 = org.apache.tika.io.b.a((String) c0365h.f);
                            a9.setLockscreenVisibility(0);
                            if (i7 >= 26) {
                                E.b(l8.f6015b, a9);
                            }
                        }
                        geolocatorLocationService2.startForeground(75415, ((C0372o) geolocatorLocationService2.f9071e0.f14881c).a());
                        geolocatorLocationService2.f9067b = true;
                    }
                    geolocatorLocationService2.b(c0365h);
                    return;
                }
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                Context context2 = this.f15478c;
                boolean equals = Boolean.TRUE.equals(Boolean.valueOf(z7));
                g gVar2 = this.f;
                gVar2.getClass();
                k a10 = g.a(context2, equals, a7);
                this.f15475X = a10;
                AbstractActivityC0032e abstractActivityC0032e2 = this.f15479d;
                Q5.c cVar3 = new Q5.c(hVar, 3);
                Q5.c cVar4 = new Q5.c(hVar, 4);
                gVar2.f15733a.add(a10);
                a10.b(abstractActivityC0032e2, cVar3, cVar4);
            }
        } catch (s2.c unused) {
            s2.b bVar2 = s2.b.permissionDefinitionsNotFound;
            hVar.b(bVar2.toString(), bVar2.a(), null);
        }
    }

    @Override // L5.i
    public final void b() {
        c(true);
    }

    public final void c(boolean z7) {
        g gVar;
        g gVar2;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = this.f15480e;
        if (geolocatorLocationService != null && (!z7 ? geolocatorLocationService.f9068c == 0 : geolocatorLocationService.f9069d == 1)) {
            geolocatorLocationService.f9069d--;
            Log.d("FlutterGeolocator", "Stopping location service.");
            k kVar = geolocatorLocationService.f9063X;
            if (kVar != null && (gVar2 = geolocatorLocationService.f) != null) {
                gVar2.f15733a.remove(kVar);
                kVar.e();
            }
            this.f15480e.a();
        } else {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        }
        k kVar2 = this.f15475X;
        if (kVar2 != null && (gVar = this.f) != null) {
            gVar.f15733a.remove(kVar2);
            kVar2.e();
            this.f15475X = null;
        }
    }

    public final void d() {
        if (this.f15477b == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        c(false);
        this.f15477b.a(null);
        this.f15477b = null;
    }
}
