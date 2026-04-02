package com.distriqt.extension.firebase.functions.analytics;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.firebase.FirebaseContext;
import com.distriqt.extension.firebase.utils.Errors;
/* loaded from: classes.dex */
public class SetSessionTimeoutDurationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            FirebaseContext firebaseContext = (FirebaseContext) fREContext;
            boolean z = false;
            if (firebaseContext.v) {
                z = firebaseContext.controller().analytics().setSessionTimeoutDuration(fREObjectArr[0].getAsInt());
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
