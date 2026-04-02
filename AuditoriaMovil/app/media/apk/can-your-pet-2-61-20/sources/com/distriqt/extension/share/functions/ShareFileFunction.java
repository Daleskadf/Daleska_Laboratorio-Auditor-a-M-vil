package com.distriqt.extension.share.functions;

import android.graphics.Rect;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.activities.ShareOptions;
import com.distriqt.extension.share.events.ShareEvent;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class ShareFileFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            if (shareContext.v) {
                String asString = fREObjectArr[0].getAsString();
                String asString2 = fREObjectArr[1].getAsString();
                String asString3 = fREObjectArr[2].getAsString();
                ShareOptions shareOptions = new ShareOptions();
                try {
                    shareOptions.title = fREObjectArr[3].getProperty("title").getAsString();
                    shareOptions.autoScale = fREObjectArr[3].getProperty("autoScale").getAsBool();
                    shareOptions.showOpenIn = fREObjectArr[3].getProperty("showOpenIn").getAsBool();
                    shareOptions.useChooser = fREObjectArr[3].getProperty("useChooser").getAsBool();
                    shareOptions.packageName = fREObjectArr[3].getProperty("packageName").getAsString();
                    FREObject property = fREObjectArr[3].getProperty("position");
                    if (property != null) {
                        shareOptions.position = new Rect((int) property.getProperty("x").getAsDouble(), (int) property.getProperty("y").getAsDouble(), (int) property.getProperty("width").getAsDouble(), (int) property.getProperty("height").getAsDouble());
                    }
                } catch (Exception e) {
                    Errors.handleException(fREContext, e);
                }
                fREObjectArr[4].getAsBool();
                shareContext.shareController().shareFile(asString, asString2, asString3, shareOptions, fREObjectArr[5].getAsString());
                return null;
            }
            return null;
        } catch (Exception e2) {
            Errors.handleException(fREContext, e2);
            fREContext.dispatchStatusEventAsync(ShareEvent.FAILED, "");
            return null;
        }
    }
}
