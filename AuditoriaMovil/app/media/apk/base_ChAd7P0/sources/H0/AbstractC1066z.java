package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.example.appecoactivate.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: h0.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1066z {

    /* renamed from: a  reason: collision with root package name */
    public static Field f11214a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f11215b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final ViewTreeObserver$OnGlobalLayoutListenerC1056p f11216c = new ViewTreeObserver$OnGlobalLayoutListenerC1056p();

    public static void a(View view, C1036P c1036p) {
        WindowInsets a7;
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets b5 = c1036p.b();
        if (b5 != null) {
            if (i7 >= 30) {
                a7 = AbstractC1064x.a(view, b5);
            } else {
                a7 = AbstractC1058r.a(view, b5);
            }
            if (!a7.equals(b5)) {
                C1036P.c(view, a7);
            }
        }
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1063w.a(view);
        }
        if (f11215b) {
            return null;
        }
        if (f11214a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f11214a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f11215b = true;
                return null;
            }
        }
        try {
            Object obj = f11214a.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f11215b = true;
            return null;
        }
    }

    public static void c(View view, int i7) {
        Object tag;
        boolean z7;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        int i8 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        if (i8 >= 28) {
            tag = AbstractC1062v.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z7) {
            if (i7 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i7);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                List<CharSequence> text = obtain.getText();
                if (i8 >= 28) {
                    charSequence = AbstractC1062v.a(view);
                } else {
                    Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                    if (CharSequence.class.isInstance(tag2)) {
                        charSequence = tag2;
                    }
                }
                text.add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                    return;
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z7) {
            i9 = RecognitionOptions.PDF417;
        }
        obtain2.setEventType(i9);
        obtain2.setContentChangeTypes(i7);
        if (z7) {
            List<CharSequence> text2 = obtain2.getText();
            if (i8 >= 28) {
                charSequence = AbstractC1062v.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1063w.b(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    public static void e(View view, C1042b c1042b) {
        C1041a c1041a;
        if (c1042b == null && (b(view) instanceof C1041a)) {
            c1042b = new C1042b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c1042b == null) {
            c1041a = null;
        } else {
            c1041a = c1042b.f11179b;
        }
        view.setAccessibilityDelegate(c1041a);
    }

    public static void f(View view, CharSequence charSequence) {
        boolean z7;
        new C1055o(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).d(view, charSequence);
        ViewTreeObserver$OnGlobalLayoutListenerC1056p viewTreeObserver$OnGlobalLayoutListenerC1056p = f11216c;
        if (charSequence != null) {
            WeakHashMap weakHashMap = viewTreeObserver$OnGlobalLayoutListenerC1056p.f11205a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z7));
            view.addOnAttachStateChangeListener(viewTreeObserver$OnGlobalLayoutListenerC1056p);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1056p);
                return;
            }
            return;
        }
        viewTreeObserver$OnGlobalLayoutListenerC1056p.f11205a.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserver$OnGlobalLayoutListenerC1056p);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1056p);
    }
}
