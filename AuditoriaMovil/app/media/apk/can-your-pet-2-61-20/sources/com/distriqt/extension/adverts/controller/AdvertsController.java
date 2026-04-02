package com.distriqt.extension.adverts.controller;

import android.content.Intent;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.platforms.admob.GoogleAdMob;
import com.distriqt.extension.adverts.platforms.admob.GoogleAdMobSupport;
import com.distriqt.extension.adverts.platforms.huawei.HuaweiAds;
import com.distriqt.extension.adverts.platforms.huawei.HuaweiAdsSupport;
import com.distriqt.extension.adverts.utils.Logger;
/* loaded from: classes.dex */
public class AdvertsController extends ActivityStateListener {
    public static final String TAG = "AdvertsController";
    private IExtensionContext _extContext;
    private AdvertPlatform _platform = null;

    public AdvertsController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.dispose();
        }
    }

    public Boolean isPlatformSupported(String str) {
        Logger.d(TAG, "isPlatformSupported( %s )", str);
        if (str.equals(AdvertPlatforms.ADVERT_PLATFORM_ADMOB)) {
            return Boolean.valueOf(GoogleAdMobSupport.isSupported(this._extContext.getActivity()));
        }
        if (str.equals(AdvertPlatforms.ADVERT_PLATFORM_DOUBLECLICK) || str.equals(AdvertPlatforms.ADVERT_PLATFORM_IAD) || !str.equals(AdvertPlatforms.ADVERT_PLATFORM_HUAWEI_ADS)) {
            return false;
        }
        return Boolean.valueOf(HuaweiAdsSupport.isSupported(this._extContext.getActivity()));
    }

    public void setup(String str, String str2) {
        String str3 = TAG;
        Logger.d(str3, "setup( %s, %s )", str, str2);
        if (this._platform == null) {
            if (str.equals(AdvertPlatforms.ADVERT_PLATFORM_ADMOB)) {
                this._platform = new GoogleAdMob(this._extContext, str2);
            } else if (str.equals(AdvertPlatforms.ADVERT_PLATFORM_HUAWEI_ADS)) {
                this._platform = new HuaweiAds(this._extContext, str2);
            } else {
                Logger.d(str3, "UNSUPPORTED PLATFORM", new Object[0]);
            }
        }
    }

    public void initialise() {
        Logger.d(TAG, "initialise()", new Object[0]);
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.initialise();
        }
    }

    public void setAppVolume(double d) {
        Logger.d(TAG, "setAppVolume( %f )", Double.valueOf(d));
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.setAppVolume(d);
        }
    }

    public void setAppMuted(boolean z) {
        Logger.d(TAG, "setAppMuted( %b )", Boolean.valueOf(z));
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.setAppMuted(z);
        }
    }

    public AdvertPlatform platform() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            return advertPlatform;
        }
        return null;
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStart() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onStart();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStop() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onStop();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onPause() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onPause();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onResume() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onResume();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onDestroy() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onDestroy();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onRestart() {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onRestart();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        AdvertPlatform advertPlatform = this._platform;
        if (advertPlatform != null) {
            advertPlatform.onActivityResult(i, i2, intent);
        }
    }
}
