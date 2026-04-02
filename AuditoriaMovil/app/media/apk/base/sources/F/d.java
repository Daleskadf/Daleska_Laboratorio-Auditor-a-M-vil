package F;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.util.Log;
import android.view.Display;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
/* loaded from: classes.dex */
public abstract class d {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Context b(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon c(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String d(Context context) {
        return context.getAttributionTag();
    }

    public static String e(Context context) {
        return context.getAttributionTag();
    }

    public static Display f(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static void g(int i7) {
        SdkExtensions.getExtensionVersion(i7);
    }

    public static CharSequence h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void i(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
