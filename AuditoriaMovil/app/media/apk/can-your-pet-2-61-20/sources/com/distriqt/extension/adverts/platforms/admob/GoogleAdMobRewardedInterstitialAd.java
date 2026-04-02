package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import android.os.Handler;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.RewardedInterstitialAd;
import com.distriqt.extension.adverts.controller.ServerSideVerificationOptions;
import com.distriqt.extension.adverts.events.FullScreenContentEvent;
import com.distriqt.extension.adverts.events.PaidEvent;
import com.distriqt.extension.adverts.events.RewardedInterstitialAdEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* loaded from: classes.dex */
public class GoogleAdMobRewardedInterstitialAd extends ActivityStateListener implements RewardedInterstitialAd, OnPaidEventListener, OnUserEarnedRewardListener {
    private static final String TAG = "GoogleAdMobRewardedInterstitialAd";
    private String _adUnitId;
    private IExtensionContext _extContext;
    private final String _identifier;
    private com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd _rewardedAd;
    private String _userId;
    private boolean _isLoading = false;
    private boolean _isShowingAd = false;
    private final FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedInterstitialAd.2
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            Logger.d(GoogleAdMobRewardedInterstitialAd.TAG, "[%s]:onAdDismissedFullScreenContent()", GoogleAdMobRewardedInterstitialAd.this._identifier);
            GoogleAdMobRewardedInterstitialAd.this._rewardedAd = null;
            GoogleAdMobRewardedInterstitialAd.this._isShowingAd = false;
            GoogleAdMobRewardedInterstitialAd.this._extContext.dispatchEvent(FullScreenContentEvent.DISMISSED, FullScreenContentEvent.formatForEvent(GoogleAdMobRewardedInterstitialAd.this._identifier));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            Logger.d(GoogleAdMobRewardedInterstitialAd.TAG, "[%s]:onAdFailedToShowFullScreenContent()", GoogleAdMobRewardedInterstitialAd.this._identifier);
            GoogleAdMobRewardedInterstitialAd.this._extContext.dispatchEvent(FullScreenContentEvent.FAILED_TO_SHOW, FullScreenContentEvent.formatForErrorEvent(GoogleAdMobRewardedInterstitialAd.this._identifier, adError.getCode(), adError.getMessage()));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            Logger.d(GoogleAdMobRewardedInterstitialAd.TAG, "[%s]:onAdShowedFullScreenContent()", GoogleAdMobRewardedInterstitialAd.this._identifier);
            GoogleAdMobRewardedInterstitialAd.this._isShowingAd = true;
            GoogleAdMobRewardedInterstitialAd.this._extContext.dispatchEvent(FullScreenContentEvent.SHOW, FullScreenContentEvent.formatForEvent(GoogleAdMobRewardedInterstitialAd.this._identifier));
        }
    };
    private Handler _handler = new Handler();
    private ServerSideVerificationOptions _options = null;

    public GoogleAdMobRewardedInterstitialAd(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
    }

    public boolean destroyed() {
        return this._extContext == null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public void destroy() {
        Logger.d(TAG, "[%s]:destroy()", this._identifier);
        if (this._rewardedAd != null) {
            this._rewardedAd = null;
        }
        Handler handler = this._handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this._handler = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public String getUserId() {
        Logger.d(TAG, "[%s]:getUserId()", this._identifier);
        try {
            String str = this._userId;
            return str != null ? str : "";
        } catch (Exception e) {
            Errors.handleException(e);
            return "";
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public void setUserId(String str) {
        Logger.d(TAG, "[%s]:setUserId( %s )", this._identifier, str);
        try {
            this._userId = str;
            if (this._rewardedAd != null) {
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedInterstitialAd$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobRewardedInterstitialAd.this.m236x85ac9414();
                    }
                });
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setUserId$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedInterstitialAd  reason: not valid java name */
    public /* synthetic */ void m236x85ac9414() {
        this._rewardedAd.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(this._userId).build());
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public String getAdUnitId() {
        Logger.d(TAG, "[%s]:getUserId()", this._identifier);
        String str = this._adUnitId;
        return str != null ? str : "";
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public void setAdUnitId(String str) {
        Logger.d(TAG, "[%s]:setAdUnitId( %s )", this._identifier, str);
        this._adUnitId = str;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public void load(AdvertRequest advertRequest) {
        Logger.d(TAG, "[%s]:load( ... )", this._identifier);
        try {
            final Activity activity = this._extContext.getActivity();
            final AdRequest adRequest = GoogleAdMobUtils.toAdRequest(advertRequest);
            activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedInterstitialAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobRewardedInterstitialAd.this.m234x269d9c3b(activity, adRequest);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$load$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedInterstitialAd  reason: not valid java name */
    public /* synthetic */ void m234x269d9c3b(Activity activity, AdRequest adRequest) {
        try {
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load(activity, this._adUnitId, adRequest, new RewardedInterstitialAdLoadCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedInterstitialAd.1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd rewardedInterstitialAd) {
                    Logger.d(GoogleAdMobRewardedInterstitialAd.TAG, "[%s]:onAdLoaded()", GoogleAdMobRewardedInterstitialAd.this._identifier);
                    GoogleAdMobRewardedInterstitialAd.this._isLoading = false;
                    GoogleAdMobRewardedInterstitialAd.this._rewardedAd = rewardedInterstitialAd;
                    if (GoogleAdMobRewardedInterstitialAd.this._userId != null) {
                        GoogleAdMobRewardedInterstitialAd googleAdMobRewardedInterstitialAd = GoogleAdMobRewardedInterstitialAd.this;
                        googleAdMobRewardedInterstitialAd.setUserId(googleAdMobRewardedInterstitialAd._userId);
                    }
                    if (GoogleAdMobRewardedInterstitialAd.this._options != null) {
                        GoogleAdMobRewardedInterstitialAd googleAdMobRewardedInterstitialAd2 = GoogleAdMobRewardedInterstitialAd.this;
                        googleAdMobRewardedInterstitialAd2.setServerSideVerificationOptions(googleAdMobRewardedInterstitialAd2._options);
                    }
                    RewardItem rewardItem = rewardedInterstitialAd.getRewardItem();
                    GoogleAdMobRewardedInterstitialAd.this._extContext.dispatchEvent(RewardedInterstitialAdEvent.LOADED, RewardedInterstitialAdEvent.formatForRewardEvent(GoogleAdMobRewardedInterstitialAd.this._identifier, rewardItem.getAmount(), rewardItem.getType()));
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Logger.d(GoogleAdMobRewardedInterstitialAd.TAG, "[%s]:onAdFailedToLoad( [%d] %s )", GoogleAdMobRewardedInterstitialAd.this._identifier, Integer.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                    GoogleAdMobRewardedInterstitialAd.this._isLoading = false;
                    GoogleAdMobRewardedInterstitialAd.this._extContext.dispatchEvent(RewardedInterstitialAdEvent.ERROR, RewardedInterstitialAdEvent.formatForErrorEvent(GoogleAdMobRewardedInterstitialAd.this._identifier, loadAdError.getCode(), loadAdError.getMessage()));
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public boolean isLoaded() {
        Logger.d(TAG, "[%s]:isLoaded()", this._identifier);
        return this._rewardedAd != null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public boolean show() {
        Logger.d(TAG, "[%s]:show()", this._identifier);
        try {
            if (!this._isShowingAd && isLoaded()) {
                final boolean shouldUseImmersiveMode = GoogleAdMobUtils.shouldUseImmersiveMode(this._extContext);
                final Activity activity = this._extContext.getActivity();
                activity.runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedInterstitialAd$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobRewardedInterstitialAd.this.m237xda79aae3(shouldUseImmersiveMode, activity);
                    }
                });
                return true;
            }
            return false;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$show$2$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedInterstitialAd  reason: not valid java name */
    public /* synthetic */ void m237xda79aae3(boolean z, Activity activity) {
        this._rewardedAd.setImmersiveMode(z);
        this._rewardedAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        this._rewardedAd.setOnPaidEventListener(this);
        this._rewardedAd.show(activity, this);
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedInterstitialAd
    public void setServerSideVerificationOptions(com.distriqt.extension.adverts.controller.ServerSideVerificationOptions serverSideVerificationOptions) {
        Logger.d(TAG, "[%s]:setServerSideVerificationOptions()", this._identifier);
        this._options = serverSideVerificationOptions;
        if (this._rewardedAd == null) {
            return;
        }
        this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedInterstitialAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdMobRewardedInterstitialAd.this.m235x9b4c6c18();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setServerSideVerificationOptions$3$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedInterstitialAd  reason: not valid java name */
    public /* synthetic */ void m235x9b4c6c18() {
        ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
        if (this._options.customData != null && this._options.customData.length() > 0) {
            builder.setCustomData(this._options.customData);
        }
        if (this._options.userId != null && this._options.userId.length() > 0) {
            builder.setUserId(this._options.userId);
        }
        this._rewardedAd.setServerSideVerificationOptions(builder.build());
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onDestroy() {
        Logger.d(TAG, "onDestroy()", new Object[0]);
        destroy();
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        this._extContext.dispatchEvent(PaidEvent.PAID, PaidEvent.formatForEvent(this._identifier, adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType(), this._rewardedAd.getResponseInfo() != null ? this._rewardedAd.getResponseInfo().getMediationAdapterClassName() : ""));
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        Logger.d(TAG, "[%s]:onUserEarnedReward()", this._identifier);
        this._extContext.dispatchEvent(RewardedInterstitialAdEvent.REWARD, RewardedInterstitialAdEvent.formatForRewardEvent(this._identifier, rewardItem.getAmount(), rewardItem.getType()));
    }
}
