package com.distriqt.extension.adverts.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.adverts.AdvertsExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(AdvertsExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(AdvertsExtension.ID, str, str2, objArr);
    }
}
