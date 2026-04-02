package k0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import h0.C1042b;
import i0.C1094c;
import i0.C1095d;
/* renamed from: k0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379f extends C1042b {
    @Override // h0.C1042b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z7;
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        accessibilityEvent.setScrollable(z7);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // h0.C1042b
    public final void b(View view, C1095d c1095d) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f11178a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1095d.f11380a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1094c.f11375d.f11377a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1094c.f11376e.f11377a);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1094c.f11374c.f11377a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) C1094c.f.f11377a);
            }
        }
    }

    @Override // h0.C1042b
    public final boolean c(View view, int i7, Bundle bundle) {
        if (super.c(view, i7, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i7 != 4096) {
            if (i7 != 8192 && i7 != 16908344) {
                if (i7 != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
