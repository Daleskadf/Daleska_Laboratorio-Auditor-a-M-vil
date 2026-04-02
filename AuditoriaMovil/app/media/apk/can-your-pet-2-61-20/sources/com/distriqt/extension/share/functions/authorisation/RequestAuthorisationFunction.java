package com.distriqt.extension.share.functions.authorisation;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class RequestAuthorisationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            return FREObject.newObject(shareContext.v ? shareContext.smsController().requestAuthorisation() : false);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
