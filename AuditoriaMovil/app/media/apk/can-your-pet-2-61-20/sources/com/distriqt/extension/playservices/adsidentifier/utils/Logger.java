package com.distriqt.extension.playservices.adsidentifier.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.playservices.adsidentifier.AdsIdentifierExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(AdsIdentifierExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(AdsIdentifierExtension.ID, str, str2, objArr);
    }
}
