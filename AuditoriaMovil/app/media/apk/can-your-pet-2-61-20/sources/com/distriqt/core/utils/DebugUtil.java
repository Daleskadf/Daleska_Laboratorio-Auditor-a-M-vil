package com.distriqt.core.utils;

import android.os.Bundle;
/* loaded from: classes.dex */
public class DebugUtil {
    public static String bundleToString(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        String str = "Bundle{\n";
        for (String str2 : bundle.keySet()) {
            str = str + " " + str2 + " => " + bundle.get(str2) + ";\n";
        }
        return str + " }Bundle";
    }
}
