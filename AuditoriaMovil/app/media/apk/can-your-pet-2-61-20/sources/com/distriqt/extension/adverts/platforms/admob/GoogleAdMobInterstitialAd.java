package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import android.os.Handler;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.InterstitialAd;
import com.distriqt.extension.adverts.events.FullScreenContentEvent;
import com.distriqt.extension.adverts.events.InterstitialEvent;
import com.distriqt.extension.adverts.events.PaidEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
/* loaded from: classes.dex */
public class GoogleAdMobInterstitialAd extends FullScreenContentCallback implements InterstitialAd, OnPaidEventListener {
    private static final String TAG = "GoogleAdMobInterstitialAd";
    private IExtensionContext _extContext;
    private final String _identifier;
    private com.google.android.gms.ads.interstitial.InterstitialAd _interstitialAd;
    private String _adUnitId = "";
    private boolean _isLoading = false;
    private boolean _isShowingAd = false;
    private Handler _handler = new Handler();

    public GoogleAdMobInterstitialAd(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public void destroy() {
        Logger.d(TAG, "[%s]: destroy()", this._identifier);
        if (this._interstitialAd != null) {
            this._interstitialAd = null;
        }
        Handler handler = this._handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this._handler = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public void setAdUnitId(String str) {
        Logger.d(TAG, "[%s]: setAdUnitId( %s )", this._identifier, str);
        this._adUnitId = str;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public String getAdUnitId() {
        Logger.d(TAG, "[%s]: getAdUnitId()", this._identifier);
        String str = this._adUnitId;
        return str != null ? str : "";
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean isLoading() {
        Logger.d(TAG, "[%s]: isLoading()", this._identifier);
        return this._isLoading;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public void load(AdvertRequest advertRequest) {
        String str = TAG;
        Logger.d(str, "[%s]: load()", this._identifier);
        try {
            final AdRequest adRequest = GoogleAdMobUtils.toAdRequest(advertRequest);
            if (isLoaded()) {
                Logger.d(str, "[%s]:load(): ERROR: ALREADY LOADED", this._identifier);
                return;
            }
            String str2 = this._adUnitId;
            if (str2 != null && str2.length() != 0) {
                this._isLoading = true;
                final Activity activity = this._extContext.getActivity();
                activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobInterstitialAd$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobInterstitialAd.this.m228x87dbb96e(activity, adRequest);
                    }
                });
                return;
            }
            Logger.d(str, "[%s]:load(): ERROR: AD UNIT ID INVALID", this._identifier);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$load$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobInterstitialAd  reason: not valid java name */
    public /* synthetic */ void m228x87dbb96e(Activity activity, AdRequest adRequest) {
        try {
            com.google.android.gms.ads.interstitial.InterstitialAd.load(activity, this._adUnitId, adRequest, new InterstitialAdLoadCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobInterstitialAd.1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                    Logger.d(GoogleAdMobInterstitialAd.TAG, "[%s]:onAdLoaded()", GoogleAdMobInterstitialAd.this._identifier);
                    GoogleAdMobInterstitialAd.this._isLoading = false;
                    GoogleAdMobInterstitialAd.this._interstitialAd = interstitialAd;
                    if (GoogleAdMobInterstitialAd.this._extContext != null) {
                        GoogleAdMobInterstitialAd.this._extContext.dispatchEvent(InterstitialEvent.LOADED, InterstitialEvent.formatForEvent(GoogleAdMobInterstitialAd.this._identifier));
                    }
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Logger.d(GoogleAdMobInterstitialAd.TAG, "[%s]:onAdFailedToLoad( [%d] %s )", GoogleAdMobInterstitialAd.this._identifier, Integer.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                    GoogleAdMobInterstitialAd.this._isLoading = false;
                    if (GoogleAdMobInterstitialAd.this._extContext != null) {
                        GoogleAdMobInterstitialAd.this._extContext.dispatchEvent(InterstitialEvent.ERROR, InterstitialEvent.formatForErrorEvent(GoogleAdMobInterstitialAd.this._identifier, loadAdError.getCode(), loadAdError.getMessage()));
                    }
                }
            });
        } catch (Exception e) {
            IExtensionContext iExtensionContext = this._extContext;
            if (iExtensionContext != null) {
                iExtensionContext.dispatchEvent(InterstitialEvent.ERROR, InterstitialEvent.formatForErrorEvent(this._identifier, 0, e.getMessage()));
            }
        }
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean isLoaded() {
        Logger.d(TAG, "[%s]: isLoaded()", this._identifier);
        return this._interstitialAd != null;
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean show() {
        Logger.d(TAG, "[%s]: show()", this._identifier);
        if (this._isShowingAd || !isLoaded()) {
            return false;
        }
        final Activity activity = this._extContext.getActivity();
        final boolean shouldUseImmersiveMode = GoogleAdMobUtils.shouldUseImmersiveMode(this._extContext);
        activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdMobInterstitialAd.this.m229x1864f016(shouldUseImmersiveMode, activity);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$show$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobInterstitialAd  reason: not valid java name */
    public /* synthetic */ void m229x1864f016(boolean z, Activity activity) {
        try {
            this._interstitialAd.setImmersiveMode(z);
            this._interstitialAd.setFullScreenContentCallback(this);
            this._interstitialAd.setOnPaidEventListener(this);
            this._interstitialAd.show(activity);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.InterstitialAd
    public boolean hide() {
        Logger.d(TAG, "[%s]: hide()", this._identifier);
        return false;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        Logger.d(TAG, "[%s]:onAdDismissedFullScreenContent()", this._identifier);
        this._interstitialAd = null;
        this._isShowingAd = false;
        this._extContext.dispatchEvent(FullScreenContentEvent.DISMISSED, FullScreenContentEvent.formatForEvent(this._identifier));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        Logger.d(TAG, "[%s]:onAdFailedToShowFullScreenContent()", this._identifier);
        this._extContext.dispatchEvent(FullScreenContentEvent.FAILED_TO_SHOW, FullScreenContentEvent.formatForErrorEvent(this._identifier, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        Logger.d(TAG, "[%s]:onAdShowedFullScreenContent()", this._identifier);
        this._isShowingAd = true;
        this._extContext.dispatchEvent(FullScreenContentEvent.SHOW, FullScreenContentEvent.formatForEvent(this._identifier));
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this._extContext.dispatchEvent(PaidEvent.PAID, PaidEvent.formatForEvent(this._identifier, adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType(), this._interstitialAd.getResponseInfo() != null ? this._interstitialAd.getResponseInfo().getMediationAdapterClassName() : ""));
    }
}
