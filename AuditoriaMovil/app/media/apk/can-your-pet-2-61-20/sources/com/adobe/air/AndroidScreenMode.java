package com.adobe.air;

import android.hardware.display.DisplayManager;
import android.view.Display;
/* loaded from: classes.dex */
public class AndroidScreenMode {
    private static final String LOG_TAG = "AndroidScreenMode";

    private AndroidScreenMode() {
    }

    public static Object[] getScreenModes(int i) {
        Display.Mode[] supportedModes;
        supportedModes = getDisplayById(i).getSupportedModes();
        return supportedModes;
    }

    public static Display getDisplayById(int i) {
        return ((DisplayManager) AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getApplicationContext().getSystemService("display")).getDisplay(i);
    }

    public static int getModeHeight(Object obj) {
        int physicalHeight;
        physicalHeight = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m195m(obj).getPhysicalHeight();
        return physicalHeight;
    }

    public static int getModeWidth(Object obj) {
        int physicalWidth;
        physicalWidth = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m195m(obj).getPhysicalWidth();
        return physicalWidth;
    }

    public static float getRefreshRate(Object obj) {
        float refreshRate;
        refreshRate = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m195m(obj).getRefreshRate();
        return refreshRate;
    }
}
