package com.distriqt.extension.playservices.appset.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.playservices.appset.AppSetContext;
import com.distriqt.extension.playservices.appset.utils.Errors;
/* loaded from: classes.dex */
public class GetAppSetIdInfoFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ((AppSetContext) fREContext).controller().getAppSetIdInfo();
            return null;
        } catch (Exception e) {
            Errors.handleException((IExtensionContext) fREContext, e);
            return null;
        }
    }
}
