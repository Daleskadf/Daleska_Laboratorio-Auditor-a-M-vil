package com.distriqt.core.utils;

import android.util.Log;
import java.util.Locale;
/* loaded from: classes.dex */
public class LogUtil {
    public static Boolean DEBUG_OUTPUTS_ENABLED = true;

    public static void d(String str, String str2, String str3, Object... objArr) {
        if (DEBUG_OUTPUTS_ENABLED.booleanValue()) {
            Log.d(str, str2 + "::" + String.format(Locale.UK, str3, objArr));
        }
    }

    public static void i(String str, String str2, String str3, Object... objArr) {
        Log.i(str, str2 + "::" + String.format(Locale.UK, str3, objArr));
    }
}
