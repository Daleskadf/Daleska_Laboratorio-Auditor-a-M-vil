package com.distriqt.extension.inappbilling.controller.catappult;

import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public class CatappultControllerSupport {
    public static final String TAG = "CatappultControllerSupport";

    public static boolean supported(Context context) {
        try {
            Class.forName("com.appcoins.sdk.billing.CatapultAppcoinsBilling");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    public static boolean isAppcoinsAppInstalled(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.appcoins.wallet", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
