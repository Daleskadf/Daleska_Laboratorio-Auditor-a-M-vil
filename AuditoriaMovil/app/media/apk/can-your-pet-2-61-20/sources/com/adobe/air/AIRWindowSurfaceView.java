package com.adobe.air;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ResultReceiver;
import android.provider.Settings;
import android.text.ClipboardManager;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adobe.air.AndroidLocale;
import com.adobe.air.gestures.AIRGestureListener;
import com.adobe.air.utils.AIRLogger;
import com.adobe.air.utils.Utils;
import com.adobe.flashruntime.air.VideoViewAIR;
import com.adobe.flashruntime.shared.VideoView;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* loaded from: classes.dex */
public class AIRWindowSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    static final int CURSOR_POS_END_DOCUMENT = 3;
    static final int CURSOR_POS_END_LINE = 1;
    static final int CURSOR_POS_START_DOCUMENT = 2;
    static final int CURSOR_POS_START_LINE = 0;
    static final int ID_COPY = 3;
    static final int ID_COPY_ALL = 4;
    static final int ID_CUT = 1;
    static final int ID_CUT_ALL = 2;
    static final int ID_PASTE = 5;
    static final int ID_SELECT_ALL = 0;
    static final int ID_START_SELECTING = 7;
    static final int ID_STOP_SELECTING = 8;
    static final int ID_SWITCH_INPUT_METHOD = 6;
    private static final String LOG_TAG = "AIRWindowSurfaceView";
    static final int LONG_PRESS_DELAY = 500;
    static final int MAX_MOVE_ACTION_ALLOWED = 4;
    static final int POST_TOUCH_MESSAGE_AFTER_DELAY = 0;
    private static final int kDefaultBitsPerPixel = 32;
    private static final int kMotionEventButtonSecondary = 2;
    private static final int kMotionEventToolTypeEraser = 4;
    private static final int kMotionEventToolTypeStylus = 2;
    private static final int kTouchActionBegin = 2;
    private static final int kTouchActionEnd = 4;
    private static final int kTouchActionHoverBegin = 16;
    private static final int kTouchActionHoverEnd = 32;
    private static final int kTouchActionHoverMove = 8;
    private static final int kTouchActionMove = 1;
    private static final int kTouchActionScrollH = 257;
    private static final int kTouchActionScrollV = 256;
    private static final int kTouchMetaStateIsEraser = 67108864;
    private static final int kTouchMetaStateIsPen = 33554432;
    private static final int kTouchMetaStateMask = 234881024;
    private static final int kTouchMetaStateSideButton1 = 134217728;
    private boolean inTouch;
    public final int kMultitouchGesture;
    public final int kMultitouchNone;
    public final int kMultitouchRaw;
    private final float kSampleSize;
    public int keyBoardHeight;
    private AndroidActivityWrapper mActivityWrapper;
    private int mBoundHeight;
    private int mBoundWidth;
    private boolean mContextMenuVisible;
    private int mCurrentOrientation;
    private int mCurrentSurfaceFormat;
    private boolean mDispatchUserTriggeredSkDeactivate;
    private float mDownX;
    private float mDownY;
    private boolean mEatTouchRelease;
    protected FlashEGL mFlashEGL;
    private AndroidStageText mFocusedStageText;
    private AndroidWebView mFocusedWebView;
    private GestureDetector mGestureDetector;
    private AIRGestureListener mGestureListener;
    private boolean mHideSoftKeyboardOnWindowFocusChange;
    private boolean mHoverInProgress;
    private int mHoverMetaState;
    private HoverTimeoutHandler mHoverTimeoutHandler;
    private int mHt;
    private AndroidInputConnection mInputConnection;
    InputMethodReceiver mInputMethodReceiver;
    private boolean mIsFullScreen;
    private float mLastTouchedXCoord;
    private float mLastTouchedYCoord;
    private CheckLongPress mLongPressCheck;
    private boolean mMaliWorkaround;
    private MetaKeyState mMetaAltState;
    private MetaKeyState mMetaShiftState;
    private int mMultitouchMode;
    private boolean mNeedsCompositingSurface;
    private Paint mPaint;
    private Paint mPaintScaled;
    private AndroidStageText mResizedStageText;
    private AndroidWebView mResizedWebView;
    private ScaleGestureDetector mScaleGestureDetector;
    private int mScaledTouchSlop;
    private int mSkipHeightFromTop;
    private boolean mSurfaceChangedForSoftKeyboard;
    protected SurfaceHolder mSurfaceHolder;
    private boolean mSurfaceValid;
    private Rect mTextBoxBounds;
    private boolean mTrackBallPressed;
    private VideoView mVideoView;
    private int mVisibleBoundHeight;
    private int mVisibleBoundWidth;
    private int mWd;
    private boolean mWindowHasFocus;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum MetaKeyState {
        INACTIVE,
        ACTIVE,
        PRESSED,
        LOCKED
    }

    private boolean AllowOSToHandleKeys(int i) {
        switch (i) {
            case 24:
            case 25:
            case 26:
                return true;
            default:
                return false;
        }
    }

    private native void nativeCutText(boolean z);

    private native void nativeDeleteTextLine();

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDispatchFullScreenEvent(boolean z);

    private native void nativeDispatchSelectionChangeEvent(boolean z);

    private native void nativeForceReDraw();

    private native int nativeGetMultitouchMode();

    private native String nativeGetSelectedText();

    private native int nativeGetSoftKeyboardType();

    private native Rect nativeGetTextBoxBounds();

    private native void nativeInsertText(String str);

    private native boolean nativeIsEditable();

    private native boolean nativeIsFullScreenInteractive();

    private native boolean nativeIsMultiLineTextField();

    private native boolean nativeIsPasswordField();

    private native boolean nativeIsTextFieldInSelectionMode();

    private native boolean nativeIsTextFieldSelectable();

    private native void nativeMoveCursor(int i);

    private native void nativeOnFormatChangeListener(int i);

    private native void nativeOnSizeChangedListener(int i, int i2, boolean z);

    private native void nativeSelectAllText();

    private native void nativeSurfaceCreated();

    private static boolean supportsSystemUiFlags() {
        return true;
    }

    private static boolean supportsSystemUiVisibilityAPI() {
        return true;
    }

    public void globalCheckHeight() {
    }

    public native void nativeDispatchUserTriggeredSkDeactivateEvent();

    public native ExtractedText nativeGetTextContent();

    public native int nativeGetTextContentLength();

    public native boolean nativeIsTextSelected();

    public native boolean nativeOnDoubleClickListener(float f, float f2);

    public native boolean nativeOnKeyListener(int i, int i2, int i3, boolean z, boolean z2, boolean z3);

    public native boolean nativePerformWindowPanning(int i, int i2);

    public native void nativeSetKeyboardVisible(boolean z);

    public native void nativeShowOriginalRect();

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    public View returnThis() {
        return this;
    }

    static /* synthetic */ boolean access$1200() {
        return supportsSystemUiVisibilityAPI();
    }

    static /* synthetic */ boolean access$1500() {
        return supportsSystemUiFlags();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class HoverTimeoutHandler extends Handler {
        static final int INTERVAL = 500;
        private AIRWindowSurfaceView mAIRWindowSurfaceView;
        private long mLastMove;

        public HoverTimeoutHandler(AIRWindowSurfaceView aIRWindowSurfaceView) {
            this.mAIRWindowSurfaceView = aIRWindowSurfaceView;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (System.currentTimeMillis() - this.mLastMove >= 500) {
                AIRWindowSurfaceView.this.mHoverInProgress = false;
                Entrypoints.registerTouchCallback(0, new TouchEventData(32, this.mAIRWindowSurfaceView.mLastTouchedXCoord, this.mAIRWindowSurfaceView.mLastTouchedYCoord, 0.0f, 0, 0.0f, 0.0f, true, null, this.mAIRWindowSurfaceView.mHoverMetaState), null);
                return;
            }
            AIRWindowSurfaceView.this.mHoverTimeoutHandler.sendEmptyMessageDelayed(0, 500L);
        }

        public void setLastMove(long j) {
            this.mLastMove = j;
        }
    }

    public AIRWindowSurfaceView(Context context, AndroidActivityWrapper androidActivityWrapper) {
        super(context);
        this.kMultitouchNone = 0;
        this.kMultitouchRaw = 1;
        this.kMultitouchGesture = 2;
        this.kSampleSize = 4.0f;
        this.mWd = 0;
        this.mHt = 0;
        this.mSurfaceValid = false;
        this.mSkipHeightFromTop = 0;
        this.mSurfaceHolder = null;
        this.mFlashEGL = null;
        this.mBoundHeight = 0;
        this.mBoundWidth = 0;
        this.mVisibleBoundWidth = 0;
        this.mVisibleBoundHeight = 0;
        this.mMultitouchMode = 0;
        this.mPaint = null;
        this.mPaintScaled = null;
        this.mMaliWorkaround = false;
        this.mHoverInProgress = false;
        this.mHoverMetaState = 0;
        this.mCurrentOrientation = 0;
        this.mEatTouchRelease = false;
        this.mContextMenuVisible = false;
        this.mLongPressCheck = null;
        this.mIsFullScreen = false;
        this.mSurfaceChangedForSoftKeyboard = false;
        this.mDispatchUserTriggeredSkDeactivate = true;
        this.mHideSoftKeyboardOnWindowFocusChange = false;
        this.mTrackBallPressed = false;
        this.mWindowHasFocus = true;
        this.mNeedsCompositingSurface = false;
        this.mCurrentSurfaceFormat = -1;
        this.mFocusedWebView = null;
        this.mResizedWebView = null;
        this.mFocusedStageText = null;
        this.mResizedStageText = null;
        this.inTouch = false;
        this.mMetaShiftState = MetaKeyState.INACTIVE;
        this.mMetaAltState = MetaKeyState.INACTIVE;
        this.mHoverTimeoutHandler = new HoverTimeoutHandler(this);
        this.mInputMethodReceiver = new InputMethodReceiver(this);
        this.keyBoardHeight = 0;
        this.mSurfaceHolder = getHolder();
        this.mActivityWrapper = androidActivityWrapper;
        setSurfaceFormat(false);
        this.mGestureListener = new AIRGestureListener(context, this);
        this.mGestureDetector = new GestureDetector(context, this.mGestureListener, null, false);
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this.mGestureListener);
        setWillNotDraw(false);
        setClickable(true);
        setEnabled(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mScaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mSurfaceHolder.addCallback(this);
        setZOrderMediaOverlay(true);
        globalCheckHeight();
        this.mActivityWrapper.registerPlane(this, 3);
    }

    public boolean setScreenFrame(int i) {
        if (this.mSurfaceHolder == null || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        this.mSurfaceHolder.getSurface().setFrameRate(i, 0);
        return true;
    }

    public AndroidActivityWrapper getActivityWrapper() {
        return this.mActivityWrapper;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        this.mWindowHasFocus = z;
        CheckLongPress checkLongPress = this.mLongPressCheck;
        if (checkLongPress != null) {
            removeCallbacks(checkLongPress);
        }
        if (this.mHideSoftKeyboardOnWindowFocusChange) {
            InputMethodManager inputMethodManager = getInputMethodManager();
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            this.mHideSoftKeyboardOnWindowFocusChange = false;
        }
        if (this.mIsFullScreen) {
            HideSystemUI();
        }
        if (z) {
            this.mContextMenuVisible = false;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        CheckLongPress checkLongPress;
        if (AllowOSToHandleKeys(i)) {
            return false;
        }
        int unicodeChar = keyEvent.getUnicodeChar();
        if (this.mMetaShiftState == MetaKeyState.ACTIVE || this.mMetaShiftState == MetaKeyState.LOCKED || this.mMetaAltState == MetaKeyState.ACTIVE || this.mMetaAltState == MetaKeyState.LOCKED) {
            unicodeChar = GetMetaKeyCharacter(keyEvent);
        }
        int i2 = unicodeChar;
        HandleMetaKeyAction(keyEvent);
        if (!this.mTrackBallPressed && (checkLongPress = this.mLongPressCheck) != null) {
            removeCallbacks(checkLongPress);
        }
        if (!this.mActivityWrapper.isApplicationLaunched() || HandleShortCuts(i, keyEvent)) {
            return false;
        }
        boolean nativeOnKeyListener = nativeOnKeyListener(keyEvent.getAction(), i, i2, keyEvent.isAltPressed(), keyEvent.isShiftPressed(), keyEvent.isSymPressed());
        AndroidInputConnection androidInputConnection = this.mInputConnection;
        if (androidInputConnection != null) {
            androidInputConnection.updateIMEText();
        }
        return nativeOnKeyListener;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (AllowOSToHandleKeys(i)) {
            return false;
        }
        int unicodeChar = keyEvent.getUnicodeChar();
        if (this.mMetaShiftState == MetaKeyState.ACTIVE || this.mMetaShiftState == MetaKeyState.LOCKED || this.mMetaAltState == MetaKeyState.ACTIVE || this.mMetaAltState == MetaKeyState.LOCKED) {
            unicodeChar = GetMetaKeyCharacter(keyEvent);
        }
        int i2 = unicodeChar;
        CheckLongPress checkLongPress = this.mLongPressCheck;
        if (checkLongPress != null) {
            removeCallbacks(checkLongPress);
        }
        if (i == 23) {
            this.mTrackBallPressed = false;
        }
        if (this.mActivityWrapper.isApplicationLaunched()) {
            boolean nativeOnKeyListener = nativeOnKeyListener(keyEvent.getAction(), i, i2, keyEvent.isAltPressed(), keyEvent.isShiftPressed(), keyEvent.isSymPressed());
            AndroidInputConnection androidInputConnection = this.mInputConnection;
            if (androidInputConnection != null) {
                androidInputConnection.updateIMEText();
            }
            if (nativeOnKeyListener || keyEvent.getKeyCode() != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || this.mActivityWrapper.getActivity() == null) {
                return nativeOnKeyListener;
            }
            this.mActivityWrapper.getActivity().moveTaskToBack(false);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        if (motionEvent.getActionMasked() == 8) {
            int axisValue = (int) motionEvent.getAxisValue(9);
            int axisValue2 = (int) motionEvent.getAxisValue(10);
            if ((axisValue2 >= 0 ? axisValue2 : -axisValue2) > (axisValue >= 0 ? axisValue : -axisValue)) {
                i = axisValue2;
                z = false;
            } else {
                i = axisValue;
                z = true;
            }
            if (axisValue != 0) {
                return Entrypoints.registerTouchCallback(0, new TouchEventData(z ? 256 : 257, (int) motionEvent.getAxisValue(0), (int) motionEvent.getAxisValue(1), 0.0f, 0, 0.0f, 0.0f, false, null, i), null);
            }
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 10 || motionEvent.getAction() == 7) {
            return onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        AIRLogger.d(LOG_TAG, "*** *** onFocusChanged: AIR");
        if (z && this.mFocusedStageText != null && !this.inTouch) {
            this.mDispatchUserTriggeredSkDeactivate = true;
            forceSoftKeyboardDown();
        }
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AIRWindowSurfaceView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setMultitouchMode(int i) {
        this.mMultitouchMode = i;
    }

    public int getMultitouchMode() {
        return this.mMultitouchMode;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mActivityWrapper.planeStepCascade();
        if (this.mIsFullScreen) {
            setFullScreen();
        }
        if (this.mActivityWrapper.isStarted() || this.mActivityWrapper.isResumed() || ((Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG") && Build.MODEL.equalsIgnoreCase("GT-I9300")) || Build.VERSION.SDK_INT >= 26)) {
            nativeSurfaceCreated();
        }
    }

    public static boolean hasNavBar(Activity activity, View view) {
        if (activity == null || view == null) {
            return true;
        }
        boolean hasPermanentMenuKey = ViewConfiguration.get(activity).hasPermanentMenuKey();
        if (KeyCharacterMap.deviceHasKey(4) || hasPermanentMenuKey) {
            return true;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int height = view.getHeight();
        return height == 0 || displayMetrics.heightPixels != height;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4;
        Activity activity = this.mActivityWrapper.getActivity();
        if (activity == null) {
            return;
        }
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (!hasNavBar(activity, getRootView()) && !hasStatusBar(activity.getWindow())) {
            HideSystemUI();
        }
        if (this.mIsFullScreen || (!hasNavBar(activity, getRootView()) && !hasStatusBar(activity.getWindow()))) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        this.mBoundHeight = point.y;
        this.mBoundWidth = point.x;
        this.mVisibleBoundHeight = i3;
        this.mVisibleBoundWidth = i2;
        nativeOnFormatChangeListener(i);
        if (!this.mSurfaceValid) {
            this.mSurfaceValid = true;
            this.mActivityWrapper.onSurfaceInitialized();
            setMultitouchMode(nativeGetMultitouchMode());
        }
        if (this.mSurfaceValid) {
            int i5 = getResources().getConfiguration().orientation;
            if (i5 != this.mCurrentOrientation) {
                showSoftKeyboard(false);
                nativeDispatchUserTriggeredSkDeactivateEvent();
                this.mDispatchUserTriggeredSkDeactivate = false;
            } else if ((i5 == 1 || i5 == 2) && i3 < (i4 = this.mHt)) {
                if (i3 == 0) {
                    return;
                }
                if (nativePerformWindowPanning(i5, i4 - i3)) {
                    this.mSurfaceChangedForSoftKeyboard = true;
                    return;
                }
            }
            boolean z = this.mCurrentOrientation != i5;
            this.mCurrentOrientation = i5;
            this.mWd = i2;
            this.mHt = i3;
            nativeOnSizeChangedListener(i2, i3, z);
            OrientationManager orientationManager = OrientationManager.getOrientationManager();
            if (orientationManager.mDispatchOrientationChangePending) {
                orientationManager.nativeOrientationChanged(orientationManager.mBeforeOrientation, orientationManager.mAfterOrientation);
                orientationManager.mDispatchOrientationChangePending = false;
            }
            nativeForceReDraw();
            forceSoftKeyboardDown();
        }
    }

    public void forceSoftKeyboardDown() {
        nativeShowOriginalRect();
        setScrollTo(0);
        if (this.mDispatchUserTriggeredSkDeactivate && this.mSurfaceChangedForSoftKeyboard) {
            nativeDispatchUserTriggeredSkDeactivateEvent();
        }
        Entrypoints.registerWindowCallback(0, new WindowEventData(this, 1, false), null);
        this.mDispatchUserTriggeredSkDeactivate = true;
        this.mSurfaceChangedForSoftKeyboard = false;
    }

    public boolean isSurfaceValid() {
        return this.mSurfaceValid;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mSurfaceValid = false;
        FlashEGL flashEGL = this.mFlashEGL;
        if (flashEGL != null) {
            flashEGL.DestroyWindowSurface();
        }
        this.mActivityWrapper.onSurfaceDestroyed();
        this.mActivityWrapper.planeBreakCascade();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class InputMethodReceiver extends ResultReceiver {
        private AIRWindowSurfaceView _surface;

        public InputMethodReceiver(AIRWindowSurfaceView aIRWindowSurfaceView) {
            super(AIRWindowSurfaceView.this.getHandler());
            this._surface = aIRWindowSurfaceView;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            if (i == 1 || i == 3) {
                AIRWindowSurfaceView.this.nativeShowOriginalRect();
            } else {
                Entrypoints.registerWindowCallback(0, new WindowEventData(this._surface, 1, true), null);
            }
        }
    }

    public void showSoftKeyboard(boolean z, View view) {
        AIRLogger.d(LOG_TAG, "showSoftKeyboard show: " + z);
        InputMethodManager inputMethodManager = getInputMethodManager();
        if (!z) {
            if (this.mSurfaceChangedForSoftKeyboard) {
                this.mDispatchUserTriggeredSkDeactivate = false;
            }
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            AndroidInputConnection androidInputConnection = this.mInputConnection;
            if (androidInputConnection != null) {
                androidInputConnection.Reset();
            }
            Entrypoints.registerWindowCallback(0, new WindowEventData(this, 1, false), null);
            return;
        }
        view.requestFocus();
        view.requestFocusFromTouch();
        inputMethodManager.showSoftInput(view, 1, this.mInputMethodReceiver);
    }

    public void showSoftKeyboard(boolean z) {
        showSoftKeyboard(z, this);
    }

    public void updateFocusedStageWebView(AndroidWebView androidWebView, boolean z) {
        if (z) {
            this.mFocusedWebView = androidWebView;
        } else if (this.mFocusedWebView == androidWebView) {
            this.mFocusedWebView = null;
        }
    }

    public boolean isStageWebViewInFocus() {
        AndroidWebView androidWebView = this.mFocusedWebView;
        if (androidWebView != null) {
            return androidWebView.isInTextEditingMode();
        }
        return false;
    }

    public long panStageWebViewInFocus() {
        AndroidWebView androidWebView = this.mFocusedWebView;
        if (androidWebView == null) {
            return 0L;
        }
        this.mResizedWebView = androidWebView;
        return androidWebView.updateViewBoundsWithKeyboard(this.mHt);
    }

    public void updateFocusedStageText(AndroidStageText androidStageText, boolean z) {
        if (z) {
            this.mFocusedStageText = androidStageText;
        } else if (this.mFocusedStageText == androidStageText) {
            this.mFocusedStageText = null;
        }
    }

    public boolean isStageTextInFocus() {
        return this.mFocusedStageText != null;
    }

    public long panStageTextInFocus() {
        AndroidStageText androidStageText = this.mFocusedStageText;
        if (androidStageText == null) {
            return 0L;
        }
        this.mResizedStageText = androidStageText;
        return androidStageText.updateViewBoundsWithKeyboard(this.mHt);
    }

    private boolean IsIMEInFullScreen() {
        return getInputMethodManager().isFullscreenMode();
    }

    public boolean setScrollTo(final int i) {
        this.mSkipHeightFromTop = i;
        final RelativeLayout overlaysLayout = this.mActivityWrapper.getOverlaysLayout(false);
        if (overlaysLayout != null) {
            post(new Runnable() { // from class: com.adobe.air.AIRWindowSurfaceView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i == 0 && AIRWindowSurfaceView.this.mResizedWebView != null) {
                        AIRWindowSurfaceView.this.mResizedWebView.resetGlobalBounds();
                        AIRWindowSurfaceView.this.mResizedWebView = null;
                    }
                    if (i == 0 && AIRWindowSurfaceView.this.mResizedStageText != null) {
                        AIRWindowSurfaceView.this.mResizedStageText.resetGlobalBounds();
                        AIRWindowSurfaceView.this.mResizedStageText = null;
                    }
                    overlaysLayout.setPadding(0, -i, 0, 0);
                    overlaysLayout.requestLayout();
                }
            });
            return true;
        }
        return true;
    }

    private void setSurfaceFormatImpl(boolean z, final int i) {
        if (z) {
            post(new Runnable() { // from class: com.adobe.air.AIRWindowSurfaceView.2
                @Override // java.lang.Runnable
                public void run() {
                    AIRWindowSurfaceView.this.mSurfaceHolder.setFormat(i);
                    AIRWindowSurfaceView.this.mCurrentSurfaceFormat = i;
                }
            });
            return;
        }
        this.mSurfaceHolder.setFormat(i);
        this.mCurrentSurfaceFormat = i;
    }

    public void setSurfaceFormat(boolean z) {
        if (!this.mActivityWrapper.useRGB565()) {
            if (this.mNeedsCompositingSurface || this.mActivityWrapper.needsCompositingSurface() || !AndroidActivityWrapper.isGingerbread()) {
                setSurfaceFormatImpl(z, 1);
            } else {
                setSurfaceFormatImpl(z, 2);
            }
        } else if (this.mNeedsCompositingSurface) {
            setSurfaceFormatImpl(z, 1);
        } else {
            setSurfaceFormatImpl(z, 4);
        }
    }

    public void setCompositingHint(boolean z) {
        this.mNeedsCompositingSurface = z;
        if (z && this.mCurrentSurfaceFormat == 1) {
            return;
        }
        if (z || this.mCurrentSurfaceFormat != 2) {
            setSurfaceFormat(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r6 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(int r4, int r5, int r6, int r7, android.graphics.Bitmap r8) {
        /*
            r3 = this;
            boolean r0 = r3.mSurfaceValid
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r0 = new android.graphics.Rect
            int r6 = r6 + r4
            int r7 = r7 + r5
            r0.<init>(r4, r5, r6, r7)
            int r4 = r3.mSkipHeightFromTop
            r5 = 0
            if (r4 == 0) goto L5c
            android.graphics.Rect r6 = new android.graphics.Rect
            int r7 = r3.mWd
            int r1 = r3.mHt
            r6.<init>(r5, r4, r7, r1)
            boolean r7 = android.graphics.Rect.intersects(r0, r6)
            if (r7 != 0) goto L21
            return
        L21:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r0)
            r7.intersect(r6)
            int r6 = r7.top
            int r6 = r6 - r4
            r7.top = r6
            int r6 = r7.bottom
            int r6 = r6 - r4
            r7.bottom = r6
            boolean r6 = r3.mIsFullScreen
            if (r6 == 0) goto L45
            android.graphics.Rect r6 = new android.graphics.Rect
            int r0 = r7.bottom
            int r1 = r3.mWd
            int r2 = r3.mHt
            r6.<init>(r5, r0, r1, r2)
            r7.union(r6)
        L45:
            android.view.SurfaceHolder r6 = r3.mSurfaceHolder
            android.graphics.Canvas r6 = r6.lockCanvas(r7)
            boolean r0 = r3.mIsFullScreen
            if (r0 != 0) goto L5a
            int r0 = r7.bottom
            int r1 = r3.mHt
            int r2 = r1 - r4
            if (r0 <= r2) goto L5a
            int r1 = r1 - r4
            r7.bottom = r1
        L5a:
            r0 = r7
            goto L62
        L5c:
            android.view.SurfaceHolder r6 = r3.mSurfaceHolder
            android.graphics.Canvas r6 = r6.lockCanvas(r0)
        L62:
            android.view.SurfaceHolder r7 = r3.mSurfaceHolder     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb7
            monitor-enter(r7)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb7
            r6.clipRect(r0)     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L73
            boolean r0 = r3.mIsFullScreen     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L73
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.drawColor(r0)     // Catch: java.lang.Throwable -> Lab
        L73:
            boolean r0 = r3.mMaliWorkaround     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L80
            r0 = 0
            r3.mPaint = r0     // Catch: java.lang.Throwable -> Lab
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> Lab
            r6.drawColor(r5, r0)     // Catch: java.lang.Throwable -> Lab
            goto L9f
        L80:
            android.graphics.Paint r0 = r3.mPaint     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L9f
            int r0 = r3.mCurrentSurfaceFormat     // Catch: java.lang.Throwable -> Lab
            r1 = 4
            if (r0 == r1) goto L9f
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
            r3.mPaint = r0     // Catch: java.lang.Throwable -> Lab
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode     // Catch: java.lang.Throwable -> Lab
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC     // Catch: java.lang.Throwable -> Lab
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lab
            r0.setXfermode(r1)     // Catch: java.lang.Throwable -> Lab
            android.graphics.Paint r0 = r3.mPaint     // Catch: java.lang.Throwable -> Lab
            r0.setFilterBitmap(r5)     // Catch: java.lang.Throwable -> Lab
        L9f:
            int r4 = -r4
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lab
            android.graphics.Paint r5 = r3.mPaint     // Catch: java.lang.Throwable -> Lab
            r0 = 0
            r6.drawBitmap(r8, r0, r4, r5)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto Lbf
            goto Lba
        Lab:
            r4 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lab
            throw r4     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb7
        Lae:
            r4 = move-exception
            if (r6 == 0) goto Lb6
            android.view.SurfaceHolder r5 = r3.mSurfaceHolder
            r5.unlockCanvasAndPost(r6)
        Lb6:
            throw r4
        Lb7:
            if (r6 == 0) goto Lbf
        Lba:
            android.view.SurfaceHolder r4 = r3.mSurfaceHolder
            r4.unlockCanvasAndPost(r6)
        Lbf:
            com.adobe.air.AndroidInputConnection r4 = r3.mInputConnection
            if (r4 == 0) goto Lc6
            r4.updateIMEText()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AIRWindowSurfaceView.draw(int, int, int, int, android.graphics.Bitmap):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawScaled(int r5, int r6, int r7, int r8, android.graphics.Bitmap r9, int r10, int r11, int r12, int r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AIRWindowSurfaceView.drawScaled(int, int, int, int, android.graphics.Bitmap, int, int, int, int, boolean, int):void");
    }

    public void drawBitmap(int i, int i2, int i3, int i4, Bitmap bitmap) {
        draw(i, i2, i3, i4, bitmap);
    }

    public void drawBitmap(int i, int i2, int i3, int i4, Bitmap bitmap, int i5, int i6, int i7, int i8, boolean z, int i9) {
        drawScaled(i, i2, i3, i4, bitmap, i5, i6, i7, i8, z, i9);
    }

    public boolean getIsFullScreen() {
        return this.mIsFullScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasStatusBar(Window window) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HideSystemUI() {
        if (supportsSystemUiVisibilityAPI()) {
            DoSetOnSystemUiVisibilityChangeListener();
            supportsSystemUiFlags();
            setSystemUiVisibility(5895);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DoSetOnSystemUiVisibilityChangeListener() {
        setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.adobe.air.AIRWindowSurfaceView.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                this.setOnSystemUiVisibilityChangeListener(null);
                if (this.getIsFullScreen()) {
                    AIRWindowSurfaceView.this.HideSystemUI();
                    this.nativeDispatchFullScreenEvent(true);
                    return;
                }
                this.nativeDispatchFullScreenEvent(false);
            }
        });
    }

    public void setFullScreen() {
        final Activity activity = this.mActivityWrapper.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AIRWindowSurfaceView.4
            @Override // java.lang.Runnable
            public void run() {
                if (!AIRWindowSurfaceView.this.mIsFullScreen) {
                    AIRWindowSurfaceView.this.mIsFullScreen = true;
                    AIRWindowSurfaceView.this.mActivityWrapper.setIsFullScreen(AIRWindowSurfaceView.this.mIsFullScreen);
                    if (AIRWindowSurfaceView.access$1200()) {
                        AIRWindowSurfaceView.this.DoSetOnSystemUiVisibilityChangeListener();
                        AIRWindowSurfaceView.this.HideSystemUI();
                    }
                    AIRWindowSurfaceView.this.mActivityWrapper.planeBreakCascade();
                }
                Activity activity2 = activity;
                if (activity2 != null) {
                    Window window = activity2.getWindow();
                    if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG") || !AIRWindowSurfaceView.access$1200() || AIRWindowSurfaceView.this.hasStatusBar(window)) {
                        window.setFlags(1024, 1024);
                    }
                }
            }
        });
    }

    public void clearFullScreen() {
        final Activity activity = this.mActivityWrapper.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AIRWindowSurfaceView.5
                @Override // java.lang.Runnable
                public void run() {
                    AIRWindowSurfaceView.this.mIsFullScreen = false;
                    AIRWindowSurfaceView.this.mActivityWrapper.setIsFullScreen(AIRWindowSurfaceView.this.mIsFullScreen);
                    if (AIRWindowSurfaceView.access$1200()) {
                        AIRWindowSurfaceView.access$1500();
                        AIRWindowSurfaceView.this.DoSetOnSystemUiVisibilityChangeListener();
                        this.setSystemUiVisibility(0);
                    }
                    Activity activity2 = activity;
                    if (activity2 != null) {
                        activity2.getWindow().clearFlags(1024);
                    }
                    AIRWindowSurfaceView.this.mActivityWrapper.planeBreakCascade();
                }
            });
        }
    }

    public int getBoundWidth() {
        return this.mBoundWidth;
    }

    public int getBoundHeight() {
        return this.mBoundHeight;
    }

    public int getVisibleBoundWidth() {
        return this.mVisibleBoundWidth;
    }

    public int getVisibleBoundHeight() {
        return this.mVisibleBoundHeight;
    }

    public int getColorDepth() {
        if (this.mCurrentSurfaceFormat == 4) {
            return 16;
        }
        Activity activity = this.mActivityWrapper.getActivity();
        if (activity != null) {
            Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
            PixelFormat pixelFormat = new PixelFormat();
            PixelFormat.getPixelFormatInfo(defaultDisplay.getPixelFormat(), pixelFormat);
            return pixelFormat.bitsPerPixel;
        }
        return 32;
    }

    public int getAppSpecifiedPixelFormat() {
        return this.mActivityWrapper.useRGB565() ? 16 : 32;
    }

    public void showActionScript2Warning() {
        Activity activity = this.mActivityWrapper.getActivity();
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            TextView textView = new TextView(activity);
            textView.setText("Your application is attempting to run ActionScript2.0, which is not supported on smart phone profile. \nSee the Adobe Developer Connection for more info www.adobe.com/devnet");
            Linkify.addLinks(textView, 1);
            builder.setView(textView);
            builder.setTitle("Action Script 2.0");
            builder.setNeutralButton("OK", new DialogInterface.OnClickListener() { // from class: com.adobe.air.AIRWindowSurfaceView.6
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        }
    }

    public boolean IsLandScape() {
        return this.mCurrentOrientation == 2;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.mActivityWrapper.isApplicationLaunched() && nativeIsEditable()) {
            editorInfo.imeOptions |= 1073741824;
            editorInfo.imeOptions |= 268435456;
            editorInfo.imeOptions |= 6;
            int nativeGetSoftKeyboardType = nativeGetSoftKeyboardType();
            editorInfo.inputType |= 1;
            switch (nativeGetSoftKeyboardType) {
                case 2:
                    editorInfo.inputType = 17;
                    break;
                case 3:
                    editorInfo.inputType = 2;
                    break;
                case 4:
                    editorInfo.inputType = 1;
                    break;
                case 5:
                    editorInfo.inputType = 33;
                    break;
                case 6:
                    editorInfo.inputType = 3;
                    break;
                case 7:
                    editorInfo.inputType = 8194;
                    break;
            }
            if (nativeIsPasswordField()) {
                editorInfo.inputType |= 128;
            }
            if (nativeIsMultiLineTextField()) {
                editorInfo.inputType |= 131072;
            }
            this.mInputConnection = new AndroidInputConnection(this);
            editorInfo.initialSelStart = -1;
            editorInfo.initialSelEnd = -1;
            editorInfo.initialCapsMode = 0;
        } else {
            this.mInputConnection = null;
            editorInfo.imeOptions = 268435456;
        }
        return this.mInputConnection;
    }

    public void RestartInput() {
        this.mMetaShiftState = MetaKeyState.INACTIVE;
        this.mMetaAltState = MetaKeyState.INACTIVE;
        InputMethodManager inputMethodManager = getInputMethodManager();
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
        AndroidInputConnection androidInputConnection = this.mInputConnection;
        if (androidInputConnection != null) {
            androidInputConnection.Reset();
        }
    }

    public InputMethodManager getInputMethodManager() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    @Override // android.view.View
    public boolean performLongClick() {
        Rect nativeGetTextBoxBounds;
        if (this.mWindowHasFocus && !this.mActivityWrapper.inAsyncMode() && (nativeGetTextBoxBounds = nativeGetTextBoxBounds()) != null && ((this.mLastTouchedXCoord > nativeGetTextBoxBounds.left && this.mLastTouchedXCoord < nativeGetTextBoxBounds.right && this.mLastTouchedYCoord > nativeGetTextBoxBounds.top && this.mLastTouchedYCoord < nativeGetTextBoxBounds.bottom) || this.mTrackBallPressed)) {
            this.mTrackBallPressed = false;
            if (super.performLongClick()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        if (!this.mIsFullScreen || nativeIsFullScreenInteractive()) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            MenuHandler menuHandler = new MenuHandler();
            boolean nativeIsEditable = nativeIsEditable();
            boolean nativeIsTextFieldSelectable = nativeIsTextFieldSelectable();
            if (nativeIsTextFieldSelectable || nativeIsEditable) {
                if (nativeIsTextFieldSelectable) {
                    boolean z = nativeGetTextContentLength() > 0;
                    if (z) {
                        contextMenu.add(0, 0, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_SELECT_ALL)).setOnMenuItemClickListener(menuHandler).setAlphabeticShortcut('a');
                        if (nativeIsTextFieldInSelectionMode()) {
                            contextMenu.add(0, 8, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_STOP_SELECTING_TEXT)).setOnMenuItemClickListener(menuHandler);
                        } else {
                            contextMenu.add(0, 7, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_SELECT_TEXT)).setOnMenuItemClickListener(menuHandler);
                        }
                    }
                    if (!nativeIsPasswordField() && z) {
                        boolean nativeIsTextSelected = nativeIsTextSelected();
                        if (nativeIsEditable) {
                            if (nativeIsTextSelected) {
                                contextMenu.add(0, 1, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_CUT_STRING)).setOnMenuItemClickListener(menuHandler).setAlphabeticShortcut('x');
                            } else {
                                contextMenu.add(0, 2, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_CUT_ALL_STRING)).setOnMenuItemClickListener(menuHandler);
                            }
                        }
                        if (nativeIsTextSelected) {
                            contextMenu.add(0, 3, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_COPY_STRING)).setOnMenuItemClickListener(menuHandler).setAlphabeticShortcut('c');
                        } else {
                            contextMenu.add(0, 4, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_COPY_ALL_STRING)).setOnMenuItemClickListener(menuHandler);
                        }
                    }
                }
                if (nativeIsEditable) {
                    if (clipboardManager != null && clipboardManager.hasText()) {
                        contextMenu.add(0, 5, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_PASTE_STRING)).setOnMenuItemClickListener(menuHandler).setAlphabeticShortcut('v');
                    }
                    contextMenu.add(0, 6, 0, AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_INPUT_METHOD_STRING)).setOnMenuItemClickListener(menuHandler);
                }
                this.mEatTouchRelease = true;
                this.mContextMenuVisible = true;
                contextMenu.setHeaderTitle(AndroidLocale.GetLocalizedString(AndroidLocale.STRING_ID.IDA_CONTEXT_MENU_TITLE_STRING));
            }
        }
    }

    private void postCheckLongPress() {
        if (this.mLongPressCheck == null) {
            this.mLongPressCheck = new CheckLongPress();
        }
        postDelayed(this.mLongPressCheck, 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class CheckLongPress implements Runnable {
        CheckLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AIRWindowSurfaceView.this.performLongClick();
        }
    }

    /* loaded from: classes.dex */
    private class MenuHandler implements MenuItem.OnMenuItemClickListener {
        private MenuHandler() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return AIRWindowSurfaceView.this.onTextBoxContextMenuItem(menuItem.getItemId());
        }
    }

    public boolean onTextBoxContextMenuItem(int i) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        switch (i) {
            case 0:
                nativeSelectAllText();
                break;
            case 1:
                String nativeGetSelectedText = nativeGetSelectedText();
                if (nativeGetSelectedText != null) {
                    nativeCutText(false);
                    if (nativeIsPasswordField()) {
                        nativeGetSelectedText = Utils.ReplaceTextContentWithStars(nativeGetSelectedText);
                    }
                    clipboardManager.setText(nativeGetSelectedText);
                }
                SetSelectionMode(false);
                break;
            case 2:
                CharSequence charSequence = nativeGetTextContent().text;
                if (charSequence != null) {
                    nativeCutText(true);
                    if (nativeIsPasswordField()) {
                        charSequence = Utils.ReplaceTextContentWithStars(charSequence.toString());
                    }
                    clipboardManager.setText(charSequence);
                    break;
                }
                break;
            case 3:
                String nativeGetSelectedText2 = nativeGetSelectedText();
                if (nativeGetSelectedText2 != null) {
                    if (nativeIsPasswordField()) {
                        nativeGetSelectedText2 = Utils.ReplaceTextContentWithStars(nativeGetSelectedText2);
                    }
                    clipboardManager.setText(nativeGetSelectedText2);
                }
                SetSelectionMode(false);
                break;
            case 4:
                CharSequence charSequence2 = nativeGetTextContent().text;
                if (charSequence2 != null) {
                    if (nativeIsPasswordField()) {
                        charSequence2 = Utils.ReplaceTextContentWithStars(charSequence2.toString());
                    }
                    clipboardManager.setText(charSequence2);
                    break;
                }
                break;
            case 5:
                CharSequence text = clipboardManager.getText();
                if (text != null) {
                    nativeInsertText(text.toString());
                }
                SetSelectionMode(false);
                break;
            case 6:
                InputMethodManager inputMethodManager = getInputMethodManager();
                if (inputMethodManager != null) {
                    inputMethodManager.showInputMethodPicker();
                    break;
                }
                break;
            case 7:
                SetSelectionMode(true);
                break;
            case 8:
                SetSelectionMode(false);
                break;
            default:
                return false;
        }
        AndroidInputConnection androidInputConnection = this.mInputConnection;
        if (androidInputConnection != null) {
            androidInputConnection.updateIMEText();
        }
        return true;
    }

    private boolean IsTouchEventHandlingAllowed(int i, float f, float f2) {
        CheckLongPress checkLongPress;
        boolean IsPointInTextBox = IsPointInTextBox(f, f2, i);
        if (i == 2) {
            this.mDownX = f;
            this.mDownY = f2;
            this.mEatTouchRelease = false;
            if (IsPointInTextBox) {
                postCheckLongPress();
            }
        } else if (i == 1) {
            if (IsPointInTextBox) {
                if (!IsTouchMove(f, f2)) {
                    return false;
                }
                CheckLongPress checkLongPress2 = this.mLongPressCheck;
                if (checkLongPress2 != null) {
                    removeCallbacks(checkLongPress2);
                }
            }
        } else if (i == 4 && (checkLongPress = this.mLongPressCheck) != null) {
            removeCallbacks(checkLongPress);
        }
        return true;
    }

    private boolean IsTouchMove(float f, float f2) {
        float f3 = this.mDownX - f;
        float f4 = this.mDownY - f2;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) >= ((float) this.mScaledTouchSlop);
    }

    private boolean IsPointInTextBox(float f, float f2, int i) {
        int i2;
        int i3;
        if (i == 2 && !this.mActivityWrapper.inAsyncMode()) {
            this.mTextBoxBounds = nativeGetTextBoxBounds();
        }
        Rect rect = this.mTextBoxBounds;
        boolean z = rect != null && (i2 = (int) f) > rect.left && i2 < this.mTextBoxBounds.right && (i3 = (int) f2) > this.mTextBoxBounds.top && i3 < this.mTextBoxBounds.bottom;
        if (i == 4) {
            this.mTextBoxBounds = null;
        }
        return z;
    }

    private void HandleMetaKeyAction(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 57:
            case 58:
                if (keyEvent.getRepeatCount() == 0) {
                    this.mMetaAltState = GetMetaKeyState(this.mMetaAltState, keyEvent.isAltPressed(), false);
                    return;
                }
                return;
            case 59:
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (keyEvent.getRepeatCount() == 0) {
                    this.mMetaShiftState = GetMetaKeyState(this.mMetaShiftState, keyEvent.isShiftPressed(), false);
                    return;
                }
                return;
            default:
                this.mMetaShiftState = GetMetaKeyState(this.mMetaShiftState, keyEvent.isShiftPressed(), true);
                this.mMetaAltState = GetMetaKeyState(this.mMetaAltState, keyEvent.isAltPressed(), true);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adobe.air.AIRWindowSurfaceView$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState;

        static {
            int[] iArr = new int[MetaKeyState.values().length];
            $SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState = iArr;
            try {
                iArr[MetaKeyState.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState[MetaKeyState.PRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState[MetaKeyState.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState[MetaKeyState.LOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private MetaKeyState GetMetaKeyState(MetaKeyState metaKeyState, boolean z, boolean z2) {
        if (z2) {
            int i = AnonymousClass7.$SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState[metaKeyState.ordinal()];
            if (i == 1 || i == 2) {
                return z ? MetaKeyState.PRESSED : MetaKeyState.INACTIVE;
            } else if (i == 3) {
                return z ? MetaKeyState.PRESSED : MetaKeyState.INACTIVE;
            } else if (i == 4) {
                return MetaKeyState.LOCKED;
            } else {
                return MetaKeyState.INACTIVE;
            }
        } else if (z) {
            int i2 = AnonymousClass7.$SwitchMap$com$adobe$air$AIRWindowSurfaceView$MetaKeyState[metaKeyState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                return MetaKeyState.ACTIVE;
            }
            if (i2 == 3) {
                return MetaKeyState.LOCKED;
            }
            return MetaKeyState.INACTIVE;
        } else {
            return MetaKeyState.INACTIVE;
        }
    }

    int GetMetaKeyCharacter(KeyEvent keyEvent) {
        int i = (this.mMetaShiftState == MetaKeyState.LOCKED || this.mMetaShiftState == MetaKeyState.ACTIVE) ? 1 : 0;
        if (this.mMetaAltState == MetaKeyState.LOCKED || this.mMetaAltState == MetaKeyState.ACTIVE) {
            i |= 2;
        }
        return keyEvent.getUnicodeChar(i);
    }

    public void HideSoftKeyboardOnWindowFocusChange() {
        this.mHideSoftKeyboardOnWindowFocusChange = true;
    }

    private boolean HandleShortCuts(int i, KeyEvent keyEvent) {
        if (i == 23) {
            if (this.mTrackBallPressed || this.mContextMenuVisible) {
                return true;
            }
            this.mTrackBallPressed = true;
            postCheckLongPress();
            return false;
        }
        if (keyEvent.isAltPressed()) {
            if (i == 67) {
                nativeDeleteTextLine();
                return true;
            }
            switch (i) {
                case 19:
                    nativeMoveCursor(2);
                    return true;
                case 20:
                    nativeMoveCursor(3);
                    return true;
                case 21:
                    nativeMoveCursor(0);
                    return true;
                case 22:
                    nativeMoveCursor(1);
                    return true;
            }
        }
        return false;
    }

    public void setInputConnection(AndroidInputConnection androidInputConnection) {
        this.mInputConnection = androidInputConnection;
    }

    public void setFlashEGL(FlashEGL flashEGL) {
        this.mFlashEGL = flashEGL;
    }

    public boolean IsPasswordVisibleSettingEnabled() {
        try {
            return Settings.System.getInt(getContext().getContentResolver(), "show_password") == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean IsTouchUpHandlingAllowed() {
        return !this.mEatTouchRelease;
    }

    public void SetSelectionMode(boolean z) {
        nativeDispatchSelectionChangeEvent(z);
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            DispatchSoftKeyboardEventOnBackKey();
            return false;
        }
        return false;
    }

    public void DispatchSoftKeyboardEventOnBackKey() {
        if ((this.mIsFullScreen && !this.mSurfaceChangedForSoftKeyboard) || this.mFlashEGL != null || IsIMEInFullScreen() || (!this.mSurfaceChangedForSoftKeyboard && !nativeIsEditable())) {
            nativeDispatchUserTriggeredSkDeactivateEvent();
            if (!this.mSurfaceChangedForSoftKeyboard && !nativeIsEditable()) {
                nativeShowOriginalRect();
            }
        }
        if (this.mIsFullScreen) {
            HideSystemUI();
        }
    }

    public boolean IsSurfaceChangedForSoftKeyboard() {
        return this.mSurfaceChangedForSoftKeyboard;
    }

    public int getKeyboardHeight() {
        return this.mHt - getVisibleBoundHeight();
    }

    public void SetSurfaceChangedForSoftKeyboard(boolean z) {
        this.mSurfaceChangedForSoftKeyboard = z;
    }

    public VideoView getVideoView() {
        if (this.mVideoView == null) {
            this.mVideoView = new VideoViewAIR(getContext(), this.mActivityWrapper);
        }
        return this.mVideoView;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], this.mVisibleBoundWidth, this.mVisibleBoundHeight, Region.Op.REPLACE);
        return false;
    }
}
