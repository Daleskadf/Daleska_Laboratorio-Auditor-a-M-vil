package t2;

import B5.AbstractActivityC0032e;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c0.AbstractC0622a;
import c0.AbstractC0623b;
import d0.ExecutorC0885c;
import e0.C0927b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import r3.AbstractC1740d;
import s2.InterfaceC1765a;
/* loaded from: classes.dex */
public final class m implements k, LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public final LocationManager f15737a;

    /* renamed from: b  reason: collision with root package name */
    public final r f15738b;

    /* renamed from: c  reason: collision with root package name */
    public final o f15739c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f15740d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15741e = false;
    public Location f;

    /* renamed from: g  reason: collision with root package name */
    public String f15742g;

    /* renamed from: h  reason: collision with root package name */
    public s f15743h;

    /* renamed from: i  reason: collision with root package name */
    public InterfaceC1765a f15744i;

    public m(Context context, o oVar) {
        this.f15737a = (LocationManager) context.getSystemService("location");
        this.f15739c = oVar;
        this.f15740d = context;
        this.f15738b = new r(context, oVar);
    }

    public static boolean f(Location location, Location location2) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        if (time > 120000) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (time < -120000) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (time > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z7) {
            return true;
        }
        if (z8) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        if (accuracy > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (accuracy < 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (accuracy > 200.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (location.getProvider() != null) {
            z13 = location.getProvider().equals(location2.getProvider());
        } else {
            z13 = false;
        }
        if (z11) {
            return true;
        }
        if (z9 && !z10) {
            return true;
        }
        if (z9 && !z12 && z13) {
            return true;
        }
        return false;
    }

    @Override // t2.k
    public final boolean a(int i7, int i8) {
        return false;
    }

    @Override // t2.k
    public final void b(AbstractActivityC0032e abstractActivityC0032e, s sVar, InterfaceC1765a interfaceC1765a) {
        long j;
        float f;
        int i7;
        String str;
        boolean z7;
        boolean z8;
        if (!io.flutter.plugins.pathprovider.b.a(this.f15740d)) {
            interfaceC1765a.a(s2.b.locationServicesDisabled);
            return;
        }
        this.f15743h = sVar;
        this.f15744i = interfaceC1765a;
        h hVar = h.best;
        o oVar = this.f15739c;
        if (oVar != null) {
            float f4 = (float) oVar.f15746b;
            h hVar2 = h.lowest;
            h hVar3 = oVar.f15745a;
            if (hVar3 == hVar2) {
                j = Long.MAX_VALUE;
            } else {
                j = oVar.f15747c;
            }
            int i8 = l.f15736a[hVar3.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 != 3 && i8 != 4 && i8 != 5) {
                    i7 = 102;
                } else {
                    i7 = 100;
                }
            } else {
                i7 = 104;
            }
            f = f4;
            hVar = hVar3;
        } else {
            j = 0;
            f = 0.0f;
            i7 = 102;
        }
        long j8 = j;
        List<String> providers = this.f15737a.getProviders(true);
        if (hVar == h.lowest) {
            str = "passive";
        } else {
            str = "fused";
            if (!providers.contains("fused") || Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        if (!providers.isEmpty()) {
                            str = providers.get(0);
                        } else {
                            str = null;
                        }
                    }
                }
            }
        }
        this.f15742g = str;
        if (str == null) {
            interfaceC1765a.a(s2.b.locationServicesDisabled);
            return;
        }
        g0.c.e("intervalMillis", j8);
        if (f >= 0.0f) {
            if (f <= Float.MAX_VALUE) {
                g0.c.e("minUpdateIntervalMillis", j8);
                if (i7 != 104 && i7 != 102 && i7 != 100) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                Object[] objArr = {Integer.valueOf(i7)};
                if (z7) {
                    if (j8 == Long.MAX_VALUE && j8 == -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    g0.c.g("passive location requests must have an explicit minimum update interval", z8);
                    c0.c cVar = new c0.c(j8, i7, Math.min(j8, j8), f);
                    this.f15741e = true;
                    this.f15738b.b();
                    String str2 = this.f15742g;
                    Looper mainLooper = Looper.getMainLooper();
                    int i9 = AbstractC0623b.f8322a;
                    int i10 = Build.VERSION.SDK_INT;
                    LocationManager locationManager = this.f15737a;
                    if (i10 >= 31) {
                        AbstractC0622a.b(locationManager, str2, AbstractC0622a.c(cVar), new ExecutorC0885c(new Handler(mainLooper)), this);
                        return;
                    }
                    try {
                        if (AbstractC1740d.f15481a == null) {
                            AbstractC1740d.f15481a = Class.forName("android.location.LocationRequest");
                        }
                        if (AbstractC1740d.f15482b == null) {
                            Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", AbstractC1740d.f15481a, LocationListener.class, Looper.class);
                            AbstractC1740d.f15482b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        }
                        LocationRequest a7 = cVar.a(str2);
                        if (a7 != null) {
                            AbstractC1740d.f15482b.invoke(locationManager, a7, this, mainLooper);
                            return;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                    }
                    locationManager.requestLocationUpdates(str2, cVar.f8324b, cVar.f8326d, this, mainLooper);
                    return;
                }
                throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
    }

    @Override // t2.k
    public final void c(C0927b c0927b) {
        if (this.f15737a == null) {
            ((K5.r) c0927b.f10587a).a(Boolean.FALSE);
            return;
        }
        ((K5.r) c0927b.f10587a).a(Boolean.valueOf(io.flutter.plugins.pathprovider.b.a(this.f15740d)));
    }

    @Override // t2.k
    public final void d(K5.m mVar, K5.m mVar2) {
        LocationManager locationManager = this.f15737a;
        Location location = null;
        for (String str : locationManager.getProviders(true)) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            if (lastKnownLocation != null && f(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        mVar.b(location);
    }

    @Override // t2.k
    public final void e() {
        this.f15741e = false;
        this.f15738b.c();
        this.f15737a.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i7) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            onLocationChanged((Location) list.get(i7));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f15742g)) {
            if (this.f15741e) {
                this.f15737a.removeUpdates(this);
            }
            InterfaceC1765a interfaceC1765a = this.f15744i;
            if (interfaceC1765a != null) {
                interfaceC1765a.a(s2.b.locationServicesDisabled);
            }
            this.f15742g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
        if (i7 != 2 && i7 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (f(location, this.f)) {
            this.f = location;
            if (this.f15743h != null) {
                this.f15738b.a(location);
                this.f15743h.b(this.f);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }
}
