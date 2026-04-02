package i0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* renamed from: i0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1094c {

    /* renamed from: c  reason: collision with root package name */
    public static final C1094c f11374c;

    /* renamed from: d  reason: collision with root package name */
    public static final C1094c f11375d;

    /* renamed from: e  reason: collision with root package name */
    public static final C1094c f11376e;
    public static final C1094c f;

    /* renamed from: a  reason: collision with root package name */
    public final Object f11377a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11378b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        new C1094c(null, 1, null);
        new C1094c(null, 2, null);
        new C1094c(null, 4, null);
        new C1094c(null, 8, null);
        new C1094c(null, 16, null);
        new C1094c(null, 32, null);
        new C1094c(null, 64, null);
        new C1094c(null, RecognitionOptions.ITF, null);
        new C1094c(null, RecognitionOptions.QR_CODE, AbstractC1096e.class);
        new C1094c(null, RecognitionOptions.UPC_A, AbstractC1096e.class);
        new C1094c(null, RecognitionOptions.UPC_E, AbstractC1097f.class);
        new C1094c(null, RecognitionOptions.PDF417, AbstractC1097f.class);
        f11374c = new C1094c(null, RecognitionOptions.AZTEC, null);
        f11375d = new C1094c(null, 8192, null);
        new C1094c(null, 16384, null);
        new C1094c(null, RecognitionOptions.TEZ_CODE, null);
        new C1094c(null, 65536, null);
        new C1094c(null, 131072, j.class);
        new C1094c(null, 262144, null);
        new C1094c(null, 524288, null);
        new C1094c(null, 1048576, null);
        new C1094c(null, 2097152, k.class);
        int i7 = Build.VERSION.SDK_INT;
        new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null);
        new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, AbstractC1099h.class);
        f11376e = new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null);
        new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null);
        f = new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null);
        new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null);
        if (i7 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new C1094c(accessibilityAction, 16908358, null);
        if (i7 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new C1094c(accessibilityAction2, 16908359, null);
        if (i7 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new C1094c(accessibilityAction3, 16908360, null);
        if (i7 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new C1094c(accessibilityAction4, 16908361, null);
        new C1094c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null);
        if (i7 >= 24) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction5 = null;
        }
        new C1094c(accessibilityAction5, 16908349, i.class);
        if (i7 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new C1094c(accessibilityAction6, 16908354, AbstractC1098g.class);
        if (i7 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new C1094c(accessibilityAction7, 16908356, null);
        if (i7 >= 28) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction8 = null;
        }
        new C1094c(accessibilityAction8, 16908357, null);
        if (i7 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new C1094c(accessibilityAction9, 16908362, null);
        if (i7 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction10 = null;
        }
        new C1094c(accessibilityAction10, 16908372, null);
        if (i7 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new C1094c(accessibilityAction11, 16908373, null);
        if (i7 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction12 = null;
        }
        new C1094c(accessibilityAction12, 16908374, null);
        if (i7 >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction13 = null;
        }
        new C1094c(accessibilityAction13, 16908375, null);
        if (i7 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        new C1094c(accessibilityAction14, 16908376, null);
        if (i7 >= 34) {
            accessibilityAction15 = F.e.b();
        } else {
            accessibilityAction15 = null;
        }
        new C1094c(accessibilityAction15, 16908382, null);
    }

    public C1094c(Object obj, int i7, Class cls) {
        this.f11378b = i7;
        if (obj == null) {
            this.f11377a = new AccessibilityNodeInfo.AccessibilityAction(i7, null);
        } else {
            this.f11377a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1094c)) {
            return false;
        }
        Object obj2 = ((C1094c) obj).f11377a;
        Object obj3 = this.f11377a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f11377a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b5 = C1095d.b(this.f11378b);
        if (b5.equals("ACTION_UNKNOWN")) {
            Object obj = this.f11377a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b5 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b5);
        return sb.toString();
    }
}
