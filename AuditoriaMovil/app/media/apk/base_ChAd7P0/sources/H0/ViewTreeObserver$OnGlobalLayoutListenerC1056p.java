package h0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: h0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1056p implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap f11205a = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z7;
        int i7;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f11205a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (booleanValue != z7) {
                    if (z7) {
                        i7 = 16;
                    } else {
                        i7 = 32;
                    }
                    AbstractC1066z.c(view, i7);
                    entry.setValue(Boolean.valueOf(z7));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
