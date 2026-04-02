package c0;

import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import com.google.android.gms.common.api.f;
import d0.ExecutorC0885c;
import t2.m;
/* renamed from: c0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0622a {
    public static boolean a(Location location) {
        return location.isMock();
    }

    public static void b(LocationManager locationManager, String str, LocationRequest locationRequest, ExecutorC0885c executorC0885c, m mVar) {
        locationManager.requestLocationUpdates(str, locationRequest, executorC0885c, mVar);
    }

    public static LocationRequest c(c cVar) {
        LocationRequest.Builder quality = new LocationRequest.Builder(cVar.f8324b).setQuality(cVar.f8323a);
        long j = cVar.f8325c;
        if (j == -1) {
            j = cVar.f8324b;
        }
        return quality.setMinUpdateIntervalMillis(j).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(f.API_PRIORITY_OTHER).setMinUpdateDistanceMeters(cVar.f8326d).setMaxUpdateDelayMillis(0L).build();
    }
}
