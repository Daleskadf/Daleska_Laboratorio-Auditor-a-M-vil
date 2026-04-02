package com.distriqt.extension.androidx.browser.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.androidx.browser.BrowserExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(BrowserExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(BrowserExtension.ID, str, str2, objArr);
    }
}
