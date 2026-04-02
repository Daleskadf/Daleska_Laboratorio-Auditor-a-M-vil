package com.distriqt.extension.playservices.cloudmessaging.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.playservices.cloudmessaging.CloudMessagingExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(CloudMessagingExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(CloudMessagingExtension.ID, str, str2, objArr);
    }
}
