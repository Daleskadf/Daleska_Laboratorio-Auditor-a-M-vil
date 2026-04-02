package com.distriqt.extension.playservices.cloudmessaging.utils;

import com.adobe.fre.FREContext;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.playservices.cloudmessaging.CloudMessagingExtension;
/* loaded from: classes.dex */
public class Errors {
    public static void handleException(FREContext fREContext, Throwable th) {
        FREUtils.handleException(fREContext, th);
    }

    public static void handleException(Throwable th) {
        FREUtils.handleException(CloudMessagingExtension.context, th);
    }
}
