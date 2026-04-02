package com.distriqt.extension.androidx.browser.utils;

import com.adobe.fre.FREContext;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.androidx.browser.BrowserExtension;
/* loaded from: classes.dex */
public class Errors {
    public static void handleException(FREContext fREContext, Throwable th) {
        FREUtils.handleException(fREContext, th);
    }

    public static void handleException(Throwable th) {
        FREUtils.handleException(BrowserExtension.context, th);
    }
}
