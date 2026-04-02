package com.distriqt.extension.share.functions.applications;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.applications.IntentObject;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class StartActivityFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            IntentObject intentObject = new IntentObject();
            intentObject.packageName = getPropertyAsString(fREObjectArr[0], "packageName");
            intentObject.action = getPropertyAsString(fREObjectArr[0], "action");
            intentObject.data = getPropertyAsString(fREObjectArr[0], "data");
            intentObject.type = getPropertyAsString(fREObjectArr[0], "type");
            intentObject.extrasJSON = getPropertyAsString(fREObjectArr[0], "extrasJSON");
            return FREObject.newObject(((ShareContext) fREContext).applications().startActivity(intentObject));
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }

    private String getPropertyAsString(FREObject fREObject, String str) {
        try {
            if (fREObject.getProperty(str) != null) {
                return fREObject.getProperty(str).getAsString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
