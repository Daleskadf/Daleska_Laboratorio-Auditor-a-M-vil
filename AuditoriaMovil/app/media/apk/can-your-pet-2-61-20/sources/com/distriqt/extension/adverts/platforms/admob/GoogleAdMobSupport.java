package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import com.distriqt.extension.adverts.utils.Errors;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* loaded from: classes.dex */
public class GoogleAdMobSupport {
    public static boolean isSupported(Activity activity) {
        try {
            Class.forName("com.google.android.gms.ads.MobileAds");
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(activity) == 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            Errors.handleException(e2);
            return false;
        }
    }
}
