package com.chad.library.adapter.base.util;
/* loaded from: classes.dex */
public class TouchEventUtil {
    public static String getTouchAction(int i10) {
        String str = "Unknow:id=" + i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "ACTION_OUTSIDE";
                        }
                        return str;
                    }
                    return "ACTION_CANCEL";
                }
                return "ACTION_MOVE";
            }
            return "ACTION_UP";
        }
        return "ACTION_DOWN";
    }
}
