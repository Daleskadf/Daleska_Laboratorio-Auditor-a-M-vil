package d0;

import D.D;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import g.C0996a;
import y.AbstractC2021a;
/* renamed from: d0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0884b {
    public static Object a(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0996a.class);
    }

    public static D b(x.j jVar) {
        Long l8 = (Long) jVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l8 != null) {
            return (D) AbstractC2021a.f16571a.get(l8);
        }
        return null;
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
