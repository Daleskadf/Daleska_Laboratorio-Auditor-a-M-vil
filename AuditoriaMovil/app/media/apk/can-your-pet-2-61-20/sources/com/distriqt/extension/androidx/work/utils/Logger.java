package com.distriqt.extension.androidx.work.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.androidx.work.WorkExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(WorkExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(WorkExtension.ID, str, str2, objArr);
    }
}
