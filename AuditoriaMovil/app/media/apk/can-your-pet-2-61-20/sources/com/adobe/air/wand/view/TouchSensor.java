package com.adobe.air.wand.view;

import com.adobe.air.TouchEventData;
/* loaded from: classes.dex */
public class TouchSensor {
    private static final String LOG_TAG = "TouchSensor";
    private Listener mListener = null;
    private boolean mTouchEventListening = false;
    private boolean mGestureEventListening = false;

    /* loaded from: classes.dex */
    public interface Listener {
        void onGestureEvent(GestureEventData gestureEventData);

        void onTouchEvent(TouchEventData touchEventData);
    }

    public void TouchListener() {
    }

    public void setListener(Listener listener) throws Exception {
        if (listener == null) {
            throw new Exception("Invalid Listener");
        }
        this.mListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchEvent(TouchEventData touchEventData) {
        Listener listener;
        if (!this.mTouchEventListening || (listener = this.mListener) == null) {
            return;
        }
        listener.onTouchEvent(touchEventData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchEvent(GestureEventData gestureEventData) {
        Listener listener;
        if (!this.mGestureEventListening || (listener = this.mListener) == null) {
            return;
        }
        listener.onGestureEvent(gestureEventData);
    }

    public void startTouchEventListening() {
        this.mTouchEventListening = true;
    }

    public void stopTouchEventListening() {
        this.mTouchEventListening = false;
    }

    public void startGestureEventListening() {
        this.mGestureEventListening = true;
    }

    public void stopGestureEventListening() {
        this.mGestureEventListening = false;
    }

    public boolean activeTouchListening() {
        return this.mTouchEventListening;
    }

    public boolean activeGestureListening() {
        return this.mGestureEventListening;
    }
}
