package com.distriqt.extension.inappbilling.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.controller.BillingService;
import com.distriqt.extension.inappbilling.controller.amazon.AmazonBillingControllerSupport;
import com.distriqt.extension.inappbilling.controller.appgallery.AppGalleryControllerSupport;
import com.distriqt.extension.inappbilling.controller.catappult.CatappultControllerSupport;
import com.distriqt.extension.inappbilling.controller.playbilling.PlayBillingControllerSupport;
import com.distriqt.extension.inappbilling.controller.samsung.SamsungIAPControllerSupport;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class IsServiceSupportedFunction implements FREFunction {
    public static final String TAG = "IsServiceSupportedFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            boolean z = false;
            String asString = fREObjectArr[0].getAsString();
            String str = TAG;
            Logger.d(str, "isServiceSupported( %s )", asString);
            if ("default".equals(asString)) {
                asString = inAppBillingContext.controller().determineDefaultServiceType();
                Logger.d(str, "isServiceSupported(): default = %s", asString);
            }
            if (BillingService.AMAZON_INAPP_PURCHASING.equals(asString)) {
                z = AmazonBillingControllerSupport.supported(fREContext.getActivity());
            } else if (BillingService.HUAWEI_APP_GALLERY.equals(asString)) {
                z = AppGalleryControllerSupport.supported(fREContext.getActivity());
            } else if (BillingService.GOOGLE_PLAY_INAPP_BILLING.equals(asString)) {
                z = PlayBillingControllerSupport.supported(fREContext.getActivity());
            } else if (BillingService.SAMSUNG_INAPP_PURCHASE.equals(asString)) {
                z = SamsungIAPControllerSupport.supported(fREContext.getActivity());
            } else if (BillingService.CATAPPULT_NATIVE_BILLING.equals(asString)) {
                z = CatappultControllerSupport.supported(fREContext.getActivity());
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
