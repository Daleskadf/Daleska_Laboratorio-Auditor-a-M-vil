package com.distriqt.extension.packagemanager.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.packagemanager.PackageManager;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(PackageManager.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(PackageManager.ID, str, str2, objArr);
    }
}
