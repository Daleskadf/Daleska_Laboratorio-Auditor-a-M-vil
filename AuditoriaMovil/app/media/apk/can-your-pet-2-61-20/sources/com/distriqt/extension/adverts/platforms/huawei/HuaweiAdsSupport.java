package com.distriqt.extension.adverts.platforms.huawei;

import android.app.Activity;
import com.distriqt.extension.adverts.utils.Errors;
import com.huawei.hms.api.HuaweiApiAvailability;
/* loaded from: classes.dex */
public class HuaweiAdsSupport {
    public static boolean isSupported(Activity activity) {
        try {
            Class.forName("com.huawei.hms.ads.HwAds");
            return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(activity) == 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            Errors.handleException(e2);
            return false;
        }
    }

    public static boolean isAdsIdentifierSupported(Activity activity) {
        try {
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
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
