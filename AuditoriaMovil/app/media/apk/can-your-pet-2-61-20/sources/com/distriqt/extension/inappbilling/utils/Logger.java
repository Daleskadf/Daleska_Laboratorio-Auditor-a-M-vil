package com.distriqt.extension.inappbilling.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.inappbilling.InAppBilling;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.i(InAppBilling.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.d(InAppBilling.ID, str, str2, objArr);
    }
}
