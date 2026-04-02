package p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class E0 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f14649a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f14650b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f14651c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f14652d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14653e;
    public boolean f;

    public E0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f14653e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f14650b = rect3;
        Rect rect4 = new Rect();
        this.f14652d = rect4;
        Rect rect5 = new Rect();
        this.f14651c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f14649a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        int x7 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z8 = this.f;
                    this.f = false;
                }
                z7 = true;
                z9 = false;
            } else {
                z8 = this.f;
                if (z8 && !this.f14652d.contains(x7, y2)) {
                    z9 = z8;
                    z7 = false;
                }
            }
            z9 = z8;
            z7 = true;
        } else {
            if (this.f14650b.contains(x7, y2)) {
                this.f = true;
                z7 = true;
            }
            z7 = true;
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        Rect rect = this.f14651c;
        View view = this.f14649a;
        if (z7 && !rect.contains(x7, y2)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x7 - rect.left, y2 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
