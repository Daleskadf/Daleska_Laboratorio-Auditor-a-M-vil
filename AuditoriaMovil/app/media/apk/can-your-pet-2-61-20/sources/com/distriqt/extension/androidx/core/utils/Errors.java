package com.distriqt.extension.androidx.core.utils;

import com.adobe.fre.FREContext;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.androidx.core.CoreExtension;
/* loaded from: classes.dex */
public class Errors {
    public static void handleException(FREContext fREContext, Throwable th) {
        FREUtils.handleException(fREContext, th);
    }

    public static void handleException(Throwable th) {
        FREUtils.handleException(CoreExtension.context, th);
    }
}
