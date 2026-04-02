package com.distriqt.extension.share.functions.applications;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.applications.ApplicationOptions;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class LaunchFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            String asString = fREObjectArr[0].getProperty("packageName").getAsString();
            FREObject fREObject = fREObjectArr[1];
            ApplicationOptions applicationOptions = new ApplicationOptions();
            applicationOptions.data = fREObject.getProperty("data").getAsString();
            applicationOptions.action = fREObject.getProperty("action").getAsString();
            applicationOptions.type = fREObject.getProperty("type").getAsString();
            applicationOptions.parameters = fREObject.getProperty("parameters").getAsString();
            String[] GetObjectAsArrayOfStrings = FREUtils.GetObjectAsArrayOfStrings((FREArray) fREObjectArr[2]);
            FREObject property = fREObject.getProperty("extras");
            for (String str : GetObjectAsArrayOfStrings) {
                applicationOptions.extras.put(str, property.getProperty(str).getAsString());
            }
            ShareContext shareContext = (ShareContext) fREContext;
            if (shareContext.v) {
                shareContext.applications().launch(asString, applicationOptions);
            }
            return FREObject.newObject(false);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
