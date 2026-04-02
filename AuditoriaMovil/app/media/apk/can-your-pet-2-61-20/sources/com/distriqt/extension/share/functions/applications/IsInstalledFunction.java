package com.distriqt.extension.share.functions.applications;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class IsInstalledFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            return FREObject.newObject(shareContext.v ? shareContext.applications().isInstalled(fREObjectArr[0].getProperty("packageName").getAsString()) : false);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
