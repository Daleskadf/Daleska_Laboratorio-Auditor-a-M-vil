package com.distriqt.extension.inappbilling.controller.samsung;

import android.content.Context;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class SamsungIAPControllerSupport {
    public static final String TAG = "SamsungIAPControllerSupport";

    public static boolean inAppUpdatesSupported(Context context) {
        return false;
    }

    public static boolean supported(Context context) {
        try {
            Class.forName("com.samsung.android.sdk.iap.lib.activity.PaymentActivity");
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            Logger.d(TAG, "installerPackageName: %s", installerPackageName);
            if (installerPackageName != null) {
                installerPackageName.contains("com.sec.android.app.samsungapps");
            }
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Exception unused2) {
        }
        return true;
    }
}
