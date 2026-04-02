package com.distriqt.extension.adverts.platforms.admob.appopenads;

import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAds;
import com.distriqt.extension.adverts.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class AdMobAppOpenAds implements AdvertAppOpenAds {
    public static final String TAG = "AdMobAppOpenAds";
    private HashMap<String, AdMobAppOpenAd> _appOpenAds = new HashMap<>();
    private IExtensionContext _extContext;

    public AdMobAppOpenAds(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public void dispose() {
        Logger.d(TAG, "dispose()", new Object[0]);
        for (Map.Entry<String, AdMobAppOpenAd> entry : this._appOpenAds.entrySet()) {
            entry.getValue().destroy();
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAds
    public String createAppOpenAd() {
        String str = TAG;
        Logger.d(str, "createAppOpenAd()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        AdMobAppOpenAd adMobAppOpenAd = new AdMobAppOpenAd(this._extContext, uuid);
        Logger.d(str, "createAppOpenAd(): created with identifier: %s", uuid);
        this._appOpenAds.put(uuid, adMobAppOpenAd);
        return uuid;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAds
    public void destroyAppOpenAd(String str) {
        Logger.d(TAG, "destroyAppOpenAd( %s )", str);
        AdMobAppOpenAd adMobAppOpenAd = (AdMobAppOpenAd) getAppOpenAd(str);
        if (adMobAppOpenAd != null) {
            adMobAppOpenAd.destroy();
            this._appOpenAds.remove(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAds
    public AdvertAppOpenAd getAppOpenAd(String str) {
        Logger.d(TAG, "getAppOpenAd( %s )", str);
        if (this._appOpenAds.containsKey(str)) {
            return this._appOpenAds.get(str);
        }
        return null;
    }
}
