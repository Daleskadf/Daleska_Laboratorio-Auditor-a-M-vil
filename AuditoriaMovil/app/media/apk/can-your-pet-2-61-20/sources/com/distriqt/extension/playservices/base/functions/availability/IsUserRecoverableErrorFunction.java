package com.distriqt.extension.playservices.base.functions.availability;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.google.android.gms.common.GoogleApiAvailability;
/* loaded from: classes.dex */
public class IsUserRecoverableErrorFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(GoogleApiAvailability.getInstance().isUserResolvableError(fREObjectArr[0].getAsInt()));
        } catch (Exception e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
