package com.distriqt.extension.share.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class ClearCacheFunction implements FREFunction {
    public static final String TAG = "ClearCacheFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ((ShareContext) fREContext).shareController().clearCache();
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
