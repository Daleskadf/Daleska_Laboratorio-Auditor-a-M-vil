package t2;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import s2.InterfaceC1765a;
/* loaded from: classes.dex */
public final class d extends p3.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f15721a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f15722b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f15723c;

    public d(f fVar, o oVar, Context context) {
        this.f15723c = fVar;
        this.f15721a = oVar;
        this.f15722b = context;
    }

    @Override // p3.l
    public final synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
        boolean z7;
        InterfaceC1765a interfaceC1765a;
        if (locationAvailability.f9424d < 1000) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            f fVar = this.f15723c;
            Context context = this.f15722b;
            fVar.getClass();
            if (!io.flutter.plugins.pathprovider.b.a(context) && (interfaceC1765a = this.f15723c.f15730g) != null) {
                interfaceC1765a.a(s2.b.locationServicesDisabled);
            }
        }
    }

    @Override // p3.l
    public final synchronized void onLocationResult(LocationResult locationResult) {
        Location location;
        if (this.f15723c.f15731h == null) {
            Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
            f fVar = this.f15723c;
            fVar.f15727c.removeLocationUpdates(fVar.f15726b);
            InterfaceC1765a interfaceC1765a = this.f15723c.f15730g;
            if (interfaceC1765a != null) {
                interfaceC1765a.a(s2.b.errorWhileAcquiringPosition);
            }
            return;
        }
        List list = locationResult.f9440a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        if (this.f15721a != null) {
            location.getExtras().putBoolean("geolocator_use_mslAltitude", this.f15721a.f15748d);
        }
        this.f15723c.f15728d.a(location);
        this.f15723c.f15731h.b(location);
    }
}
