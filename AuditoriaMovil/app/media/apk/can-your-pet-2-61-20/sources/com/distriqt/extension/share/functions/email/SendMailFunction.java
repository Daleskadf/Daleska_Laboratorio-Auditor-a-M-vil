package com.distriqt.extension.share.functions.email;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class SendMailFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            boolean z = false;
            if (shareContext.v) {
                z = shareContext.email().sendMail(fREObjectArr[0].getAsString(), fREObjectArr[1].getAsString(), fREObjectArr[2].getAsString().split(","));
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
