package com.distriqt.extension.firebase.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.firebase.FirebaseContext;
import com.distriqt.extension.firebase.controller.FirebaseOptions;
import com.distriqt.extension.firebase.utils.Errors;
/* loaded from: classes.dex */
public class InitialiseAppFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FirebaseOptions firebaseOptions;
        try {
            FirebaseContext firebaseContext = (FirebaseContext) fREContext;
            boolean z = false;
            if (firebaseContext.v) {
                if (fREObjectArr[0] != null) {
                    firebaseOptions = new FirebaseOptions();
                    firebaseOptions.apiKey = fREObjectArr[0].getProperty("apiKey").getAsString();
                    firebaseOptions.clientID = fREObjectArr[0].getProperty("clientID").getAsString();
                    firebaseOptions.gcmSenderID = fREObjectArr[0].getProperty("gcmSenderID").getAsString();
                    firebaseOptions.googleAppID = fREObjectArr[0].getProperty("googleAppID").getAsString();
                    firebaseOptions.databaseURL = fREObjectArr[0].getProperty("databaseURL").getAsString();
                    firebaseOptions.storageBucket = fREObjectArr[0].getProperty("storageBucket").getAsString();
                    z = firebaseContext.controller().initialiseApp(firebaseOptions);
                }
                firebaseOptions = null;
                z = firebaseContext.controller().initialiseApp(firebaseOptions);
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
