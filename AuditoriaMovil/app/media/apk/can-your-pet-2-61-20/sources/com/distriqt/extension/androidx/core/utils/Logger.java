package com.distriqt.extension.androidx.core.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.androidx.core.CoreExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(CoreExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(CoreExtension.ID, str, str2, objArr);
    }
}
