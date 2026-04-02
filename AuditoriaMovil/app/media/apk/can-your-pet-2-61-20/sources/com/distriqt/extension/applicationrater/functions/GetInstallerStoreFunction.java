package com.distriqt.extension.applicationrater.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.applicationrater.ApplicationRaterContext;
import com.distriqt.extension.applicationrater.utils.Errors;
/* loaded from: classes.dex */
public class GetInstallerStoreFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ApplicationRaterContext applicationRaterContext = (ApplicationRaterContext) fREContext;
            return FREObject.newObject(applicationRaterContext.v ? applicationRaterContext.controller().getInstallerStore() : "unknown");
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
