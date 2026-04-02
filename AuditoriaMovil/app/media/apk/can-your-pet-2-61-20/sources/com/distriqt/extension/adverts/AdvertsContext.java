package com.distriqt.extension.adverts;

import android.content.Intent;
import android.content.res.Configuration;
import com.adobe.air.ActivityResultCallback;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.StateChangeCallback;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertsController;
import com.distriqt.extension.adverts.functions.GetAdvertisingIdFunction;
import com.distriqt.extension.adverts.functions.GetRequestConfigurationFunction;
import com.distriqt.extension.adverts.functions.ImplementationFunction;
import com.distriqt.extension.adverts.functions.InitialiseFunction;
import com.distriqt.extension.adverts.functions.IsPlatformSupportedFunction;
import com.distriqt.extension.adverts.functions.IsSupportedFunction;
import com.distriqt.extension.adverts.functions.OpenAdInspectorFunction;
import com.distriqt.extension.adverts.functions.PlatformVersionFunction;
import com.distriqt.extension.adverts.functions.SetAppMutedFunction;
import com.distriqt.extension.adverts.functions.SetAppVolumeFunction;
import com.distriqt.extension.adverts.functions.SetRequestConfigurationFunction;
import com.distriqt.extension.adverts.functions.SetupFunction;
import com.distriqt.extension.adverts.functions.VersionFunction;
import com.distriqt.extension.adverts.functions.adview.CreateFunction;
import com.distriqt.extension.adverts.functions.adview.DestroyFunction;
import com.distriqt.extension.adverts.functions.adview.GetAdSizeFunction;
import com.distriqt.extension.adverts.functions.adview.GetAdUnitIdFunction;
import com.distriqt.extension.adverts.functions.adview.HideFunction;
import com.distriqt.extension.adverts.functions.adview.IsLoadingFunction;
import com.distriqt.extension.adverts.functions.adview.LoadFunction;
import com.distriqt.extension.adverts.functions.adview.SetAdSizeFunction;
import com.distriqt.extension.adverts.functions.adview.SetAdUnitIdFunction;
import com.distriqt.extension.adverts.functions.adview.SetAdaptiveAdSizeFunction;
import com.distriqt.extension.adverts.functions.adview.SetInlineAdaptiveAdSizeFunction;
import com.distriqt.extension.adverts.functions.adview.SetInlineAdaptiveAdSizeWithMaxHeightFunction;
import com.distriqt.extension.adverts.functions.adview.SetViewParamsFunction;
import com.distriqt.extension.adverts.functions.adview.ShowFunction;
import com.distriqt.extension.adverts.functions.consent.AddTestDeviceFunction;
import com.distriqt.extension.adverts.functions.consent.AskForConsentFunction;
import com.distriqt.extension.adverts.functions.consent.GetConsentStatusFunction;
import com.distriqt.extension.adverts.functions.consent.SetConsentStatusFunction;
import com.distriqt.extension.adverts.functions.consent.SetDebugGeographyFunction;
import com.distriqt.extension.adverts.functions.interstitials.IsLoadedFunction;
import com.distriqt.extension.adverts.functions.nativeads.GetViewParamsFunction;
import com.distriqt.extension.adverts.functions.nativeads.ShowWithCustomFunction;
import com.distriqt.extension.adverts.functions.nativeads.ShowWithTemplateFunction;
import com.distriqt.extension.adverts.functions.nativeads.VisibleGetFunction;
import com.distriqt.extension.adverts.functions.nativeads.VisibleSetFunction;
import com.distriqt.extension.adverts.functions.rewarded.GetUserIdFunction;
import com.distriqt.extension.adverts.functions.rewarded.SetServerSideVerificationOptionsFunction;
import com.distriqt.extension.adverts.functions.rewarded.SetUserIdFunction;
import com.distriqt.extension.adverts.functions.ump.GetConsentInformationFunction;
import com.distriqt.extension.adverts.functions.ump.LoadConsentFormFunction;
import com.distriqt.extension.adverts.functions.ump.RequestConsentInfoUpdateFunction;
import com.distriqt.extension.adverts.functions.ump.ResetFunction;
import com.distriqt.extension.adverts.functions.ump.ShowConsentFormFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class AdvertsContext extends FREContext implements IExtensionContext, ActivityResultCallback, StateChangeCallback {
    public static String IMPLEMENTATION = "Android";
    public static String VERSION = "5.0";
    private AndroidActivityWrapper _aaw;
    public boolean v = true;
    private AdvertsController _controller = null;

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    public AdvertsContext() {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        this._aaw = GetAndroidActivityWrapper;
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this._aaw.addActivityStateChangeListner(this);
    }

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        AdvertsController advertsController = this._controller;
        if (advertsController != null) {
            advertsController.dispose();
            this._controller = null;
        }
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        hashMap.put("isPlatformSupported", new IsPlatformSupportedFunction());
        hashMap.put("setup", new SetupFunction());
        hashMap.put("initialise", new InitialiseFunction());
        hashMap.put("openAdInspector", new OpenAdInspectorFunction());
        hashMap.put("platformVersion", new PlatformVersionFunction());
        hashMap.put("getAdvertisingId", new GetAdvertisingIdFunction());
        hashMap.put("setAppVolume", new SetAppVolumeFunction());
        hashMap.put("setAppMuted", new SetAppMutedFunction());
        hashMap.put("getRequestConfiguration", new GetRequestConfigurationFunction());
        hashMap.put("setRequestConfiguration", new SetRequestConfigurationFunction());
        hashMap.put("adview_create", new CreateFunction());
        hashMap.put("adview_destroy", new DestroyFunction());
        hashMap.put("adview_setAdSize", new SetAdSizeFunction());
        hashMap.put("adview_setAdaptiveAdSize", new SetAdaptiveAdSizeFunction());
        hashMap.put("adview_setInlineAdaptiveAdSize", new SetInlineAdaptiveAdSizeFunction());
        hashMap.put("adview_setInlineAdaptiveAdSizeWithMaxHeight", new SetInlineAdaptiveAdSizeWithMaxHeightFunction());
        hashMap.put("adview_getAdSize", new GetAdSizeFunction());
        hashMap.put("adview_setAdUnitId", new SetAdUnitIdFunction());
        hashMap.put("adview_getAdUnitId", new GetAdUnitIdFunction());
        hashMap.put("adview_isLoading", new IsLoadingFunction());
        hashMap.put("adview_load", new LoadFunction());
        hashMap.put("adview_setViewParams", new SetViewParamsFunction());
        hashMap.put("adview_show", new ShowFunction());
        hashMap.put("adview_hide", new HideFunction());
        hashMap.put("interstitials_isSupported", new com.distriqt.extension.adverts.functions.interstitials.IsSupportedFunction());
        hashMap.put("interstitial_create", new com.distriqt.extension.adverts.functions.interstitials.CreateFunction());
        hashMap.put("interstitial_destroy", new com.distriqt.extension.adverts.functions.interstitials.DestroyFunction());
        hashMap.put("interstitial_setAdUnitId", new com.distriqt.extension.adverts.functions.interstitials.SetAdUnitIdFunction());
        hashMap.put("interstitial_getAdUnitId", new com.distriqt.extension.adverts.functions.interstitials.GetAdUnitIdFunction());
        hashMap.put("interstitial_isLoading", new com.distriqt.extension.adverts.functions.interstitials.IsLoadingFunction());
        hashMap.put("interstitial_load", new com.distriqt.extension.adverts.functions.interstitials.LoadFunction());
        hashMap.put("interstitial_isLoaded", new IsLoadedFunction());
        hashMap.put("interstitial_show", new com.distriqt.extension.adverts.functions.interstitials.ShowFunction());
        hashMap.put("interstitial_hide", new com.distriqt.extension.adverts.functions.interstitials.HideFunction());
        hashMap.put("rewardedvideoads_isSupported", new com.distriqt.extension.adverts.functions.rewarded.IsSupportedFunction());
        hashMap.put("rewarded_create", new com.distriqt.extension.adverts.functions.rewarded.CreateFunction());
        hashMap.put("rewarded_destroy", new com.distriqt.extension.adverts.functions.rewarded.DestroyFunction());
        hashMap.put("rewarded_getUserId", new GetUserIdFunction());
        hashMap.put("rewarded_setUserId", new SetUserIdFunction());
        hashMap.put("rewarded_getAdUnitId", new com.distriqt.extension.adverts.functions.rewarded.GetAdUnitIdFunction());
        hashMap.put("rewarded_setAdUnitId", new com.distriqt.extension.adverts.functions.rewarded.SetAdUnitIdFunction());
        hashMap.put("rewarded_load", new com.distriqt.extension.adverts.functions.rewarded.LoadFunction());
        hashMap.put("rewarded_isLoaded", new com.distriqt.extension.adverts.functions.rewarded.IsLoadedFunction());
        hashMap.put("rewarded_show", new com.distriqt.extension.adverts.functions.rewarded.ShowFunction());
        hashMap.put("rewarded_setServerSideVerificationOptions", new SetServerSideVerificationOptionsFunction());
        hashMap.put("rewardedinterstitialads_isSupported", new com.distriqt.extension.adverts.functions.rewardedinterstitials.IsSupportedFunction());
        hashMap.put("rewardedinterstitial_create", new com.distriqt.extension.adverts.functions.rewardedinterstitials.CreateFunction());
        hashMap.put("rewardedinterstitial_destroy", new com.distriqt.extension.adverts.functions.rewardedinterstitials.DestroyFunction());
        hashMap.put("rewardedinterstitial_getUserId", new com.distriqt.extension.adverts.functions.rewardedinterstitials.GetUserIdFunction());
        hashMap.put("rewardedinterstitial_setUserId", new com.distriqt.extension.adverts.functions.rewardedinterstitials.SetUserIdFunction());
        hashMap.put("rewardedinterstitial_getAdUnitId", new com.distriqt.extension.adverts.functions.rewardedinterstitials.GetAdUnitIdFunction());
        hashMap.put("rewardedinterstitial_setAdUnitId", new com.distriqt.extension.adverts.functions.rewardedinterstitials.SetAdUnitIdFunction());
        hashMap.put("rewardedinterstitial_load", new com.distriqt.extension.adverts.functions.rewardedinterstitials.LoadFunction());
        hashMap.put("rewardedinterstitial_isLoaded", new com.distriqt.extension.adverts.functions.rewardedinterstitials.IsLoadedFunction());
        hashMap.put("rewardedinterstitial_show", new com.distriqt.extension.adverts.functions.rewardedinterstitials.ShowFunction());
        hashMap.put("rewardedinterstitial_setServerSideVerificationOptions", new com.distriqt.extension.adverts.functions.rewardedinterstitials.SetServerSideVerificationOptionsFunction());
        hashMap.put("nativeads_isSupported", new com.distriqt.extension.adverts.functions.nativeads.IsSupportedFunction());
        hashMap.put("nativead_create", new com.distriqt.extension.adverts.functions.nativeads.CreateFunction());
        hashMap.put("nativead_destroy", new com.distriqt.extension.adverts.functions.nativeads.DestroyFunction());
        hashMap.put("nativead_isLoaded", new com.distriqt.extension.adverts.functions.nativeads.IsLoadedFunction());
        hashMap.put("nativead_isLoading", new com.distriqt.extension.adverts.functions.nativeads.IsLoadingFunction());
        hashMap.put("nativead_load", new com.distriqt.extension.adverts.functions.nativeads.LoadFunction());
        hashMap.put("nativead_showWithCustom", new ShowWithCustomFunction());
        hashMap.put("nativead_showWithTemplate", new ShowWithTemplateFunction());
        hashMap.put("nativead_visible_get", new VisibleGetFunction());
        hashMap.put("nativead_visible_set", new VisibleSetFunction());
        hashMap.put("nativead_setViewParams", new com.distriqt.extension.adverts.functions.nativeads.SetViewParamsFunction());
        hashMap.put("nativead_getViewParams", new GetViewParamsFunction());
        hashMap.put("consent_isSupported", new com.distriqt.extension.adverts.functions.consent.IsSupportedFunction());
        hashMap.put("consent_getConsentStatus", new GetConsentStatusFunction());
        hashMap.put("consent_setConsentStatus", new SetConsentStatusFunction());
        hashMap.put("consent_askForConsent", new AskForConsentFunction());
        hashMap.put("consent_addTestDevice", new AddTestDeviceFunction());
        hashMap.put("consent_setDebugGeography", new SetDebugGeographyFunction());
        hashMap.put("ump_isSupported", new com.distriqt.extension.adverts.functions.ump.IsSupportedFunction());
        hashMap.put("ump_loadConsentForm", new LoadConsentFormFunction());
        hashMap.put("ump_showConsentForm", new ShowConsentFormFunction());
        hashMap.put("ump_ci_getConsentInformation", new GetConsentInformationFunction());
        hashMap.put("ump_ci_requestConsentInfoUpdate", new RequestConsentInfoUpdateFunction());
        hashMap.put("ump_ci_reset", new ResetFunction());
        hashMap.put("appopenads_isSupported", new com.distriqt.extension.adverts.functions.rewarded.IsSupportedFunction());
        hashMap.put("appopenad_create", new com.distriqt.extension.adverts.functions.appopen.CreateFunction());
        hashMap.put("appopenad_destroy", new com.distriqt.extension.adverts.functions.appopen.DestroyFunction());
        hashMap.put("appopenad_getAdUnitId", new com.distriqt.extension.adverts.functions.appopen.GetAdUnitIdFunction());
        hashMap.put("appopenad_setAdUnitId", new com.distriqt.extension.adverts.functions.appopen.SetAdUnitIdFunction());
        hashMap.put("appopenad_load", new com.distriqt.extension.adverts.functions.appopen.LoadFunction());
        hashMap.put("appopenad_isLoaded", new com.distriqt.extension.adverts.functions.appopen.IsLoadedFunction());
        hashMap.put("appopenad_show", new com.distriqt.extension.adverts.functions.appopen.ShowFunction());
        return hashMap;
    }

    public AdvertsController controller() {
        if (this._controller == null) {
            this._controller = new AdvertsController(this);
        }
        return this._controller;
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        AdvertsController advertsController = this._controller;
        if (advertsController != null) {
            advertsController.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
        if (this._controller != null) {
            switch (AnonymousClass1.$SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[activityState.ordinal()]) {
                case 1:
                    this._controller.onStart();
                    return;
                case 2:
                    this._controller.onStop();
                    return;
                case 3:
                    this._controller.onPause();
                    return;
                case 4:
                    this._controller.onRestart();
                    return;
                case 5:
                    this._controller.onDestroy();
                    return;
                case 6:
                    this._controller.onResume();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.distriqt.extension.adverts.AdvertsContext$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState;

        static {
            int[] iArr = new int[AndroidActivityWrapper.ActivityState.values().length];
            $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState = iArr;
            try {
                iArr[AndroidActivityWrapper.ActivityState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESTARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$air$AndroidActivityWrapper$ActivityState[AndroidActivityWrapper.ActivityState.RESUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception unused) {
        }
    }
}
