package h0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.appecoactivate.R;
import i0.C1094c;
import i0.C1095d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* renamed from: h0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1042b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f11177c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f11178a;

    /* renamed from: b  reason: collision with root package name */
    public final C1041a f11179b;

    public C1042b() {
        this(f11177c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f11178a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, C1095d c1095d) {
        this.f11178a.onInitializeAccessibilityNodeInfo(view, c1095d.f11380a);
    }

    public boolean c(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z7 = false;
        for (int i8 = 0; i8 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1094c) list.get(i8)).f11377a).getId() != i7; i8++) {
        }
        boolean performAccessibilityAction = this.f11178a.performAccessibilityAction(view, i7, bundle);
        if (!performAccessibilityAction && i7 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                int i10 = 0;
                while (true) {
                    if (clickableSpanArr == null || i10 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i10])) {
                        clickableSpan.onClick(view);
                        z7 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            return z7;
        }
        return performAccessibilityAction;
    }

    public C1042b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f11178a = accessibilityDelegate;
        this.f11179b = new C1041a(this);
    }
}
