package com.distriqt.extension.play.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.play.playExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(playExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(playExtension.ID, str, str2, objArr);
    }
}
