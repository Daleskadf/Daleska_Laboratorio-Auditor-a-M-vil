package com.distriqt.extension.firebase.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.firebase.Firebase;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(Firebase.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(Firebase.ID, str, str2, objArr);
    }
}
