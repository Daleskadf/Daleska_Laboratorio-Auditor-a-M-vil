package com.distriqt.extension.inappbilling;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class InAppBillingExtension implements FREExtension {
    public static InAppBillingContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        InAppBillingContext inAppBillingContext = new InAppBillingContext();
        context = inAppBillingContext;
        InAppBilling.context = inAppBillingContext;
        return context;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        InAppBillingContext inAppBillingContext = context;
        if (inAppBillingContext != null) {
            inAppBillingContext.dispose();
        }
        InAppBilling.context = null;
        context = null;
    }
}
