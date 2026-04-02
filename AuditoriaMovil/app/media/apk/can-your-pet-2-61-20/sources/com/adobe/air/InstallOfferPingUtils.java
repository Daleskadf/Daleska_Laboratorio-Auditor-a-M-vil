package com.adobe.air;

import android.app.Activity;
import android.app.UiModeManager;
/* loaded from: classes.dex */
public class InstallOfferPingUtils {
    private static final String LOG_TAG = "InstallOfferPingUtils";

    public static void PingAndExit(Activity activity, String str, boolean z, boolean z2, boolean z3) {
    }

    private static boolean isAndroidTV(Activity activity) {
        return ((UiModeManager) activity.getSystemService("uimode")).getCurrentModeType() == 4;
    }
}
