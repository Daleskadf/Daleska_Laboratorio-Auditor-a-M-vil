package com.adobe.air;
/* loaded from: classes.dex */
public class WindowEventData {
    static final int SET_KEYBOARD_VISIBLE = 1;
    int mMsg;
    boolean mVal;
    AIRWindowSurfaceView surface;

    public WindowEventData(AIRWindowSurfaceView aIRWindowSurfaceView, int i, boolean z) {
        this.surface = aIRWindowSurfaceView;
        this.mMsg = i;
        this.mVal = z;
    }

    public void run() {
        if (this.mMsg != 1) {
            return;
        }
        this.surface.nativeSetKeyboardVisible(this.mVal);
    }
}
