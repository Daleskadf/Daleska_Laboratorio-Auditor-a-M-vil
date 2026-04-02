package com.distriqt.extension.share.functions.social;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.controller.SocialPost;
import com.distriqt.extension.share.utils.Errors;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class SharePostFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            if (shareContext.v) {
                SocialPost socialPost = new SocialPost();
                socialPost.text = fREObjectArr[0].getProperty("text").getAsString();
                socialPost.urls = new ArrayList<>(Arrays.asList(FREUtils.GetObjectAsArrayOfStrings((FREArray) fREObjectArr[0].getProperty("urls"))));
                shareContext.socialController().sharePost(socialPost, fREObjectArr[1].getAsString());
            }
            return FREObject.newObject(false);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
