package com.distriqt.extension.share.functions.authorisation;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.Logger;
/* loaded from: classes.dex */
public class AuthorisationStatusFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            String str = "unknown";
            if (shareContext.v) {
                str = shareContext.smsController().authorisationStatus();
                Logger.d("AuthorisationStatusFunction", "status=%s", str);
            }
            return FREObject.newObject(str);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
