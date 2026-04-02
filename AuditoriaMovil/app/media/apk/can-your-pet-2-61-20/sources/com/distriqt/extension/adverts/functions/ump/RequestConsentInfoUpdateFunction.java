package com.distriqt.extension.adverts.functions.ump;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.ump.AdvertConsentDebugSettings;
import com.distriqt.extension.adverts.controller.ump.AdvertConsentRequestParameters;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class RequestConsentInfoUpdateFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            AdvertConsentRequestParameters advertConsentRequestParameters = new AdvertConsentRequestParameters();
            advertConsentRequestParameters.tagForUnderAgeOfConsent = fREObjectArr[0].getProperty("tagForUnderAgeOfConsent").getAsBool();
            if (fREObjectArr[0].getProperty("debugSettings") != null) {
                FREObject property = fREObjectArr[0].getProperty("debugSettings");
                AdvertConsentDebugSettings advertConsentDebugSettings = new AdvertConsentDebugSettings();
                advertConsentDebugSettings.debugGeography = property.getProperty("debugGeography").getAsInt();
                advertConsentDebugSettings.testDeviceIds = FREUtils.GetObjectAsArrayOfStrings((FREArray) property.getProperty("testDeviceIds"));
                advertConsentRequestParameters.debugSettings = advertConsentDebugSettings;
            }
            if (advertsContext.v) {
                advertsContext.controller().platform().ump().requestConsentInfoUpdate(advertConsentRequestParameters);
                return null;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
