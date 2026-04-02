package com.distriqt.extension.applicationrater.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.applicationrater.ApplicationRaterContext;
/* loaded from: classes.dex */
public class RetrieveApplicationIdFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ApplicationRaterContext applicationRaterContext = (ApplicationRaterContext) fREContext;
            if (applicationRaterContext.v) {
                applicationRaterContext.controller().retrieveApplicationId();
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
