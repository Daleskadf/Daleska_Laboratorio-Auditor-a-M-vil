package com.distriqt.extension.playservices.appset.utils;

import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.playservices.appset.AppSet;
/* loaded from: classes.dex */
public class Errors {
    private static final boolean DEBUG_ENABLED = true;

    public static void handleException(IExtensionContext iExtensionContext, Throwable th) {
        try {
            th.printStackTrace();
            if (iExtensionContext != null) {
                String str = "unknown";
                if (th != null) {
                    try {
                        str = th.getMessage();
                    } catch (Throwable unused) {
                    }
                }
                iExtensionContext.dispatchEvent("extension:error", str);
            }
        } catch (Exception unused2) {
            th.printStackTrace();
        }
    }

    public static void handleException(Throwable th) {
        handleException(AppSet.context, th);
    }
}
