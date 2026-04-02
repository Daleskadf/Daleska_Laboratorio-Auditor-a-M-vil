package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public abstract class zzr extends zzw implements zzs {
    public static zzs zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof zzs ? (zzs) queryLocalInterface : new zzq(iBinder);
    }
}
