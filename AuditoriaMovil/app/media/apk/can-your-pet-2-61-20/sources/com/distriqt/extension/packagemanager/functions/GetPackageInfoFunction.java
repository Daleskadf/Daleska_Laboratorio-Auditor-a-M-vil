package com.distriqt.extension.packagemanager.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.packagemanager.PackageManagerContext;
/* loaded from: classes.dex */
public class GetPackageInfoFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(((PackageManagerContext) fREContext).controller().getPackageInfo(fREObjectArr[0].getAsString(), fREObjectArr[1].getAsInt()).toString());
        } catch (Exception e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
