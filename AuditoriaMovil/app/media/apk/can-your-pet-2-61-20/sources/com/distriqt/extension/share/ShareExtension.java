package com.distriqt.extension.share;

import android.util.Log;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class ShareExtension implements FREExtension {
    public static ShareContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        ShareContext shareContext = new ShareContext();
        context = shareContext;
        return shareContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }

    public static void dispatchEvent(String str, String str2) {
        ShareContext shareContext = context;
        if (shareContext != null) {
            shareContext.dispatchEvent(str, str2);
        } else {
            Log.e(Share.ID, "ERROR::dispatchEvent failed as there is no context!");
        }
    }
}
