package com.distriqt.extension.firebase.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.firebase.Firebase;
import com.distriqt.extension.firebase.utils.Errors;
/* loaded from: classes.dex */
public class ImplementationFunction implements FREFunction {
    public static String TAG = "ImplementationFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(Firebase.IMPLEMENTATION);
        } catch (FREWrongThreadException e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
