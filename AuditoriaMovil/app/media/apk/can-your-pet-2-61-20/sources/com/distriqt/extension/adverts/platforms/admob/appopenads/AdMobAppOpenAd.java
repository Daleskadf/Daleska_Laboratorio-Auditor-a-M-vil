package com.distriqt.extension.adverts.platforms.admob.appopenads;

import android.app.Activity;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd;
import com.distriqt.extension.adverts.events.AppOpenAdEvent;
import com.distriqt.extension.adverts.events.FullScreenContentEvent;
import com.distriqt.extension.adverts.events.PaidEvent;
import com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUtils;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
/* loaded from: classes.dex */
public class AdMobAppOpenAd implements AdvertAppOpenAd, OnPaidEventListener {
    public static final String TAG = "AdMobAppOpenAd";
    private IExtensionContext _extContext;
    private final String _identifier;
    private String _adUnitId = "";
    private AppOpenAd _appOpenAd = null;
    private boolean _isShowingAd = false;
    private final AppOpenAd.AppOpenAdLoadCallback _loadCallback = new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.appopenads.AdMobAppOpenAd.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AppOpenAd appOpenAd) {
            Logger.d(AdMobAppOpenAd.TAG, "[%s]:onAdLoaded()", AdMobAppOpenAd.this._identifier);
            AdMobAppOpenAd.this._appOpenAd = appOpenAd;
            AdMobAppOpenAd.this._extContext.dispatchEvent(AppOpenAdEvent.LOADED, AppOpenAdEvent.formatForEvent(AdMobAppOpenAd.this._identifier));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Logger.d(AdMobAppOpenAd.TAG, "[%s]:onAdFailedToLoad( [%d] %s )", AdMobAppOpenAd.this._identifier, Integer.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            AdMobAppOpenAd.this._extContext.dispatchEvent(AppOpenAdEvent.ERROR, AppOpenAdEvent.formatForErrorEvent(AdMobAppOpenAd.this._identifier, loadAdError.getCode(), loadAdError.getMessage()));
        }
    };
    private final FullScreenContentCallback _fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.appopenads.AdMobAppOpenAd.2
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            Logger.d(AdMobAppOpenAd.TAG, "[%s]:onAdDismissedFullScreenContent()", AdMobAppOpenAd.this._identifier);
            AdMobAppOpenAd.this._appOpenAd = null;
            AdMobAppOpenAd.this._isShowingAd = false;
            AdMobAppOpenAd.this._extContext.dispatchEvent(FullScreenContentEvent.DISMISSED, FullScreenContentEvent.formatForEvent(AdMobAppOpenAd.this._identifier));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            Logger.d(AdMobAppOpenAd.TAG, "[%s]:onAdFailedToShowFullScreenContent()", AdMobAppOpenAd.this._identifier);
            AdMobAppOpenAd.this._extContext.dispatchEvent(FullScreenContentEvent.FAILED_TO_SHOW, FullScreenContentEvent.formatForErrorEvent(AdMobAppOpenAd.this._identifier, adError.getCode(), adError.getMessage()));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            Logger.d(AdMobAppOpenAd.TAG, "[%s]:onAdShowedFullScreenContent()", AdMobAppOpenAd.this._identifier);
            AdMobAppOpenAd.this._isShowingAd = true;
            AdMobAppOpenAd.this._extContext.dispatchEvent(FullScreenContentEvent.SHOW, FullScreenContentEvent.formatForEvent(AdMobAppOpenAd.this._identifier));
        }
    };

    public AdMobAppOpenAd(IExtensionContext iExtensionContext, String str) {
        Logger.d(TAG, "AdMobAppOpenAd()", new Object[0]);
        this._extContext = iExtensionContext;
        this._identifier = str;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd
    public void destroy() {
        Logger.d(TAG, "[%s]:destroy()", this._identifier);
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd
    public void setAdUnitId(String str) {
        Logger.d(TAG, "[%s]:setAdUnitId( %s )", this._identifier, str);
        this._adUnitId = str;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd
    public String getAdUnitId() {
        return this._adUnitId;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd
    public boolean isLoaded() {
        return this._appOpenAd != null;
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd
    public void load(final AdvertRequest advertRequest, final int i) {
        String str = TAG;
        Logger.d(str, "[%s]:load( ..., %d )", this._identifier, Integer.valueOf(i));
        if (isLoaded()) {
            Logger.d(str, "[%s]:load(): ERROR: ALREADY LOADED", this._identifier);
            return;
        }
        String str2 = this._adUnitId;
        if (str2 == null || str2.length() == 0) {
            Logger.d(str, "[%s]:load(): ERROR: AD UNIT ID INVALID", this._identifier);
            return;
        }
        Logger.d(str, "[%s]:load(): START", this._identifier);
        final Activity activity = this._extContext.getActivity();
        this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.appopenads.AdMobAppOpenAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AdMobAppOpenAd.this.m248x44c8e714(activity, advertRequest, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$load$0$com-distriqt-extension-adverts-platforms-admob-appopenads-AdMobAppOpenAd  reason: not valid java name */
    public /* synthetic */ void m248x44c8e714(Activity activity, AdvertRequest advertRequest, int i) {
        AppOpenAd.load(activity, this._adUnitId, GoogleAdMobUtils.toAdRequest(advertRequest), i, this._loadCallback);
    }

    @Override // com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd
    public boolean show() {
        String str = TAG;
        Logger.d(str, "[%s]:show()", this._identifier);
        if (this._isShowingAd || !isLoaded()) {
            Logger.d(str, "[%s]:show() ERROR: ALREADY SHOWING OR NOT LOADED", this._identifier);
            return false;
        }
        this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.appopenads.AdMobAppOpenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdMobAppOpenAd.this.m249xd5521dbc();
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$show$1$com-distriqt-extension-adverts-platforms-admob-appopenads-AdMobAppOpenAd  reason: not valid java name */
    public /* synthetic */ void m249xd5521dbc() {
        this._appOpenAd.setFullScreenContentCallback(this._fullScreenContentCallback);
        this._appOpenAd.setOnPaidEventListener(this);
        this._appOpenAd.show(this._extContext.getActivity());
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this._extContext.dispatchEvent(PaidEvent.PAID, PaidEvent.formatForEvent(this._identifier, adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType(), this._appOpenAd.getResponseInfo() != null ? this._appOpenAd.getResponseInfo().getMediationAdapterClassName() : ""));
    }
}
