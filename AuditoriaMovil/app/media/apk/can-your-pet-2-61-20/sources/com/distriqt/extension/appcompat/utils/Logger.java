package com.distriqt.extension.appcompat.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.appcompat.AppcompatExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(AppcompatExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(AppcompatExtension.ID, str, str2, objArr);
    }
}
