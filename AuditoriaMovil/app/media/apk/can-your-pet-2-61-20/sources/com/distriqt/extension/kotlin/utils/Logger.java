package com.distriqt.extension.kotlin.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.kotlin.KotlinExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(KotlinExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(KotlinExtension.ID, str, str2, objArr);
    }
}
