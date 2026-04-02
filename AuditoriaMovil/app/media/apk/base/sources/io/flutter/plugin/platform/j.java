package io.flutter.plugin.platform;

import B5.C0028a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public final class j extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f11699a;

    /* renamed from: b  reason: collision with root package name */
    public int f11700b;

    /* renamed from: c  reason: collision with root package name */
    public int f11701c;

    /* renamed from: d  reason: collision with root package name */
    public int f11702d;

    /* renamed from: e  reason: collision with root package name */
    public C0028a f11703e;

    /* renamed from: e0  reason: collision with root package name */
    public G5.a f11704e0;
    public i f;

    public j(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar = this.f;
        if (iVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = iVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f11704e0;
    }

    public int getRenderTargetHeight() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11703e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                matrix.postTranslate(this.f11701c, this.f11702d);
            } else {
                matrix.postTranslate(this.f11699a, this.f11700b);
                this.f11699a = this.f11701c;
                this.f11700b = this.f11702d;
            }
        } else {
            int i7 = this.f11701c;
            this.f11699a = i7;
            int i8 = this.f11702d;
            this.f11700b = i8;
            matrix.postTranslate(i7, i8);
        }
        this.f11703e.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getImportantForAccessibility() == 4) {
            return false;
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f11701c = layoutParams.leftMargin;
        this.f11702d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        G5.a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (aVar = this.f11704e0) != null) {
            this.f11704e0 = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f11704e0 == null) {
            G5.a aVar2 = new G5.a(this, onFocusChangeListener);
            this.f11704e0 = aVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(aVar2);
        }
    }

    public void setTouchProcessor(C0028a c0028a) {
        this.f11703e = c0028a;
    }
}
