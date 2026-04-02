package p;

import a0.AbstractC0414b;
import a0.InterfaceC0413a;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f14702a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f14703b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f14704c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29 && i7 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f14703b);
            } else {
                drawable.setState(f14702a);
            }
            drawable.setState(state);
        }
    }

    public static Rect b(Drawable drawable) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Insets a7 = N.a(drawable);
            i7 = a7.left;
            i8 = a7.top;
            i9 = a7.right;
            i10 = a7.bottom;
            return new Rect(i7, i8, i9, i10);
        }
        if (drawable instanceof InterfaceC0413a) {
            ((AbstractC0414b) ((InterfaceC0413a) drawable)).getClass();
            drawable = null;
        }
        if (i11 < 29) {
            if (M.f14695a) {
                try {
                    Object invoke = M.f14696b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(M.f14697c.getInt(invoke), M.f14698d.getInt(invoke), M.f14699e.getInt(invoke), M.f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z7 = M.f14695a;
        }
        return f14704c;
    }

    public static PorterDuff.Mode c(int i7, PorterDuff.Mode mode) {
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 9) {
                    switch (i7) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
