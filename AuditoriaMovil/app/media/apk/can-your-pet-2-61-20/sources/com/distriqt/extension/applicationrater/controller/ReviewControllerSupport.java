package com.distriqt.extension.applicationrater.controller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.distriqt.extension.applicationrater.utils.Logger;
/* loaded from: classes.dex */
public class ReviewControllerSupport {
    public static final String TAG = "ReviewControllerSupport";

    public static boolean isSupported(Context context) {
        PackageManager.PackageInfoFlags of;
        try {
            Class.forName("com.google.android.play.core.review.ReviewManagerFactory");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    context.getPackageManager().getPackageInfo("com.android.vending", of);
                    return true;
                }
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.d(TAG, "Google Play Store not found - app must be installed through Google Play", new Object[0]);
                return false;
            }
        } catch (ClassNotFoundException unused2) {
            Logger.d(TAG, "Google Play Review Library not found - check you have added the com.google.android.play library", new Object[0]);
            return false;
        }
    }
}
