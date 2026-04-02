package t2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15751a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f15752b;

    /* renamed from: c  reason: collision with root package name */
    public final o f15753c;

    /* renamed from: d  reason: collision with root package name */
    public final p f15754d;

    /* renamed from: e  reason: collision with root package name */
    public final q f15755e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public double f15756g;

    /* renamed from: h  reason: collision with root package name */
    public double f15757h;

    /* renamed from: i  reason: collision with root package name */
    public Calendar f15758i;
    public boolean j = false;

    /* JADX WARN: Type inference failed for: r2v4, types: [t2.p] */
    public r(Context context, o oVar) {
        this.f15751a = context;
        this.f15753c = oVar;
        this.f15752b = (LocationManager) context.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f15754d = new OnNmeaMessageListener() { // from class: t2.p
                @Override // android.location.OnNmeaMessageListener
                public final void onNmeaMessage(String str, long j) {
                    r rVar = r.this;
                    rVar.getClass();
                    if (str.trim().matches("^\\$..GGA.*$")) {
                        rVar.f = str;
                        rVar.f15758i = Calendar.getInstance();
                    }
                }
            };
            this.f15755e = new q(this);
        }
    }

    public final void a(Location location) {
        o oVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f15756g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f15757h);
        if (this.f != null && (oVar = this.f15753c) != null && this.j) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, -5);
            Calendar calendar2 = this.f15758i;
            if ((calendar2 == null || !calendar2.before(calendar)) && oVar.f15748d) {
                String[] split = this.f.split(",");
                String str = split[0];
                if (this.f.trim().matches("^\\$..GGA.*$") && split.length > 9 && !split[9].isEmpty()) {
                    double parseDouble = Double.parseDouble(split[9]);
                    if (location.getExtras() == null) {
                        location.setExtras(Bundle.EMPTY);
                    }
                    location.getExtras().putDouble("geolocator_mslAltitude", parseDouble);
                }
            }
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (!this.j && this.f15753c != null && Build.VERSION.SDK_INT >= 24 && (locationManager = this.f15752b) != null && this.f15751a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            locationManager.addNmeaListener(this.f15754d, (Handler) null);
            locationManager.registerGnssStatusCallback(this.f15755e, (Handler) null);
            this.j = true;
        }
    }

    public final void c() {
        LocationManager locationManager;
        if (this.f15753c != null && Build.VERSION.SDK_INT >= 24 && (locationManager = this.f15752b) != null) {
            locationManager.removeNmeaListener(this.f15754d);
            locationManager.unregisterGnssStatusCallback(this.f15755e);
            this.j = false;
        }
    }
}
