package com.adobe.air;
/* loaded from: classes.dex */
public class PanEventData {
    int mCurrentOrientation;
    int mKeyboardHeight;
    AIRWindowSurfaceView surface;

    public PanEventData(AIRWindowSurfaceView aIRWindowSurfaceView, int i, int i2) {
        this.surface = aIRWindowSurfaceView;
        this.mCurrentOrientation = i;
        this.mKeyboardHeight = i2;
    }
}
