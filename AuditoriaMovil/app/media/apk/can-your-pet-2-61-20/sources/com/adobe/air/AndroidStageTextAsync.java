package com.adobe.air;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.adobe.air.AndroidActivityWrapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class AndroidStageTextAsync implements AndroidActivityWrapper.StateChangeCallback {
    private static final int ALIGN_Center = 2;
    private static final int ALIGN_End = 5;
    private static final int ALIGN_Justify = 3;
    private static final int ALIGN_Left = 0;
    private static final int ALIGN_Right = 1;
    private static final int ALIGN_Start = 4;
    private static final int AUTO_CAP_All = 3;
    private static final int AUTO_CAP_None = 0;
    private static final int AUTO_CAP_Sentence = 2;
    private static final int AUTO_CAP_Word = 1;
    private static final int FOCUS_DOWN = 3;
    private static final int FOCUS_NONE = 1;
    private static final int FOCUS_UP = 2;
    private static final int KEYBOARDTYPE_Contact = 4;
    private static final int KEYBOARDTYPE_DecimalPad = 7;
    private static final int KEYBOARDTYPE_Default = 0;
    private static final int KEYBOARDTYPE_Email = 5;
    private static final int KEYBOARDTYPE_Number = 3;
    private static final int KEYBOARDTYPE_Phone = 6;
    private static final int KEYBOARDTYPE_Punctuation = 1;
    private static final int KEYBOARDTYPE_Url = 2;
    private static final String LOG_TAG = "AndroidStageText";
    private static final int RETURN_KEY_Default = 0;
    private static final int RETURN_KEY_Done = 1;
    private static final int RETURN_KEY_Go = 2;
    private static final int RETURN_KEY_Next = 3;
    private static final int RETURN_KEY_Search = 4;
    private AIRWindowSurfaceView mAIRSurface;
    private BackgroundBorderDrawable mBBDrawable;
    private Context mContext;
    private boolean mDisplayAsPassword;
    private String mFont;
    private int mFontSize;
    private RelativeLayout mLayout;
    private boolean mMultiline;
    private AndroidStageText mOwner;
    private KeyListener mSavedKeyListener;
    private AndroidStageTextEditText mTextView;
    private AndroidStageTextImpl mView;
    private static Map<String, Typeface> FontMap = new HashMap();
    private static boolean MapCreate = false;
    private boolean enterKeyDispatched = false;
    private ViewGroup mClip = null;
    private int mKeyboardType = 0;
    private String mContentType = null;
    private int mAutoCapitalize = 0;
    private int mReturnKeyLabel = 0;
    private boolean mAutoCorrect = false;
    private boolean mBold = false;
    private boolean mItalic = false;
    private boolean mEditable = true;
    private boolean mDisableInteraction = false;
    private int mAlign = 4;
    private int mTextColor = ViewCompat.MEASURED_STATE_MASK;
    private int mBackgroundColor = -1;
    private int mBorderColor = ViewCompat.MEASURED_STATE_MASK;
    private int mMaxChars = 0;
    private String mRestrict = null;
    private String mLocale = null;
    private boolean mPreventDefault = false;
    private Rect mBounds = new Rect();
    private Rect mViewBounds = null;
    private Rect mClipBounds = null;
    private Rect mGlobalBounds = new Rect();
    private boolean mMenuInvoked = false;
    private boolean mSelectionChanged = false;
    private boolean mInContentMenu = false;
    private boolean mNotifyLayoutComplete = false;
    private double mScaleFactor = 1.0d;
    private long mInternalReference = 0;

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onActivityStateChanged(AndroidActivityWrapper.ActivityState activityState) {
    }

    @Override // com.adobe.air.AndroidActivityWrapper.StateChangeCallback
    public void onConfigurationChanged(Configuration configuration) {
    }

    /* loaded from: classes.dex */
    public class BackgroundBorderDrawable extends ShapeDrawable {
        public int mBkgColor;
        public Paint mBkgPaint;
        public int mBorderColor;
        public boolean mHaveBkg;
        public boolean mHaveBorder;

        public BackgroundBorderDrawable() {
            this.mHaveBorder = false;
            this.mHaveBkg = false;
            this.mBkgColor = -1;
            this.mBorderColor = ViewCompat.MEASURED_STATE_MASK;
            init();
        }

        public BackgroundBorderDrawable(Shape shape) {
            super(shape);
            this.mHaveBorder = false;
            this.mHaveBkg = false;
            this.mBkgColor = -1;
            this.mBorderColor = ViewCompat.MEASURED_STATE_MASK;
            init();
        }

        @Override // android.graphics.drawable.ShapeDrawable
        protected void onDraw(Shape shape, Canvas canvas, Paint paint) {
            if (this.mHaveBkg) {
                canvas.drawRect(getBounds(), this.mBkgPaint);
            }
            if (this.mHaveBorder) {
                super.onDraw(shape, canvas, paint);
            }
        }

        private void init() {
            Paint paint = new Paint(getPaint());
            this.mBkgPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mBkgPaint.setColor(this.mBkgColor);
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(3.0f);
            getPaint().setColor(this.mBorderColor);
        }

        public void setBkgColor(int i) {
            this.mBkgColor = i;
            this.mBkgPaint.setColor(i);
        }

        public void setBorderColor(int i) {
            this.mBorderColor = i;
            getPaint().setColor(i);
        }
    }

    /* loaded from: classes.dex */
    public class AndroidStageTextImpl extends ScrollView {
        public AndroidStageTextImpl(Context context) {
            super(context);
        }

        public AndroidStageTextImpl(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public AndroidStageTextImpl(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        @Override // android.widget.ScrollView, android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
        }

        @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            AndroidStageTextAsync androidStageTextAsync = AndroidStageTextAsync.this;
            super.onLayout(z, i, i2, i3, i4);
            if (androidStageTextAsync.mNotifyLayoutComplete) {
                androidStageTextAsync.mNotifyLayoutComplete = false;
                androidStageTextAsync.mOwner.sendDispatchCompleteEvent(androidStageTextAsync.mInternalReference);
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (AndroidStageTextAsync.this.mClipBounds != null) {
                canvas.save();
                int i = -AndroidStageTextAsync.this.mViewBounds.left;
                int i2 = -AndroidStageTextAsync.this.mViewBounds.top;
                canvas.clipRect(new Rect(AndroidStageTextAsync.this.mClipBounds.left + i, AndroidStageTextAsync.this.mClipBounds.top + i2, AndroidStageTextAsync.this.mClipBounds.right + i, AndroidStageTextAsync.this.mClipBounds.bottom + i2));
                super.onDraw(canvas);
                canvas.restore();
                return;
            }
            super.onDraw(canvas);
        }
    }

    /* loaded from: classes.dex */
    public class AndroidStageTextEditText extends EditText {
        private int mLastFocusDirection;
        private View m_focusedChildView;
        private boolean m_hasFocus;
        private boolean m_inRequestChildFocus;

        public AndroidStageTextEditText(Context context) {
            super(context);
            this.m_inRequestChildFocus = false;
            this.m_focusedChildView = null;
            this.m_hasFocus = false;
            this.mLastFocusDirection = 0;
            setBackgroundDrawable(null);
            setCompoundDrawablePadding(0);
            setPadding(0, 0, 0, 0);
        }

        public AndroidStageTextEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m_inRequestChildFocus = false;
            this.m_focusedChildView = null;
            this.m_hasFocus = false;
            this.mLastFocusDirection = 0;
        }

        public AndroidStageTextEditText(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.m_inRequestChildFocus = false;
            this.m_focusedChildView = null;
            this.m_hasFocus = false;
            this.mLastFocusDirection = 0;
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            if (AndroidStageTextAsync.this.mClipBounds != null) {
                canvas.save();
                int i = -AndroidStageTextAsync.this.mViewBounds.left;
                int i2 = -AndroidStageTextAsync.this.mViewBounds.top;
                canvas.clipRect(new Rect(AndroidStageTextAsync.this.mClipBounds.left + i, AndroidStageTextAsync.this.mClipBounds.top + i2, AndroidStageTextAsync.this.mClipBounds.right + i, AndroidStageTextAsync.this.mClipBounds.bottom + i2));
                super.onDraw(canvas);
                canvas.restore();
                return;
            }
            super.onDraw(canvas);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!this.m_hasFocus) {
                requestFocus();
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        /* loaded from: classes.dex */
        private class DelayedTransparentRegionUpdate implements Runnable {
            private AIRWindowSurfaceView m_AIRSurface;
            private int m_freqMsecs;
            private int m_nUpdates;
            private AndroidStageTextImpl m_stageText;

            public DelayedTransparentRegionUpdate(int i, int i2, AndroidStageTextImpl androidStageTextImpl, AIRWindowSurfaceView aIRWindowSurfaceView) {
                this.m_nUpdates = i;
                this.m_freqMsecs = i2;
                this.m_stageText = androidStageTextImpl;
                this.m_AIRSurface = aIRWindowSurfaceView;
            }

            @Override // java.lang.Runnable
            public void run() {
                AIRWindowSurfaceView aIRWindowSurfaceView;
                AndroidStageTextImpl androidStageTextImpl = this.m_stageText;
                if (androidStageTextImpl != null && (aIRWindowSurfaceView = this.m_AIRSurface) != null) {
                    androidStageTextImpl.requestTransparentRegion(aIRWindowSurfaceView);
                }
                int i = this.m_nUpdates - 1;
                this.m_nUpdates = i;
                if (i > 0) {
                    this.m_stageText.postDelayed(this, this.m_freqMsecs);
                }
            }
        }

        @Override // android.widget.TextView, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            AndroidStageTextAsync androidStageTextAsync = AndroidStageTextAsync.this;
            super.onLayout(z, i, i2, i3, i4);
            if (androidStageTextAsync.mNotifyLayoutComplete) {
                androidStageTextAsync.mNotifyLayoutComplete = false;
                androidStageTextAsync.mOwner.sendDispatchCompleteEvent(androidStageTextAsync.mInternalReference);
            }
            AndroidStageTextAsync.this.mView.postDelayed(new DelayedTransparentRegionUpdate(10, 75, AndroidStageTextAsync.this.mView, AndroidStageTextAsync.this.mAIRSurface), 75L);
        }

        private void dispatchFocusEvent(boolean z, int i) {
            if (this.m_hasFocus == z) {
                return;
            }
            this.m_hasFocus = z;
            AndroidStageTextAsync androidStageTextAsync = AndroidStageTextAsync.this;
            if (androidStageTextAsync.mInternalReference == 0) {
                return;
            }
            if (androidStageTextAsync.mAIRSurface != null) {
                androidStageTextAsync.mAIRSurface.updateFocusedStageText(androidStageTextAsync.mOwner, this.m_hasFocus);
            }
            if (z) {
                androidStageTextAsync.mOwner.sendDispatchFocusIn(androidStageTextAsync.mInternalReference, i);
            }
        }

        @Override // android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (i == 0) {
                i = this.mLastFocusDirection;
            }
            this.mLastFocusDirection = 0;
            dispatchFocusEvent(z, i);
        }

        @Override // android.widget.TextView
        protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            AndroidStageTextAsync androidStageTextAsync = AndroidStageTextAsync.this;
            if (androidStageTextAsync.mInternalReference == 0) {
                return;
            }
            androidStageTextAsync.mOwner.sendDispatchChangeEvent(androidStageTextAsync.mInternalReference);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int i;
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= motionEvent.getPointerCount()) {
                    break;
                }
                int action = motionEvent.getAction();
                motionEvent.getPointerId(i2);
                if ((motionEvent.getPointerCount() == 1 || motionEvent.getPointerId(i2) == motionEvent.getPointerId((65280 & action) >> 8)) && (i = action & 255) != 6 && i != 1) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                AndroidStageTextAsync.this.mOwner.sendInvokeSoftKeyboard(AndroidStageTextAsync.this.mInternalReference);
                AndroidStageTextAsync.this.mMenuInvoked = false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.TextView, android.view.View
        public void onCreateContextMenu(ContextMenu contextMenu) {
            AndroidStageTextAsync.this.mMenuInvoked = true;
            AndroidStageTextAsync.this.mSelectionChanged = false;
            super.onCreateContextMenu(contextMenu);
        }

        @Override // android.widget.TextView
        public boolean onTextContextMenuItem(int i) {
            AndroidStageTextAsync.this.mInContentMenu = true;
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            AndroidStageTextAsync.this.mInContentMenu = false;
            AndroidStageTextAsync.this.mMenuInvoked = false;
            return onTextContextMenuItem;
        }

        @Override // android.widget.TextView
        public void onSelectionChanged(int i, int i2) {
            super.onSelectionChanged(i, i2);
            AndroidStageTextAsync.this.mSelectionChanged = true;
            if (AndroidStageTextAsync.this.mAIRSurface == null || !AndroidStageTextAsync.this.mInContentMenu) {
                return;
            }
            AndroidStageTextAsync.this.mAIRSurface.showSoftKeyboard(true, AndroidStageTextAsync.this.mTextView);
            AndroidStageTextAsync.this.mOwner.sendInvokeSoftKeyboard(AndroidStageTextAsync.this.mInternalReference);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            boolean sendHandleKeyEvent = ((i == 4 || i == 66 || i == 82) && !AndroidStageTextAsync.this.enterKeyDispatched) ? AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, keyEvent.getAction(), i) : false;
            return !sendHandleKeyEvent ? super.onKeyDown(i, keyEvent) : sendHandleKeyEvent;
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            if ((i == 4 || i == 66 || i == 82) && !AndroidStageTextAsync.this.enterKeyDispatched) {
                AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, keyEvent.getAction(), i);
            }
            boolean onKeyUp = super.onKeyUp(i, keyEvent);
            AndroidStageTextAsync.this.enterKeyDispatched = false;
            return onKeyUp;
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (AndroidStageTextAsync.this.mAIRSurface != null && i == 4 && keyEvent.getAction() == 0) {
                AndroidStageTextAsync.this.mAIRSurface.DispatchSoftKeyboardEventOnBackKey();
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.view.View
        public ActionMode startActionMode(ActionMode.Callback callback) {
            if (AndroidStageTextAsync.this.mAIRSurface != null && AndroidStageTextAsync.this.mSelectionChanged) {
                AndroidStageTextAsync.this.mAIRSurface.showSoftKeyboard(true, AndroidStageTextAsync.this.mTextView);
                AndroidStageTextAsync.this.mOwner.sendInvokeSoftKeyboard(AndroidStageTextAsync.this.mInternalReference);
                AndroidStageTextAsync.this.mSelectionChanged = false;
            }
            return super.startActionMode(callback);
        }
    }

    public AndroidStageTextAsync(boolean z, AndroidStageText androidStageText) {
        Typeface createFromAsset;
        this.mDisplayAsPassword = false;
        this.mMultiline = false;
        this.mSavedKeyListener = null;
        this.mOwner = androidStageText;
        this.mMultiline = z;
        this.mDisplayAsPassword = false;
        Context defaultContext = AndroidActivityWrapper.GetAndroidActivityWrapper().getDefaultContext();
        this.mContext = defaultContext;
        if (defaultContext == null) {
            return;
        }
        AndroidStageTextImpl androidStageTextImpl = new AndroidStageTextImpl(this.mContext);
        this.mView = androidStageTextImpl;
        androidStageTextImpl.setFillViewport(true);
        this.mView.setLayerType(1, null);
        AndroidStageTextEditText androidStageTextEditText = new AndroidStageTextEditText(this.mContext);
        this.mTextView = androidStageTextEditText;
        androidStageTextEditText.setImeOptions(301989888);
        this.mSavedKeyListener = this.mTextView.getKeyListener();
        setFontSize(12);
        setInputType();
        this.mView.addView(this.mTextView, new ViewGroup.LayoutParams(-1, -2));
        if (!z) {
            this.mTextView.setSingleLine(true);
        } else {
            this.mTextView.setTransformationMethod(null);
            this.mTextView.setHorizontallyScrolling(false);
        }
        this.mTextView.setGravity(3);
        if (!MapCreate && !AndroidActivityWrapper.GetAndroidActivityWrapper().embeddedFonts()) {
            MapCreate = true;
        }
        if (MapCreate) {
            return;
        }
        MapCreate = true;
        try {
            String[] list = this.mContext.getAssets().list("customEmbeddedFonts");
            new String();
            for (String str : list) {
                String str2 = "customEmbeddedFonts/" + str;
                try {
                    this.mContext.getAssets().open(str2);
                    String substring = str2.substring(str2.lastIndexOf(46) + 1);
                    if ((substring.equals("ttf") || substring.equals("otf")) && (createFromAsset = Typeface.createFromAsset(this.mContext.getAssets(), str2)) != null) {
                        FontMap.put(str.substring(0, str.lastIndexOf(46)), createFromAsset);
                    }
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setInternalReference(long j) {
        this.mInternalReference = j;
    }

    public void destroyInternals() {
        this.mInternalReference = 0L;
        this.mClipBounds = null;
        this.mTextView = null;
        this.mOwner = null;
    }

    public void addToStage(AIRWindowSurfaceView aIRWindowSurfaceView) {
        if (this.mLayout != null) {
            removeFromStage();
        }
        this.mAIRSurface = aIRWindowSurfaceView;
        AndroidActivityWrapper activityWrapper = aIRWindowSurfaceView.getActivityWrapper();
        activityWrapper.addActivityStateChangeListner(this);
        RelativeLayout overlaysLayout = activityWrapper.getOverlaysLayout(true);
        this.mLayout = overlaysLayout;
        overlaysLayout.addView(this.mView, new RelativeLayout.LayoutParams(this.mGlobalBounds.width(), this.mGlobalBounds.height()));
        this.mTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.adobe.air.AndroidStageTextAsync.1
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                AndroidStageTextAsync.this.enterKeyDispatched = true;
                if (i == 2 || i == 3) {
                    boolean sendHandleKeyEvent = AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, 0, 66);
                    AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, 1, 66);
                    return sendHandleKeyEvent;
                } else if (i == 5) {
                    boolean sendHandleKeyEvent2 = AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, 0, 66);
                    AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, 1, 66);
                    return sendHandleKeyEvent2;
                } else {
                    if (i == 6) {
                        AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, 0, 66);
                        AndroidStageTextAsync.this.mOwner.sendHandleKeyEvent(AndroidStageTextAsync.this.mInternalReference, 1, 66);
                        AndroidStageTextAsync.this.mAIRSurface.DispatchSoftKeyboardEventOnBackKey();
                    }
                    return false;
                }
            }
        });
    }

    public void removeFromStage() {
        RelativeLayout relativeLayout = this.mLayout;
        if (relativeLayout != null) {
            relativeLayout.removeView(this.mView);
            this.mLayout = null;
        }
        if (this.mInternalReference == 0) {
            this.mView = null;
        }
        AIRWindowSurfaceView aIRWindowSurfaceView = this.mAIRSurface;
        if (aIRWindowSurfaceView != null) {
            AndroidActivityWrapper activityWrapper = aIRWindowSurfaceView.getActivityWrapper();
            activityWrapper.didRemoveOverlay();
            activityWrapper.removeActivityStateChangeListner(this);
            this.mAIRSurface.updateFocusedStageText(this.mOwner, false);
        }
        this.mAIRSurface = null;
    }

    public void setVisibility(boolean z) {
        int i = z ? 0 : 4;
        if (this.mView.getVisibility() != i) {
            this.mView.setVisibility(i);
            if (z) {
                this.mTextView.invalidate();
            }
        }
    }

    public long updateViewBoundsWithKeyboard(int i) {
        int i2;
        int i3;
        this.mGlobalBounds = this.mBounds;
        if (this.mAIRSurface != null) {
            Rect rect = new Rect(0, 0, this.mAIRSurface.getVisibleBoundWidth(), this.mAIRSurface.getVisibleBoundHeight());
            if (!rect.contains(this.mBounds)) {
                i2 = Math.min(Math.max(0, this.mBounds.top), i);
                int min = Math.min(Math.max(0, this.mBounds.bottom), i);
                if (i2 != min && (i3 = min - rect.bottom) > 0) {
                    if (i3 <= i2) {
                        i2 = i3;
                    } else {
                        Rect rect2 = new Rect(this.mBounds);
                        this.mGlobalBounds = rect2;
                        rect2.bottom = rect.bottom + i2;
                    }
                    refreshGlobalBounds(false);
                    return i2;
                }
                return 0L;
            }
        }
        i2 = 0;
        refreshGlobalBounds(false);
        return i2;
    }

    public void resetGlobalBounds() {
        this.mGlobalBounds = this.mBounds;
        refreshGlobalBounds(false);
    }

    private void refreshGlobalBounds(final boolean z) {
        AndroidStageTextImpl androidStageTextImpl = this.mView;
        if (androidStageTextImpl == null) {
            return;
        }
        androidStageTextImpl.post(new Runnable() { // from class: com.adobe.air.AndroidStageTextAsync.2
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidStageTextAsync.this.mView == null) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AndroidStageTextAsync.this.mGlobalBounds.width(), AndroidStageTextAsync.this.mGlobalBounds.height());
                layoutParams.leftMargin = AndroidStageTextAsync.this.mGlobalBounds.left;
                layoutParams.topMargin = AndroidStageTextAsync.this.mGlobalBounds.top;
                AndroidStageTextAsync.this.mView.setLayoutParams(layoutParams);
                AndroidStageTextAsync.this.mView.requestLayout();
                if (z) {
                    AndroidStageTextAsync.this.mNotifyLayoutComplete = true;
                }
            }
        });
    }

    public void adjustViewBounds(double d, double d2, double d3, double d4, double d5) {
        this.mViewBounds = new Rect((int) d, (int) d2, (int) (d + d3), (int) (d2 + d4));
        if (d5 != this.mScaleFactor) {
            this.mScaleFactor = d5;
            setFontSize(this.mFontSize);
        }
        Rect rect = this.mViewBounds;
        this.mBounds = rect;
        if (this.mClip != null) {
            rect.intersect(this.mClipBounds);
        }
        this.mGlobalBounds = this.mBounds;
        refreshGlobalBounds(true);
    }

    public void setClipBounds(double d, double d2, double d3, double d4) {
        this.mClipBounds = new Rect((int) d, (int) d2, (int) (d + d3), (int) (d2 + d4));
        this.mBounds = this.mViewBounds;
        this.mTextView.invalidate();
        refreshGlobalBounds(true);
    }

    public void removeClip() {
        this.mBounds = this.mViewBounds;
        this.mClipBounds = null;
        this.mTextView.invalidate();
        refreshGlobalBounds(true);
    }

    public void setText(String str) {
        InputFilter[] filters = this.mTextView.getFilters();
        this.mTextView.setFilters(new InputFilter[0]);
        this.mTextView.setText(str, (!this.mEditable || this.mDisableInteraction) ? TextView.BufferType.NORMAL : TextView.BufferType.EDITABLE);
        this.mTextView.setFilters(filters);
    }

    public boolean isContextValid() {
        return this.mContext != null;
    }

    public String getText() {
        return this.mTextView.getText().toString();
    }

    public void setKeyboardType(int i) {
        this.mKeyboardType = i;
        setInputType();
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setContentType(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.mContentType
            if (r6 != r0) goto L5
            return
        L5:
            java.lang.String r0 = "AdobeAIR"
            r1 = 1
            if (r6 == 0) goto L89
            r6.hashCode()
            int r2 = r6.hashCode()
            java.lang.String r3 = "password"
            r4 = -1
            switch(r2) {
                case -1181815352: goto L58;
                case -1147692044: goto L4d;
                case -1138946491: goto L42;
                case -769510831: goto L37;
                case -612351174: goto L2c;
                case 3373707: goto L21;
                case 1216985755: goto L18;
                default: goto L17;
            }
        L17:
            goto L62
        L18:
            boolean r2 = r6.equals(r3)
            if (r2 != 0) goto L1f
            goto L62
        L1f:
            r4 = 6
            goto L62
        L21:
            java.lang.String r2 = "name"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L2a
            goto L62
        L2a:
            r4 = 5
            goto L62
        L2c:
            java.lang.String r2 = "phone_number"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L35
            goto L62
        L35:
            r4 = 4
            goto L62
        L37:
            java.lang.String r2 = "email_address"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L40
            goto L62
        L40:
            r4 = 3
            goto L62
        L42:
            java.lang.String r2 = "otp_sms"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L4b
            goto L62
        L4b:
            r4 = 2
            goto L62
        L4d:
            java.lang.String r2 = "address"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L56
            goto L62
        L56:
            r4 = 1
            goto L62
        L58:
            java.lang.String r2 = "date_of_birth"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L61
            goto L62
        L61:
            r4 = 0
        L62:
            switch(r4) {
                case 0: goto L86;
                case 1: goto L83;
                case 2: goto L80;
                case 3: goto L7d;
                case 4: goto L7a;
                case 5: goto L77;
                case 6: goto L8a;
                default: goto L65;
            }
        L65:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown StageText.contentType value -> "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
            goto L89
        L77:
            java.lang.String r3 = "personName"
            goto L8a
        L7a:
            java.lang.String r3 = "phoneNumber"
            goto L8a
        L7d:
            java.lang.String r3 = "emailAddress"
            goto L8a
        L80:
            java.lang.String r3 = "smsOTPCode"
            goto L8a
        L83:
            java.lang.String r3 = "postalAddress"
            goto L8a
        L86:
            java.lang.String r3 = "birthDateFull"
            goto L8a
        L89:
            r3 = 0
        L8a:
            if (r3 == 0) goto La8
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 < r4) goto La1
            com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText r0 = r5.mTextView
            java.lang.String[] r2 = new java.lang.String[]{r3}
            com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m(r0, r2)
            com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText r0 = r5.mTextView
            com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2.m(r0, r1)
            goto La6
        La1:
            java.lang.String r1 = "Could not set StageText.contentType, Android API version is less than 26"
            android.util.Log.i(r0, r1)
        La6:
            r5.mContentType = r6
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidStageTextAsync.setContentType(java.lang.String):void");
    }

    public String getContentType() {
        return this.mContentType;
    }

    public void setDisplayAsPassword(boolean z) {
        this.mDisplayAsPassword = z;
        if (z) {
            this.mTextView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (!this.mMultiline) {
            this.mTextView.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            this.mTextView.setTransformationMethod(null);
        }
        setInputType();
    }

    private void setInputType() {
        int i;
        if (!this.mDisplayAsPassword) {
            switch (this.mKeyboardType) {
                case 1:
                case 4:
                default:
                    i = 1;
                    break;
                case 2:
                    i = 17;
                    break;
                case 3:
                    i = 2;
                    break;
                case 5:
                    i = 33;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 8194;
                    break;
            }
        } else {
            i = this.mKeyboardType == 3 ? 18 : 129;
        }
        if ((i & 15) == 1) {
            i |= this.mAutoCorrect ? 32768 : 524288;
            int i2 = this.mAutoCapitalize;
            if (i2 != 0) {
                if (i2 == 1) {
                    i |= 8192;
                } else if (i2 == 2) {
                    i |= 16384;
                } else if (i2 == 3) {
                    i |= 4096;
                }
            }
        }
        if (this.mMultiline) {
            i |= 131072;
        }
        this.mTextView.setRawInputType(i);
        this.mTextView.invalidate();
    }

    public void setEditable(boolean z) {
        if (z != this.mEditable) {
            this.mEditable = z;
            if (this.mDisableInteraction) {
                return;
            }
            InputFilter[] filters = this.mTextView.getFilters();
            this.mTextView.setFilters(new InputFilter[0]);
            AndroidStageTextEditText androidStageTextEditText = this.mTextView;
            androidStageTextEditText.setText(androidStageTextEditText.getText(), this.mEditable ? TextView.BufferType.EDITABLE : TextView.BufferType.NORMAL);
            this.mTextView.setFilters(filters);
            this.mTextView.setKeyListener(this.mEditable ? this.mSavedKeyListener : null);
            if (this.mEditable) {
                setInputType();
            }
        }
    }

    public void setDisableInteraction(boolean z) {
        this.mDisableInteraction = z;
        InputFilter[] filters = this.mTextView.getFilters();
        this.mTextView.setFilters(new InputFilter[0]);
        if (z) {
            AndroidStageTextEditText androidStageTextEditText = this.mTextView;
            androidStageTextEditText.setText(androidStageTextEditText.getText(), TextView.BufferType.NORMAL);
            this.mTextView.setFilters(filters);
            this.mTextView.setKeyListener(null);
            return;
        }
        AndroidStageTextEditText androidStageTextEditText2 = this.mTextView;
        androidStageTextEditText2.setText(androidStageTextEditText2.getText(), this.mEditable ? TextView.BufferType.EDITABLE : TextView.BufferType.NORMAL);
        this.mTextView.setFilters(filters);
        this.mTextView.setKeyListener(this.mEditable ? this.mSavedKeyListener : null);
        if (this.mEditable) {
            setInputType();
        }
    }

    public void setTextColor(int i, int i2, int i3, int i4) {
        int argb = Color.argb(i4, i, i2, i3);
        this.mTextColor = argb;
        this.mTextView.setTextColor(argb);
        this.mTextView.invalidate();
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    private RectShape getShapeForBounds(Rect rect) {
        RectShape rectShape = new RectShape();
        rectShape.resize(rect.width(), rect.height());
        return rectShape;
    }

    public void setBackgroundColor(int i, int i2, int i3, int i4) {
        this.mBBDrawable.setBkgColor(Color.argb(i4, i, i2, i3));
        this.mTextView.invalidate();
    }

    public int getBackgroundColor() {
        return this.mBBDrawable.mBkgColor;
    }

    public void setBackground(boolean z) {
        if (this.mBBDrawable.mHaveBkg != z) {
            this.mBBDrawable.mHaveBkg = z;
            this.mTextView.invalidate();
        }
    }

    public void setBorderColor(int i, int i2, int i3, int i4) {
        this.mBBDrawable.setBorderColor(Color.argb(i4, i, i2, i3));
        this.mTextView.invalidate();
    }

    public int getBorderColor() {
        return this.mBBDrawable.mBorderColor;
    }

    public void setBorder(boolean z) {
        if (this.mBBDrawable.mHaveBorder != z) {
            this.mBBDrawable.mHaveBorder = z;
            this.mTextView.invalidate();
        }
    }

    public void setAutoCapitalize(int i) {
        if (this.mAutoCapitalize != i) {
            this.mAutoCapitalize = i;
            setInputType();
        }
    }

    public int getAutoCapitalize() {
        return this.mAutoCapitalize;
    }

    public void setAutoCorrect(boolean z) {
        if (this.mAutoCorrect != z) {
            this.mAutoCorrect = z;
            setInputType();
        }
    }

    public int getReturnKeyLabel() {
        return this.mReturnKeyLabel;
    }

    public void setReturnKeyLabel(int i) {
        this.mReturnKeyLabel = i;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                i2 = 6;
            } else if (i == 2) {
                i2 = 2;
            } else if (i == 3) {
                i2 = 5;
            } else if (i == 4) {
                i2 = 3;
            }
        }
        this.mTextView.setImeOptions(301989888 | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class RestrictFilter implements InputFilter {
        private static final int kMapSize = 8192;
        private String mPattern;
        private byte[] m_map;

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RestrictFilter(java.lang.String r11) {
            /*
                r9 = this;
                com.adobe.air.AndroidStageTextAsync.this = r10
                r9.<init>()
                r10 = 0
                r9.m_map = r10
                r9.mPattern = r11
                if (r11 == 0) goto L67
                java.lang.String r10 = ""
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L67
                r10 = 8192(0x2000, float:1.14794E-41)
                byte[] r10 = new byte[r10]
                r9.m_map = r10
                r10 = 0
                r9.SetAll(r10)
                char r0 = r11.charAt(r10)
                r1 = 94
                r2 = 1
                if (r0 != r1) goto L2a
                r9.SetAll(r2)
            L2a:
                r0 = 0
                r3 = 0
                r4 = 1
                r5 = 0
                r6 = 0
            L2f:
                int r7 = r11.length()
                if (r0 >= r7) goto L67
                char r7 = r11.charAt(r0)
                if (r3 != 0) goto L4e
                r8 = 45
                if (r7 == r8) goto L4b
                r8 = 92
                if (r7 == r8) goto L49
                if (r7 == r1) goto L46
                goto L4f
            L46:
                r4 = r4 ^ 1
                goto L4c
            L49:
                r3 = 1
                goto L4c
            L4b:
                r5 = 1
            L4c:
                r8 = 0
                goto L50
            L4e:
                r3 = 0
            L4f:
                r8 = 1
            L50:
                if (r8 == 0) goto L64
                if (r5 == 0) goto L60
            L54:
                if (r6 > r7) goto L5d
                r9.SetCode(r6, r4)
                int r6 = r6 + 1
                char r6 = (char) r6
                goto L54
            L5d:
                r5 = 0
                r6 = 0
                goto L64
            L60:
                r9.SetCode(r7, r4)
                r6 = r7
            L64:
                int r0 = r0 + 1
                goto L2f
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidStageTextAsync.RestrictFilter.<init>(com.adobe.air.AndroidStageTextAsync, java.lang.String):void");
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int i5;
            int i6;
            if (this.mPattern == null) {
                return null;
            }
            if (this.m_map == null) {
                return "";
            }
            int i7 = i2 - i;
            StringBuffer stringBuffer = new StringBuffer(i7);
            boolean z = true;
            if (i7 > 1) {
                int i8 = 0;
                while (true) {
                    i5 = i + i8;
                    if (i5 >= i2 || (i6 = i3 + i8) >= i4 || charSequence.charAt(i5) != spanned.charAt(i6)) {
                        break;
                    }
                    stringBuffer.append(charSequence.charAt(i5));
                    i8++;
                }
            } else {
                i5 = i;
            }
            while (i5 < i2) {
                char charAt = charSequence.charAt(i5);
                if (IsCharAvailable(charAt)) {
                    stringBuffer.append(charAt);
                } else {
                    z = false;
                }
                i5++;
            }
            if (z) {
                return null;
            }
            if (charSequence instanceof Spanned) {
                SpannableString spannableString = new SpannableString(stringBuffer);
                TextUtils.copySpansFrom((Spanned) charSequence, i, stringBuffer.length(), null, spannableString, 0);
                return spannableString;
            }
            return stringBuffer;
        }

        boolean IsEmpty() {
            return this.mPattern != null;
        }

        boolean IsCharAvailable(char c) {
            byte[] bArr = this.m_map;
            if (bArr == null) {
                return false;
            }
            return ((1 << (c & 7)) & bArr[c >> 3]) != 0;
        }

        void SetCode(char c, boolean z) {
            if (z) {
                byte[] bArr = this.m_map;
                int i = c >> 3;
                bArr[i] = (byte) ((1 << (c & 7)) | bArr[i]);
                return;
            }
            byte[] bArr2 = this.m_map;
            int i2 = c >> 3;
            bArr2[i2] = (byte) ((~(1 << (c & 7))) & bArr2[i2]);
        }

        void SetAll(boolean z) {
            byte b = (byte) (z ? 255 : 0);
            for (int i = 0; i < 8192; i++) {
                this.m_map[i] = b;
            }
        }
    }

    private void applyFilters() {
        int i = this.mMaxChars;
        char c = 1;
        int i2 = i != 0 ? 1 : 0;
        if (this.mRestrict != null) {
            i2++;
        }
        InputFilter[] inputFilterArr = new InputFilter[i2];
        if (i != 0) {
            inputFilterArr[0] = new InputFilter.LengthFilter(this.mMaxChars);
        } else {
            c = 0;
        }
        String str = this.mRestrict;
        if (str != null) {
            inputFilterArr[c] = new RestrictFilter(str);
        }
        this.mTextView.setFilters(inputFilterArr);
    }

    public String getRestrict() {
        return this.mRestrict;
    }

    public void clearRestrict() {
        this.mRestrict = null;
        applyFilters();
    }

    public void setRestrict(String str) {
        this.mRestrict = str;
        applyFilters();
    }

    public int getMaxChars() {
        return this.mMaxChars;
    }

    public void setMaxChars(int i) {
        if (i != this.mMaxChars) {
            this.mMaxChars = i;
            applyFilters();
        }
    }

    public String getLocale() {
        return this.mLocale;
    }

    public void setLocale(String str) {
        this.mLocale = str;
    }

    public boolean getPreventDefault() {
        return this.mPreventDefault;
    }

    public void setPreventDefault(boolean z) {
        this.mPreventDefault = z;
    }

    public int getAlign() {
        return this.mAlign;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r4 != 5) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAlign(int r4) {
        /*
            r3 = this;
            r3.mAlign = r4
            if (r4 == 0) goto L1d
            r0 = 5
            r1 = 1
            if (r4 == r1) goto L17
            r2 = 2
            if (r4 == r2) goto L11
            r1 = 4
            if (r4 == r1) goto L1d
            if (r4 == r0) goto L17
            goto L23
        L11:
            com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText r4 = r3.mTextView
            r4.setGravity(r1)
            goto L23
        L17:
            com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText r4 = r3.mTextView
            r4.setGravity(r0)
            goto L23
        L1d:
            com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText r4 = r3.mTextView
            r0 = 3
            r4.setGravity(r0)
        L23:
            com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText r4 = r3.mTextView
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidStageTextAsync.setAlign(int):void");
    }

    public void setFontSize(int i) {
        this.mFontSize = i;
        this.mTextView.setTextSize(0, (int) ((i * this.mScaleFactor) + 0.5d));
        this.mTextView.invalidate();
    }

    public int getFontSize() {
        return this.mFontSize;
    }

    public void setBold(boolean z) {
        this.mBold = z;
        updateTypeface();
    }

    public void setItalic(boolean z) {
        this.mItalic = z;
        updateTypeface();
    }

    public void setFontFamily(String str) {
        this.mFont = str;
        updateTypeface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.adobe.air.AndroidStageTextAsync$AndroidStageTextEditText] */
    public void updateTypeface() {
        boolean z = this.mBold;
        ?? r0 = z;
        if (this.mItalic) {
            r0 = (z ? 1 : 0) | true;
        }
        Typeface typeface = FontMap.get(this.mFont);
        if (typeface != null) {
            this.mTextView.setTypeface(typeface);
        } else {
            Typeface create = Typeface.create(this.mFont, (int) r0);
            if (create != null) {
                this.mTextView.setTypeface(create, r0);
            } else if (r0 == 0) {
                this.mTextView.setTypeface(Typeface.DEFAULT);
            } else if (r0 == 1) {
                this.mTextView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
        this.mTextView.invalidate();
    }

    public void assignFocus() {
        this.mTextView.requestFocus();
        if (!this.mPreventDefault) {
            this.mAIRSurface.showSoftKeyboard(true, this.mTextView);
        }
        this.mOwner.sendInvokeSoftKeyboard(this.mInternalReference);
    }

    public void clearFocus() {
        if (this.mTextView.hasFocus()) {
            this.mTextView.clearFocus();
            this.mAIRSurface.requestFocus();
        }
        if (this.mMenuInvoked && this.mDisableInteraction) {
            this.mAIRSurface.showSoftKeyboard(false, this.mTextView);
        }
    }

    public void selectRange(int i, int i2) {
        int length = this.mTextView.length();
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.mTextView.setSelection(i, i2);
        this.mTextView.invalidate();
    }

    public int getSelectionAnchorIndex() {
        return this.mTextView.getSelectionStart();
    }

    public int getSelectionActiveIndex() {
        return this.mTextView.getSelectionEnd();
    }

    public Bitmap captureSnapshot(int i, int i2) {
        Bitmap bitmap = null;
        if (i >= 0 && i2 >= 0) {
            if (i == 0 && i2 == 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-this.mView.getScrollX(), -this.mView.getScrollY());
            double d = this.mScaleFactor;
            if (d != 0.0d) {
                canvas.scale((float) (1.0d / d), (float) (1.0d / d));
            }
            boolean isHorizontalScrollBarEnabled = this.mView.isHorizontalScrollBarEnabled();
            boolean isVerticalScrollBarEnabled = this.mView.isVerticalScrollBarEnabled();
            this.mView.setHorizontalScrollBarEnabled(false);
            this.mView.setVerticalScrollBarEnabled(false);
            try {
                this.mView.draw(canvas);
                bitmap = createBitmap;
            } catch (Exception unused) {
            }
            this.mView.setHorizontalScrollBarEnabled(isHorizontalScrollBarEnabled);
            this.mView.setVerticalScrollBarEnabled(isVerticalScrollBarEnabled);
        }
        return bitmap;
    }
}
