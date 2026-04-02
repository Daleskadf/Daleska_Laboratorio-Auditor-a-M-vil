package com.distriqt.extension.share.functions.sms;

import com.adobe.air.wand.message.MessageManager;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.sms.SMS;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class SendSMSFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            boolean z = false;
            if (shareContext.v) {
                SMS sms = new SMS();
                sms.address = fREObjectArr[0].getProperty("address").getAsString();
                sms.message = fREObjectArr[0].getProperty(MessageManager.NAME_ERROR_MESSAGE).getAsString();
                sms.id = fREObjectArr[0].getProperty("id").getAsString();
                if (fREObjectArr[0].getProperty("scAddress") != null) {
                    sms.scAddress = fREObjectArr[0].getProperty("scAddress").getAsString();
                }
                z = shareContext.smsController().sendSMS(sms, fREObjectArr[1].getAsInt());
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
