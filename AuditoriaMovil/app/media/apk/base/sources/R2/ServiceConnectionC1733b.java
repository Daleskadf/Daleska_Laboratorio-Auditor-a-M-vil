package r2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import w3.C1953b;
import w3.C1954c;
/* renamed from: r2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1733b implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15461b;

    public /* synthetic */ ServiceConnectionC1733b(Object obj, int i7) {
        this.f15460a = i7;
        this.f15461b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj = this.f15461b;
        switch (this.f15460a) {
            case 0:
                if (iBinder instanceof BinderC1732a) {
                    GeolocatorLocationService geolocatorLocationService = ((BinderC1732a) iBinder).f15459a;
                    C1734c c1734c = (C1734c) obj;
                    c1734c.f15468d = geolocatorLocationService;
                    geolocatorLocationService.f = c1734c.f15466b;
                    geolocatorLocationService.f9068c++;
                    Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f9068c);
                    C1736e c1736e = c1734c.f;
                    if (c1736e != null) {
                        c1736e.f15480e = geolocatorLocationService;
                        return;
                    }
                    return;
                }
                return;
            default:
                w3.d dVar = (w3.d) obj;
                dVar.f16346b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new C1953b(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj = this.f15461b;
        switch (this.f15460a) {
            case 0:
                C1734c c1734c = (C1734c) obj;
                GeolocatorLocationService geolocatorLocationService = c1734c.f15468d;
                if (geolocatorLocationService != null) {
                    geolocatorLocationService.f9070e = null;
                    c1734c.f15468d = null;
                    return;
                }
                return;
            default:
                w3.d dVar = (w3.d) obj;
                dVar.f16346b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new C1954c(this, 0));
                return;
        }
    }
}
