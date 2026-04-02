package com.distriqt.extension.gson.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.gson.GsonExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(GsonExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(GsonExtension.ID, str, str2, objArr);
    }
}
