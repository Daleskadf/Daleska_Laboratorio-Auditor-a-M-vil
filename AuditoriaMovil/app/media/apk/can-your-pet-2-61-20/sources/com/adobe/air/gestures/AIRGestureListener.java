package com.adobe.air.gestures;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.adobe.air.AIRWindowSurfaceView;
import com.adobe.air.SystemCapabilities;
import java.util.Objects;
/* loaded from: classes.dex */
public class AIRGestureListener implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    private static final String LOG_TAG = "AIRGestureListener";
    private static final int MAX_TOUCH_POINTS = 2;
    private static final float MM_PER_INCH = 25.4f;
    private static final float _FP_GESTURE_PAN_THRESHOLD_MM = 3.0f;
    private static final float _FP_GESTURE_ROTATION_THRESHOLD_DEGREES = 15.0f;
    private static final float _FP_GESTURE_SWIPE_PRIMARY_AXIS_MIN_MM = 10.0f;
    private static final float _FP_GESTURE_SWIPE_SECONDARY_AXIS_MAX_MM = 5.0f;
    private static final float _FP_GESTURE_ZOOM_PER_AXIS_THRESHOLD_MM = 3.0f;
    private static final float _FP_GESTURE_ZOOM_THRESHOLD_MM = 8.0f;
    private static final int kGestureAll = 8;
    private static final int kGestureBegin = 2;
    private static final int kGestureEnd = 4;
    private static final int kGesturePan = 1;
    private static final int kGestureRotate = 2;
    private static final int kGestureSwipe = 5;
    private static final int kGestureTwoFingerTap = 3;
    private static final int kGestureUpdate = 1;
    private static final int kGestureZoom = 0;
    private static int screenPPI;
    private TouchPoint mSecondaryPointOfTwoFingerTap;
    private AIRWindowSurfaceView mSurfaceView;
    private float mPreviousAbsoluteRotation = 0.0f;
    private boolean mInRotateTransformGesture = false;
    private boolean mInZoomTransformGesture = false;
    private boolean mInZoomTransformGestureX = false;
    private boolean mInZoomTransformGestureY = false;
    private boolean mInPanTransformGesture = false;
    private float mPreviousRotateLocX = 0.0f;
    private float mPreviousRotateLocY = 0.0f;
    private float mPreviousZoomLocX = 0.0f;
    private float mPreviousZoomLocY = 0.0f;
    private float mPreviousPanLocX = 0.0f;
    private float mPreviousPanLocY = 0.0f;
    private long mTwoFingerTapStartTime = 0;
    private boolean mDidOccurTwoFingerGesture = false;
    private int mCouldBeTwoFingerTap = 0;
    private TouchPoint mPrimaryPointOfTwoFingerTap = null;
    private boolean mCheckForSwipe = true;
    private TouchPoint[] mDownTouchPoints = new TouchPoint[2];

    private native boolean nativeOnGestureListener(int i, int i2, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8);

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class TouchPoint {
        private int pid;
        private float x;
        private float y;

        TouchPoint() {
            this.x = 0.0f;
            this.y = 0.0f;
            this.pid = 0;
        }

        TouchPoint(float f, float f2, int i) {
            this.x = f;
            this.y = f2;
            this.pid = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assign(float f, float f2, int i) {
            this.x = f;
            this.y = f2;
            this.pid = i;
        }
    }

    public AIRGestureListener(Context context, AIRWindowSurfaceView aIRWindowSurfaceView) {
        this.mSecondaryPointOfTwoFingerTap = null;
        this.mSurfaceView = aIRWindowSurfaceView;
        for (int i = 0; i < 2; i++) {
            this.mDownTouchPoints[i] = new TouchPoint();
        }
        this.mSecondaryPointOfTwoFingerTap = new TouchPoint();
        screenPPI = SystemCapabilities.GetScreenDPI(context);
    }

    public TouchPoint getDownTouchPoint(int i) {
        if (i < 0 || i >= 2) {
            return null;
        }
        return this.mDownTouchPoints[i];
    }

    public void setDownTouchPoint(float f, float f2, int i) {
        if (i < 0 || i >= 2) {
            return;
        }
        this.mDownTouchPoints[i].assign(f, f2, i);
    }

    public void setCouldBeTwoFingerTap(int i) {
        this.mCouldBeTwoFingerTap = i;
        if (i == 0) {
            this.mTwoFingerTapStartTime = System.currentTimeMillis();
            this.mDidOccurTwoFingerGesture = false;
        }
    }

    public int getCouldBeTwoFingerTap() {
        return this.mCouldBeTwoFingerTap;
    }

    public void setSecondaryPointOfTwoFingerTap(float f, float f2, int i) {
        this.mSecondaryPointOfTwoFingerTap = new TouchPoint(f, f2, i);
    }

    public void setPrimaryPointOfTwoFingerTap(float f, float f2, int i) {
        this.mPrimaryPointOfTwoFingerTap = new TouchPoint(f, f2, i);
    }

    public void mayStartNewTransformGesture() {
        this.mInRotateTransformGesture = false;
        this.mInZoomTransformGesture = false;
        this.mInZoomTransformGestureX = false;
        this.mInZoomTransformGestureY = false;
        this.mInPanTransformGesture = false;
    }

    public boolean getCheckForSwipe() {
        return this.mCheckForSwipe;
    }

    public void setCheckForSwipe(boolean z) {
        this.mCheckForSwipe = z;
    }

    public boolean endTwoFingerGesture() {
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode != 2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.mDidOccurTwoFingerGesture && this.mCouldBeTwoFingerTap == 3 && currentTimeMillis - this.mTwoFingerTapStartTime < ViewConfiguration.getTapTimeout()) {
            onTwoFingerTap();
        }
        endRotateGesture();
        endPanGesture();
        return true;
    }

    private void endRotateGesture() {
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode == 2 && this.mInRotateTransformGesture) {
            nativeOnGestureListener(4, 2, true, this.mPreviousRotateLocX, this.mPreviousRotateLocY, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            this.mInRotateTransformGesture = false;
        }
    }

    private void endZoomGesture() {
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode == 2 && this.mInZoomTransformGesture) {
            nativeOnGestureListener(4, 0, true, this.mPreviousZoomLocX, this.mPreviousZoomLocY, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            this.mInZoomTransformGesture = false;
            this.mInZoomTransformGestureX = false;
            this.mInZoomTransformGestureY = false;
        }
    }

    private void endPanGesture() {
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode == 2 && this.mInPanTransformGesture) {
            nativeOnGestureListener(4, 1, true, this.mPreviousPanLocX, this.mPreviousPanLocY, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            this.mInPanTransformGesture = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r24, android.view.MotionEvent r25, float r26, float r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.gestures.AIRGestureListener.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public boolean onTwoFingerTap() {
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode != 2) {
            return true;
        }
        boolean z = nativeOnGestureListener(8, 3, false, (this.mSecondaryPointOfTwoFingerTap.x + this.mPrimaryPointOfTwoFingerTap.x) / 2.0f, (this.mSecondaryPointOfTwoFingerTap.y + this.mPrimaryPointOfTwoFingerTap.y) / 2.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.mCouldBeTwoFingerTap = 0;
        return z;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() != 1 || this.mSurfaceView.nativeOnDoubleClickListener(motionEvent.getX(0), motionEvent.getY(0));
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.mInZoomTransformGesture) {
            endZoomGesture();
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i;
        float f;
        float f2;
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode != 2) {
            return true;
        }
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        double previousSpan = scaleGestureDetector.getPreviousSpan();
        double abs = Math.abs(scaleGestureDetector.getCurrentSpan() - previousSpan);
        double abs2 = Math.abs(scaleGestureDetector.getCurrentSpanX() - scaleGestureDetector.getPreviousSpanX());
        double abs3 = Math.abs(scaleGestureDetector.getCurrentSpanY() - scaleGestureDetector.getPreviousSpanY());
        if (previousSpan != 0.0d) {
            boolean z = this.mInZoomTransformGesture;
            if (z || (abs * 25.399999618530273d) / screenPPI > 8.0d) {
                if (z) {
                    i = 1;
                } else {
                    this.mInZoomTransformGesture = true;
                    this.mDidOccurTwoFingerGesture = true;
                    i = 2;
                }
                if (scaleGestureDetector.getPreviousSpanX() == 0.0f || scaleGestureDetector.getCurrentSpanX() == 0.0f || (!this.mInZoomTransformGestureX && (abs2 * 25.399999618530273d) / screenPPI <= 3.0d)) {
                    f = 1.0f;
                } else {
                    float abs4 = Math.abs(scaleGestureDetector.getCurrentSpanX() / scaleGestureDetector.getPreviousSpanX());
                    this.mInZoomTransformGestureX = true;
                    f = abs4;
                }
                if (scaleGestureDetector.getPreviousSpanY() == 0.0f || scaleGestureDetector.getCurrentSpanY() == 0.0f || (!this.mInZoomTransformGestureY && (abs3 * 25.399999618530273d) / screenPPI <= 3.0d)) {
                    f2 = 1.0f;
                } else {
                    float abs5 = Math.abs(scaleGestureDetector.getCurrentSpanY() / scaleGestureDetector.getPreviousSpanY());
                    this.mInZoomTransformGestureY = true;
                    f2 = abs5;
                }
                this.mPreviousZoomLocX = focusX;
                this.mPreviousZoomLocY = focusY;
                nativeOnGestureListener(i, 0, true, focusX, focusY, f, f2, 0.0f, 0.0f, 0.0f, 0.0f);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        int multitouchMode = this.mSurfaceView.getMultitouchMode();
        Objects.requireNonNull(this.mSurfaceView);
        if (multitouchMode == 2 && this.mInZoomTransformGesture) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            nativeOnGestureListener(4, 0, true, this.mPreviousZoomLocX, this.mPreviousZoomLocY, scaleFactor, scaleFactor, 0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private float getRotation(TouchPoint touchPoint, TouchPoint touchPoint2, TouchPoint touchPoint3, TouchPoint touchPoint4) {
        if (touchPoint.pid == touchPoint3.pid && touchPoint2.pid == touchPoint4.pid) {
            return (float) (((Math.atan2(touchPoint4.y - touchPoint3.y, touchPoint4.x - touchPoint3.x) * 180.0d) / 3.141592653589793d) - ((Math.atan2(touchPoint2.y - touchPoint.y, touchPoint2.x - touchPoint.x) * 180.0d) / 3.141592653589793d));
        }
        return 0.0f;
    }

    private boolean isPanGesture(TouchPoint touchPoint, TouchPoint touchPoint2, TouchPoint touchPoint3, TouchPoint touchPoint4) {
        float f = touchPoint3.x - touchPoint.x;
        float f2 = touchPoint3.y - touchPoint.y;
        float f3 = touchPoint4.x - touchPoint2.x;
        float f4 = touchPoint4.y - touchPoint2.y;
        float min = Math.min(Math.abs(f), Math.abs(f3));
        float min2 = Math.min(Math.abs(f2), Math.abs(f4));
        double sqrt = Math.sqrt((min * min) + (min2 * min2));
        if ((f < 0.0f || f3 < 0.0f) && (f > 0.0f || f3 > 0.0f)) {
            return false;
        }
        if ((f2 < 0.0f || f4 < 0.0f) && (f2 > 0.0f || f4 > 0.0f)) {
            return false;
        }
        return this.mInPanTransformGesture || sqrt > ((double) ((((float) screenPPI) * 3.0f) / MM_PER_INCH));
    }

    private double distanceBetweenPoints(TouchPoint touchPoint, TouchPoint touchPoint2) {
        return Math.sqrt(Math.pow(touchPoint2.x - touchPoint.x, 2.0d) + Math.pow(touchPoint2.y - touchPoint.y, 2.0d));
    }
}
