package com.distriqt.extension.inappbilling.controller.amazon;

import android.content.Context;
import android.os.Build;
import com.distriqt.extension.applicationrater.controller.ApplicationRaterController;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class AmazonBillingControllerSupport {
    public static final String TAG = "AmazonBillingControllerSupport";

    public static boolean supported(Context context) {
        String installerPackageName;
        try {
            Class.forName("com.amazon.device.iap.PurchasingService");
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            Logger.d(TAG, "installerPackageName: %s", installerPackageName);
        } catch (ClassNotFoundException unused) {
        }
        if (installerPackageName == null || !installerPackageName.contains(ApplicationRaterController.STORE_AMAZON)) {
            return Build.MANUFACTURER.equalsIgnoreCase(ApplicationRaterController.STORE_AMAZON);
        }
        return true;
    }
}
