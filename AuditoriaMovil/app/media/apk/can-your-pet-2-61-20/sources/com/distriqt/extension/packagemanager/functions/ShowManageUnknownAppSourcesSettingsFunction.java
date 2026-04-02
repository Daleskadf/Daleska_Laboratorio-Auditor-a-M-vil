package com.distriqt.extension.packagemanager.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.packagemanager.PackageManagerContext;
import com.distriqt.extension.packagemanager.utils.Errors;
/* loaded from: classes.dex */
public class ShowManageUnknownAppSourcesSettingsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ((PackageManagerContext) fREContext).controller().showManageUnknownAppSourcesSettings();
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
