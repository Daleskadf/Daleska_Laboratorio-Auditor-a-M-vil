package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import android.os.Handler;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.RewardedVideoAd;
import com.distriqt.extension.adverts.controller.ServerSideVerificationOptions;
import com.distriqt.extension.adverts.events.FullScreenContentEvent;
import com.distriqt.extension.adverts.events.PaidEvent;
import com.distriqt.extension.adverts.events.RewardedVideoAdEvent;
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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
/* loaded from: classes.dex */
public class GoogleAdMobRewardedVideoAd extends ActivityStateListener implements RewardedVideoAd, OnPaidEventListener, OnUserEarnedRewardListener {
    private static final String TAG = "GoogleAdMobRewardedVideoAd";
    private String _adUnitId;
    private IExtensionContext _extContext;
    private final String _identifier;
    private ServerSideVerificationOptions _options;
    private RewardedAd _rewardedVideoAd;
    private String _userId;
    private boolean _isLoading = false;
    private boolean _isShowingAd = false;
    private final FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedVideoAd.2
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            Logger.d(GoogleAdMobRewardedVideoAd.TAG, "[%s]:onAdDismissedFullScreenContent()", GoogleAdMobRewardedVideoAd.this._identifier);
            GoogleAdMobRewardedVideoAd.this._rewardedVideoAd = null;
            GoogleAdMobRewardedVideoAd.this._isShowingAd = false;
            GoogleAdMobRewardedVideoAd.this._extContext.dispatchEvent(FullScreenContentEvent.DISMISSED, FullScreenContentEvent.formatForEvent(GoogleAdMobRewardedVideoAd.this._identifier));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            Logger.d(GoogleAdMobRewardedVideoAd.TAG, "[%s]:onAdFailedToShowFullScreenContent()", GoogleAdMobRewardedVideoAd.this._identifier);
            GoogleAdMobRewardedVideoAd.this._extContext.dispatchEvent(FullScreenContentEvent.FAILED_TO_SHOW, FullScreenContentEvent.formatForErrorEvent(GoogleAdMobRewardedVideoAd.this._identifier, adError.getCode(), adError.getMessage()));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            Logger.d(GoogleAdMobRewardedVideoAd.TAG, "[%s]:onAdShowedFullScreenContent()", GoogleAdMobRewardedVideoAd.this._identifier);
            GoogleAdMobRewardedVideoAd.this._isShowingAd = true;
            GoogleAdMobRewardedVideoAd.this._extContext.dispatchEvent(FullScreenContentEvent.SHOW, FullScreenContentEvent.formatForEvent(GoogleAdMobRewardedVideoAd.this._identifier));
        }
    };
    private Handler _handler = new Handler();

    public GoogleAdMobRewardedVideoAd(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
    }

    public boolean destroyed() {
        return this._extContext == null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void destroy() {
        Logger.d(TAG, "[%s]:destroy()", this._identifier);
        if (this._rewardedVideoAd != null) {
            this._rewardedVideoAd = null;
        }
        Handler handler = this._handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this._handler = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
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

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void setUserId(String str) {
        Logger.d(TAG, "[%s]:setUserId( %s )", this._identifier, str);
        try {
            this._userId = str;
            RewardedAd rewardedAd = this._rewardedVideoAd;
            if (rewardedAd != null) {
                rewardedAd.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(this._userId).build());
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public String getAdUnitId() {
        Logger.d(TAG, "[%s]:getUserId()", this._identifier);
        String str = this._adUnitId;
        return str != null ? str : "";
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void setAdUnitId(String str) {
        Logger.d(TAG, "[%s]:setAdUnitId( %s )", this._identifier, str);
        this._adUnitId = str;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void load(AdvertRequest advertRequest) {
        Logger.d(TAG, "[%s]:load( ... )", this._identifier);
        try {
            final Activity activity = this._extContext.getActivity();
            final AdRequest adRequest = GoogleAdMobUtils.toAdRequest(advertRequest);
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedVideoAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdMobRewardedVideoAd.this.m238x1dbf64f1(activity, adRequest);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$load$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedVideoAd  reason: not valid java name */
    public /* synthetic */ void m238x1dbf64f1(Activity activity, AdRequest adRequest) {
        try {
            RewardedAd.load(activity, this._adUnitId, adRequest, new RewardedAdLoadCallback() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedVideoAd.1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(RewardedAd rewardedAd) {
                    Logger.d(GoogleAdMobRewardedVideoAd.TAG, "[%s]:onAdLoaded()", GoogleAdMobRewardedVideoAd.this._identifier);
                    GoogleAdMobRewardedVideoAd.this._isLoading = false;
                    GoogleAdMobRewardedVideoAd.this._rewardedVideoAd = rewardedAd;
                    if (GoogleAdMobRewardedVideoAd.this._userId != null) {
                        GoogleAdMobRewardedVideoAd googleAdMobRewardedVideoAd = GoogleAdMobRewardedVideoAd.this;
                        googleAdMobRewardedVideoAd.setUserId(googleAdMobRewardedVideoAd._userId);
                    }
                    if (GoogleAdMobRewardedVideoAd.this._options != null) {
                        GoogleAdMobRewardedVideoAd googleAdMobRewardedVideoAd2 = GoogleAdMobRewardedVideoAd.this;
                        googleAdMobRewardedVideoAd2.setServerSideVerificationOptions(googleAdMobRewardedVideoAd2._options);
                    }
                    RewardItem rewardItem = rewardedAd.getRewardItem();
                    GoogleAdMobRewardedVideoAd.this._extContext.dispatchEvent(RewardedVideoAdEvent.LOADED, RewardedVideoAdEvent.formatForRewardEvent(GoogleAdMobRewardedVideoAd.this._identifier, rewardItem.getAmount(), rewardItem.getType()));
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Logger.d(GoogleAdMobRewardedVideoAd.TAG, "[%s]:onAdFailedToLoad( [%d] %s )", GoogleAdMobRewardedVideoAd.this._identifier, Integer.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                    if (loadAdError.getResponseInfo() != null) {
                        String mediationAdapterClassName = loadAdError.getResponseInfo().getMediationAdapterClassName();
                        String str = GoogleAdMobRewardedVideoAd.TAG;
                        Object[] objArr = new Object[2];
                        objArr[0] = GoogleAdMobRewardedVideoAd.this._identifier;
                        if (mediationAdapterClassName == null) {
                            mediationAdapterClassName = "null";
                        }
                        objArr[1] = mediationAdapterClassName;
                        Logger.d(str, "[%s]:onAdFailedToLoad(): adapter: %s", objArr);
                    }
                    GoogleAdMobRewardedVideoAd.this._isLoading = false;
                    GoogleAdMobRewardedVideoAd.this._extContext.dispatchEvent(RewardedVideoAdEvent.ERROR, RewardedVideoAdEvent.formatForErrorEvent(GoogleAdMobRewardedVideoAd.this._identifier, loadAdError.getCode(), loadAdError.getMessage()));
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public boolean isLoaded() {
        Logger.d(TAG, "[%s]:isLoaded()", this._identifier);
        return this._rewardedVideoAd != null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public boolean show() {
        Logger.d(TAG, "[%s]:show()", this._identifier);
        try {
            if (!this._isShowingAd && isLoaded()) {
                final boolean shouldUseImmersiveMode = GoogleAdMobUtils.shouldUseImmersiveMode(this._extContext);
                final Activity activity = this._extContext.getActivity();
                this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedVideoAd$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GoogleAdMobRewardedVideoAd.this.m240x9e5d0349(shouldUseImmersiveMode, activity);
                    }
                });
                return true;
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$show$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedVideoAd  reason: not valid java name */
    public /* synthetic */ void m240x9e5d0349(boolean z, Activity activity) {
        try {
            this._rewardedVideoAd.setImmersiveMode(z);
            this._rewardedVideoAd.setFullScreenContentCallback(this.fullScreenContentCallback);
            this._rewardedVideoAd.setOnPaidEventListener(this);
            this._rewardedVideoAd.show(activity, this);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void setServerSideVerificationOptions(com.distriqt.extension.adverts.controller.ServerSideVerificationOptions serverSideVerificationOptions) {
        Logger.d(TAG, "[%s]:setServerSideVerificationOptions()", this._identifier);
        this._options = serverSideVerificationOptions;
        if (this._rewardedVideoAd == null) {
            return;
        }
        this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobRewardedVideoAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdMobRewardedVideoAd.this.m239x1a4803b4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setServerSideVerificationOptions$2$com-distriqt-extension-adverts-platforms-admob-GoogleAdMobRewardedVideoAd  reason: not valid java name */
    public /* synthetic */ void m239x1a4803b4() {
        ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
        if (this._options.customData != null && this._options.customData.length() > 0) {
            builder.setCustomData(this._options.customData);
        }
        if (this._options.userId != null && this._options.userId.length() > 0) {
            builder.setUserId(this._options.userId);
        }
        this._rewardedVideoAd.setServerSideVerificationOptions(builder.build());
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onDestroy() {
        Logger.d(TAG, "onDestroy()", new Object[0]);
        destroy();
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        RewardedAd rewardedAd = this._rewardedVideoAd;
        String mediationAdapterClassName = (rewardedAd == null || rewardedAd.getResponseInfo() == null) ? "" : this._rewardedVideoAd.getResponseInfo().getMediationAdapterClassName();
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext == null) {
            return;
        }
        iExtensionContext.dispatchEvent(PaidEvent.PAID, PaidEvent.formatForEvent(this._identifier, adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType(), mediationAdapterClassName));
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        Logger.d(TAG, "[%s]:onUserEarnedReward()", this._identifier);
        IExtensionContext iExtensionContext = this._extContext;
        if (iExtensionContext == null) {
            return;
        }
        iExtensionContext.dispatchEvent(RewardedVideoAdEvent.REWARD, RewardedVideoAdEvent.formatForRewardEvent(this._identifier, rewardItem.getAmount(), rewardItem.getType()));
    }
}
