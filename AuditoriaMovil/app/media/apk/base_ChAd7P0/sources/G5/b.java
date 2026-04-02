package G5;

import B5.C0028a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public FlutterMutatorsStack f1596a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1597b;

    /* renamed from: c  reason: collision with root package name */
    public int f1598c;

    /* renamed from: d  reason: collision with root package name */
    public int f1599d;

    /* renamed from: e  reason: collision with root package name */
    public int f1600e;

    /* renamed from: e0  reason: collision with root package name */
    public final C0028a f1601e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public a f1602f0;

    public b(Activity activity, float f, C0028a c0028a) {
        super(activity, null);
        this.f1597b = f;
        this.f1601e0 = c0028a;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f1596a.getFinalMatrix());
        float f = this.f1597b;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate(-this.f1598c, -this.f1599d);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f1596a.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f1598c, -this.f1599d);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0028a c0028a = this.f1601e0;
        if (c0028a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                matrix.postTranslate(this.f1598c, this.f1599d);
            } else {
                matrix.postTranslate(this.f1600e, this.f);
                this.f1600e = this.f1598c;
                this.f = this.f1599d;
            }
        } else {
            int i7 = this.f1598c;
            this.f1600e = i7;
            int i8 = this.f1599d;
            this.f = i8;
            matrix.postTranslate(i7, i8);
        }
        c0028a.d(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (aVar = this.f1602f0) != null) {
            this.f1602f0 = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f1602f0 == null) {
            a aVar2 = new a(onFocusChangeListener, this);
            this.f1602f0 = aVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(aVar2);
        }
    }
}
