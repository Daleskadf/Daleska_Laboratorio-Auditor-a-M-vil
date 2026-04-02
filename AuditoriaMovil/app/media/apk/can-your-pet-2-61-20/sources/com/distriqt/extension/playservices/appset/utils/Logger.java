package com.distriqt.extension.playservices.appset.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.playservices.appset.AppSet;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(AppSet.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(AppSet.ID, str, str2, objArr);
    }
}
