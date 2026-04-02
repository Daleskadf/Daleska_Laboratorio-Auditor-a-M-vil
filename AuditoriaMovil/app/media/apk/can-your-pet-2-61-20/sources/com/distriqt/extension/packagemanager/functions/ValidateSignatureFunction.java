package com.distriqt.extension.packagemanager.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.packagemanager.PackageManagerContext;
/* loaded from: classes.dex */
public class ValidateSignatureFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            PackageManagerContext packageManagerContext = (PackageManagerContext) fREContext;
            boolean z = false;
            if (packageManagerContext.v) {
                z = packageManagerContext.controller().validateSignature(fREObjectArr[0].getAsString());
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
