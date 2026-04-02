package com.distriqt.extension.firebase.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.firebase.FirebaseContext;
import com.distriqt.extension.firebase.controller.FirebaseOptions;
import com.distriqt.extension.firebase.utils.Errors;
/* loaded from: classes.dex */
public class GetOptionsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FirebaseOptions options;
        try {
            FirebaseContext firebaseContext = (FirebaseContext) fREContext;
            if (!firebaseContext.v || (options = firebaseContext.controller().getOptions()) == null) {
                return null;
            }
            return FREObject.newObject(options.toJSONObject().toString());
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
