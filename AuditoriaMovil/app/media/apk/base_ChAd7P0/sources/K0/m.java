package K0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* loaded from: classes.dex */
public final class m extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final o f2498a;

    public m(o oVar) {
        this.f2498a = oVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z7;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i7 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z7 = false;
        } else {
            z7 = true;
        }
        o oVar = this.f2498a;
        if (z7) {
            i7 = 10;
        }
        o.a(i7, oVar);
    }
}
