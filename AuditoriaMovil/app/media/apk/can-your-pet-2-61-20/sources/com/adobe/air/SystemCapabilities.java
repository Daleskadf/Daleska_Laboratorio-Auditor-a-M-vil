package com.adobe.air;

import android.content.Context;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.harman.services.AIRRuntimeCheck;
import java.util.Arrays;
/* loaded from: classes.dex */
public class SystemCapabilities {
    private static final String LOG_TAG = "SystemCapabilities";

    private static WindowManager getWindowManager(Context context) {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        if (GetAndroidActivityWrapper != null) {
            context = GetAndroidActivityWrapper.getDefaultContext();
        }
        return (WindowManager) context.getSystemService("window");
    }

    public static int GetScreenHRes(Context context) {
        Display defaultDisplay = getWindowManager(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static int GetRealScreenHRes(Context context) {
        Display defaultDisplay = getWindowManager(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.x;
    }

    public static int GetScreenVRes(Context context) {
        Display defaultDisplay = getWindowManager(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static int GetRealScreenVRes(Context context) {
        Display defaultDisplay = getWindowManager(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    public static int GetScreenDPI(Context context) {
        if (!AIRRuntimeCheck.shouldPreventBuildModelAccess()) {
            String[] strArr = {"SCH-I800", "SPH-P100", "SC-01C", "GT-P1000", "GT-P1010", "GT-P1000R", "GT-P1000M", "SHW-M180W", "SHW-M180L", "SHW-M180K", "SHW-M180S", "SGH-I987", "SGH-t849"};
            String str = Build.MODEL;
            Arrays.sort(strArr);
            if (Arrays.binarySearch(strArr, str) >= 0) {
                return 160;
            }
        }
        WindowManager windowManager = getWindowManager(context);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static int GetBitsPerPixel(Context context) {
        Display defaultDisplay = getWindowManager(context).getDefaultDisplay();
        PixelFormat pixelFormat = new PixelFormat();
        PixelFormat.getPixelFormatInfo(defaultDisplay.getPixelFormat(), pixelFormat);
        return pixelFormat.bitsPerPixel;
    }

    public static boolean HasTrackBall(Context context) {
        return context.getResources().getConfiguration().navigation == 3;
    }
}
