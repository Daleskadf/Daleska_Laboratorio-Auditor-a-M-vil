package com.distriqt.extension.share.functions.email;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class IsMailSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(((ShareContext) fREContext).email().isMailSupported());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
