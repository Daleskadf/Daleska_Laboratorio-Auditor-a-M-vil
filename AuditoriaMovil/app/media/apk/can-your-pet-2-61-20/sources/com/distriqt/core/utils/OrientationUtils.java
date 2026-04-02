package com.distriqt.core.utils;

import android.app.Activity;
import android.util.DisplayMetrics;
/* loaded from: classes.dex */
public class OrientationUtils {
    public static int getScreenRotation(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                return rotation != 3 ? 0 : 270;
            }
            return 180;
        }
        return 90;
    }

    public static int getScreenOrientation(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && i2 > i) || ((rotation == 1 || rotation == 3) && i > i2)) {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation == 3) {
                            return 8;
                        }
                    }
                    return 9;
                }
                return 0;
            }
            return 1;
        }
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation == 2) {
                    return 8;
                }
                if (rotation == 3) {
                    return 9;
                }
            }
            return 1;
        }
        return 0;
    }
}
