package com.distriqt.extension.androidx.constraintlayout.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.androidx.constraintlayout.ConstraintlayoutExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(ConstraintlayoutExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(ConstraintlayoutExtension.ID, str, str2, objArr);
    }
}
