package com.distriqt.extension.adverts.platforms.huawei;

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
import com.distriqt.extension.adverts.events.AdvertsEvent;
import com.distriqt.extension.adverts.events.ConsentEvent;
import com.distriqt.extension.adverts.platforms.huawei.appopenads.HuaweiAdsAppOpenAds;
import com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.consent.bean.AdProvider;
import com.huawei.hms.ads.consent.constant.ConsentStatus;
import com.huawei.hms.ads.consent.constant.DebugNeedConsent;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.hms.ads.consent.inter.ConsentUpdateListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class HuaweiAds extends ActivityStateListener implements AdvertPlatform {
    public static final String TAG = "HuaweiAds";
    private String _accountId;
    private HuaweiAdsIdentifier _adsIdentifier;
    private HuaweiAdsAppOpenAds _appOpenAds;
    private IExtensionContext _extContext;
    private List<AdProvider> _adProviders = new ArrayList();
    private HashMap<String, HuaweiBannerView> _adViews = new HashMap<>();
    private HashMap<String, HuaweiInterstitial> _interstitialAds = new HashMap<>();
    private HashMap<String, HuaweiRewarded> _rewardedVideoAds = new HashMap<>();

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createNativeAd(String str, AdvertNativeAdOptions advertNativeAdOptions) {
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createRewardedInterstitialAd() {
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyNativeAd(String str) {
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void destroyRewardedInterstitialAd(String str) {
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertNativeAd getNativeAd(String str) {
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public RewardedInterstitialAd getRewardedInterstitialAd(String str) {
        return null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isAppOpenAdsSupported() {
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isInterstitialsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isNativeAdsSupported() {
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isRewardedInterstitialAdsSupported() {
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isRewardedVideoAdsSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean isSupported() {
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void openAdInspector() {
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertUserMessagingPlatform ump() {
        return null;
    }

    public HuaweiAds(IExtensionContext iExtensionContext, String str) {
        this._accountId = "";
        this._extContext = iExtensionContext;
        this._accountId = str;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void dispose() {
        HuaweiAdsIdentifier huaweiAdsIdentifier = this._adsIdentifier;
        if (huaweiAdsIdentifier != null) {
            huaweiAdsIdentifier.dispose();
            this._adsIdentifier = null;
        }
        for (Map.Entry<String, HuaweiBannerView> entry : this._adViews.entrySet()) {
            entry.getValue().destroy();
        }
        for (Map.Entry<String, HuaweiInterstitial> entry2 : this._interstitialAds.entrySet()) {
            entry2.getValue().destroy();
        }
        for (Map.Entry<String, HuaweiRewarded> entry3 : this._rewardedVideoAds.entrySet()) {
            entry3.getValue().destroy();
        }
        this._adViews.clear();
        this._interstitialAds.clear();
        this._rewardedVideoAds.clear();
        HuaweiAdsAppOpenAds huaweiAdsAppOpenAds = this._appOpenAds;
        if (huaweiAdsAppOpenAds != null) {
            huaweiAdsAppOpenAds.dispose();
            this._appOpenAds = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String platformVersion() {
        return HuaweiAdsSupport.isSupported(this._extContext.getActivity()) ? HwAds.getSDKVersion() : "";
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String getAdvertisingId() {
        if (HuaweiAdsSupport.isAdsIdentifierSupported(this._extContext.getActivity())) {
            if (this._adsIdentifier == null) {
                this._adsIdentifier = new HuaweiAdsIdentifier(this._extContext);
            }
            return this._adsIdentifier.getAdvertisingId();
        }
        this._extContext.dispatchEvent("extension:error", "Missing com.huawei.hms.adsidentifier extension dependency");
        return "";
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void initialise() {
        Logger.d(TAG, "initialise()", new Object[0]);
        try {
            Activity activity = this._extContext.getActivity();
            if (!configurationFileExists(activity)) {
                this._extContext.dispatchEvent("extension:error", "Missing agconnect-services.json configuration");
                return;
            }
            AGConnectInstance.initialize(activity, new AGConnectOptionsBuilder().setInputStream(activity.getAssets().open("agconnect-services.json")));
            HwAds.init(activity);
            this._extContext.dispatchEvent(AdvertsEvent.INITIALISED, HuaweiAdsUtils.formatStatusForEvent());
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    private boolean configurationFileExists(Context context) {
        try {
            context.getAssets().open("agconnect-services.json").close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setAppVolume(double d) {
        float f = (float) d;
        Logger.d(TAG, "setAppVolume( %f )", Float.valueOf(f));
        try {
            HwAds.setVideoVolume(f);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setAppMuted(boolean z) {
        Logger.d(TAG, "setAppMuted( %b )", Boolean.valueOf(z));
        try {
            HwAds.setVideoMuted(z);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertRequestConfiguration getRequestConfiguration() {
        return new AdvertRequestConfiguration();
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setRequestConfiguration(AdvertRequestConfiguration advertRequestConfiguration) {
        Logger.d(TAG, "setRequestConfiguration( %s )", advertRequestConfiguration.toString());
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public String createAdView() {
        Logger.d(TAG, "createAdView()", new Object[0]);
        String uuid = UUID.randomUUID().toString();
        this._adViews.put(uuid, new HuaweiBannerView(this._extContext, uuid));
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
        this._interstitialAds.put(uuid, new HuaweiInterstitial(this._extContext, uuid));
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
        this._rewardedVideoAds.put(uuid, new HuaweiRewarded(this._extContext, uuid));
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
    public void addTestDevice(String str) {
        try {
            Consent.getInstance(this._extContext.getActivity()).addTestDeviceId(str);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void setDebugGeography(int i) {
        try {
            DebugNeedConsent debugNeedConsent = DebugNeedConsent.DEBUG_DISABLED;
            if (i == 1) {
                debugNeedConsent = DebugNeedConsent.DEBUG_NEED_CONSENT;
            } else if (i == 2) {
                debugNeedConsent = DebugNeedConsent.DEBUG_NOT_NEED_CONSENT;
            }
            Consent.getInstance(this._extContext.getActivity()).setDebugNeedConsent(debugNeedConsent);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public void getConsentStatus(String str) {
        String str2 = TAG;
        Logger.d(str2, "getConsentStatus()", new Object[0]);
        try {
            Logger.d(str2, "Use test device id: %s", Consent.getInstance(this._extContext.getActivity()).getTestDeviceId());
            Consent.getInstance(this._extContext.getActivity()).requestConsentUpdate(new ConsentUpdateListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiAds.1
                public void onSuccess(ConsentStatus consentStatus, boolean z, List<AdProvider> list) {
                    Logger.d(HuaweiAds.TAG, "getConsentStatus():onSuccess( )", new Object[0]);
                    HuaweiAds.this._adProviders.clear();
                    HuaweiAds.this._adProviders.addAll(list);
                    HuaweiAds.this._extContext.dispatchEvent(ConsentEvent.STATUS_UPDATED, ConsentEvent.formatForEvent(HuaweiAds.this.consentStatusToString(consentStatus), z, false));
                }

                public void onFail(String str3) {
                    Logger.d(HuaweiAds.TAG, "getConsentStatus():onFail( %s )", str3);
                    HuaweiAds.this._extContext.dispatchEvent(ConsentEvent.STATUS_ERROR, ConsentEvent.formatErrorForEvent(str3));
                }
            });
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:3:0x000d, B:25:0x007d, B:23:0x005c, B:24:0x006d, B:10:0x0038, B:13:0x0042, B:16:0x004c), top: B:30:0x000d }] */
    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setConsentStatus(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = com.distriqt.extension.adverts.platforms.huawei.HuaweiAds.TAG
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r8
            java.lang.String r4 = "setConsentStatus( %s )"
            com.distriqt.extension.adverts.utils.Logger.d(r0, r4, r2)
            com.distriqt.core.utils.IExtensionContext r0 = r7._extContext     // Catch: java.lang.Exception -> L81
            android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.consent.inter.Consent r0 = com.huawei.hms.ads.consent.inter.Consent.getInstance(r0)     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.consent.constant.ConsentStatus r2 = r7.consentStatusFromString(r8)     // Catch: java.lang.Exception -> L81
            r0.setConsentStatus(r2)     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.RequestOptions r0 = com.huawei.hms.ads.HwAds.getRequestOptions()     // Catch: java.lang.Exception -> L81
            int r2 = r8.hashCode()     // Catch: java.lang.Exception -> L81
            r4 = -284840886(0xffffffffef05ac4a, float:-4.136979E28)
            r5 = 3
            r6 = 2
            if (r2 == r4) goto L4c
            r4 = -258041904(0xfffffffff09e97d0, float:-3.926573E29)
            if (r2 == r4) goto L42
            r4 = 1666911234(0x635b0c02, float:4.0407022E21)
            if (r2 == r4) goto L38
            goto L56
        L38:
            java.lang.String r2 = "non_personalized"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r8 == 0) goto L56
            r8 = 3
            goto L57
        L42:
            java.lang.String r2 = "personalized"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r8 == 0) goto L56
            r8 = 2
            goto L57
        L4c:
            java.lang.String r2 = "unknown"
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> L81
            if (r8 == 0) goto L56
            r8 = 1
            goto L57
        L56:
            r8 = -1
        L57:
            if (r8 == r6) goto L6d
            if (r8 == r5) goto L5c
            goto L7d
        L5c:
            com.huawei.hms.ads.RequestOptions$Builder r8 = r0.toBuilder()     // Catch: java.lang.Exception -> L81
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.RequestOptions$Builder r8 = r8.setNonPersonalizedAd(r0)     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.RequestOptions r0 = r8.build()     // Catch: java.lang.Exception -> L81
            goto L7d
        L6d:
            com.huawei.hms.ads.RequestOptions$Builder r8 = r0.toBuilder()     // Catch: java.lang.Exception -> L81
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.RequestOptions$Builder r8 = r8.setNonPersonalizedAd(r0)     // Catch: java.lang.Exception -> L81
            com.huawei.hms.ads.RequestOptions r0 = r8.build()     // Catch: java.lang.Exception -> L81
        L7d:
            com.huawei.hms.ads.HwAds.setRequestOptions(r0)     // Catch: java.lang.Exception -> L81
            goto L85
        L81:
            r8 = move-exception
            com.distriqt.extension.adverts.utils.Errors.handleException(r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.extension.adverts.platforms.huawei.HuaweiAds.setConsentStatus(java.lang.String):void");
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public boolean askForConsent(ConsentOptions consentOptions) {
        ConsentDialog consentDialog = new ConsentDialog(this._extContext.getActivity(), this._adProviders, consentOptions);
        consentDialog.setCallback(new ConsentDialog.ConsentDialogCallback() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiAds.2
            @Override // com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.ConsentDialogCallback
            public void updateConsentStatus(ConsentStatus consentStatus) {
                HuaweiAds huaweiAds = HuaweiAds.this;
                huaweiAds.setConsentStatus(huaweiAds.consentStatusToString(consentStatus));
                HuaweiAds.this._extContext.dispatchEvent(ConsentEvent.FORM_CLOSED, ConsentEvent.formatForEvent(HuaweiAds.this.consentStatusToString(consentStatus), false, false));
            }
        });
        consentDialog.setCanceledOnTouchOutside(false);
        consentDialog.show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.distriqt.extension.adverts.platforms.huawei.HuaweiAds$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$hms$ads$consent$constant$ConsentStatus;

        static {
            int[] iArr = new int[ConsentStatus.values().length];
            $SwitchMap$com$huawei$hms$ads$consent$constant$ConsentStatus = iArr;
            try {
                iArr[ConsentStatus.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$hms$ads$consent$constant$ConsentStatus[ConsentStatus.PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$hms$ads$consent$constant$ConsentStatus[ConsentStatus.NON_PERSONALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String consentStatusToString(ConsentStatus consentStatus) {
        int i = AnonymousClass3.$SwitchMap$com$huawei$hms$ads$consent$constant$ConsentStatus[consentStatus.ordinal()];
        return i != 2 ? i != 3 ? "unknown" : "non_personalized" : "personalized";
    }

    private ConsentStatus consentStatusFromString(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -284840886) {
            if (str.equals("unknown")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -258041904) {
            if (hashCode == 1666911234 && str.equals("non_personalized")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("personalized")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 2) {
            if (c != 3) {
                return ConsentStatus.UNKNOWN;
            }
            return ConsentStatus.NON_PERSONALIZED;
        }
        return ConsentStatus.PERSONALIZED;
    }

    @Override // com.distriqt.extension.adverts.controller.AdvertPlatform
    public AdvertAppOpenAds appOpenAds() {
        if (this._appOpenAds == null) {
            this._appOpenAds = new HuaweiAdsAppOpenAds(this._extContext);
        }
        return this._appOpenAds;
    }
}
