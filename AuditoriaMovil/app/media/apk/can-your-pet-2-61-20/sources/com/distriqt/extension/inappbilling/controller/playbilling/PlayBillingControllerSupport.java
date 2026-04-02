package com.distriqt.extension.inappbilling.controller.playbilling;

import android.content.Context;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class PlayBillingControllerSupport {
    public static final String TAG = "PlayBillingControllerSupport";

    public static boolean supported(Context context) {
        try {
            Class.forName("com.android.billingclient.api.BillingClient");
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            Logger.d(TAG, "installerPackageName: %s", installerPackageName);
            if (installerPackageName != null) {
                installerPackageName.contains("com.android.vending");
            }
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Exception unused2) {
        }
        return true;
    }

    public static boolean inAppUpdatesSupported(Context context) {
        if (supported(context)) {
            try {
                Class.forName("com.google.android.play.core.appupdate.AppUpdateManagerFactory");
                return true;
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }
}
