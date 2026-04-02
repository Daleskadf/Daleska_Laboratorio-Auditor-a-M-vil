package com.distriqt.extension.applicationrater.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.applicationrater.ApplicationRaterContext;
import com.distriqt.extension.applicationrater.events.ApplicationRaterEvent;
import com.distriqt.extension.applicationrater.utils.Errors;
/* loaded from: classes.dex */
public class RateFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            String asString = fREObjectArr[0].getAsString();
            String asString2 = fREObjectArr[1].getAsString();
            ApplicationRaterContext applicationRaterContext = (ApplicationRaterContext) fREContext;
            if (applicationRaterContext.v) {
                applicationRaterContext.controller().rate(asString, asString2);
                applicationRaterContext.dispatchEvent(ApplicationRaterEvent.SELECTED_RATE, "");
                return null;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
