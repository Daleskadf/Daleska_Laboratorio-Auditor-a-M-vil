package com.distriqt.extension.adverts.functions.consent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.consent.ConsentDialogContent;
import com.distriqt.extension.adverts.controller.consent.ConsentOptions;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class AskForConsentFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            boolean z = false;
            if (advertsContext.v) {
                ConsentOptions consentOptions = new ConsentOptions();
                consentOptions.privacyUrl = fREObjectArr[0].getProperty("privacyUrl").getAsString();
                consentOptions.showNonPersonalisedAdsOption = fREObjectArr[0].getProperty("showNonPersonalisedAdsOption").getAsBool();
                consentOptions.showPersonalisedAdsOption = fREObjectArr[0].getProperty("showPersonalisedAdsOption").getAsBool();
                consentOptions.showAdFreeOption = fREObjectArr[0].getProperty("showAdFreeOption").getAsBool();
                FREObject property = fREObjectArr[0].getProperty("dialogContent");
                if (property != null) {
                    consentOptions.dialogContent = new ConsentDialogContent();
                    consentOptions.dialogContent.title = property.getProperty("title").getAsString();
                    consentOptions.dialogContent.contentText = property.getProperty("contentText").getAsString();
                    consentOptions.dialogContent.moreInfoText = property.getProperty("moreInfoText").getAsString();
                    consentOptions.dialogContent.mediationPartnersText = property.getProperty("mediationPartnersText").getAsString();
                }
                if (advertsContext.controller().platform() != null) {
                    z = advertsContext.controller().platform().askForConsent(consentOptions);
                }
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
