package com.distriqt.extension.inappbilling.controller.appgallery;

import android.content.Context;
import android.os.Build;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class AppGalleryControllerSupport {
    public static final String TAG = "AppGalleryControllerSupport";

    public static boolean supported(Context context) {
        String installerPackageName;
        try {
            Class.forName("com.huawei.hms.iap.Iap");
            Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            Logger.d(TAG, "installerPackageName: %s", installerPackageName);
        } catch (ClassNotFoundException unused) {
        }
        if (installerPackageName == null || !installerPackageName.contains("huawei")) {
            return Build.MANUFACTURER.equalsIgnoreCase("huawei");
        }
        return true;
    }

    public static boolean inAppUpdatesSupported(Context context) {
        if (supported(context)) {
            try {
                Class.forName("com.huawei.hms.jos.AppUpdateClient");
                return true;
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }
}
