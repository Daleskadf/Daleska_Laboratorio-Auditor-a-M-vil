package com.distriqt.extension.applicationrater.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.applicationrater.ApplicationRaterContext;
import com.distriqt.extension.applicationrater.utils.Errors;
/* loaded from: classes.dex */
public class ShowRateDialogFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            String asString = fREObjectArr[0].getAsString();
            String asString2 = fREObjectArr[1].getAsString();
            String asString3 = fREObjectArr[2].getAsString();
            String asString4 = fREObjectArr[3].getAsString();
            String asString5 = fREObjectArr[4].getAsString();
            String asString6 = fREObjectArr[5].getAsString();
            String asString7 = fREObjectArr[6].getAsString();
            String asString8 = fREObjectArr[7].getAsString();
            ApplicationRaterContext applicationRaterContext = (ApplicationRaterContext) fREContext;
            if (applicationRaterContext.v) {
                applicationRaterContext.controller().showRateDialog(asString, asString7, asString2, asString3, asString4, asString5, asString6, asString8);
                return null;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
