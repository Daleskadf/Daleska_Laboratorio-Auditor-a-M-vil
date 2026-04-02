package com.distriqt.extension.playservices.base.functions.availability;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.google.android.gms.common.GoogleApiAvailability;
/* loaded from: classes.dex */
public class ShowErrorNotificationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            GoogleApiAvailability.getInstance().showErrorNotification(fREContext.getActivity(), fREObjectArr[0].getAsInt());
            return null;
        } catch (Exception e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
