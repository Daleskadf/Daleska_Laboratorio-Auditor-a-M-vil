package com.distriqt.extension.share.utils;

import com.adobe.fre.FREContext;
/* loaded from: classes.dex */
public class Errors {
    public static void handleException(Throwable th) {
        th.printStackTrace();
    }

    public static void handleException(FREContext fREContext, Throwable th) {
        handleException(th);
    }
}
