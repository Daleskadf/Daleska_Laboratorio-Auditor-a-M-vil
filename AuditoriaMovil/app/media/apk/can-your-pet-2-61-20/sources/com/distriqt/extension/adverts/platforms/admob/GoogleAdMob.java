package com.distriqt.extension.adverts.platforms.admob;

import android.app.Activity;
import android.content.Context;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertPlatform;
import com.distriqt.extension.adverts.controller.AdvertRequestConfiguration;
import com.distriqt.extension.adverts.controller.AdvertView;
import com.distriqt.extension.adverts.controller.InterstitialAd;
import com.distriqt.extension.adverts.controller.RewardedInterstitialAd;
import com.distriqt.extension.adverts.controller.RewardedVideoAd;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAds;
import com.distriqt.extension.adverts.controller.consent.ConsentOptions;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdOptions;
import com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform;
import com.distriqt.extension.adverts.events.AdInspectorEvent;
import com.distriqt.extension.adverts.events.AdvertisingIdEvent;
import com.distriqt.extension.adverts.events.AdvertsEvent;
import com.distriqt.extension.adverts.platforms.admob.appopenads.AdMobAppOpenAds;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class GoogleAdMob extends ActivityStateListener implements AdvertPlatform {
    public static final String TAG = "GoogleAdMob";
    private String _accountId;
    private AdMobAppOpenAds _appOpenAds;
    private IExtensionContext _extContext;
    private GoogleAdMobUserMessagingPlatform _ump;
    private AdvertisingIdClient.Info _advertisingIdInfo = null;
    private HashMap<String, GoogleAdMobAdvertView> _adViews = new HashMap<>();
    private HashMap<String, GoogleAdMobInterstitialAd> _interstitialAds = new HashMap<>();
    private HashMap<String, GoogleAdMobRewardedVideoAd> _rewardedVideoAds = new HashMap<>();
    private HashMap<String, GoogleAdMobRewardedInterstitialAd> _rewardedInterstitialAds = new HashMap<>();
    private HashMap<String, GoogleAdMobNativeAd> _nativeAds = new HashMap<>();

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void addTestDevice(String str) {
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean askForConsent(ConsentOptions consentOptions) {
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void getConsentStatus(String str) {
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isAppOpenAdsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isInterstitialsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isNativeAdsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isRewardedInterstitialAdsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isRewardedVideoAdsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isSupported() {
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setConsentStatus(String str) {
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setDebugGeography(int i) {
    }

    public GoogleAdMob(IExtensionContext iExtensionContext, String str) {
        this._accountId = "";
        this._extContext = iExtensionContext;
        this._accountId = str;
    }

    public static boolean isSupported(Activity activity) {
        return GoogleAdMobSupport.isSupported(activity);
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String platformVersion() {
        String str = TAG;
        Logger.d(str, "platformVersion()", new Object[0]);
        if (GoogleAdMobSupport.isSupported(this._extContext.getActivity())) {
            Logger.d(str, "return MobileAds.getVersionString()", new Object[0]);
            return MobileAds.getVersion().toString();
        }
        return "";
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void openAdInspector() {
        Logger.d(TAG, "openAdInspector()", new Object[0]);
        MobileAds.openAdInspector(this._extContext.getActivity(), new OnAdInspectorClosedListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
            public final void onAdInspectorClosed(AdInspectorError adInspectorError) {
                GoogleAdMob.this.m216x3c8b5875(adInspectorError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$openAdInspector$0$com-distriqt-extension-adverts-platforms-admob-GoogleAdMob  reason: not valid java name */
    public /* synthetic */ void m216x3c8b5875(AdInspectorError adInspectorError) {
        if (adInspectorError != null) {
            this._extContext.dispatchEvent(AdInspectorEvent.CLOSED, AdInspectorEvent.formatErrorForEvent(adInspectorError.getMessage(), adInspectorError.getCode()));
        } else {
            this._extContext.dispatchEvent(AdInspectorEvent.CLOSED, AdInspectorEvent.formatForEvent());
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void dispose() {
        for (Map.Entry<String, GoogleAdMobAdvertView> entry : this._adViews.entrySet()) {
            entry.getValue().destroy();
        }
        for (Map.Entry<String, GoogleAdMobInterstitialAd> entry2 : this._interstitialAds.entrySet()) {
            entry2.getValue().destroy();
        }
        for (Map.Entry<String, GoogleAdMobRewardedVideoAd> entry3 : this._rewardedVideoAds.entrySet()) {
            entry3.getValue().destroy();
        }
        for (Map.Entry<String, GoogleAdMobRewardedInterstitialAd> entry4 : this._rewardedInterstitialAds.entrySet()) {
            entry4.getValue().destroy();
        }
        for (Map.Entry<String, GoogleAdMobNativeAd> entry5 : this._nativeAds.entrySet()) {
            entry5.getValue().destroy();
        }
        this._adViews.clear();
        this._interstitialAds.clear();
        this._rewardedVideoAds.clear();
        this._rewardedInterstitialAds.clear();
        this._nativeAds.clear();
        GoogleAdMobUserMessagingPlatform googleAdMobUserMessagingPlatform = this._ump;
        if (googleAdMobUserMessagingPlatform != null) {
            googleAdMobUserMessagingPlatform.destroy();
            this._ump = null;
        }
        AdMobAppOpenAds adMobAppOpenAds = this._appOpenAds;
        if (adMobAppOpenAds != null) {
            adMobAppOpenAds.dispose();
            this._appOpenAds = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void initialise() {
        Logger.d(TAG, "initialise()", new Object[0]);
        final Context applicationContext = this._extContext.getActivity().getApplicationContext();
        this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdMob.this.m215x40f376c(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initialise$2$com-distriqt-extension-adverts-platforms-admob-GoogleAdMob  reason: not valid java name */
    public /* synthetic */ void m215x40f376c(Context context) {
        try {
            MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    GoogleAdMob.this.m214xfe0b6c0d(initializationStatus);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initialise$1$com-distriqt-extension-adverts-platforms-admob-GoogleAdMob  reason: not valid java name */
    public /* synthetic */ void m214xfe0b6c0d(InitializationStatus initializationStatus) {
        this._extContext.dispatchEvent(AdvertsEvent.INITIALISED, GoogleAdMobUtils.formatStatusForEvent(initializationStatus.getAdapterStatusMap()));
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setAppVolume(final double d) {
        Logger.d(TAG, "setAppVolume( %f )", Float.valueOf((float) d));
        try {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    MobileAds.setAppVolume((float) d);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setAppMuted(final boolean z) {
        Logger.d(TAG, "setAppMuted( %b )", Boolean.valueOf(z));
        try {
            this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MobileAds.setAppMuted(z);
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String getAdvertisingId() {
        Logger.d(TAG, "getAdvertisingId()", new Object[0]);
        final Context applicationContext = this._extContext.getActivity().getApplicationContext();
        new Thread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GoogleAdMob.this.m213x1f879f97(applicationContext);
            }
        }).start();
        AdvertisingIdClient.Info info = this._advertisingIdInfo;
        return info == null ? "" : info.getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getAdvertisingId$5$com-distriqt-extension-adverts-platforms-admob-GoogleAdMob  reason: not valid java name */
    public /* synthetic */ void m213x1f879f97(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this._advertisingIdInfo = advertisingIdInfo;
            Logger.d(TAG, String.format("getAdvertisingId=%s", advertisingIdInfo.getId()), new Object[0]);
            this._extContext.dispatchEvent(AdvertisingIdEvent.ADVERTISING_ID, AdvertisingIdEvent.formatAdvertisingIdForEvent(this._advertisingIdInfo.getId(), this._advertisingIdInfo.isLimitAdTrackingEnabled()));
        } catch (Exception e) {
            Errors.handleException(e);
        } catch (NoClassDefFoundError unused) {
            this._extContext.dispatchEvent("extension:error", "Missing com.distriqt.playservices.AdsIdentifier extension dependency");
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertRequestConfiguration getRequestConfiguration() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        AdvertRequestConfiguration advertRequestConfiguration = new AdvertRequestConfiguration();
        advertRequestConfiguration.maxAdContentRating = requestConfiguration.getMaxAdContentRating();
        advertRequestConfiguration.tagForChildDirectedTreatment = requestConfiguration.getTagForChildDirectedTreatment();
        advertRequestConfiguration.tagForUnderAgeOfConsent = requestConfiguration.getTagForUnderAgeOfConsent();
        advertRequestConfiguration.testDeviceIds = requestConfiguration.getTestDeviceIds();
        return advertRequestConfiguration;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setRequestConfiguration(final AdvertRequestConfiguration advertRequestConfiguration) {
        Logger.d(TAG, "setRequestConfiguration( %s )", advertRequestConfiguration.toString());
        this._extContext.getActivity().runOnUiThread(new Runnable() { // from class: com.distriqt.extension.adverts.platforms.admob.GoogleAdMob$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MobileAds.setRequestConfiguration(GoogleAdMobUtils.toRequestConfiguration(AdvertRequestConfiguration.this));
            }
        });
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createAdView() {
        Logger.d(TAG, "createAdView()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        this._adViews.put(uuid, new GoogleAdMobAdvertView(this._extContext, uuid));
        return uuid;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyAdView(String str) {
        Logger.d(TAG, "destroyAdView( %s )", str);
        AdvertView adView = getAdView(str);
        if (adView != null) {
            adView.destroy();
            this._adViews.remove(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertView getAdView(String str) {
        if (this._adViews.containsKey(str)) {
            return this._adViews.get(str);
        }
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createInterstitialAd() {
        Logger.d(TAG, "createInterstitialAd()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        this._interstitialAds.put(uuid, new GoogleAdMobInterstitialAd(this._extContext, uuid));
        return uuid;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyInterstitialAd(String str) {
        Logger.d(TAG, "destroyAdView( %s )", str);
        InterstitialAd interstitialAd = getInterstitialAd(str);
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this._interstitialAds.remove(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public InterstitialAd getInterstitialAd(String str) {
        if (this._interstitialAds.containsKey(str)) {
            return this._interstitialAds.get(str);
        }
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createRewardedVideoAd() {
        Logger.d(TAG, "createRewardedVideoAd()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        this._rewardedVideoAds.put(uuid, new GoogleAdMobRewardedVideoAd(this._extContext, uuid));
        return uuid;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyRewardedVideoAd(String str) {
        Logger.d(TAG, "destroyRewardedVideoAd( %s )", str);
        RewardedVideoAd rewardedVideoAd = getRewardedVideoAd(str);
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this._rewardedVideoAds.remove(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public RewardedVideoAd getRewardedVideoAd(String str) {
        if (this._rewardedVideoAds.containsKey(str)) {
            return this._rewardedVideoAds.get(str);
        }
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createRewardedInterstitialAd() {
        Logger.d(TAG, "createRewardedInterstitialAd()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        this._rewardedInterstitialAds.put(uuid, new GoogleAdMobRewardedInterstitialAd(this._extContext, uuid));
        return uuid;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyRewardedInterstitialAd(String str) {
        Logger.d(TAG, "destroyRewardedVideoAd( %s )", str);
        RewardedInterstitialAd rewardedInterstitialAd = getRewardedInterstitialAd(str);
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.destroy();
            this._rewardedInterstitialAds.remove(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public RewardedInterstitialAd getRewardedInterstitialAd(String str) {
        if (this._rewardedInterstitialAds.containsKey(str)) {
            return this._rewardedInterstitialAds.get(str);
        }
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createNativeAd(String str, AdvertNativeAdOptions advertNativeAdOptions) {
        Logger.d(TAG, "createRewardedVideoAd()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        this._nativeAds.put(uuid, new GoogleAdMobNativeAd(this._extContext, uuid, str, advertNativeAdOptions));
        return uuid;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyNativeAd(String str) {
        Logger.d(TAG, "destroyNativeAd( %s )", str);
        GoogleAdMobNativeAd googleAdMobNativeAd = (GoogleAdMobNativeAd) getNativeAd(str);
        if (googleAdMobNativeAd != null) {
            googleAdMobNativeAd.destroy();
            this._nativeAds.remove(str);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertNativeAd getNativeAd(String str) {
        if (this._nativeAds.containsKey(str)) {
            return this._nativeAds.get(str);
        }
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertUserMessagingPlatform ump() {
        if (this._ump == null) {
            this._ump = new GoogleAdMobUserMessagingPlatform(this._extContext);
        }
        return this._ump;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertAppOpenAds appOpenAds() {
        if (this._appOpenAds == null) {
            this._appOpenAds = new AdMobAppOpenAds(this._extContext);
        }
        return this._appOpenAds;
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onResume() {
        Logger.d(TAG, "onResume()", new Object[0]);
        for (Map.Entry<String, GoogleAdMobAdvertView> entry : this._adViews.entrySet()) {
            entry.getValue().onResume();
        }
        for (Map.Entry<String, GoogleAdMobNativeAd> entry2 : this._nativeAds.entrySet()) {
            entry2.getValue().onResume();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onPause() {
        Logger.d(TAG, "onPause()", new Object[0]);
        for (Map.Entry<String, GoogleAdMobAdvertView> entry : this._adViews.entrySet()) {
            entry.getValue().onPause();
        }
        for (Map.Entry<String, GoogleAdMobNativeAd> entry2 : this._nativeAds.entrySet()) {
            entry2.getValue().onPause();
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStart() {
        Logger.d(TAG, "onStart()", new Object[0]);
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onStop() {
        Logger.d(TAG, "onStop()", new Object[0]);
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onDestroy() {
        Logger.d(TAG, "onDestroy()", new Object[0]);
    }
}
