package com.distriqt.extension.adverts.controller;

import android.content.Intent;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAds;
import com.distriqt.extension.adverts.controller.consent.ConsentOptions;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdOptions;
import com.distriqt.extension.adverts.controller.ump.AdvertUserMessagingPlatform;
/* loaded from: classes.dex */
public interface AdvertPlatform {
    void addTestDevice(String str);

    AdvertAppOpenAds appOpenAds();

    boolean askForConsent(ConsentOptions consentOptions);

    String createAdView();

    String createInterstitialAd();

    String createNativeAd(String str, AdvertNativeAdOptions advertNativeAdOptions);

    String createRewardedInterstitialAd();

    String createRewardedVideoAd();

    void destroyAdView(String str);

    void destroyInterstitialAd(String str);

    void destroyNativeAd(String str);

    void destroyRewardedInterstitialAd(String str);

    void destroyRewardedVideoAd(String str);

    void dispose();

    AdvertView getAdView(String str);

    String getAdvertisingId();

    void getConsentStatus(String str);

    InterstitialAd getInterstitialAd(String str);

    AdvertNativeAd getNativeAd(String str);

    AdvertRequestConfiguration getRequestConfiguration();

    RewardedInterstitialAd getRewardedInterstitialAd(String str);

    RewardedVideoAd getRewardedVideoAd(String str);

    void initialise();

    boolean isAppOpenAdsSupported();

    boolean isInterstitialsSupported();

    boolean isNativeAdsSupported();

    boolean isRewardedInterstitialAdsSupported();

    boolean isRewardedVideoAdsSupported();

    boolean isSupported();

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onPause();

    void onRestart();

    void onResume();

    void onStart();

    void onStop();

    void openAdInspector();

    String platformVersion();

    void setAppMuted(boolean z);

    void setAppVolume(double d);

    void setConsentStatus(String str);

    void setDebugGeography(int i);

    void setRequestConfiguration(AdvertRequestConfiguration advertRequestConfiguration);

    AdvertUserMessagingPlatform ump();
}
