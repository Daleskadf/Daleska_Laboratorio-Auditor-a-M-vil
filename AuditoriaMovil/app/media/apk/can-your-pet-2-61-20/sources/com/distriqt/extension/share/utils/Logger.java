package com.distriqt.extension.share.utils;

import android.util.Log;
import com.distriqt.extension.share.Share;
import java.util.Locale;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        String str3 = Share.ID;
        Log.d(str3, str + "::" + String.format(Locale.UK, str2, objArr));
    }

    public static void i(String str, String str2, Object... objArr) {
        String str3 = Share.ID;
        Log.i(str3, str + "::" + String.format(Locale.UK, str2, objArr));
    }
}
