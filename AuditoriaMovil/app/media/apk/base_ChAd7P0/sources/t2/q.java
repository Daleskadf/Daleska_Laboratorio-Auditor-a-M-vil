package t2;

import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
/* loaded from: classes.dex */
public final class q extends GnssStatus$Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f15750a;

    public q(r rVar) {
        this.f15750a = rVar;
    }

    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        int satelliteCount;
        boolean usedInFix;
        r rVar = this.f15750a;
        satelliteCount = gnssStatus.getSatelliteCount();
        rVar.f15756g = satelliteCount;
        this.f15750a.f15757h = 0.0d;
        for (int i7 = 0; i7 < this.f15750a.f15756g; i7++) {
            usedInFix = gnssStatus.usedInFix(i7);
            if (usedInFix) {
                this.f15750a.f15757h += 1.0d;
            }
        }
    }
}
