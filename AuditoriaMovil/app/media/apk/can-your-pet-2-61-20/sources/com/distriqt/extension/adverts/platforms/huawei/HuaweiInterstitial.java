package com.distriqt.extension.adverts.platforms.huawei;

import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.InterstitialAd;
import com.distriqt.extension.adverts.events.FullScreenContentEvent;
import com.distriqt.extension.adverts.events.InterstitialEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.huawei.hms.ads.AdListener;
/* loaded from: classes.dex */
public class HuaweiInterstitial extends AdListener implements InterstitialAd {
    private static final String TAG = "HuaweiInterstitial";
    private IExtensionContext _extContext;
    private String _identifier;
    private com.huawei.hms.ads.InterstitialAd _interstitialAd;

    public HuaweiInterstitial(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
        com.huawei.hms.ads.InterstitialAd interstitialAd = new com.huawei.hms.ads.InterstitialAd(this._extContext.getActivity());
        this._interstitialAd = interstitialAd;
        interstitialAd.setAdListener(this);
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public void destroy() {
        com.huawei.hms.ads.InterstitialAd interstitialAd = this._interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdListener((AdListener) null);
            this._interstitialAd = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public void setAdUnitId(String str) {
        com.huawei.hms.ads.InterstitialAd interstitialAd = this._interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdId(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public String getAdUnitId() {
        com.huawei.hms.ads.InterstitialAd interstitialAd = this._interstitialAd;
        return interstitialAd != null ? interstitialAd.getAdId() : "";
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean isLoading() {
        com.huawei.hms.ads.InterstitialAd interstitialAd = this._interstitialAd;
        if (interstitialAd != null) {
            return interstitialAd.isLoading();
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public void load(AdvertRequest advertRequest) {
        Logger.d(TAG, "[%s]: load()", this._identifier);
        try {
            if (this._interstitialAd != null) {
                this._interstitialAd.loadAd(HuaweiAdsUtils.toAdParam(advertRequest));
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean isLoaded() {
        com.huawei.hms.ads.InterstitialAd interstitialAd = this._interstitialAd;
        if (interstitialAd != null) {
            return interstitialAd.isLoaded();
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean show() {
        Logger.d(TAG, "[%s]: show()", this._identifier);
        com.huawei.hms.ads.InterstitialAd interstitialAd = this._interstitialAd;
        if (interstitialAd != null) {
            try {
                if (interstitialAd.isLoaded()) {
                    this._interstitialAd.show(this._extContext.getActivity());
                    return true;
                }
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean hide() {
        Logger.d(TAG, "[%s]: hide()", this._identifier);
        return false;
    }

    public void onAdClosed() {
        Logger.d(TAG, "onAdClosed()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(FullScreenContentEvent.DISMISSED, FullScreenContentEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAdLeave() {
        Logger.d(TAG, "onAdLeave()", new Object[0]);
    }

    public void onAdOpened() {
        Logger.d(TAG, "onAdOpened()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(FullScreenContentEvent.SHOW, FullScreenContentEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAdLoaded() {
        Logger.d(TAG, "onAdLoaded()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(InterstitialEvent.LOADED, InterstitialEvent.formatForEvent(this._identifier));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAdFailed(int i) {
        Logger.d(TAG, "onAdFailed()", new Object[0]);
        try {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(InterstitialEvent.ERROR, InterstitialEvent.formatForErrorEvent(this._identifier, i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAdClicked() {
        Logger.d(TAG, "onAdClicked()", new Object[0]);
    }

    public void onAdImpression() {
        Logger.d(TAG, "onAdImpression()", new Object[0]);
    }
}
