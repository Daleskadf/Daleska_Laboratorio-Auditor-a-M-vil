package com.distriqt.extension.applicationrater.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.applicationrater.ApplicationRater;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(ApplicationRater.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(ApplicationRater.ID, str, str2, objArr);
    }
}
