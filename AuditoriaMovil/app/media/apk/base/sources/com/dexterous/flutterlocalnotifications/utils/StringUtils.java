package com.dexterous.flutterlocalnotifications.utils;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        boolean z7;
        if (str != null && !str.isEmpty()) {
            z7 = false;
        } else {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }
}
