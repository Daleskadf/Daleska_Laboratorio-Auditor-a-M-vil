package com.distriqt.extension.guava.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.guava.GuavaExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(GuavaExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(GuavaExtension.ID, str, str2, objArr);
    }
}
