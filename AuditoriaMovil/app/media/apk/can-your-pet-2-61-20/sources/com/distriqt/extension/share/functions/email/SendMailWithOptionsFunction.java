package com.distriqt.extension.share.functions.email;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.mail.MessageAttachment;
import com.distriqt.extension.share.utils.Errors;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SendMailWithOptionsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            boolean z = false;
            int i = 0;
            if (shareContext.v) {
                String asString = fREObjectArr[0].getAsString();
                String asString2 = fREObjectArr[1].getAsString();
                String[] split = fREObjectArr[2].getAsString().split(",");
                String[] split2 = fREObjectArr[3].getAsString().split(",");
                String[] split3 = fREObjectArr[4].getAsString().split(",");
                ArrayList<MessageAttachment> arrayList = new ArrayList<>();
                FREArray fREArray = (FREArray) fREObjectArr[5];
                while (true) {
                    long j = i;
                    if (j >= fREArray.getLength()) {
                        break;
                    }
                    try {
                        FREObject objectAt = fREArray.getObjectAt(j);
                        MessageAttachment messageAttachment = new MessageAttachment();
                        messageAttachment.nativePath = objectAt.getProperty("nativePath").getAsString();
                        messageAttachment.mimeType = objectAt.getProperty("mimeType").getAsString();
                        messageAttachment.filename = objectAt.getProperty("filename").getAsString();
                        messageAttachment.location = objectAt.getProperty(FirebaseAnalytics.Param.LOCATION).getAsString();
                        arrayList.add(messageAttachment);
                    } catch (Exception e) {
                        Errors.handleException(e);
                    }
                    i++;
                }
                z = shareContext.email().sendMailWithOptions(asString, asString2, split, split2, split3, arrayList, fREObjectArr[6].getAsBool(), fREObjectArr[7].getAsBool());
            }
            return FREObject.newObject(z);
        } catch (Exception e2) {
            Errors.handleException(fREContext, e2);
            return null;
        }
    }
}
