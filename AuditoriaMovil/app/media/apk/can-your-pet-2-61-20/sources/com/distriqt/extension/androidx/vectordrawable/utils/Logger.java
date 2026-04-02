package com.distriqt.extension.androidx.vectordrawable.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.androidx.vectordrawable.VectordrawableExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(VectordrawableExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(VectordrawableExtension.ID, str, str2, objArr);
    }
}
