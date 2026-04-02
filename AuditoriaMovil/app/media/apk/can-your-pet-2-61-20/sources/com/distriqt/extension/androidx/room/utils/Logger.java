package com.distriqt.extension.androidx.room.utils;

import com.distriqt.core.utils.LogUtil;
import com.distriqt.extension.androidx.room.RoomExtension;
/* loaded from: classes.dex */
public class Logger {
    public static void d(String str, String str2, Object... objArr) {
        LogUtil.d(RoomExtension.ID, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogUtil.i(RoomExtension.ID, str, str2, objArr);
    }
}
