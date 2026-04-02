package com.distriqt.extension.adverts.platforms.admob;

import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class GoogleAdMobUserMessagingPlatformSupport {
    private static final String TAG = "GoogleAdMobUserMessagingPlatformSupport";

    public static boolean isSupported() {
        try {
            Class.forName("com.google.android.ump.UserMessagingPlatform");
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            Errors.handleException(e2);
            return false;
        }
    }

    public static boolean isAdvertisingIdAvailable() {
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            Errors.handleException(e2);
            return false;
        }
    }
}
