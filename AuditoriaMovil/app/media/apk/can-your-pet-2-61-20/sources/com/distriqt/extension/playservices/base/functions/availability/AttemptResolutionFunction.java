package com.distriqt.extension.playservices.base.functions.availability;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.google.android.gms.common.GoogleApiAvailability;
/* loaded from: classes.dex */
public class AttemptResolutionFunction implements FREFunction {
    public static final int PLAY_SERVICES_REQUESTCODE = 99550;

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            GoogleApiAvailability.getInstance().getErrorResolutionPendingIntent(fREContext.getActivity(), fREObjectArr[0].getAsInt(), 99550).send();
            return null;
        } catch (Exception e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
