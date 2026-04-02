package com.distriqt.extension.adverts.controller.ump;

import org.json.JSONObject;
/* loaded from: classes.dex */
public interface AdvertUserMessagingPlatform {
    JSONObject getConsentInformation();

    int getConsentStatus();

    boolean isConsentFormAvailable();

    boolean isSupported();

    boolean loadConsentForm();

    void requestConsentInfoUpdate(AdvertConsentRequestParameters advertConsentRequestParameters);

    void reset();

    boolean showConsentForm();
}
