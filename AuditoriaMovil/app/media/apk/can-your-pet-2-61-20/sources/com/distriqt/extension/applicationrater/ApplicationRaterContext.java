package com.distriqt.extension.applicationrater;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.applicationrater.controller.ApplicationRaterController;
import com.distriqt.extension.applicationrater.functions.GetInstallerStoreFunction;
import com.distriqt.extension.applicationrater.functions.ImplementationFunction;
import com.distriqt.extension.applicationrater.functions.IsSupportedFunction;
import com.distriqt.extension.applicationrater.functions.RateFunction;
import com.distriqt.extension.applicationrater.functions.RetrieveApplicationIdFunction;
import com.distriqt.extension.applicationrater.functions.ShowRateDialogFunction;
import com.distriqt.extension.applicationrater.functions.VersionFunction;
import com.distriqt.extension.applicationrater.functions.review.RequestReviewFunction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ApplicationRaterContext extends FREContext implements IExtensionContext {
    public boolean v = true;
    private ApplicationRaterController _controller = null;

    @Override // com.adobe.fre.FREContext
    public void dispose() {
        ApplicationRaterController applicationRaterController = this._controller;
        if (applicationRaterController != null) {
            applicationRaterController.dispose();
            this._controller = null;
        }
    }

    @Override // com.adobe.fre.FREContext
    public Map<String, FREFunction> getFunctions() {
        HashMap hashMap = new HashMap();
        hashMap.put("isSupported", new IsSupportedFunction());
        hashMap.put("version", new VersionFunction());
        hashMap.put("implementation", new ImplementationFunction());
        hashMap.put("showRateDialog", new ShowRateDialogFunction());
        hashMap.put("rate", new RateFunction());
        hashMap.put("getInstallerStore", new GetInstallerStoreFunction());
        hashMap.put("retrieveApplicationId", new RetrieveApplicationIdFunction());
        hashMap.put("review_isSupported", new com.distriqt.extension.applicationrater.functions.review.IsSupportedFunction());
        hashMap.put("review_requestReview", new RequestReviewFunction());
        return hashMap;
    }

    public ApplicationRaterController controller() {
        if (this._controller == null) {
            this._controller = new ApplicationRaterController(this);
        }
        return this._controller;
    }

    @Override // com.distriqt.core.utils.IExtensionContext
    public void dispatchEvent(String str, String str2) {
        try {
            dispatchStatusEventAsync(str, str2);
        } catch (Exception unused) {
        }
    }
}
