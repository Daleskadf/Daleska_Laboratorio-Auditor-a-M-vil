package com.distriqt.extension.share.functions.sms;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class IsSMSSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(((ShareContext) fREContext).smsController().isSupported());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
