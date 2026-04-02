package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;
/* loaded from: classes.dex */
public class p {

    /* renamed from: d  reason: collision with root package name */
    public static p f1018d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1019a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f1020b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1021c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1022a;

        /* renamed from: b  reason: collision with root package name */
        public long f1023b;

        /* renamed from: c  reason: collision with root package name */
        public long f1024c;

        /* renamed from: d  reason: collision with root package name */
        public long f1025d;

        /* renamed from: e  reason: collision with root package name */
        public long f1026e;

        /* renamed from: f  reason: collision with root package name */
        public long f1027f;
    }

    public p(Context context, LocationManager locationManager) {
        this.f1019a = context;
        this.f1020b = locationManager;
    }

    public static p a(Context context) {
        if (f1018d == null) {
            Context applicationContext = context.getApplicationContext();
            f1018d = new p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1018d;
    }

    public final Location b() {
        Location location;
        Location location2 = null;
        if (p.m.b(this.f1019a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (p.m.b(this.f1019a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    public final Location c(String str) {
        try {
            if (this.f1020b.isProviderEnabled(str)) {
                return this.f1020b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f1021c;
        if (e()) {
            return aVar.f1022a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f1022a;
        }
        int i10 = Calendar.getInstance().get(11);
        if (i10 >= 6 && i10 < 22) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (this.f1021c.f1027f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final void f(Location location) {
        boolean z10;
        long j10;
        long j11;
        a aVar = this.f1021c;
        long currentTimeMillis = System.currentTimeMillis();
        o b10 = o.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j12 = b10.f1015a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (b10.f1017c == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j13 = b10.f1016b;
        long j14 = b10.f1015a;
        boolean z11 = z10;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j15 = b10.f1016b;
        if (j13 != -1 && j14 != -1) {
            if (currentTimeMillis > j14) {
                j11 = 0 + j15;
            } else if (currentTimeMillis > j13) {
                j11 = 0 + j14;
            } else {
                j11 = 0 + j13;
            }
            j10 = j11 + 60000;
        } else {
            j10 = 43200000 + currentTimeMillis;
        }
        aVar.f1022a = z11;
        aVar.f1023b = j12;
        aVar.f1024c = j13;
        aVar.f1025d = j14;
        aVar.f1026e = j15;
        aVar.f1027f = j10;
    }
}
